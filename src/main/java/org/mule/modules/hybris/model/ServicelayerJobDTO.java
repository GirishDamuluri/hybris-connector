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
 * <p>Java class for servicelayerJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicelayerJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}jobDTO">
 *       &lt;sequence>
 *         &lt;element name="springId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="springIdCronJobFactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicelayerJobDTO", propOrder = {
    "springId",
    "springIdCronJobFactory"
})
@XmlSeeAlso({
    MaintenanceCleanupJobDTO.class
})
public class ServicelayerJobDTO
    extends JobDTO
{

    protected String springId;
    protected String springIdCronJobFactory;

    /**
     * Gets the value of the springId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpringId() {
        return springId;
    }

    /**
     * Sets the value of the springId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpringId(String value) {
        this.springId = value;
    }

    /**
     * Gets the value of the springIdCronJobFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpringIdCronJobFactory() {
        return springIdCronJobFactory;
    }

    /**
     * Sets the value of the springIdCronJobFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpringIdCronJobFactory(String value) {
        this.springIdCronJobFactory = value;
    }

}
