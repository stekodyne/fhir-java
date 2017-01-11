//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
 * 
 * <p>Java class for MedicationDispense.DosageInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.DosageInstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="additionalInstructions" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="timing" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="siteCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="siteReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="doseRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="doseQuantity" type="{http://hl7.org/fhir}SimpleQuantity"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="rateRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="rateRange" type="{http://hl7.org/fhir}Range"/>
 *         &lt;/choice>
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.DosageInstruction", propOrder = {
    "text",
    "additionalInstructions",
    "timing",
    "asNeededBooleanOrAsNeededCodeableConcept",
    "siteCodeableConceptOrSiteReference",
    "route",
    "method",
    "doseRangeOrDoseQuantity",
    "rateRatioOrRateRange",
    "maxDosePerPeriod"
})
public class MedicationDispenseDosageInstruction
    extends BackboneElement
{

    protected String text;
    protected CodeableConcept additionalInstructions;
    protected Timing timing;
    @XmlElements({
        @XmlElement(name = "asNeededBoolean", type = Boolean.class),
        @XmlElement(name = "asNeededCodeableConcept", type = CodeableConcept.class)
    })
    protected Element asNeededBooleanOrAsNeededCodeableConcept;
    @XmlElements({
        @XmlElement(name = "siteCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "siteReference", type = Reference.class)
    })
    protected Element siteCodeableConceptOrSiteReference;
    protected CodeableConcept route;
    protected CodeableConcept method;
    @XmlElements({
        @XmlElement(name = "doseRange", type = Range.class),
        @XmlElement(name = "doseQuantity", type = SimpleQuantity.class)
    })
    protected Element doseRangeOrDoseQuantity;
    @XmlElements({
        @XmlElement(name = "rateRatio", type = Ratio.class),
        @XmlElement(name = "rateRange", type = Range.class)
    })
    protected Element rateRatioOrRateRange;
    protected Ratio maxDosePerPeriod;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the additionalInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdditionalInstructions() {
        return additionalInstructions;
    }

    /**
     * Sets the value of the additionalInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = value;
    }

    /**
     * Gets the value of the timing property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getTiming() {
        return timing;
    }

    /**
     * Sets the value of the timing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setTiming(Timing value) {
        this.timing = value;
    }

    /**
     * Gets the value of the asNeededBooleanOrAsNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     {@link CodeableConcept }
     *     
     */
    public Element getAsNeededBooleanOrAsNeededCodeableConcept() {
        return asNeededBooleanOrAsNeededCodeableConcept;
    }

    /**
     * Sets the value of the asNeededBooleanOrAsNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededBooleanOrAsNeededCodeableConcept(Element value) {
        this.asNeededBooleanOrAsNeededCodeableConcept = value;
    }

    /**
     * Gets the value of the siteCodeableConceptOrSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public Element getSiteCodeableConceptOrSiteReference() {
        return siteCodeableConceptOrSiteReference;
    }

    /**
     * Sets the value of the siteCodeableConceptOrSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public void setSiteCodeableConceptOrSiteReference(Element value) {
        this.siteCodeableConceptOrSiteReference = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the doseRangeOrDoseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     {@link SimpleQuantity }
     *     
     */
    public Element getDoseRangeOrDoseQuantity() {
        return doseRangeOrDoseQuantity;
    }

    /**
     * Sets the value of the doseRangeOrDoseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     {@link SimpleQuantity }
     *     
     */
    public void setDoseRangeOrDoseQuantity(Element value) {
        this.doseRangeOrDoseQuantity = value;
    }

    /**
     * Gets the value of the rateRatioOrRateRange property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     {@link Range }
     *     
     */
    public Element getRateRatioOrRateRange() {
        return rateRatioOrRateRange;
    }

    /**
     * Sets the value of the rateRatioOrRateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     {@link Range }
     *     
     */
    public void setRateRatioOrRateRange(Element value) {
        this.rateRatioOrRateRange = value;
    }

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
    }

}
