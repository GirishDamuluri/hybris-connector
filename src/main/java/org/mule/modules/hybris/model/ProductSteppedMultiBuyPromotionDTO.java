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
 * <p>Java class for productSteppedMultiBuyPromotionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productSteppedMultiBuyPromotionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}productPromotionDTO">
 *       &lt;sequence>
 *         &lt;element name="messageCouldHaveFired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageFired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualifyingCountsAndBundlePrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="promotionQuantityAndPricesRow" type="{}promotionQuantityAndPricesRowDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "productSteppedMultiBuyPromotionDTO", propOrder = {
    "messageCouldHaveFired",
    "messageFired",
    "qualifyingCountsAndBundlePrices"
})
public class ProductSteppedMultiBuyPromotionDTO
    extends ProductPromotionDTO
{

    protected String messageCouldHaveFired;
    protected String messageFired;
    protected ProductSteppedMultiBuyPromotionDTO.QualifyingCountsAndBundlePrices qualifyingCountsAndBundlePrices;

    /**
     * Gets the value of the messageCouldHaveFired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCouldHaveFired() {
        return messageCouldHaveFired;
    }

    /**
     * Sets the value of the messageCouldHaveFired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCouldHaveFired(String value) {
        this.messageCouldHaveFired = value;
    }

    /**
     * Gets the value of the messageFired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFired() {
        return messageFired;
    }

    /**
     * Sets the value of the messageFired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFired(String value) {
        this.messageFired = value;
    }

    /**
     * Gets the value of the qualifyingCountsAndBundlePrices property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSteppedMultiBuyPromotionDTO.QualifyingCountsAndBundlePrices }
     *     
     */
    public ProductSteppedMultiBuyPromotionDTO.QualifyingCountsAndBundlePrices getQualifyingCountsAndBundlePrices() {
        return qualifyingCountsAndBundlePrices;
    }

    /**
     * Sets the value of the qualifyingCountsAndBundlePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSteppedMultiBuyPromotionDTO.QualifyingCountsAndBundlePrices }
     *     
     */
    public void setQualifyingCountsAndBundlePrices(ProductSteppedMultiBuyPromotionDTO.QualifyingCountsAndBundlePrices value) {
        this.qualifyingCountsAndBundlePrices = value;
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
     *         &lt;element name="promotionQuantityAndPricesRow" type="{}promotionQuantityAndPricesRowDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "promotionQuantityAndPricesRow"
    })
    public static class QualifyingCountsAndBundlePrices {

        protected List<PromotionQuantityAndPricesRowDTO> promotionQuantityAndPricesRow;

        /**
         * Gets the value of the promotionQuantityAndPricesRow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionQuantityAndPricesRow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionQuantityAndPricesRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromotionQuantityAndPricesRowDTO }
         * 
         * 
         */
        public List<PromotionQuantityAndPricesRowDTO> getPromotionQuantityAndPricesRow() {
            if (promotionQuantityAndPricesRow == null) {
                promotionQuantityAndPricesRow = new ArrayList<PromotionQuantityAndPricesRowDTO>();
            }
            return this.promotionQuantityAndPricesRow;
        }

    }

}
