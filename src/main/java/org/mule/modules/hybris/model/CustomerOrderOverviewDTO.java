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
 * <p>Java class for customerOrderOverviewDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerOrderOverviewDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}currency" minOccurs="0"/>
 *         &lt;element ref="{}customer" minOccurs="0"/>
 *         &lt;element name="orderCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="orderTotals" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerOrderOverviewDTO", propOrder = {
    "currency",
    "customer",
    "orderCount",
    "orderTotals"
})
public class CustomerOrderOverviewDTO
    extends ItemDTO
{

    protected CurrencyDTO currency;
    protected CustomerDTO customer;
    protected Integer orderCount;
    protected Double orderTotals;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDTO }
     *     
     */
    public CurrencyDTO getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDTO }
     *     
     */
    public void setCurrency(CurrencyDTO value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDTO }
     *     
     */
    public CustomerDTO getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDTO }
     *     
     */
    public void setCustomer(CustomerDTO value) {
        this.customer = value;
    }

    /**
     * Gets the value of the orderCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * Sets the value of the orderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderCount(Integer value) {
        this.orderCount = value;
    }

    /**
     * Gets the value of the orderTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrderTotals() {
        return orderTotals;
    }

    /**
     * Sets the value of the orderTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrderTotals(Double value) {
        this.orderTotals = value;
    }

}
