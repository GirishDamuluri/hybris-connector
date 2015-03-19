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
 * <p>Java class for btgReferenceContentpagesOperandDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgReferenceContentpagesOperandDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}btgAbstractReferenceOperandDTO">
 *       &lt;sequence>
 *         &lt;element name="contentpages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contentPage" type="{}contentPageDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "btgReferenceContentpagesOperandDTO", propOrder = {
    "contentpages"
})
public class BtgReferenceContentpagesOperandDTO
    extends BtgAbstractReferenceOperandDTO
{

    protected BtgReferenceContentpagesOperandDTO.Contentpages contentpages;

    /**
     * Gets the value of the contentpages property.
     * 
     * @return
     *     possible object is
     *     {@link BtgReferenceContentpagesOperandDTO.Contentpages }
     *     
     */
    public BtgReferenceContentpagesOperandDTO.Contentpages getContentpages() {
        return contentpages;
    }

    /**
     * Sets the value of the contentpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtgReferenceContentpagesOperandDTO.Contentpages }
     *     
     */
    public void setContentpages(BtgReferenceContentpagesOperandDTO.Contentpages value) {
        this.contentpages = value;
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
     *         &lt;element name="contentPage" type="{}contentPageDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "contentPage"
    })
    public static class Contentpages {

        protected List<ContentPageDTO> contentPage;

        /**
         * Gets the value of the contentPage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentPage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContentPage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContentPageDTO }
         * 
         * 
         */
        public List<ContentPageDTO> getContentPage() {
            if (contentPage == null) {
                contentPage = new ArrayList<ContentPageDTO>();
            }
            return this.contentPage;
        }

    }

}
