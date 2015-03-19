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
 * <p>Java class for sortConfigDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortConfigDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="ascending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="axis" type="{}axisEntryDTO" minOccurs="0"/>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cell" type="{}cellEntryDTO" minOccurs="0"/>
 *         &lt;element name="comparatorClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortByRawValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortConfigDTO", propOrder = {
    "ascending",
    "axis",
    "caseSensitive",
    "cell",
    "comparatorClass",
    "sortByRawValue"
})
public class SortConfigDTO
    extends ItemDTO
{

    protected Boolean ascending;
    protected AxisEntryDTO axis;
    protected Boolean caseSensitive;
    protected CellEntryDTO cell;
    protected String comparatorClass;
    protected Boolean sortByRawValue;

    /**
     * Gets the value of the ascending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAscending() {
        return ascending;
    }

    /**
     * Sets the value of the ascending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAscending(Boolean value) {
        this.ascending = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link AxisEntryDTO }
     *     
     */
    public AxisEntryDTO getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisEntryDTO }
     *     
     */
    public void setAxis(AxisEntryDTO value) {
        this.axis = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the cell property.
     * 
     * @return
     *     possible object is
     *     {@link CellEntryDTO }
     *     
     */
    public CellEntryDTO getCell() {
        return cell;
    }

    /**
     * Sets the value of the cell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellEntryDTO }
     *     
     */
    public void setCell(CellEntryDTO value) {
        this.cell = value;
    }

    /**
     * Gets the value of the comparatorClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparatorClass() {
        return comparatorClass;
    }

    /**
     * Sets the value of the comparatorClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparatorClass(String value) {
        this.comparatorClass = value;
    }

    /**
     * Gets the value of the sortByRawValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortByRawValue() {
        return sortByRawValue;
    }

    /**
     * Sets the value of the sortByRawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortByRawValue(Boolean value) {
        this.sortByRawValue = value;
    }

}
