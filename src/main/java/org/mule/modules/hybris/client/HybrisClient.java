package org.mule.modules.hybris.client;

import java.io.IOException;

import org.mule.api.ConnectionException;
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

public interface HybrisClient {
	public void login(String username, String password) throws ConnectionException;
	public void logout() throws ConnectionException;
	public boolean isConnected();
	public String connectionId();
	
	public CatalogsDTO getCatalogs(int size, int page) throws IOException;
    public CatalogDTO getCatalog(String catalogId) throws IOException;
    public void upsertCatalog(CatalogDTO catalog) throws IOException;
    public void deleteCatalog(String catalogId) throws IOException;
    
    public CatalogVersionDTO getCatalogVersion(String catalogId, String version) throws IOException;
    public void upsertCatalogVersion(CatalogVersionDTO catalog) throws IOException;
    public void deleteCatalogVersion(String catalogId, String version) throws IOException;
    
    public CategoryDTO getCategory(String catalogId, String version, String categoryCode) throws IOException;
    public void upsertCategory(CategoryDTO category) throws IOException;
    public void deleteCategory(String catalogId, String version, String categoryCode) throws IOException;
    
    public ProductDTO getProduct(String catalogId, String version, String productCode) throws IOException;
    public void upsertProduct(ProductDTO product) throws IOException;
    public void deleteProduct(String catalogId, String version, String productCode) throws IOException;
    
    public UnitsDTO getUnits(int size, int page) throws IOException;
    public UnitDTO getUnit(String unitCode) throws IOException;
    public void upsertUnit(UnitDTO unit) throws IOException;
    public void deleteUnit(String unitCode) throws IOException;
    
    public CurrenciesDTO getCurrencies(int size, int page) throws IOException;
    public CurrencyDTO getCurrency(String isocode) throws IOException;
    public void upsertCurrency(CurrencyDTO country) throws IOException;
    public void deleteCurrency(String isocode) throws IOException;
    
    public DiscountsDTO getDiscounts(int size, int page) throws IOException;
    public DiscountDTO getDiscount(String code) throws IOException;
    public void upsertDiscount(DiscountDTO discount) throws IOException;
    public void deleteDiscount(String code) throws IOException;
    
    public CartsDTO getCarts(int size, int page) throws IOException;
    public CartDTO getCart(String code) throws IOException;
    public void upsertCart(CartDTO cart) throws IOException;
    public void deleteCart(String code) throws IOException;
    
    public CartEntriesDTO getCartEntries(int size, int page) throws IOException;
    public CartEntryDTO getCartEntry(Long pk) throws IOException;
    public void upsertCartEntry(CartEntryDTO cartEntry) throws IOException;
    public void deleteCartEntry(Long pk) throws IOException;
    
    public PaymentModesDTO getPaymentModes(int size, int page) throws IOException;
    public PaymentModeDTO getPaymentMode(String code) throws IOException;
    public void upsertPaymentMode(PaymentModeDTO paymentMode) throws IOException;
    public void deletePaymentMode(String code) throws IOException;
    
	public CountriesDTO getCountries(int size, int page) throws IOException;
	public CountryDTO getCountry(String isocode) throws IOException;
	public void upsertCountry(CountryDTO country) throws IOException;
	public void deleteCountry(String isocode) throws IOException;
	
	public RegionsDTO getRegions(int size, int page) throws IOException;
	public RegionDTO getRegion(String isocode) throws IOException;
	public void upsertRegion(RegionDTO region) throws IOException;
	public void deleteRegion(String isocode) throws IOException;
	
	public LanguagesDTO getLanguages(int size, int page) throws IOException;
    public LanguageDTO getLanguage(String isocode) throws IOException;
    public void upsertLanguage(LanguageDTO language) throws IOException;
    public void deleteLanguage(String isocode) throws IOException;
}
