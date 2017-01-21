//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Timing.Repeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Timing.Repeat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="boundsQuantity" type="{http://hl7.org/fhir}Duration"/>
 *           &lt;element name="boundsRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="boundsPeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="count" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="durationMax" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="durationUnits" type="{http://hl7.org/fhir}UnitsOfTime" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="frequencyMax" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="periodMax" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="periodUnits" type="{http://hl7.org/fhir}UnitsOfTime" minOccurs="0"/>
 *         &lt;element name="when" type="{http://hl7.org/fhir}EventTiming" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timing.Repeat", propOrder = {
    "boundsQuantity",
    "boundsRange",
    "boundsPeriod",
    "count",
    "duration",
    "durationMax",
    "durationUnits",
    "frequency",
    "frequencyMax",
    "period",
    "periodMax",
    "periodUnits",
    "when"
})
public class TimingRepeat
    extends Element
{

    protected Duration boundsQuantity;
    protected Range boundsRange;
    protected Period boundsPeriod;
    protected Integer count;
    protected Decimal duration;
    protected Decimal durationMax;
    protected UnitsOfTime durationUnits;
    protected Integer frequency;
    protected Integer frequencyMax;
    protected Decimal period;
    protected Decimal periodMax;
    protected UnitsOfTime periodUnits;
    protected EventTiming when;

    /**
     * Gets the value of the boundsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBoundsQuantity() {
        return boundsQuantity;
    }

    /**
     * Sets the value of the boundsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBoundsQuantity(Duration value) {
        this.boundsQuantity = value;
    }

    /**
     * Gets the value of the boundsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getBoundsRange() {
        return boundsRange;
    }

    /**
     * Sets the value of the boundsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setBoundsRange(Range value) {
        this.boundsRange = value;
    }

    /**
     * Gets the value of the boundsPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBoundsPeriod() {
        return boundsPeriod;
    }

    /**
     * Sets the value of the boundsPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBoundsPeriod(Period value) {
        this.boundsPeriod = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDuration(Decimal value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationMax property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getDurationMax() {
        return durationMax;
    }

    /**
     * Sets the value of the durationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setDurationMax(Decimal value) {
        this.durationMax = value;
    }

    /**
     * Gets the value of the durationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfTime }
     *     
     */
    public UnitsOfTime getDurationUnits() {
        return durationUnits;
    }

    /**
     * Sets the value of the durationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfTime }
     *     
     */
    public void setDurationUnits(UnitsOfTime value) {
        this.durationUnits = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the frequencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyMax() {
        return frequencyMax;
    }

    /**
     * Sets the value of the frequencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyMax(Integer value) {
        this.frequencyMax = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriod(Decimal value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodMax property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPeriodMax() {
        return periodMax;
    }

    /**
     * Sets the value of the periodMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPeriodMax(Decimal value) {
        this.periodMax = value;
    }

    /**
     * Gets the value of the periodUnits property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfTime }
     *     
     */
    public UnitsOfTime getPeriodUnits() {
        return periodUnits;
    }

    /**
     * Sets the value of the periodUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfTime }
     *     
     */
    public void setPeriodUnits(UnitsOfTime value) {
        this.periodUnits = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link EventTiming }
     *     
     */
    public EventTiming getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTiming }
     *     
     */
    public void setWhen(EventTiming value) {
        this.when = value;
    }

}
