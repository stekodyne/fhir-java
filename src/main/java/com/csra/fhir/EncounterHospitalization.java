//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 * <p>Java class for Encounter.Hospitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Encounter.Hospitalization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="preAdmissionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="admitSource" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="admittingDiagnosis" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reAdmission" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="dietPreference" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialCourtesy" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialArrangement" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dischargeDisposition" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="dischargeDiagnosis" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter.Hospitalization", propOrder = {
    "preAdmissionIdentifier",
    "origin",
    "admitSource",
    "admittingDiagnosis",
    "reAdmission",
    "dietPreference",
    "specialCourtesy",
    "specialArrangement",
    "destination",
    "dischargeDisposition",
    "dischargeDiagnosis"
})
public class EncounterHospitalization
    extends BackboneElement
{

    protected Identifier preAdmissionIdentifier;
    protected Reference origin;
    protected CodeableConcept admitSource;
    protected List<Reference> admittingDiagnosis;
    protected CodeableConcept reAdmission;
    protected List<CodeableConcept> dietPreference;
    protected List<CodeableConcept> specialCourtesy;
    protected List<CodeableConcept> specialArrangement;
    protected Reference destination;
    protected CodeableConcept dischargeDisposition;
    protected List<Reference> dischargeDiagnosis;

    /**
     * Gets the value of the preAdmissionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getPreAdmissionIdentifier() {
        return preAdmissionIdentifier;
    }

    /**
     * Sets the value of the preAdmissionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPreAdmissionIdentifier(Identifier value) {
        this.preAdmissionIdentifier = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrigin(Reference value) {
        this.origin = value;
    }

    /**
     * Gets the value of the admitSource property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdmitSource() {
        return admitSource;
    }

    /**
     * Sets the value of the admitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdmitSource(CodeableConcept value) {
        this.admitSource = value;
    }

    /**
     * Gets the value of the admittingDiagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admittingDiagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmittingDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAdmittingDiagnosis() {
        if (admittingDiagnosis == null) {
            admittingDiagnosis = new ArrayList<Reference>();
        }
        return this.admittingDiagnosis;
    }

    /**
     * Gets the value of the reAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getReAdmission() {
        return reAdmission;
    }

    /**
     * Sets the value of the reAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setReAdmission(CodeableConcept value) {
        this.reAdmission = value;
    }

    /**
     * Gets the value of the dietPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dietPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDietPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getDietPreference() {
        if (dietPreference == null) {
            dietPreference = new ArrayList<CodeableConcept>();
        }
        return this.dietPreference;
    }

    /**
     * Gets the value of the specialCourtesy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCourtesy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCourtesy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialCourtesy() {
        if (specialCourtesy == null) {
            specialCourtesy = new ArrayList<CodeableConcept>();
        }
        return this.specialCourtesy;
    }

    /**
     * Gets the value of the specialArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getSpecialArrangement() {
        if (specialArrangement == null) {
            specialArrangement = new ArrayList<CodeableConcept>();
        }
        return this.specialArrangement;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDestination(Reference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the dischargeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDischargeDisposition() {
        return dischargeDisposition;
    }

    /**
     * Sets the value of the dischargeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDischargeDisposition(CodeableConcept value) {
        this.dischargeDisposition = value;
    }

    /**
     * Gets the value of the dischargeDiagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dischargeDiagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDischargeDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getDischargeDiagnosis() {
        if (dischargeDiagnosis == null) {
            dischargeDiagnosis = new ArrayList<Reference>();
        }
        return this.dischargeDiagnosis;
    }

}
