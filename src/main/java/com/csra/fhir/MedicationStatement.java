//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
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
 * <p>Java class for MedicationStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="informationSource" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateAsserted" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}MedicationStatementStatus"/>
 *         &lt;element name="wasNotTaken" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="reasonNotTaken" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="reasonForUseCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="reasonForUseReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="supportingInformation" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="medicationCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="medicationReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationStatement.Dosage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationStatement", propOrder = {
    "identifier",
    "patient",
    "informationSource",
    "dateAsserted",
    "status",
    "wasNotTaken",
    "reasonNotTaken",
    "reasonForUseCodeableConceptOrReasonForUseReference",
    "effectiveDateTimeOrEffectivePeriod",
    "note",
    "supportingInformation",
    "medicationCodeableConceptOrMedicationReference",
    "dosage"
})
public class MedicationStatement
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference informationSource;
    protected DateTime dateAsserted;
    @XmlElement(required = true)
    protected MedicationStatementStatus status;
    protected Boolean wasNotTaken;
    protected List<CodeableConcept> reasonNotTaken;
    @XmlElements({
        @XmlElement(name = "reasonForUseCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "reasonForUseReference", type = Reference.class)
    })
    protected Element reasonForUseCodeableConceptOrReasonForUseReference;
    @XmlElements({
        @XmlElement(name = "effectiveDateTime", type = DateTime.class),
        @XmlElement(name = "effectivePeriod", type = Period.class)
    })
    protected Element effectiveDateTimeOrEffectivePeriod;
    protected String note;
    protected List<Reference> supportingInformation;
    @XmlElements({
        @XmlElement(name = "medicationCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "medicationReference", type = Reference.class)
    })
    protected Element medicationCodeableConceptOrMedicationReference;
    protected List<MedicationStatementDosage> dosage;

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
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setInformationSource(Reference value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the dateAsserted property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateAsserted() {
        return dateAsserted;
    }

    /**
     * Sets the value of the dateAsserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateAsserted(DateTime value) {
        this.dateAsserted = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationStatementStatus }
     *     
     */
    public MedicationStatementStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationStatementStatus }
     *     
     */
    public void setStatus(MedicationStatementStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the wasNotTaken property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWasNotTaken() {
        return wasNotTaken;
    }

    /**
     * Sets the value of the wasNotTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasNotTaken(Boolean value) {
        this.wasNotTaken = value;
    }

    /**
     * Gets the value of the reasonNotTaken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotTaken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotTaken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonNotTaken() {
        if (reasonNotTaken == null) {
            reasonNotTaken = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotTaken;
    }

    /**
     * Gets the value of the reasonForUseCodeableConceptOrReasonForUseReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public Element getReasonForUseCodeableConceptOrReasonForUseReference() {
        return reasonForUseCodeableConceptOrReasonForUseReference;
    }

    /**
     * Sets the value of the reasonForUseCodeableConceptOrReasonForUseReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     {@link Reference }
     *     
     */
    public void setReasonForUseCodeableConceptOrReasonForUseReference(Element value) {
        this.reasonForUseCodeableConceptOrReasonForUseReference = value;
    }

    /**
     * Gets the value of the effectiveDateTimeOrEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public Element getEffectiveDateTimeOrEffectivePeriod() {
        return effectiveDateTimeOrEffectivePeriod;
    }

    /**
     * Sets the value of the effectiveDateTimeOrEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public void setEffectiveDateTimeOrEffectivePeriod(Element value) {
        this.effectiveDateTimeOrEffectivePeriod = value;
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
     * Gets the value of the supportingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingInformation() {
        if (supportingInformation == null) {
            supportingInformation = new ArrayList<Reference>();
        }
        return this.supportingInformation;
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
     * Gets the value of the dosage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationStatementDosage }
     * 
     * 
     */
    public List<MedicationStatementDosage> getDosage() {
        if (dosage == null) {
            dosage = new ArrayList<MedicationStatementDosage>();
        }
        return this.dosage;
    }

}
