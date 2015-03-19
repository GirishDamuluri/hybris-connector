//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for duplicateCatalogItemCodesViewDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="duplicateCatalogItemCodesViewDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="catalogVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cv" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="typeCode" type="{}composedTypeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duplicateCatalogItemCodesViewDTO", propOrder = {
    "catalogVersion",
    "code",
    "count",
    "cv",
    "typeCode"
})
public class DuplicateCatalogItemCodesViewDTO
    extends ItemDTO
{

    protected CatalogVersionDTO catalogVersion;
    protected String code;
    protected Integer count;
    protected CatalogVersionDTO cv;
    protected ComposedTypeDTO typeCode;

    /**
     * Gets the value of the catalogVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getCatalogVersion() {
        return catalogVersion;
    }

    /**
     * Sets the value of the catalogVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setCatalogVersion(CatalogVersionDTO value) {
        this.catalogVersion = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the cv property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getCv() {
        return cv;
    }

    /**
     * Sets the value of the cv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setCv(CatalogVersionDTO value) {
        this.cv = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public ComposedTypeDTO getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public void setTypeCode(ComposedTypeDTO value) {
        this.typeCode = value;
    }

}
