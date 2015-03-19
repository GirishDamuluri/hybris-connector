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
 * <p>Java class for cartRemovalCronJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartRemovalCronJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element name="sites" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="baseSite" type="{}baseSiteDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cartRemovalCronJobDTO", propOrder = {
    "sites"
})
public class CartRemovalCronJobDTO
    extends CronJobDTO
{

    protected CartRemovalCronJobDTO.Sites sites;

    /**
     * Gets the value of the sites property.
     * 
     * @return
     *     possible object is
     *     {@link CartRemovalCronJobDTO.Sites }
     *     
     */
    public CartRemovalCronJobDTO.Sites getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartRemovalCronJobDTO.Sites }
     *     
     */
    public void setSites(CartRemovalCronJobDTO.Sites value) {
        this.sites = value;
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
     *         &lt;element name="baseSite" type="{}baseSiteDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "baseSite"
    })
    public static class Sites {

        protected List<BaseSiteDTO> baseSite;

        /**
         * Gets the value of the baseSite property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseSite property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaseSite().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseSiteDTO }
         * 
         * 
         */
        public List<BaseSiteDTO> getBaseSite() {
            if (baseSite == null) {
                baseSite = new ArrayList<BaseSiteDTO>();
            }
            return this.baseSite;
        }

    }

}
