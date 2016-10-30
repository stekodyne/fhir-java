//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.29 at 04:21:59 PM PDT 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateWritten" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationOrderStatus" minOccurs="0"/>
 *         &lt;element name="dateEnded" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="reasonEnded" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="prescriber" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="dosageInstruction" type="{http://hl7.org/fhir}MedicationOrder.DosageInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dispenseRequest" type="{http://hl7.org/fhir}MedicationOrder.DispenseRequest" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://hl7.org/fhir}MedicationOrder.Substitution" minOccurs="0"/>
 *         &lt;element name="priorPrescription" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationOrder", propOrder = {
    "identifier",
    "dateWritten",
    "status",
    "dateEnded",
    "reasonEnded",
    "patient",
    "prescriber",
    "encounter",
    "reasonCodeableConcept",
    "reasonReference",
    "note",
    "medicationCodeableConcept",
    "medicationReference",
    "dosageInstruction",
    "dispenseRequest",
    "substitution",
    "priorPrescription"
})
public class MedicationOrder
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected DateTime dateWritten;
    protected MedicationOrderStatus status;
    protected DateTime dateEnded;
    protected CodeableConcept reasonEnded;
    protected Reference patient;
    protected Reference prescriber;
    protected Reference encounter;
    protected CodeableConcept reasonCodeableConcept;
    protected Reference reasonReference;
    protected String note;
    protected CodeableConcept medicationCodeableConcept;
    protected Reference medicationReference;
    protected List<MedicationOrderDosageInstruction> dosageInstruction;
    protected MedicationOrderDispenseRequest dispenseRequest;
    protected MedicationOrderSubstitution substitution;
    protected Reference priorPrescription;

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
     * Gets the value of the dateWritten property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateWritten() {
        return dateWritten;
    }

    /**
     * Sets the value of the dateWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateWritten(DateTime value) {
        this.dateWritten = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderStatus }
     *     
     */
    public MedicationOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderStatus }
     *     
     */
    public void setStatus(MedicationOrderStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the dateEnded property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateEnded() {
        return dateEnded;
    }

    /**
     * Sets the value of the dateEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateEnded(DateTime value) {
        this.dateEnded = value;
    }

    /**
     * Gets the value of the reasonEnded property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonEnded() {
        return reasonEnded;
    }

    /**
     * Sets the value of the reasonEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonEnded(CodeableConcept value) {
        this.reasonEnded = value;
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
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescriber(Reference value) {
        this.prescriber = value;
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
     * Gets the value of the reasonCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    /**
     * Sets the value of the reasonCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = value;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReasonReference(Reference value) {
        this.reasonReference = value;
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
     * Gets the value of the medicationCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMedicationCodeableConcept() {
        return medicationCodeableConcept;
    }

    /**
     * Sets the value of the medicationCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMedicationCodeableConcept(CodeableConcept value) {
        this.medicationCodeableConcept = value;
    }

    /**
     * Gets the value of the medicationReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getMedicationReference() {
        return medicationReference;
    }

    /**
     * Sets the value of the medicationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setMedicationReference(Reference value) {
        this.medicationReference = value;
    }

    /**
     * Gets the value of the dosageInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosageInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosageInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationOrderDosageInstruction }
     * 
     * 
     */
    public List<MedicationOrderDosageInstruction> getDosageInstruction() {
        if (dosageInstruction == null) {
            dosageInstruction = new ArrayList<MedicationOrderDosageInstruction>();
        }
        return this.dosageInstruction;
    }

    /**
     * Gets the value of the dispenseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderDispenseRequest }
     *     
     */
    public MedicationOrderDispenseRequest getDispenseRequest() {
        return dispenseRequest;
    }

    /**
     * Sets the value of the dispenseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderDispenseRequest }
     *     
     */
    public void setDispenseRequest(MedicationOrderDispenseRequest value) {
        this.dispenseRequest = value;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationOrderSubstitution }
     *     
     */
    public MedicationOrderSubstitution getSubstitution() {
        return substitution;
    }

    /**
     * Sets the value of the substitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationOrderSubstitution }
     *     
     */
    public void setSubstitution(MedicationOrderSubstitution value) {
        this.substitution = value;
    }

    /**
     * Gets the value of the priorPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPriorPrescription() {
        return priorPrescription;
    }

    /**
     * Sets the value of the priorPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPriorPrescription(Reference value) {
        this.priorPrescription = value;
    }

}
