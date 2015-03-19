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
 * <p>Java class for standardPaymentModeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardPaymentModeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}paymentModeDTO">
 *       &lt;sequence>
 *         &lt;element name="net" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paymentModeValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="standardPaymentModeValue" type="{}standardPaymentModeValueDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "standardPaymentModeDTO", propOrder = {
    "net",
    "paymentModeValues"
})
public class StandardPaymentModeDTO
    extends PaymentModeDTO
{

    protected Boolean net;
    protected StandardPaymentModeDTO.PaymentModeValues paymentModeValues;

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNet(Boolean value) {
        this.net = value;
    }

    /**
     * Gets the value of the paymentModeValues property.
     * 
     * @return
     *     possible object is
     *     {@link StandardPaymentModeDTO.PaymentModeValues }
     *     
     */
    public StandardPaymentModeDTO.PaymentModeValues getPaymentModeValues() {
        return paymentModeValues;
    }

    /**
     * Sets the value of the paymentModeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardPaymentModeDTO.PaymentModeValues }
     *     
     */
    public void setPaymentModeValues(StandardPaymentModeDTO.PaymentModeValues value) {
        this.paymentModeValues = value;
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
     *         &lt;element name="standardPaymentModeValue" type="{}standardPaymentModeValueDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "standardPaymentModeValue"
    })
    public static class PaymentModeValues {

        protected List<StandardPaymentModeValueDTO> standardPaymentModeValue;

        /**
         * Gets the value of the standardPaymentModeValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the standardPaymentModeValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStandardPaymentModeValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StandardPaymentModeValueDTO }
         * 
         * 
         */
        public List<StandardPaymentModeValueDTO> getStandardPaymentModeValue() {
            if (standardPaymentModeValue == null) {
                standardPaymentModeValue = new ArrayList<StandardPaymentModeValueDTO>();
            }
            return this.standardPaymentModeValue;
        }

    }

}
