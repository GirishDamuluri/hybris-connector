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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hyend2RangeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2RangeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2AbstractItemDTO">
 *       &lt;sequence>
 *         &lt;element name="boundType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endecaDimensionConfiguration" type="{}hyend2EndecaDimensionConfigurationDTO" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="rangeEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2RangeEntry" type="{}hyend2RangeEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rangeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchInterfaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2SearchInterface" type="{}hyend2SearchInterfaceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2RangeDTO", propOrder = {
    "boundType",
    "endecaDimensionConfiguration",
    "name",
    "properties",
    "rangeEntries",
    "rangeType",
    "searchInterfaces"
})
public class Hyend2RangeDTO
    extends Hyend2AbstractItemDTO
{

    protected String boundType;
    protected Hyend2EndecaDimensionConfigurationDTO endecaDimensionConfiguration;
    protected String name;
    protected Hyend2RangeDTO.Properties properties;
    protected Hyend2RangeDTO.RangeEntries rangeEntries;
    protected String rangeType;
    protected Hyend2RangeDTO.SearchInterfaces searchInterfaces;

    /**
     * Gets the value of the boundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundType() {
        return boundType;
    }

    /**
     * Sets the value of the boundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundType(String value) {
        this.boundType = value;
    }

    /**
     * Gets the value of the endecaDimensionConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2EndecaDimensionConfigurationDTO }
     *     
     */
    public Hyend2EndecaDimensionConfigurationDTO getEndecaDimensionConfiguration() {
        return endecaDimensionConfiguration;
    }

    /**
     * Sets the value of the endecaDimensionConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2EndecaDimensionConfigurationDTO }
     *     
     */
    public void setEndecaDimensionConfiguration(Hyend2EndecaDimensionConfigurationDTO value) {
        this.endecaDimensionConfiguration = value;
    }

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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2RangeDTO.Properties }
     *     
     */
    public Hyend2RangeDTO.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2RangeDTO.Properties }
     *     
     */
    public void setProperties(Hyend2RangeDTO.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the rangeEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2RangeDTO.RangeEntries }
     *     
     */
    public Hyend2RangeDTO.RangeEntries getRangeEntries() {
        return rangeEntries;
    }

    /**
     * Sets the value of the rangeEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2RangeDTO.RangeEntries }
     *     
     */
    public void setRangeEntries(Hyend2RangeDTO.RangeEntries value) {
        this.rangeEntries = value;
    }

    /**
     * Gets the value of the rangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeType() {
        return rangeType;
    }

    /**
     * Sets the value of the rangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeType(String value) {
        this.rangeType = value;
    }

    /**
     * Gets the value of the searchInterfaces property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2RangeDTO.SearchInterfaces }
     *     
     */
    public Hyend2RangeDTO.SearchInterfaces getSearchInterfaces() {
        return searchInterfaces;
    }

    /**
     * Sets the value of the searchInterfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2RangeDTO.SearchInterfaces }
     *     
     */
    public void setSearchInterfaces(Hyend2RangeDTO.SearchInterfaces value) {
        this.searchInterfaces = value;
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
     *         &lt;element name="hyend2RangeEntry" type="{}hyend2RangeEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "hyend2RangeEntry"
    })
    public static class RangeEntries {

        protected List<Hyend2RangeEntryDTO> hyend2RangeEntry;

        /**
         * Gets the value of the hyend2RangeEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2RangeEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2RangeEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2RangeEntryDTO }
         * 
         * 
         */
        public List<Hyend2RangeEntryDTO> getHyend2RangeEntry() {
            if (hyend2RangeEntry == null) {
                hyend2RangeEntry = new ArrayList<Hyend2RangeEntryDTO>();
            }
            return this.hyend2RangeEntry;
        }

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
     *         &lt;element name="hyend2SearchInterface" type="{}hyend2SearchInterfaceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "hyend2SearchInterface"
    })
    public static class SearchInterfaces {

        protected List<Hyend2SearchInterfaceDTO> hyend2SearchInterface;

        /**
         * Gets the value of the hyend2SearchInterface property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2SearchInterface property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2SearchInterface().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2SearchInterfaceDTO }
         * 
         * 
         */
        public List<Hyend2SearchInterfaceDTO> getHyend2SearchInterface() {
            if (hyend2SearchInterface == null) {
                hyend2SearchInterface = new ArrayList<Hyend2SearchInterfaceDTO>();
            }
            return this.hyend2SearchInterface;
        }

    }

}
