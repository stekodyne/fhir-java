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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Java class for Claim.Prosthesis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim.Prosthesis">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="initial" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="priorDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="priorMaterial" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.Prosthesis", propOrder = {
    "initial",
    "priorDate",
    "priorMaterial"
})
public class ClaimProsthesis
    extends BackboneElement
{

    protected Boolean initial;
    protected Date priorDate;
    protected Coding priorMaterial;

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitial(Boolean value) {
        this.initial = value;
    }

    /**
     * Gets the value of the priorDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPriorDate() {
        return priorDate;
    }

    /**
     * Sets the value of the priorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPriorDate(Date value) {
        this.priorDate = value;
    }

    /**
     * Gets the value of the priorMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPriorMaterial() {
        return priorMaterial;
    }

    /**
     * Sets the value of the priorMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPriorMaterial(Coding value) {
        this.priorMaterial = value;
    }

}
