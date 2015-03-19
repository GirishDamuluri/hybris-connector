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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userGroupDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userGroupDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}principalGroupDTO">
 *       &lt;sequence>
 *         &lt;element name="BTGAssignToGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bTGAssignToGroupDefinition" type="{}btgAssignToGroupDefinitionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hmcLoginDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hmcXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readableLanguages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="restrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSUserGroupRestriction" type="{}cmsUserGroupRestrictionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userDiscountGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPriceGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="writeableLanguages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "userGroupDTO", propOrder = {
    "btgAssignToGroup",
    "hmcLoginDisabled",
    "hmcXML",
    "readableLanguages",
    "restrictions",
    "userDiscountGroup",
    "userPriceGroup",
    "userTaxGroup",
    "writeableLanguages"
})
@XmlSeeAlso({
    BackofficeRoleDTO.class,
    B2BUserGroupDTO.class,
    CsAgentGroupDTO.class,
    StoreEmployeeGroupDTO.class,
    CompanyDTO.class
})
public class UserGroupDTO
    extends PrincipalGroupDTO
{

    @XmlElement(name = "BTGAssignToGroup")
    protected UserGroupDTO.BTGAssignToGroup btgAssignToGroup;
    protected Boolean hmcLoginDisabled;
    protected String hmcXML;
    protected UserGroupDTO.ReadableLanguages readableLanguages;
    protected UserGroupDTO.Restrictions restrictions;
    protected String userDiscountGroup;
    protected String userPriceGroup;
    protected String userTaxGroup;
    protected UserGroupDTO.WriteableLanguages writeableLanguages;

    /**
     * Gets the value of the btgAssignToGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupDTO.BTGAssignToGroup }
     *     
     */
    public UserGroupDTO.BTGAssignToGroup getBTGAssignToGroup() {
        return btgAssignToGroup;
    }

    /**
     * Sets the value of the btgAssignToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupDTO.BTGAssignToGroup }
     *     
     */
    public void setBTGAssignToGroup(UserGroupDTO.BTGAssignToGroup value) {
        this.btgAssignToGroup = value;
    }

    /**
     * Gets the value of the hmcLoginDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHmcLoginDisabled() {
        return hmcLoginDisabled;
    }

    /**
     * Sets the value of the hmcLoginDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHmcLoginDisabled(Boolean value) {
        this.hmcLoginDisabled = value;
    }

    /**
     * Gets the value of the hmcXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmcXML() {
        return hmcXML;
    }

    /**
     * Sets the value of the hmcXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmcXML(String value) {
        this.hmcXML = value;
    }

    /**
     * Gets the value of the readableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupDTO.ReadableLanguages }
     *     
     */
    public UserGroupDTO.ReadableLanguages getReadableLanguages() {
        return readableLanguages;
    }

    /**
     * Sets the value of the readableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupDTO.ReadableLanguages }
     *     
     */
    public void setReadableLanguages(UserGroupDTO.ReadableLanguages value) {
        this.readableLanguages = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupDTO.Restrictions }
     *     
     */
    public UserGroupDTO.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupDTO.Restrictions }
     *     
     */
    public void setRestrictions(UserGroupDTO.Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the userDiscountGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDiscountGroup() {
        return userDiscountGroup;
    }

    /**
     * Sets the value of the userDiscountGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDiscountGroup(String value) {
        this.userDiscountGroup = value;
    }

    /**
     * Gets the value of the userPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPriceGroup() {
        return userPriceGroup;
    }

    /**
     * Sets the value of the userPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPriceGroup(String value) {
        this.userPriceGroup = value;
    }

    /**
     * Gets the value of the userTaxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTaxGroup() {
        return userTaxGroup;
    }

    /**
     * Sets the value of the userTaxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTaxGroup(String value) {
        this.userTaxGroup = value;
    }

    /**
     * Gets the value of the writeableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupDTO.WriteableLanguages }
     *     
     */
    public UserGroupDTO.WriteableLanguages getWriteableLanguages() {
        return writeableLanguages;
    }

    /**
     * Sets the value of the writeableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupDTO.WriteableLanguages }
     *     
     */
    public void setWriteableLanguages(UserGroupDTO.WriteableLanguages value) {
        this.writeableLanguages = value;
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
     *         &lt;element name="bTGAssignToGroupDefinition" type="{}btgAssignToGroupDefinitionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "btgAssignToGroupDefinition"
    })
    public static class BTGAssignToGroup {

        @XmlElement(name = "bTGAssignToGroupDefinition")
        protected List<BtgAssignToGroupDefinitionDTO> btgAssignToGroupDefinition;

        /**
         * Gets the value of the btgAssignToGroupDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the btgAssignToGroupDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBTGAssignToGroupDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BtgAssignToGroupDefinitionDTO }
         * 
         * 
         */
        public List<BtgAssignToGroupDefinitionDTO> getBTGAssignToGroupDefinition() {
            if (btgAssignToGroupDefinition == null) {
                btgAssignToGroupDefinition = new ArrayList<BtgAssignToGroupDefinitionDTO>();
            }
            return this.btgAssignToGroupDefinition;
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
     *         &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
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
        "language"
    })
    public static class ReadableLanguages {

        protected List<LanguageDTO> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageDTO }
         * 
         * 
         */
        public List<LanguageDTO> getLanguage() {
            if (language == null) {
                language = new ArrayList<LanguageDTO>();
            }
            return this.language;
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
     *         &lt;element name="cMSUserGroupRestriction" type="{}cmsUserGroupRestrictionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsUserGroupRestriction"
    })
    public static class Restrictions {

        @XmlElement(name = "cMSUserGroupRestriction")
        protected List<CmsUserGroupRestrictionDTO> cmsUserGroupRestriction;

        /**
         * Gets the value of the cmsUserGroupRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsUserGroupRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSUserGroupRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsUserGroupRestrictionDTO }
         * 
         * 
         */
        public List<CmsUserGroupRestrictionDTO> getCMSUserGroupRestriction() {
            if (cmsUserGroupRestriction == null) {
                cmsUserGroupRestriction = new ArrayList<CmsUserGroupRestrictionDTO>();
            }
            return this.cmsUserGroupRestriction;
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
     *         &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
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
        "language"
    })
    public static class WriteableLanguages {

        protected List<LanguageDTO> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageDTO }
         * 
         * 
         */
        public List<LanguageDTO> getLanguage() {
            if (language == null) {
                language = new ArrayList<LanguageDTO>();
            }
            return this.language;
        }

    }

}
