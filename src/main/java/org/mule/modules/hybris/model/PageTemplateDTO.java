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
 * <p>Java class for pageTemplateDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageTemplateDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cmsItemDTO">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableContentSlots" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contentSlotName" type="{}contentSlotNameDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contentSlots" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contentSlotForTemplate" type="{}contentSlotForTemplateDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="frontendTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previewIcon" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="restrictedPageTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSPageType" type="{}cmsPageTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="velocityTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageTemplateDTO", propOrder = {
    "active",
    "availableContentSlots",
    "contentSlots",
    "frontendTemplateName",
    "previewIcon",
    "restrictedPageTypes",
    "velocityTemplate"
})
@XmlSeeAlso({
    EmailPageTemplateDTO.class
})
public class PageTemplateDTO
    extends CmsItemDTO
{

    protected Boolean active;
    protected PageTemplateDTO.AvailableContentSlots availableContentSlots;
    protected PageTemplateDTO.ContentSlots contentSlots;
    protected String frontendTemplateName;
    protected MediaDTO previewIcon;
    protected PageTemplateDTO.RestrictedPageTypes restrictedPageTypes;
    protected String velocityTemplate;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the availableContentSlots property.
     * 
     * @return
     *     possible object is
     *     {@link PageTemplateDTO.AvailableContentSlots }
     *     
     */
    public PageTemplateDTO.AvailableContentSlots getAvailableContentSlots() {
        return availableContentSlots;
    }

    /**
     * Sets the value of the availableContentSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageTemplateDTO.AvailableContentSlots }
     *     
     */
    public void setAvailableContentSlots(PageTemplateDTO.AvailableContentSlots value) {
        this.availableContentSlots = value;
    }

    /**
     * Gets the value of the contentSlots property.
     * 
     * @return
     *     possible object is
     *     {@link PageTemplateDTO.ContentSlots }
     *     
     */
    public PageTemplateDTO.ContentSlots getContentSlots() {
        return contentSlots;
    }

    /**
     * Sets the value of the contentSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageTemplateDTO.ContentSlots }
     *     
     */
    public void setContentSlots(PageTemplateDTO.ContentSlots value) {
        this.contentSlots = value;
    }

    /**
     * Gets the value of the frontendTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontendTemplateName() {
        return frontendTemplateName;
    }

    /**
     * Sets the value of the frontendTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontendTemplateName(String value) {
        this.frontendTemplateName = value;
    }

    /**
     * Gets the value of the previewIcon property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getPreviewIcon() {
        return previewIcon;
    }

    /**
     * Sets the value of the previewIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setPreviewIcon(MediaDTO value) {
        this.previewIcon = value;
    }

    /**
     * Gets the value of the restrictedPageTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PageTemplateDTO.RestrictedPageTypes }
     *     
     */
    public PageTemplateDTO.RestrictedPageTypes getRestrictedPageTypes() {
        return restrictedPageTypes;
    }

    /**
     * Sets the value of the restrictedPageTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageTemplateDTO.RestrictedPageTypes }
     *     
     */
    public void setRestrictedPageTypes(PageTemplateDTO.RestrictedPageTypes value) {
        this.restrictedPageTypes = value;
    }

    /**
     * Gets the value of the velocityTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocityTemplate() {
        return velocityTemplate;
    }

    /**
     * Sets the value of the velocityTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocityTemplate(String value) {
        this.velocityTemplate = value;
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
     *         &lt;element name="contentSlotName" type="{}contentSlotNameDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "contentSlotName"
    })
    public static class AvailableContentSlots {

        protected List<ContentSlotNameDTO> contentSlotName;

        /**
         * Gets the value of the contentSlotName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentSlotName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContentSlotName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContentSlotNameDTO }
         * 
         * 
         */
        public List<ContentSlotNameDTO> getContentSlotName() {
            if (contentSlotName == null) {
                contentSlotName = new ArrayList<ContentSlotNameDTO>();
            }
            return this.contentSlotName;
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
     *         &lt;element name="contentSlotForTemplate" type="{}contentSlotForTemplateDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "contentSlotForTemplate"
    })
    public static class ContentSlots {

        protected List<ContentSlotForTemplateDTO> contentSlotForTemplate;

        /**
         * Gets the value of the contentSlotForTemplate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentSlotForTemplate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContentSlotForTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContentSlotForTemplateDTO }
         * 
         * 
         */
        public List<ContentSlotForTemplateDTO> getContentSlotForTemplate() {
            if (contentSlotForTemplate == null) {
                contentSlotForTemplate = new ArrayList<ContentSlotForTemplateDTO>();
            }
            return this.contentSlotForTemplate;
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
     *         &lt;element name="cMSPageType" type="{}cmsPageTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsPageType"
    })
    public static class RestrictedPageTypes {

        @XmlElement(name = "cMSPageType")
        protected List<CmsPageTypeDTO> cmsPageType;

        /**
         * Gets the value of the cmsPageType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsPageType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSPageType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsPageTypeDTO }
         * 
         * 
         */
        public List<CmsPageTypeDTO> getCMSPageType() {
            if (cmsPageType == null) {
                cmsPageType = new ArrayList<CmsPageTypeDTO>();
            }
            return this.cmsPageType;
        }

    }

}
