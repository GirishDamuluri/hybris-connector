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
 * <p>Java class for paragraphStyleDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paragraphStyleDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}styleDTO">
 *       &lt;sequence>
 *         &lt;element name="styleContainer" type="{}styleContainerDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paragraphStyleDTO", propOrder = {
    "styleContainer"
})
public class ParagraphStyleDTO
    extends StyleDTO
{

    protected StyleContainerDTO styleContainer;

    /**
     * Gets the value of the styleContainer property.
     * 
     * @return
     *     possible object is
     *     {@link StyleContainerDTO }
     *     
     */
    public StyleContainerDTO getStyleContainer() {
        return styleContainer;
    }

    /**
     * Sets the value of the styleContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleContainerDTO }
     *     
     */
    public void setStyleContainer(StyleContainerDTO value) {
        this.styleContainer = value;
    }

}
