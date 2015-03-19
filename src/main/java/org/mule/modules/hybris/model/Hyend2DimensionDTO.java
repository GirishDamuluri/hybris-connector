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
 * <p>Java class for hyend2DimensionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2DimensionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2AbstractAttributeDTO">
 *       &lt;sequence>
 *         &lt;element name="endecaDimensionConfiguration" type="{}hyend2EndecaDimensionConfigurationDTO" minOccurs="0"/>
 *         &lt;element name="indexElements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2IndexElement" type="{}hyend2IndexElementDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taxonomyResolver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2DimensionDTO", propOrder = {
    "endecaDimensionConfiguration",
    "indexElements",
    "taxonomyResolver"
})
@XmlSeeAlso({
    Hyend2CategoryDimensionDTO.class
})
public class Hyend2DimensionDTO
    extends Hyend2AbstractAttributeDTO
{

    protected Hyend2EndecaDimensionConfigurationDTO endecaDimensionConfiguration;
    protected Hyend2DimensionDTO.IndexElements indexElements;
    protected String taxonomyResolver;

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
     * Gets the value of the indexElements property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2DimensionDTO.IndexElements }
     *     
     */
    public Hyend2DimensionDTO.IndexElements getIndexElements() {
        return indexElements;
    }

    /**
     * Sets the value of the indexElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2DimensionDTO.IndexElements }
     *     
     */
    public void setIndexElements(Hyend2DimensionDTO.IndexElements value) {
        this.indexElements = value;
    }

    /**
     * Gets the value of the taxonomyResolver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyResolver() {
        return taxonomyResolver;
    }

    /**
     * Sets the value of the taxonomyResolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyResolver(String value) {
        this.taxonomyResolver = value;
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
     *         &lt;element name="hyend2IndexElement" type="{}hyend2IndexElementDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "hyend2IndexElement"
    })
    public static class IndexElements {

        protected List<Hyend2IndexElementDTO> hyend2IndexElement;

        /**
         * Gets the value of the hyend2IndexElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2IndexElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2IndexElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2IndexElementDTO }
         * 
         * 
         */
        public List<Hyend2IndexElementDTO> getHyend2IndexElement() {
            if (hyend2IndexElement == null) {
                hyend2IndexElement = new ArrayList<Hyend2IndexElementDTO>();
            }
            return this.hyend2IndexElement;
        }

    }

}
