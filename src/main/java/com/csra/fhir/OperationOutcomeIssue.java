//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of error, warning or information messages that result from a system action.
 * 
 * <p>Java class for OperationOutcome.Issue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationOutcome.Issue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}IssueSeverity"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}IssueType"/>
 *         &lt;element name="details" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="diagnostics" type="{http://hl7.org/fhir}string-primitive" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}string-primitive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationOutcome.Issue", propOrder = {
    "severity",
    "code",
    "details",
    "diagnostics",
    "location"
})
public class OperationOutcomeIssue
    extends BackboneElement
{

    @XmlElement(required = true)
    protected IssueSeverity severity;
    @XmlElement(required = true)
    protected IssueType code;
    protected CodeableConcept details;
    protected java.lang.String diagnostics;
    protected List<java.lang.String> location;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link IssueSeverity }
     *     
     */
    public IssueSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSeverity }
     *     
     */
    public void setSeverity(IssueSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link IssueType }
     *     
     */
    public IssueType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueType }
     *     
     */
    public void setCode(IssueType value) {
        this.code = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDetails(CodeableConcept value) {
        this.details = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDiagnostics(java.lang.String value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getLocation() {
        if (location == null) {
            location = new ArrayList<java.lang.String>();
        }
        return this.location;
    }

}
