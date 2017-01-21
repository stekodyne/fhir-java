//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The details of a healthcare service available at a location.
 * 
 * <p>Java class for HealthcareService.AvailableTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthcareService.AvailableTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="daysOfWeek" type="{http://hl7.org/fhir}DaysOfWeek" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allDay" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="availableStartTime" type="{http://hl7.org/fhir}time" minOccurs="0"/>
 *         &lt;element name="availableEndTime" type="{http://hl7.org/fhir}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareService.AvailableTime", propOrder = {
    "daysOfWeek",
    "allDay",
    "availableStartTime",
    "availableEndTime"
})
public class HealthcareServiceAvailableTime
    extends BackboneElement
{

    protected List<DaysOfWeek> daysOfWeek;
    protected Boolean allDay;
    protected Time availableStartTime;
    protected Time availableEndTime;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeek }
     * 
     * 
     */
    public List<DaysOfWeek> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DaysOfWeek>();
        }
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the allDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllDay() {
        return allDay;
    }

    /**
     * Sets the value of the allDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDay(Boolean value) {
        this.allDay = value;
    }

    /**
     * Gets the value of the availableStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getAvailableStartTime() {
        return availableStartTime;
    }

    /**
     * Sets the value of the availableStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setAvailableStartTime(Time value) {
        this.availableStartTime = value;
    }

    /**
     * Gets the value of the availableEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getAvailableEndTime() {
        return availableEndTime;
    }

    /**
     * Sets the value of the availableEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setAvailableEndTime(Time value) {
        this.availableEndTime = value;
    }

}
