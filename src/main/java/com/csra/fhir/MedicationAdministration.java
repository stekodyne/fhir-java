//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationAdministration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationAdministration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationAdministrationStatus"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="practitioner" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="prescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="wasNotGiven" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reasonNotGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reasonGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="effectiveTimeDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectiveTimePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="device" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationAdministration.Dosage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationAdministration", propOrder = {
    "identifier",
    "status",
    "patient",
    "practitioner",
    "encounter",
    "prescription",
    "wasNotGiven",
    "reasonNotGiven",
    "reasonGiven",
    "effectiveTimeDateTimeOrEffectiveTimePeriod",
    "medicationCodeableConceptOrMedicationReference",
    "device",
    "note",
    "dosage"
})
public class MedicationAdministration
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected MedicationAdministrationStatus status;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference practitioner;
    protected Reference encounter;
    protected Reference prescription;
    protected Boolean wasNotGiven;
    protected List<CodeableConcept> reasonNotGiven;
    protected List<CodeableConcept> reasonGiven;
    @XmlElements({
        @XmlElement(name = "effectiveTimeDateTime", type = DateTime.class),
        @XmlElement(name = "effectiveTimePeriod", type = Period.class)
    })
    protected Element effectiveTimeDateTimeOrEffectiveTimePeriod;
    @XmlElements({
        @XmlElement(name = "medicationCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "medicationReference", type = Reference.class)
    })
    protected Element medicationCodeableConceptOrMedicationReference;
    protected List<Reference> device;
    protected String note;
    protected MedicationAdministrationDosage dosage;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationAdministrationStatus }
     *     
     */
    public MedicationAdministrationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationAdministrationStatus }
     *     
     */
    public void setStatus(MedicationAdministrationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the practitioner property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPractitioner() {
        return practitioner;
    }

    /**
     * Sets the value of the practitioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPractitioner(Reference value) {
        this.practitioner = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the prescription property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescription() {
        return prescription;
    }

    /**
     * Sets the value of the prescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescription(Reference value) {
        this.prescription = value;
    }

    /**
     * Gets the value of the wasNotGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWasNotGiven() {
        return wasNotGiven;
    }

    /**
     * Sets the value of the wasNotGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasNotGiven(Boolean value) {
        this.wasNotGiven = value;
    }

    /**
     * Gets the value of the reasonNotGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonNotGiven() {
        if (reasonNotGiven == null) {
            reasonNotGiven = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotGiven;
    }

    /**
     * Gets the value of the reasonGiven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonGiven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonGiven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonGiven() {
        if (reasonGiven == null) {
            reasonGiven = new ArrayList<CodeableConcept>();
        }
        return this.reasonGiven;
    }

    /**
     * Gets the value of the effectiveTimeDateTimeOrEffectiveTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public Element getEffectiveTimeDateTimeOrEffectiveTimePeriod() {
        return effectiveTimeDateTimeOrEffectiveTimePeriod;
    }

    /**
     * Sets the value of the effectiveTimeDateTimeOrEffectiveTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public void setEffectiveTimeDateTimeOrEffectiveTimePeriod(Element value) {
        this.effectiveTimeDateTimeOrEffectiveTimePeriod = value;
    }

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
     * Gets the value of the device property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getDevice() {
        if (device == null) {
            device = new ArrayList<Reference>();
        }
        return this.device;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationAdministrationDosage }
     *     
     */
    public MedicationAdministrationDosage getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationAdministrationDosage }
     *     
     */
    public void setDosage(MedicationAdministrationDosage value) {
        this.dosage = value;
    }

}
