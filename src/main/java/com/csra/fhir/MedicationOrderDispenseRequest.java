//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
 * 
 * <p>Java class for MedicationOrder.DispenseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationOrder.DispenseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="validityPeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="numberOfRepeatsAllowed" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="expectedSupplyDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationOrder.DispenseRequest", propOrder = {
    "medicationCodeableConceptOrMedicationReference",
    "validityPeriod",
    "numberOfRepeatsAllowed",
    "quantity",
    "expectedSupplyDuration"
})
public class MedicationOrderDispenseRequest
    extends BackboneElement
{

    @XmlElements({
        @XmlElement(name = "medicationCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "medicationReference", type = Reference.class)
    })
    protected Element medicationCodeableConceptOrMedicationReference;
    protected Period validityPeriod;
    protected PositiveInt numberOfRepeatsAllowed;
    protected SimpleQuantity quantity;
    protected Duration expectedSupplyDuration;

    /**
     * Gets the value of the medicationCodeableConceptOrMedicationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public Element getMedicationCodeableConceptOrMedicationReference() {
        return medicationCodeableConceptOrMedicationReference;
    }

    /**
     * Sets the value of the medicationCodeableConceptOrMedicationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public void setMedicationCodeableConceptOrMedicationReference(Element value) {
        this.medicationCodeableConceptOrMedicationReference = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValidityPeriod(Period value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the numberOfRepeatsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getNumberOfRepeatsAllowed() {
        return numberOfRepeatsAllowed;
    }

    /**
     * Sets the value of the numberOfRepeatsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setNumberOfRepeatsAllowed(PositiveInt value) {
        this.numberOfRepeatsAllowed = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the expectedSupplyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedSupplyDuration() {
        return expectedSupplyDuration;
    }

    /**
     * Sets the value of the expectedSupplyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedSupplyDuration(Duration value) {
        this.expectedSupplyDuration = value;
    }

}
