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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mobileActionAssignmentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobileActionAssignmentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="action" type="{}mobileReceiveGenericActionDTO" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="keyword" type="{}mobileActionKeywordDTO" minOccurs="0"/>
 *         &lt;element ref="{}language" minOccurs="0"/>
 *         &lt;element name="phoneNumberFilters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shortcode" type="{}mobileShortcodeDTO" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testingPhoneNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "mobileActionAssignmentDTO", propOrder = {
    "action",
    "endDate",
    "keyword",
    "language",
    "phoneNumberFilters",
    "shortcode",
    "startDate",
    "state",
    "testingPhoneNumbers"
})
public class MobileActionAssignmentDTO
    extends ItemDTO
{

    protected MobileReceiveGenericActionDTO action;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected MobileActionKeywordDTO keyword;
    protected LanguageDTO language;
    protected MobileActionAssignmentDTO.PhoneNumberFilters phoneNumberFilters;
    protected MobileShortcodeDTO shortcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String state;
    protected MobileActionAssignmentDTO.TestingPhoneNumbers testingPhoneNumbers;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link MobileReceiveGenericActionDTO }
     *     
     */
    public MobileReceiveGenericActionDTO getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileReceiveGenericActionDTO }
     *     
     */
    public void setAction(MobileReceiveGenericActionDTO value) {
        this.action = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link MobileActionKeywordDTO }
     *     
     */
    public MobileActionKeywordDTO getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileActionKeywordDTO }
     *     
     */
    public void setKeyword(MobileActionKeywordDTO value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDTO }
     *     
     */
    public LanguageDTO getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDTO }
     *     
     */
    public void setLanguage(LanguageDTO value) {
        this.language = value;
    }

    /**
     * Gets the value of the phoneNumberFilters property.
     * 
     * @return
     *     possible object is
     *     {@link MobileActionAssignmentDTO.PhoneNumberFilters }
     *     
     */
    public MobileActionAssignmentDTO.PhoneNumberFilters getPhoneNumberFilters() {
        return phoneNumberFilters;
    }

    /**
     * Sets the value of the phoneNumberFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileActionAssignmentDTO.PhoneNumberFilters }
     *     
     */
    public void setPhoneNumberFilters(MobileActionAssignmentDTO.PhoneNumberFilters value) {
        this.phoneNumberFilters = value;
    }

    /**
     * Gets the value of the shortcode property.
     * 
     * @return
     *     possible object is
     *     {@link MobileShortcodeDTO }
     *     
     */
    public MobileShortcodeDTO getShortcode() {
        return shortcode;
    }

    /**
     * Sets the value of the shortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileShortcodeDTO }
     *     
     */
    public void setShortcode(MobileShortcodeDTO value) {
        this.shortcode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the testingPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link MobileActionAssignmentDTO.TestingPhoneNumbers }
     *     
     */
    public MobileActionAssignmentDTO.TestingPhoneNumbers getTestingPhoneNumbers() {
        return testingPhoneNumbers;
    }

    /**
     * Sets the value of the testingPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileActionAssignmentDTO.TestingPhoneNumbers }
     *     
     */
    public void setTestingPhoneNumbers(MobileActionAssignmentDTO.TestingPhoneNumbers value) {
        this.testingPhoneNumbers = value;
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
     *         &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumberList"
    })
    public static class PhoneNumberFilters {

        protected List<PhoneNumberListDTO> phoneNumberList;

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumberList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumberList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberListDTO }
         * 
         * 
         */
        public List<PhoneNumberListDTO> getPhoneNumberList() {
            if (phoneNumberList == null) {
                phoneNumberList = new ArrayList<PhoneNumberListDTO>();
            }
            return this.phoneNumberList;
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
     *         &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumberList"
    })
    public static class TestingPhoneNumbers {

        protected List<PhoneNumberListDTO> phoneNumberList;

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumberList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumberList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberListDTO }
         * 
         * 
         */
        public List<PhoneNumberListDTO> getPhoneNumberList() {
            if (phoneNumberList == null) {
                phoneNumberList = new ArrayList<PhoneNumberListDTO>();
            }
            return this.phoneNumberList;
        }

    }

}
