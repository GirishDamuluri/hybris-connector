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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for b2BPermissionResultsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="b2BPermissionResultsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}b2bpermissionresult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "b2BPermissionResultsDTO", propOrder = {
    "b2Bpermissionresult"
})
public class B2BPermissionResultsDTO
    extends AbstractCollectionDTO
{

    @XmlElement(name = "b2bpermissionresult")
    protected List<B2BPermissionResultDTO> b2Bpermissionresult;

    /**
     * Gets the value of the b2Bpermissionresult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b2Bpermissionresult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB2Bpermissionresult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B2BPermissionResultDTO }
     * 
     * 
     */
    public List<B2BPermissionResultDTO> getB2Bpermissionresult() {
        if (b2Bpermissionresult == null) {
            b2Bpermissionresult = new ArrayList<B2BPermissionResultDTO>();
        }
        return this.b2Bpermissionresult;
    }

}
