package org.mule.modules.hybris.client.impl;

import static org.mule.modules.hybris.client.ClientUtil.execute;
import static org.mule.modules.hybris.client.ClientUtil.validateAndParseResponse;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;

import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.hybris.client.HybrisAPIException;
import org.mule.modules.hybris.client.HybrisClient;
import org.mule.modules.hybris.client.HybrisClientException;
import org.mule.modules.hybris.model.CartDTO;
import org.mule.modules.hybris.model.CartEntriesDTO;
import org.mule.modules.hybris.model.CartEntryDTO;
import org.mule.modules.hybris.model.CartsDTO;
import org.mule.modules.hybris.model.CatalogDTO;
import org.mule.modules.hybris.model.CatalogVersionDTO;
import org.mule.modules.hybris.model.CatalogsDTO;
import org.mule.modules.hybris.model.CategoryDTO;
import org.mule.modules.hybris.model.CountriesDTO;
import org.mule.modules.hybris.model.CountryDTO;
import org.mule.modules.hybris.model.CurrenciesDTO;
import org.mule.modules.hybris.model.CurrencyDTO;
import org.mule.modules.hybris.model.DiscountDTO;
import org.mule.modules.hybris.model.DiscountsDTO;
import org.mule.modules.hybris.model.LanguageDTO;
import org.mule.modules.hybris.model.LanguagesDTO;
import org.mule.modules.hybris.model.PaymentModeDTO;
import org.mule.modules.hybris.model.PaymentModesDTO;
import org.mule.modules.hybris.model.ProductDTO;
import org.mule.modules.hybris.model.RegionDTO;
import org.mule.modules.hybris.model.RegionsDTO;
import org.mule.modules.hybris.model.UnitDTO;
import org.mule.modules.hybris.model.UnitsDTO;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class HybrisRestClient implements HybrisClient
{
    private static final String LOGIN_PATH = "login";
    private static final String CATALOGS_PATH = "catalogs";
    private static final String CATALOG_VERSIONS_PATH = "catalogversions";
    private static final String CATEGORIES_PATH = "categories";
    private static final String PRODUCTS_PATH = "products";
    private static final String UNITS_PATH = "units";
    private static final String CURRENCIES_PATH = "currencies";
    private static final String DISCOUNTS_PATH = "discounts";
    private static final String CARTS_PATH = "carts";
    private static final String CART_ENTRIES_PATH = "cartentries";
    private static final String COUNTRIES_PATH = "countries";
    private static final String REGIONS_PATH = "regions";
    private static final String LANGUAGES_PATH = "languages";
    private static final String PAYMENT_MODES_PATH = "paymentmodes";

    private NewCookie sessionId;

    protected Client client;
    protected WebResource webResource;

    private String endpointUrl;

    public HybrisRestClient(String endpointUrl)
    {
        this.endpointUrl = endpointUrl;
        this.client = Client.create(new DefaultClientConfig());
    }

    @Override
    public void login(String username, String password) throws ConnectionException
    {
        client.addFilter(new HTTPBasicAuthFilter(username, password));

        this.webResource = client.resource(endpointUrl);

        ClientResponse response = webResource.path(LOGIN_PATH).get(ClientResponse.class);

        int status = response.getStatus();
        if (status == 200)
        {
            if (!response.getCookies().isEmpty())
            {
                this.sessionId = response.getCookies().get(0);
            } else
            {
                throw new ConnectionException(ConnectionExceptionCode.UNKNOWN,
                        response.getEntity(String.class), "Hybris Rejected Login");
            }
        } else if (status == 403)
        {
            throw new HybrisAPIException("API returned status 403: Invalid Credentials");
        } else
        {
            throw new HybrisAPIException("API returned status: " + status);
        }
    }

    @Override
    public void logout() throws ConnectionException
    {
        this.client = null;
        this.sessionId = null;
    }

    @Override
    public boolean isConnected()
    {
        return client != null && sessionId != null && sessionId.getValue() != null;
    }

    @Override
    public String connectionId()
    {
        return this.sessionId.toString();
    }

    @Override
    public CatalogsDTO getCatalogs(int size, int page)
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH)
                .queryParam("catalogs_size", Integer.toString(size))
                .queryParam("catalogs_page", Integer.toString(page)).cookie(sessionId);
        return validateAndParseResponse(execute(HttpMethod.GET, resource), CatalogsDTO.class, 200);
    }

    @Override
    public CatalogDTO getCatalog(String catalogId) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CatalogDTO.class, 200);
    }

    @Override
    public void upsertCatalog(CatalogDTO catalog) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalog.getId())
                .cookie(sessionId).type(MediaType.APPLICATION_XML).entity(catalog);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCatalog(String catalogId) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CatalogVersionDTO getCatalogVersion(String catalogId, String version) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CatalogVersionDTO.class,
                200);
    }

    @Override
    public void upsertCatalogVersion(CatalogVersionDTO catalogVersion) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH)
                .path(catalogVersion.getCatalog().getId()).path(CATALOG_VERSIONS_PATH)
                .path(catalogVersion.getVersion()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(catalogVersion);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCatalogVersion(String catalogId, String version) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CategoryDTO getCategory(String catalogId, String version, String categoryCode)
            throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(CATEGORIES_PATH).path(categoryCode)
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CategoryDTO.class, 200);
    }

    @Override
    public void upsertCategory(CategoryDTO category) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH)
                .path(category.getCatalogVersion().getCatalog().getId())
                .path(CATALOG_VERSIONS_PATH).path(category.getCatalogVersion().getVersion())
                .path(CATEGORIES_PATH).path(category.getCode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(category);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCategory(String catalogId, String version, String categoryCode)
            throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(CATEGORIES_PATH).path(categoryCode)
                .cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public ProductDTO getProduct(String catalogId, String version, String productCode)
            throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(PRODUCTS_PATH).path(productCode)
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), ProductDTO.class, 200);
    }

    @Override
    public void upsertProduct(ProductDTO product) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH)
                .path(product.getCatalogVersion().getCatalog().getId()).path(CATALOG_VERSIONS_PATH)
                .path(product.getCatalogVersion().getVersion()).path(PRODUCTS_PATH)
                .path(product.getCode()).cookie(sessionId).type(MediaType.APPLICATION_XML)
                .entity(product);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteProduct(String catalogId, String version, String productCode)
            throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(PRODUCTS_PATH).path(productCode)
                .cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public UnitsDTO getUnits(int size, int page)
    {
        WebResource.Builder resource = webResource.path(UNITS_PATH)
                .queryParam("units_size", Integer.toString(size))
                .queryParam("units_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), UnitsDTO.class, 200);
    }

    @Override
    public UnitDTO getUnit(String unitCode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(UNITS_PATH).path(unitCode)
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), UnitDTO.class, 200);
    }

    @Override
    public void upsertUnit(UnitDTO unit) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(UNITS_PATH).path(unit.getCode())
                .cookie(sessionId).type(MediaType.APPLICATION_XML).entity(unit);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteUnit(String unitCode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(UNITS_PATH).path(unitCode)
                .cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CurrenciesDTO getCurrencies(int size, int page)
    {
        WebResource.Builder resource = webResource.path(CURRENCIES_PATH)
                .queryParam("currencies_size", Integer.toString(size))
                .queryParam("currencies_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CurrenciesDTO.class, 200);
    }

    @Override
    public CurrencyDTO getCurrency(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CURRENCIES_PATH).path(isocode)
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CurrencyDTO.class, 200);
    }

    @Override
    public void upsertCurrency(CurrencyDTO currency) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CURRENCIES_PATH)
                .path(currency.getIsocode()).cookie(sessionId).type(MediaType.APPLICATION_XML)
                .entity(currency);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCurrency(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CURRENCIES_PATH).path(isocode)
                .cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public DiscountsDTO getDiscounts(int size, int page)
    {
        WebResource.Builder resource = webResource.path(DISCOUNTS_PATH)
                .queryParam("discounts_size", Integer.toString(size))
                .queryParam("discounts_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), DiscountsDTO.class, 200);
    }

    @Override
    public DiscountDTO getDiscount(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(DISCOUNTS_PATH).path(code).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), DiscountDTO.class, 200);
    }

    @Override
    public void upsertDiscount(DiscountDTO discount) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(DISCOUNTS_PATH).path(discount.getCode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(discount);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteDiscount(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource =  webResource.path(DISCOUNTS_PATH).path(code).cookie(sessionId);
        
        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CartsDTO getCarts(int size, int page)
    {
        WebResource.Builder resource = webResource.path(CARTS_PATH)
                .queryParam("carts_size", Integer.toString(size))
                .queryParam("carts_page", Integer.toString(page)).cookie(sessionId);
        
       return validateAndParseResponse(execute(HttpMethod.GET, resource), CartsDTO.class, 200);
    }

    @Override
    public CartDTO getCart(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CARTS_PATH).path(code).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CartDTO.class, 200);
    }

    @Override
    public void upsertCart(CartDTO cart) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CARTS_PATH).path(cart.getCode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(cart);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCart(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CARTS_PATH).path(code).cookie(sessionId);
        
        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CartEntriesDTO getCartEntries(int size, int page)
    {
        WebResource.Builder resource = webResource.path(CART_ENTRIES_PATH)
                .queryParam("cartentries_size", Integer.toString(size))
                .queryParam("cartentries_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CartEntriesDTO.class, 200);
    }

    @Override
    public CartEntryDTO getCartEntry(Long pk) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CART_ENTRIES_PATH).path(Long.toString(pk))
                .cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CartEntryDTO.class, 200);
    }

    @Override
    public void deleteCartEntry(Long pk) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CART_ENTRIES_PATH).path(Long.toString(pk)).cookie(sessionId);
        

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public void upsertCartEntry(CartEntryDTO cartEntry) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(CART_ENTRIES_PATH).path(Long.toString(cartEntry.getPk()))
                .cookie(sessionId).type(MediaType.APPLICATION_XML).entity(cartEntry);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public PaymentModesDTO getPaymentModes(int size, int page)
    {
        WebResource.Builder resource = webResource.path(PAYMENT_MODES_PATH)
                .queryParam("paymentmodes_size", Integer.toString(size))
                .queryParam("paymentmodes_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), PaymentModesDTO.class, 200);
    }

    @Override
    public PaymentModeDTO getPaymentMode(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(PAYMENT_MODES_PATH).path(code).cookie(sessionId);
        
        return validateAndParseResponse(execute(HttpMethod.GET, resource), PaymentModeDTO.class, 200);
    }

    @Override
    public void upsertPaymentMode(PaymentModeDTO paymentMode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(PAYMENT_MODES_PATH).path(paymentMode.getCode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(paymentMode);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deletePaymentMode(String code) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(PAYMENT_MODES_PATH).path(code).cookie(sessionId);
        
                validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public CountriesDTO getCountries(int size, int page)
    {
        WebResource.Builder resource = webResource.path(COUNTRIES_PATH)
                .queryParam("countries_size", Integer.toString(size))
                .queryParam("countries_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CountriesDTO.class, 200);
    }

    @Override
    public CountryDTO getCountry(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(COUNTRIES_PATH).path(isocode).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), CountryDTO.class, 200);
    }

    @Override
    public void upsertCountry(CountryDTO country) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource =  webResource.path(COUNTRIES_PATH).path(country.getIsocode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(country);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteCountry(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(COUNTRIES_PATH).path(isocode).cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public RegionsDTO getRegions(int size, int page)
    {
        WebResource.Builder resource = webResource.path(REGIONS_PATH)
                .queryParam("regions_size", Integer.toString(size))
                .queryParam("regions_page", Integer.toString(page)).cookie(sessionId);
        
        return validateAndParseResponse(execute(HttpMethod.GET, resource), RegionsDTO.class, 200);
    }

    @Override
    public RegionDTO getRegion(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(REGIONS_PATH).path(isocode).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), RegionDTO.class, 200);
    }

    @Override
    public void upsertRegion(RegionDTO region) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(REGIONS_PATH).path(region.getIsocode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(region);
        
        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteRegion(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(REGIONS_PATH).path(isocode).cookie(sessionId);

        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }

    @Override
    public LanguagesDTO getLanguages(int size, int page)
    {
        WebResource.Builder resource = webResource.path(LANGUAGES_PATH)
                .queryParam("languages_size", Integer.toString(size))
                .queryParam("languages_page", Integer.toString(page)).cookie(sessionId);

        return validateAndParseResponse(execute(HttpMethod.GET, resource), LanguagesDTO.class, 200);
    }

    @Override
    public LanguageDTO getLanguage(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(LANGUAGES_PATH).path(isocode).cookie(sessionId);
        
        return validateAndParseResponse(execute(HttpMethod.GET, resource), LanguageDTO.class, 200);
    }

    @Override
    public void upsertLanguage(LanguageDTO language) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(LANGUAGES_PATH).path(language.getIsocode()).cookie(sessionId)
                .type(MediaType.APPLICATION_XML).entity(language);

        validateAndParseResponse(execute(HttpMethod.PUT, resource), String.class, 200, 201);
    }

    @Override
    public void deleteLanguage(String isocode) throws HybrisAPIException, HybrisClientException
    {
        WebResource.Builder resource = webResource.path(LANGUAGES_PATH).path(isocode).cookie(sessionId);
        
        validateAndParseResponse(execute(HttpMethod.DELETE, resource), String.class, 200);
    }
}
