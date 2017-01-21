//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * 
 * <p>Java class for Provenance.Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provenance.Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}ProvenanceEntityRole"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://hl7.org/fhir}Provenance.Agent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance.Entity", propOrder = {
    "role",
    "type",
    "reference",
    "display",
    "agent"
})
public class ProvenanceEntity
    extends BackboneElement
{

    @XmlElement(required = true)
    protected ProvenanceEntityRole role;
    @XmlElement(required = true)
    protected Coding type;
    @XmlElement(required = true)
    protected Uri reference;
    protected String display;
    protected ProvenanceAgent agent;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public ProvenanceEntityRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public void setRole(ProvenanceEntityRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setReference(Uri value) {
        this.reference = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceAgent }
     *     
     */
    public ProvenanceAgent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceAgent }
     *     
     */
    public void setAgent(ProvenanceAgent value) {
        this.agent = value;
    }

}
