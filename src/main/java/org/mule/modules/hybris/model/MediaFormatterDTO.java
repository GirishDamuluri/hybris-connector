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
 * <p>Java class for mediaFormatterDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaFormatterDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}formatterDTO">
 *       &lt;sequence>
 *         &lt;element name="formats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}format" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="inputMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaFormatterDTO", propOrder = {
    "formats",
    "inputMimeType"
})
@XmlSeeAlso({
    XmlTransformFormatterDTO.class,
    FopFormatterDTO.class
})
public class MediaFormatterDTO
    extends FormatterDTO
{

    protected MediaFormatterDTO.Formats formats;
    protected String inputMimeType;

    /**
     * Gets the value of the formats property.
     * 
     * @return
     *     possible object is
     *     {@link MediaFormatterDTO.Formats }
     *     
     */
    public MediaFormatterDTO.Formats getFormats() {
        return formats;
    }

    /**
     * Sets the value of the formats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaFormatterDTO.Formats }
     *     
     */
    public void setFormats(MediaFormatterDTO.Formats value) {
        this.formats = value;
    }

    /**
     * Gets the value of the inputMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMimeType() {
        return inputMimeType;
    }

    /**
     * Sets the value of the inputMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMimeType(String value) {
        this.inputMimeType = value;
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
     *         &lt;element ref="{}format" maxOccurs="unbounded" minOccurs="0"/>
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
        "format"
    })
    public static class Formats {

        protected List<FormatDTO> format;

        /**
         * Gets the value of the format property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the format property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormatDTO }
         * 
         * 
         */
        public List<FormatDTO> getFormat() {
            if (format == null) {
                format = new ArrayList<FormatDTO>();
            }
            return this.format;
        }

    }

}
