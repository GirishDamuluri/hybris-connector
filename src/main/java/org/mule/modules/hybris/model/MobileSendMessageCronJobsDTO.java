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
 * <p>Java class for mobileSendMessageCronJobsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobileSendMessageCronJobsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}mobilesendmessagecronjob" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobileSendMessageCronJobsDTO", propOrder = {
    "mobilesendmessagecronjob"
})
public class MobileSendMessageCronJobsDTO
    extends AbstractCollectionDTO
{

    protected List<MobileSendMessageCronJobDTO> mobilesendmessagecronjob;

    /**
     * Gets the value of the mobilesendmessagecronjob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilesendmessagecronjob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilesendmessagecronjob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileSendMessageCronJobDTO }
     * 
     * 
     */
    public List<MobileSendMessageCronJobDTO> getMobilesendmessagecronjob() {
        if (mobilesendmessagecronjob == null) {
            mobilesendmessagecronjob = new ArrayList<MobileSendMessageCronJobDTO>();
        }
        return this.mobilesendmessagecronjob;
    }

}
