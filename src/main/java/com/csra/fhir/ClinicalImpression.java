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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ClinicalImpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalImpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="assessor" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ClinicalImpressionStatus"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="problem" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="triggerCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="triggerReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="investigations" type="{http://hl7.org/fhir}ClinicalImpression.Investigations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="finding" type="{http://hl7.org/fhir}ClinicalImpression.Finding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resolved" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruledOut" type="{http://hl7.org/fhir}ClinicalImpression.RuledOut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prognosis" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalImpression", propOrder = {
    "patient",
    "assessor",
    "status",
    "date",
    "description",
    "previous",
    "problem",
    "triggerCodeableConcept",
    "triggerReference",
    "investigations",
    "protocol",
    "summary",
    "finding",
    "resolved",
    "ruledOut",
    "prognosis",
    "plan",
    "action"
})
public class ClinicalImpression
    extends DomainResource
{

    @XmlElement(required = true)
    protected Reference patient;
    protected Reference assessor;
    @XmlElement(required = true)
    protected ClinicalImpressionStatus status;
    protected DateTime date;
    protected String description;
    protected Reference previous;
    protected List<Reference> problem;
    protected CodeableConcept triggerCodeableConcept;
    protected Reference triggerReference;
    protected List<ClinicalImpressionInvestigations> investigations;
    protected Uri protocol;
    protected String summary;
    protected List<ClinicalImpressionFinding> finding;
    protected List<CodeableConcept> resolved;
    protected List<ClinicalImpressionRuledOut> ruledOut;
    protected String prognosis;
    protected List<Reference> plan;
    protected List<Reference> action;

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
     * Gets the value of the assessor property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAssessor() {
        return assessor;
    }

    /**
     * Sets the value of the assessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAssessor(Reference value) {
        this.assessor = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalImpressionStatus }
     *     
     */
    public ClinicalImpressionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalImpressionStatus }
     *     
     */
    public void setStatus(ClinicalImpressionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrevious(Reference value) {
        this.previous = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getProblem() {
        if (problem == null) {
            problem = new ArrayList<Reference>();
        }
        return this.problem;
    }

    /**
     * Gets the value of the triggerCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getTriggerCodeableConcept() {
        return triggerCodeableConcept;
    }

    /**
     * Sets the value of the triggerCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setTriggerCodeableConcept(CodeableConcept value) {
        this.triggerCodeableConcept = value;
    }

    /**
     * Gets the value of the triggerReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTriggerReference() {
        return triggerReference;
    }

    /**
     * Sets the value of the triggerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTriggerReference(Reference value) {
        this.triggerReference = value;
    }

    /**
     * Gets the value of the investigations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investigations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestigations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalImpressionInvestigations }
     * 
     * 
     */
    public List<ClinicalImpressionInvestigations> getInvestigations() {
        if (investigations == null) {
            investigations = new ArrayList<ClinicalImpressionInvestigations>();
        }
        return this.investigations;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setProtocol(Uri value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the finding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalImpressionFinding }
     * 
     * 
     */
    public List<ClinicalImpressionFinding> getFinding() {
        if (finding == null) {
            finding = new ArrayList<ClinicalImpressionFinding>();
        }
        return this.finding;
    }

    /**
     * Gets the value of the resolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getResolved() {
        if (resolved == null) {
            resolved = new ArrayList<CodeableConcept>();
        }
        return this.resolved;
    }

    /**
     * Gets the value of the ruledOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruledOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuledOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalImpressionRuledOut }
     * 
     * 
     */
    public List<ClinicalImpressionRuledOut> getRuledOut() {
        if (ruledOut == null) {
            ruledOut = new ArrayList<ClinicalImpressionRuledOut>();
        }
        return this.ruledOut;
    }

    /**
     * Gets the value of the prognosis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrognosis() {
        return prognosis;
    }

    /**
     * Sets the value of the prognosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrognosis(String value) {
        this.prognosis = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPlan() {
        if (plan == null) {
            plan = new ArrayList<Reference>();
        }
        return this.plan;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAction() {
        if (action == null) {
            action = new ArrayList<Reference>();
        }
        return this.action;
    }

}
