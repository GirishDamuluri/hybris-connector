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
 * <p>Java class for typeSystemExportJobsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSystemExportJobsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}typesystemexportjob" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSystemExportJobsDTO", propOrder = {
    "typesystemexportjob"
})
public class TypeSystemExportJobsDTO
    extends AbstractCollectionDTO
{

    protected List<TypeSystemExportJobDTO> typesystemexportjob;

    /**
     * Gets the value of the typesystemexportjob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typesystemexportjob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypesystemexportjob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSystemExportJobDTO }
     * 
     * 
     */
    public List<TypeSystemExportJobDTO> getTypesystemexportjob() {
        if (typesystemexportjob == null) {
            typesystemexportjob = new ArrayList<TypeSystemExportJobDTO>();
        }
        return this.typesystemexportjob;
    }

}
