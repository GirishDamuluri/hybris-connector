//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cronJobConfigProxyItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cronJobConfigProxyItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="cronjob_timertask_loadonstartup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cronjob_trigger_interval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="testEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timerTaskNextRun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timerTaskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cronJobConfigProxyItemDTO", propOrder = {
    "cronjobTimertaskLoadonstartup",
    "cronjobTriggerInterval",
    "testEmailAddress",
    "timerTaskNextRun",
    "timerTaskStatus"
})
public class CronJobConfigProxyItemDTO
    extends ItemDTO
{

    @XmlElement(name = "cronjob_timertask_loadonstartup")
    protected Boolean cronjobTimertaskLoadonstartup;
    @XmlElement(name = "cronjob_trigger_interval")
    protected Integer cronjobTriggerInterval;
    protected String testEmailAddress;
    protected String timerTaskNextRun;
    protected String timerTaskStatus;

    /**
     * Gets the value of the cronjobTimertaskLoadonstartup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCronjobTimertaskLoadonstartup() {
        return cronjobTimertaskLoadonstartup;
    }

    /**
     * Sets the value of the cronjobTimertaskLoadonstartup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCronjobTimertaskLoadonstartup(Boolean value) {
        this.cronjobTimertaskLoadonstartup = value;
    }

    /**
     * Gets the value of the cronjobTriggerInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCronjobTriggerInterval() {
        return cronjobTriggerInterval;
    }

    /**
     * Sets the value of the cronjobTriggerInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCronjobTriggerInterval(Integer value) {
        this.cronjobTriggerInterval = value;
    }

    /**
     * Gets the value of the testEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEmailAddress() {
        return testEmailAddress;
    }

    /**
     * Sets the value of the testEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEmailAddress(String value) {
        this.testEmailAddress = value;
    }

    /**
     * Gets the value of the timerTaskNextRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerTaskNextRun() {
        return timerTaskNextRun;
    }

    /**
     * Sets the value of the timerTaskNextRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerTaskNextRun(String value) {
        this.timerTaskNextRun = value;
    }

    /**
     * Gets the value of the timerTaskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimerTaskStatus() {
        return timerTaskStatus;
    }

    /**
     * Sets the value of the timerTaskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimerTaskStatus(String value) {
        this.timerTaskStatus = value;
    }

}
