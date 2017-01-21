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
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 * 
 * <p>Java class for Goal.Outcome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Goal.Outcome">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="resultCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="resultReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goal.Outcome", propOrder = {
    "resultCodeableConcept",
    "resultReference"
})
public class GoalOutcome
    extends BackboneElement
{

    protected CodeableConcept resultCodeableConcept;
    protected Reference resultReference;

    /**
     * Gets the value of the resultCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getResultCodeableConcept() {
        return resultCodeableConcept;
    }

    /**
     * Sets the value of the resultCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setResultCodeableConcept(CodeableConcept value) {
        this.resultCodeableConcept = value;
    }

    /**
     * Gets the value of the resultReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResultReference() {
        return resultReference;
    }

    /**
     * Sets the value of the resultReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResultReference(Reference value) {
        this.resultReference = value;
    }

}
