package org.mule.modules.hybris.client.impl;

import static org.mule.modules.hybris.client.ClientUtil.validateAndParseResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
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
    protected WebTarget webResource;

    private String endpointUrl;

    public HybrisRestClient(String endpointUrl)
    {
        this.endpointUrl = endpointUrl;
    }

    @Override
    public void login(String username, String password) throws ConnectionException
    {
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(username, password);

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);

        this.client = ClientBuilder.newClient(clientConfig);

        this.webResource = client.target(endpointUrl);
        this.webResource.register(feature);

        Response response = webResource.path(LOGIN_PATH).request().get(Response.class);

        int status = response.getStatus();
        if (status == 200)
        {
            if (!response.getCookies().isEmpty())
            {
                this.sessionId = response.getCookies().get(0);
            } else
            {
                throw new ConnectionException(ConnectionExceptionCode.UNKNOWN,
                        response.readEntity(String.class), "Hybris Rejected Login");
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
    public void logout()
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
        Response response = webResource.path(CATALOGS_PATH)
                .queryParam("catalogs_size", Integer.toString(size))
                .queryParam("catalogs_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, CatalogsDTO.class, 200);
    }

    @Override
    public CatalogDTO getCatalog(String catalogId) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, CatalogDTO.class, 200);
    }

    @Override
    public void upsertCatalog(CatalogDTO catalog) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalog.getId()).request()
                .cookie(sessionId).put(Entity.entity(catalog, MediaType.APPLICATION_XML));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCatalog(String catalogId) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CatalogVersionDTO getCatalogVersion(String catalogId, String version)
            throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).request().cookie(sessionId).get();

        return validateAndParseResponse(response, CatalogVersionDTO.class, 200);
    }

    @Override
    public void upsertCatalogVersion(CatalogVersionDTO catalogVersion) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH)
                .path(catalogVersion.getCatalog().getId()).path(CATALOG_VERSIONS_PATH)
                .path(catalogVersion.getVersion()).request().cookie(sessionId)
                .put(Entity.entity(catalogVersion, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCatalogVersion(String catalogId, String version) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).request().cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CategoryDTO getCategory(String catalogId, String version, String categoryCode)
            throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(CATEGORIES_PATH).path(categoryCode)
                .request().cookie(sessionId).get();

        return validateAndParseResponse(response, CategoryDTO.class, 200);
    }

    @Override
    public void upsertCategory(CategoryDTO category) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH)
                .path(category.getCatalogVersion().getCatalog().getId())
                .path(CATALOG_VERSIONS_PATH).path(category.getCatalogVersion().getVersion())
                .path(CATEGORIES_PATH).path(category.getCode()).request().cookie(sessionId)
                .put(Entity.entity(category, MediaType.APPLICATION_XML));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCategory(String catalogId, String version, String categoryCode)
            throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(CATEGORIES_PATH).path(categoryCode)
                .request().cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public ProductDTO getProduct(String catalogId, String version, String productCode)
            throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(PRODUCTS_PATH).path(productCode)
                .request().cookie(sessionId).get();

        return validateAndParseResponse(response, ProductDTO.class, 200);
    }

    @Override
    public void upsertProduct(ProductDTO product) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH)
                .path(product.getCatalogVersion().getCatalog().getId()).path(CATALOG_VERSIONS_PATH)
                .path(product.getCatalogVersion().getVersion()).path(PRODUCTS_PATH)
                .path(product.getCode()).request().cookie(sessionId)
                .put(Entity.entity(product, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteProduct(String catalogId, String version, String productCode)
            throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CATALOGS_PATH).path(catalogId)
                .path(CATALOG_VERSIONS_PATH).path(version).path(PRODUCTS_PATH).path(productCode)
                .request().cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public UnitsDTO getUnits(int size, int page)
    {
        Response response = webResource.path(UNITS_PATH)
                .queryParam("units_size", Integer.toString(size))
                .queryParam("units_page", Integer.toString(page)).request().cookie(sessionId).get();

        return validateAndParseResponse(response, UnitsDTO.class, 200);
    }

    @Override
    public UnitDTO getUnit(String unitCode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(UNITS_PATH).path(unitCode).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, UnitDTO.class, 200);
    }

    @Override
    public void upsertUnit(UnitDTO unit) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(UNITS_PATH).path(unit.getCode()).request()
                .cookie(sessionId).put(Entity.entity(unit, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteUnit(String unitCode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(UNITS_PATH).path(unitCode).request().cookie(sessionId)
                .delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CurrenciesDTO getCurrencies(int size, int page)
    {
        Response response = webResource.path(CURRENCIES_PATH)
                .queryParam("currencies_size", Integer.toString(size))
                .queryParam("currencies_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, CurrenciesDTO.class, 200);
    }

    @Override
    public CurrencyDTO getCurrency(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CURRENCIES_PATH).path(isocode).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, CurrencyDTO.class, 200);
    }

    @Override
    public void upsertCurrency(CurrencyDTO currency) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(CURRENCIES_PATH).path(currency.getIsocode()).request()
                .cookie(sessionId).put(Entity.entity(currency, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCurrency(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CURRENCIES_PATH).path(isocode).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public DiscountsDTO getDiscounts(int size, int page)
    {
        Response response = webResource.path(DISCOUNTS_PATH)
                .queryParam("discounts_size", Integer.toString(size))
                .queryParam("discounts_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, DiscountsDTO.class, 200);
    }

    @Override
    public DiscountDTO getDiscount(String code) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(DISCOUNTS_PATH).path(code).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, DiscountDTO.class, 200);
    }

    @Override
    public void upsertDiscount(DiscountDTO discount) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(DISCOUNTS_PATH).path(discount.getCode()).request()
                .cookie(sessionId).put(Entity.entity(discount, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteDiscount(String code) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(DISCOUNTS_PATH).path(code).request().cookie(sessionId)
                .delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CartsDTO getCarts(int size, int page)
    {
        Response response = webResource.path(CARTS_PATH)
                .queryParam("carts_size", Integer.toString(size))
                .queryParam("carts_page", Integer.toString(page)).request().cookie(sessionId).get();

        return validateAndParseResponse(response, CartsDTO.class, 200);
    }

    @Override
    public CartDTO getCart(String code) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CARTS_PATH).path(code).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, CartDTO.class, 200);
    }

    @Override
    public void upsertCart(CartDTO cart) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CARTS_PATH).path(cart.getCode()).request()
                .cookie(sessionId).put(Entity.entity(cart, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCart(String code) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CARTS_PATH).path(code).request().cookie(sessionId)
                .delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CartEntriesDTO getCartEntries(int size, int page)
    {
        Response response = webResource.path(CART_ENTRIES_PATH)
                .queryParam("cartentries_size", Integer.toString(size))
                .queryParam("cartentries_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, CartEntriesDTO.class, 200);
    }

    @Override
    public CartEntryDTO getCartEntry(Long pk) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CART_ENTRIES_PATH).path(Long.toString(pk)).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, CartEntryDTO.class, 200);
    }

    @Override
    public void deleteCartEntry(Long pk) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(CART_ENTRIES_PATH).path(Long.toString(pk)).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public void upsertCartEntry(CartEntryDTO cartEntry) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(CART_ENTRIES_PATH)
                .path(Long.toString(cartEntry.getPk())).request().cookie(sessionId)
                .put(Entity.entity(cartEntry, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public PaymentModesDTO getPaymentModes(int size, int page)
    {
        Response response = webResource.path(PAYMENT_MODES_PATH)
                .queryParam("paymentmodes_size", Integer.toString(size))
                .queryParam("paymentmodes_page", Integer.toString(page)).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, PaymentModesDTO.class, 200);
    }

    @Override
    public PaymentModeDTO getPaymentMode(String code) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(PAYMENT_MODES_PATH).path(code).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, PaymentModeDTO.class, 200);
    }

    @Override
    public void upsertPaymentMode(PaymentModeDTO paymentMode) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(PAYMENT_MODES_PATH).path(paymentMode.getCode())
                .request().cookie(sessionId)
                .put(Entity.entity(paymentMode, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deletePaymentMode(String code) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(PAYMENT_MODES_PATH).path(code).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public CountriesDTO getCountries(int size, int page)
    {
        Response response = webResource.path(COUNTRIES_PATH)
                .queryParam("countries_size", Integer.toString(size))
                .queryParam("countries_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, CountriesDTO.class, 200);
    }

    @Override
    public CountryDTO getCountry(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(COUNTRIES_PATH).path(isocode).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, CountryDTO.class, 200);
    }

    @Override
    public void upsertCountry(CountryDTO country) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(COUNTRIES_PATH).path(country.getIsocode()).request()
                .cookie(sessionId).put(Entity.entity(country, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteCountry(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(COUNTRIES_PATH).path(isocode).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public RegionsDTO getRegions(int size, int page)
    {
        Response response = webResource.path(REGIONS_PATH)
                .queryParam("regions_size", Integer.toString(size))
                .queryParam("regions_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, RegionsDTO.class, 200);
    }

    @Override
    public RegionDTO getRegion(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(REGIONS_PATH).path(isocode).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, RegionDTO.class, 200);
    }

    @Override
    public void upsertRegion(RegionDTO region) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(REGIONS_PATH).path(region.getIsocode()).request()
                .cookie(sessionId).put(Entity.entity(region, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteRegion(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(REGIONS_PATH).path(isocode).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }

    @Override
    public LanguagesDTO getLanguages(int size, int page)
    {
        Response response = webResource.path(LANGUAGES_PATH)
                .queryParam("languages_size", Integer.toString(size))
                .queryParam("languages_page", Integer.toString(page)).request().cookie(sessionId)
                .get();

        return validateAndParseResponse(response, LanguagesDTO.class, 200);
    }

    @Override
    public LanguageDTO getLanguage(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(LANGUAGES_PATH).path(isocode).request()
                .cookie(sessionId).get();

        return validateAndParseResponse(response, LanguageDTO.class, 200);
    }

    @Override
    public void upsertLanguage(LanguageDTO language) throws HybrisAPIException,
            HybrisClientException
    {
        Response response = webResource.path(LANGUAGES_PATH).path(language.getIsocode()).request()
                .cookie(sessionId).put(Entity.entity(language, MediaType.APPLICATION_XML_TYPE));

        validateAndParseResponse(response, String.class, 200, 201);
    }

    @Override
    public void deleteLanguage(String isocode) throws HybrisAPIException, HybrisClientException
    {
        Response response = webResource.path(LANGUAGES_PATH).path(isocode).request()
                .cookie(sessionId).delete();

        validateAndParseResponse(response, String.class, 200);
    }
}
