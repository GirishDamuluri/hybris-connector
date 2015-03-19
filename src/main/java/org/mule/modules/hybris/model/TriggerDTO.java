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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for triggerDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="triggerDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="activationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cronExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cronJob" type="{}cronJobDTO" minOccurs="0"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysOfWeek" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{}job" minOccurs="0"/>
 *         &lt;element name="maxAcceptableDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="relative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weekInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggerDTO", propOrder = {
    "activationTime",
    "active",
    "cronExpression",
    "cronJob",
    "day",
    "daysOfWeek",
    "hour",
    "job",
    "maxAcceptableDelay",
    "minute",
    "month",
    "relative",
    "second",
    "timeTable",
    "weekInterval",
    "year"
})
public class TriggerDTO
    extends ItemDTO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationTime;
    protected Boolean active;
    protected String cronExpression;
    protected CronJobDTO cronJob;
    protected Integer day;
    protected TriggerDTO.DaysOfWeek daysOfWeek;
    protected Integer hour;
    protected JobDTO job;
    protected Integer maxAcceptableDelay;
    protected Integer minute;
    protected Integer month;
    protected Boolean relative;
    protected Integer second;
    protected String timeTable;
    protected Integer weekInterval;
    protected Integer year;

    /**
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationTime(XMLGregorianCalendar value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the cronExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Sets the value of the cronExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCronExpression(String value) {
        this.cronExpression = value;
    }

    /**
     * Gets the value of the cronJob property.
     * 
     * @return
     *     possible object is
     *     {@link CronJobDTO }
     *     
     */
    public CronJobDTO getCronJob() {
        return cronJob;
    }

    /**
     * Sets the value of the cronJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link CronJobDTO }
     *     
     */
    public void setCronJob(CronJobDTO value) {
        this.cronJob = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDay(Integer value) {
        this.day = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerDTO.DaysOfWeek }
     *     
     */
    public TriggerDTO.DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerDTO.DaysOfWeek }
     *     
     */
    public void setDaysOfWeek(TriggerDTO.DaysOfWeek value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHour(Integer value) {
        this.hour = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JobDTO }
     *     
     */
    public JobDTO getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDTO }
     *     
     */
    public void setJob(JobDTO value) {
        this.job = value;
    }

    /**
     * Gets the value of the maxAcceptableDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAcceptableDelay() {
        return maxAcceptableDelay;
    }

    /**
     * Sets the value of the maxAcceptableDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAcceptableDelay(Integer value) {
        this.maxAcceptableDelay = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinute(Integer value) {
        this.minute = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelative(Boolean value) {
        this.relative = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecond(Integer value) {
        this.second = value;
    }

    /**
     * Gets the value of the timeTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTable() {
        return timeTable;
    }

    /**
     * Sets the value of the timeTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTable(String value) {
        this.timeTable = value;
    }

    /**
     * Gets the value of the weekInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekInterval() {
        return weekInterval;
    }

    /**
     * Sets the value of the weekInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekInterval(Integer value) {
        this.weekInterval = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
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
     *         &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "dayOfWeek"
    })
    public static class DaysOfWeek {

        protected List<String> dayOfWeek;

        /**
         * Gets the value of the dayOfWeek property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayOfWeek().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDayOfWeek() {
            if (dayOfWeek == null) {
                dayOfWeek = new ArrayList<String>();
            }
            return this.dayOfWeek;
        }

    }

}
