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
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Java class for Claim.Coverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim.Coverage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="focal" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="businessArrangement" type="{http://hl7.org/fhir}string-primitive" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="preAuthRef" type="{http://hl7.org/fhir}string-primitive" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimResponse" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.Coverage", propOrder = {
    "sequence",
    "focal",
    "coverage",
    "businessArrangement",
    "relationship",
    "preAuthRef",
    "claimResponse",
    "originalRuleset"
})
public class ClaimCoverage
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected Boolean focal;
    @XmlElement(required = true)
    protected Reference coverage;
    protected java.lang.String businessArrangement;
    @XmlElement(required = true)
    protected Coding relationship;
    protected List<java.lang.String> preAuthRef;
    protected Reference claimResponse;
    protected Coding originalRuleset;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequence(PositiveInt value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the focal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFocal() {
        return focal;
    }

    /**
     * Sets the value of the focal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocal(Boolean value) {
        this.focal = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCoverage(Reference value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the businessArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBusinessArrangement() {
        return businessArrangement;
    }

    /**
     * Sets the value of the businessArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBusinessArrangement(java.lang.String value) {
        this.businessArrangement = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRelationship(Coding value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the preAuthRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAuthRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAuthRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getPreAuthRef() {
        if (preAuthRef == null) {
            preAuthRef = new ArrayList<java.lang.String>();
        }
        return this.preAuthRef;
    }

    /**
     * Gets the value of the claimResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getClaimResponse() {
        return claimResponse;
    }

    /**
     * Sets the value of the claimResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setClaimResponse(Reference value) {
        this.claimResponse = value;
    }

    /**
     * Gets the value of the originalRuleset property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getOriginalRuleset() {
        return originalRuleset;
    }

    /**
     * Sets the value of the originalRuleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
    }

}
