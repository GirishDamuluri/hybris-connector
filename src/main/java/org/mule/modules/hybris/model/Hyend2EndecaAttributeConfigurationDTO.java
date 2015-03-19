//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hyend2EndecaAttributeConfigurationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2EndecaAttributeConfigurationDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2AbstractItemDTO">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offlineSort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="properties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2Property" type="{}hyend2PropertyDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recordFilterable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rollupKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchWildcard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showWithList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showWithRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2EndecaAttributeConfigurationDTO", propOrder = {
    "name",
    "offlineSort",
    "properties",
    "recordFilterable",
    "rollupKey",
    "searchWildcard",
    "searchable",
    "showWithList",
    "showWithRecord"
})
@XmlSeeAlso({
    Hyend2EndecaDimensionConfigurationDTO.class
})
public class Hyend2EndecaAttributeConfigurationDTO
    extends Hyend2AbstractItemDTO
{

    protected String name;
    protected Boolean offlineSort;
    protected Hyend2EndecaAttributeConfigurationDTO.Properties properties;
    protected Boolean recordFilterable;
    protected Boolean rollupKey;
    protected Boolean searchWildcard;
    protected Boolean searchable;
    protected Boolean showWithList;
    protected Boolean showWithRecord;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the offlineSort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineSort() {
        return offlineSort;
    }

    /**
     * Sets the value of the offlineSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineSort(Boolean value) {
        this.offlineSort = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2EndecaAttributeConfigurationDTO.Properties }
     *     
     */
    public Hyend2EndecaAttributeConfigurationDTO.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2EndecaAttributeConfigurationDTO.Properties }
     *     
     */
    public void setProperties(Hyend2EndecaAttributeConfigurationDTO.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the recordFilterable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordFilterable() {
        return recordFilterable;
    }

    /**
     * Sets the value of the recordFilterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordFilterable(Boolean value) {
        this.recordFilterable = value;
    }

    /**
     * Gets the value of the rollupKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollupKey() {
        return rollupKey;
    }

    /**
     * Sets the value of the rollupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollupKey(Boolean value) {
        this.rollupKey = value;
    }

    /**
     * Gets the value of the searchWildcard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchWildcard() {
        return searchWildcard;
    }

    /**
     * Sets the value of the searchWildcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchWildcard(Boolean value) {
        this.searchWildcard = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchable(Boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the showWithList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowWithList() {
        return showWithList;
    }

    /**
     * Sets the value of the showWithList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowWithList(Boolean value) {
        this.showWithList = value;
    }

    /**
     * Gets the value of the showWithRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowWithRecord() {
        return showWithRecord;
    }

    /**
     * Sets the value of the showWithRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowWithRecord(Boolean value) {
        this.showWithRecord = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="hyend2Property" type="{}hyend2PropertyDTO" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hyend2Property"
    })
    public static class Properties {

        protected List<Hyend2PropertyDTO> hyend2Property;

        /**
         * Gets the value of the hyend2Property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2Property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2Property().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2PropertyDTO }
         * 
         * 
         */
        public List<Hyend2PropertyDTO> getHyend2Property() {
            if (hyend2Property == null) {
                hyend2Property = new ArrayList<Hyend2PropertyDTO>();
            }
            return this.hyend2Property;
        }

    }

}
