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
 * <p>Java class for csAgentGroupDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="csAgentGroupDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}userGroupDTO">
 *       &lt;sequence>
 *         &lt;element name="defaultAssignee" type="{}employeeDTO" minOccurs="0"/>
 *         &lt;element name="emailDistributionList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketstores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="baseStore" type="{}baseStoreDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "csAgentGroupDTO", propOrder = {
    "defaultAssignee",
    "emailDistributionList",
    "ticketstores"
})
public class CsAgentGroupDTO
    extends UserGroupDTO
{

    protected EmployeeDTO defaultAssignee;
    protected String emailDistributionList;
    protected CsAgentGroupDTO.Ticketstores ticketstores;

    /**
     * Gets the value of the defaultAssignee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDTO }
     *     
     */
    public EmployeeDTO getDefaultAssignee() {
        return defaultAssignee;
    }

    /**
     * Sets the value of the defaultAssignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDTO }
     *     
     */
    public void setDefaultAssignee(EmployeeDTO value) {
        this.defaultAssignee = value;
    }

    /**
     * Gets the value of the emailDistributionList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailDistributionList() {
        return emailDistributionList;
    }

    /**
     * Sets the value of the emailDistributionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailDistributionList(String value) {
        this.emailDistributionList = value;
    }

    /**
     * Gets the value of the ticketstores property.
     * 
     * @return
     *     possible object is
     *     {@link CsAgentGroupDTO.Ticketstores }
     *     
     */
    public CsAgentGroupDTO.Ticketstores getTicketstores() {
        return ticketstores;
    }

    /**
     * Sets the value of the ticketstores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsAgentGroupDTO.Ticketstores }
     *     
     */
    public void setTicketstores(CsAgentGroupDTO.Ticketstores value) {
        this.ticketstores = value;
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
     *         &lt;element name="baseStore" type="{}baseStoreDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "baseStore"
    })
    public static class Ticketstores {

        protected List<BaseStoreDTO> baseStore;

        /**
         * Gets the value of the baseStore property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseStore property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaseStore().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseStoreDTO }
         * 
         * 
         */
        public List<BaseStoreDTO> getBaseStore() {
            if (baseStore == null) {
                baseStore = new ArrayList<BaseStoreDTO>();
            }
            return this.baseStore;
        }

    }

}
