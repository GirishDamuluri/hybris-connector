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
 * <p>Java class for celumPicturesIntegrationJobBasesDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="celumPicturesIntegrationJobBasesDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}celumpicturesintegrationjobbase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celumPicturesIntegrationJobBasesDTO", propOrder = {
    "celumpicturesintegrationjobbase"
})
public class CelumPicturesIntegrationJobBasesDTO
    extends AbstractCollectionDTO
{

    protected List<CelumPicturesIntegrationJobBaseDTO> celumpicturesintegrationjobbase;

    /**
     * Gets the value of the celumpicturesintegrationjobbase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the celumpicturesintegrationjobbase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCelumpicturesintegrationjobbase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CelumPicturesIntegrationJobBaseDTO }
     * 
     * 
     */
    public List<CelumPicturesIntegrationJobBaseDTO> getCelumpicturesintegrationjobbase() {
        if (celumpicturesintegrationjobbase == null) {
            celumpicturesintegrationjobbase = new ArrayList<CelumPicturesIntegrationJobBaseDTO>();
        }
        return this.celumpicturesintegrationjobbase;
    }

}
