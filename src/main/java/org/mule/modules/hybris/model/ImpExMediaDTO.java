//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impExMediaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impExMediaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}mediaDTO">
 *       &lt;sequence>
 *         &lt;element name="commentCharacter" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldSeparator" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="linesToSkip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteCharacter" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="removeOnSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zipentry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impExMediaDTO", propOrder = {
    "commentCharacter",
    "encoding",
    "fieldSeparator",
    "linesToSkip",
    "preview",
    "quoteCharacter",
    "removeOnSuccess",
    "zipentry"
})
@XmlSeeAlso({
    BmeCatImpExScriptMediaDTO.class,
    ImportCockpitInputMediaDTO.class,
    HeaderLibraryDTO.class,
    ImpExImportCockpitMediaDTO.class,
    ImpExExportMediaDTO.class
})
public class ImpExMediaDTO
    extends MediaDTO
{

    @XmlSchemaType(name = "unsignedShort")
    protected Integer commentCharacter;
    protected String encoding;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer fieldSeparator;
    protected int linesToSkip;
    protected String preview;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer quoteCharacter;
    protected boolean removeOnSuccess;
    protected String zipentry;

    /**
     * Gets the value of the commentCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentCharacter() {
        return commentCharacter;
    }

    /**
     * Sets the value of the commentCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentCharacter(Integer value) {
        this.commentCharacter = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the fieldSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldSeparator() {
        return fieldSeparator;
    }

    /**
     * Sets the value of the fieldSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldSeparator(Integer value) {
        this.fieldSeparator = value;
    }

    /**
     * Gets the value of the linesToSkip property.
     * 
     */
    public int getLinesToSkip() {
        return linesToSkip;
    }

    /**
     * Sets the value of the linesToSkip property.
     * 
     */
    public void setLinesToSkip(int value) {
        this.linesToSkip = value;
    }

    /**
     * Gets the value of the preview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Sets the value of the preview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreview(String value) {
        this.preview = value;
    }

    /**
     * Gets the value of the quoteCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuoteCharacter() {
        return quoteCharacter;
    }

    /**
     * Sets the value of the quoteCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuoteCharacter(Integer value) {
        this.quoteCharacter = value;
    }

    /**
     * Gets the value of the removeOnSuccess property.
     * 
     */
    public boolean isRemoveOnSuccess() {
        return removeOnSuccess;
    }

    /**
     * Sets the value of the removeOnSuccess property.
     * 
     */
    public void setRemoveOnSuccess(boolean value) {
        this.removeOnSuccess = value;
    }

    /**
     * Gets the value of the zipentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipentry() {
        return zipentry;
    }

    /**
     * Sets the value of the zipentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipentry(String value) {
        this.zipentry = value;
    }

}
