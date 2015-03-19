//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgAbstractResultDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgAbstractResultDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="forced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fulfilled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="invalidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgAbstractResultDTO", propOrder = {
    "forced",
    "fulfilled",
    "invalidated",
    "resultScope",
    "sequence",
    "sessionId"
})
@XmlSeeAlso({
    BtgRuleResultDTO.class,
    BtgSegmentResultDTO.class,
    BtgConditionResultDTO.class
})
public class BtgAbstractResultDTO
    extends ItemDTO
{

    protected boolean forced;
    protected boolean fulfilled;
    protected boolean invalidated;
    protected String resultScope;
    protected String sequence;
    protected String sessionId;

    /**
     * Gets the value of the forced property.
     * 
     */
    public boolean isForced() {
        return forced;
    }

    /**
     * Sets the value of the forced property.
     * 
     */
    public void setForced(boolean value) {
        this.forced = value;
    }

    /**
     * Gets the value of the fulfilled property.
     * 
     */
    public boolean isFulfilled() {
        return fulfilled;
    }

    /**
     * Sets the value of the fulfilled property.
     * 
     */
    public void setFulfilled(boolean value) {
        this.fulfilled = value;
    }

    /**
     * Gets the value of the invalidated property.
     * 
     */
    public boolean isInvalidated() {
        return invalidated;
    }

    /**
     * Sets the value of the invalidated property.
     * 
     */
    public void setInvalidated(boolean value) {
        this.invalidated = value;
    }

    /**
     * Gets the value of the resultScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultScope() {
        return resultScope;
    }

    /**
     * Sets the value of the resultScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultScope(String value) {
        this.resultScope = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}
