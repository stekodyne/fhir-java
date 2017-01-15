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
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateRecorded" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="clinicalStatus" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="verificationStatus" type="{http://hl7.org/fhir}ConditionVerificationStatus"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="onsetDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="onsetQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="onsetPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="onsetRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="onsetString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="abatementDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="abatementQuantity" type="{http://hl7.org/fhir}Age"/>
 *           &lt;element name="abatementBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="abatementPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="abatementRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="abatementString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="stage" type="{http://hl7.org/fhir}Condition.Stage" minOccurs="0"/>
 *         &lt;element name="evidence" type="{http://hl7.org/fhir}Condition.Evidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "identifier",
    "patient",
    "encounter",
    "asserter",
    "dateRecorded",
    "code",
    "category",
    "clinicalStatus",
    "verificationStatus",
    "severity",
    "onsetDateTimeOrOnsetQuantityOrOnsetPeriod",
    "abatementDateTimeOrAbatementQuantityOrAbatementBoolean",
    "stage",
    "evidence",
    "bodySite",
    "notes"
})
public class Condition
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference encounter;
    protected Reference asserter;
    protected Date dateRecorded;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected CodeableConcept category;
    protected Code clinicalStatus;
    @XmlElement(required = true)
    protected ConditionVerificationStatus verificationStatus;
    protected CodeableConcept severity;
    @XmlElements({
        @XmlElement(name = "onsetDateTime", type = DateTime.class),
        @XmlElement(name = "onsetQuantity", type = Age.class),
        @XmlElement(name = "onsetPeriod", type = Period.class),
        @XmlElement(name = "onsetRange", type = Range.class),
        @XmlElement(name = "onsetString", type = String.class)
    })
    protected Element onsetDateTimeOrOnsetQuantityOrOnsetPeriod;
    @XmlElements({
        @XmlElement(name = "abatementDateTime", type = DateTime.class),
        @XmlElement(name = "abatementQuantity", type = Age.class),
        @XmlElement(name = "abatementBoolean", type = Boolean.class),
        @XmlElement(name = "abatementPeriod", type = Period.class),
        @XmlElement(name = "abatementRange", type = Range.class),
        @XmlElement(name = "abatementString", type = String.class)
    })
    protected Element abatementDateTimeOrAbatementQuantityOrAbatementBoolean;
    protected ConditionStage stage;
    protected List<ConditionEvidence> evidence;
    protected List<CodeableConcept> bodySite;
    protected String notes;

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
     * Gets the value of the asserter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAsserter() {
        return asserter;
    }

    /**
     * Sets the value of the asserter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAsserter(Reference value) {
        this.asserter = value;
    }

    /**
     * Gets the value of the dateRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateRecorded() {
        return dateRecorded;
    }

    /**
     * Sets the value of the dateRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateRecorded(Date value) {
        this.dateRecorded = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * Gets the value of the clinicalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getClinicalStatus() {
        return clinicalStatus;
    }

    /**
     * Sets the value of the clinicalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setClinicalStatus(Code value) {
        this.clinicalStatus = value;
    }

    /**
     * Gets the value of the verificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionVerificationStatus }
     *     
     */
    public ConditionVerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the value of the verificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionVerificationStatus }
     *     
     */
    public void setVerificationStatus(ConditionVerificationStatus value) {
        this.verificationStatus = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSeverity(CodeableConcept value) {
        this.severity = value;
    }

    /**
     * Gets the value of the onsetDateTimeOrOnsetQuantityOrOnsetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     {@link Age }
     *     {@link Period }
     *     {@link Range }
     *     {@link String }
     *     
     */
    public Element getOnsetDateTimeOrOnsetQuantityOrOnsetPeriod() {
        return onsetDateTimeOrOnsetQuantityOrOnsetPeriod;
    }

    /**
     * Sets the value of the onsetDateTimeOrOnsetQuantityOrOnsetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     {@link Age }
     *     {@link Period }
     *     {@link Range }
     *     {@link String }
     *     
     */
    public void setOnsetDateTimeOrOnsetQuantityOrOnsetPeriod(Element value) {
        this.onsetDateTimeOrOnsetQuantityOrOnsetPeriod = value;
    }

    /**
     * Gets the value of the abatementDateTimeOrAbatementQuantityOrAbatementBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     {@link Age }
     *     {@link Boolean }
     *     {@link Period }
     *     {@link Range }
     *     {@link String }
     *     
     */
    public Element getAbatementDateTimeOrAbatementQuantityOrAbatementBoolean() {
        return abatementDateTimeOrAbatementQuantityOrAbatementBoolean;
    }

    /**
     * Sets the value of the abatementDateTimeOrAbatementQuantityOrAbatementBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     {@link Age }
     *     {@link Boolean }
     *     {@link Period }
     *     {@link Range }
     *     {@link String }
     *     
     */
    public void setAbatementDateTimeOrAbatementQuantityOrAbatementBoolean(Element value) {
        this.abatementDateTimeOrAbatementQuantityOrAbatementBoolean = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStage }
     *     
     */
    public ConditionStage getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStage }
     *     
     */
    public void setStage(ConditionStage value) {
        this.stage = value;
    }

    /**
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionEvidence }
     * 
     * 
     */
    public List<ConditionEvidence> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<ConditionEvidence>();
        }
        return this.evidence;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getBodySite() {
        if (bodySite == null) {
            bodySite = new ArrayList<CodeableConcept>();
        }
        return this.bodySite;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
