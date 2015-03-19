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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solrIndexerQueryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solrIndexerQueryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="injectCurrentDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="injectCurrentTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="injectLastIndexTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parameterProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solrIndexedType" type="{}solrIndexedTypeDTO" minOccurs="0"/>
 *         &lt;element name="solrIndexerQueryParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="solrIndexerQueryParameter" type="{}solrIndexerQueryParameterDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}user" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solrIndexerQueryDTO", propOrder = {
    "injectCurrentDate",
    "injectCurrentTime",
    "injectLastIndexTime",
    "parameterProvider",
    "query",
    "solrIndexedType",
    "solrIndexerQueryParameters",
    "type",
    "user"
})
public class SolrIndexerQueryDTO
    extends ItemDTO
{

    protected boolean injectCurrentDate;
    protected boolean injectCurrentTime;
    protected boolean injectLastIndexTime;
    protected String parameterProvider;
    protected String query;
    protected SolrIndexedTypeDTO solrIndexedType;
    protected SolrIndexerQueryDTO.SolrIndexerQueryParameters solrIndexerQueryParameters;
    protected String type;
    protected UserDTO user;
    @XmlAttribute(name = "identifier")
    protected String identifier;

    /**
     * Gets the value of the injectCurrentDate property.
     * 
     */
    public boolean isInjectCurrentDate() {
        return injectCurrentDate;
    }

    /**
     * Sets the value of the injectCurrentDate property.
     * 
     */
    public void setInjectCurrentDate(boolean value) {
        this.injectCurrentDate = value;
    }

    /**
     * Gets the value of the injectCurrentTime property.
     * 
     */
    public boolean isInjectCurrentTime() {
        return injectCurrentTime;
    }

    /**
     * Sets the value of the injectCurrentTime property.
     * 
     */
    public void setInjectCurrentTime(boolean value) {
        this.injectCurrentTime = value;
    }

    /**
     * Gets the value of the injectLastIndexTime property.
     * 
     */
    public boolean isInjectLastIndexTime() {
        return injectLastIndexTime;
    }

    /**
     * Sets the value of the injectLastIndexTime property.
     * 
     */
    public void setInjectLastIndexTime(boolean value) {
        this.injectLastIndexTime = value;
    }

    /**
     * Gets the value of the parameterProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterProvider() {
        return parameterProvider;
    }

    /**
     * Sets the value of the parameterProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterProvider(String value) {
        this.parameterProvider = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the solrIndexedType property.
     * 
     * @return
     *     possible object is
     *     {@link SolrIndexedTypeDTO }
     *     
     */
    public SolrIndexedTypeDTO getSolrIndexedType() {
        return solrIndexedType;
    }

    /**
     * Sets the value of the solrIndexedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolrIndexedTypeDTO }
     *     
     */
    public void setSolrIndexedType(SolrIndexedTypeDTO value) {
        this.solrIndexedType = value;
    }

    /**
     * Gets the value of the solrIndexerQueryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SolrIndexerQueryDTO.SolrIndexerQueryParameters }
     *     
     */
    public SolrIndexerQueryDTO.SolrIndexerQueryParameters getSolrIndexerQueryParameters() {
        return solrIndexerQueryParameters;
    }

    /**
     * Sets the value of the solrIndexerQueryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolrIndexerQueryDTO.SolrIndexerQueryParameters }
     *     
     */
    public void setSolrIndexerQueryParameters(SolrIndexerQueryDTO.SolrIndexerQueryParameters value) {
        this.solrIndexerQueryParameters = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserDTO }
     *     
     */
    public UserDTO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *     
     */
    public void setUser(UserDTO value) {
        this.user = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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
     *         &lt;element name="solrIndexerQueryParameter" type="{}solrIndexerQueryParameterDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "solrIndexerQueryParameter"
    })
    public static class SolrIndexerQueryParameters {

        protected List<SolrIndexerQueryParameterDTO> solrIndexerQueryParameter;

        /**
         * Gets the value of the solrIndexerQueryParameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the solrIndexerQueryParameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSolrIndexerQueryParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SolrIndexerQueryParameterDTO }
         * 
         * 
         */
        public List<SolrIndexerQueryParameterDTO> getSolrIndexerQueryParameter() {
            if (solrIndexerQueryParameter == null) {
                solrIndexerQueryParameter = new ArrayList<SolrIndexerQueryParameterDTO>();
            }
            return this.solrIndexerQueryParameter;
        }

    }

}
