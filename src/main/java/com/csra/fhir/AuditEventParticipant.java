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
import javax.xml.bind.annotation.XmlType;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for AuditEvent.Participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent.Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="altId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="media" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="network" type="{http://hl7.org/fhir}AuditEvent.Network" minOccurs="0"/>
 *         &lt;element name="purposeOfUse" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent.Participant", propOrder = {
    "role",
    "reference",
    "userId",
    "altId",
    "name",
    "requestor",
    "location",
    "policy",
    "media",
    "network",
    "purposeOfUse"
})
public class AuditEventParticipant
    extends BackboneElement
{

    protected List<CodeableConcept> role;
    protected Reference reference;
    protected Identifier userId;
    protected String altId;
    protected String name;
    @XmlElement(required = true)
    protected Boolean requestor;
    protected Reference location;
    protected List<Uri> policy;
    protected Coding media;
    protected AuditEventNetwork network;
    protected List<Coding> purposeOfUse;

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getRole() {
        if (role == null) {
            role = new ArrayList<CodeableConcept>();
        }
        return this.role;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setUserId(Identifier value) {
        this.userId = value;
    }

    /**
     * Gets the value of the altId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltId() {
        return altId;
    }

    /**
     * Sets the value of the altId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltId(String value) {
        this.altId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestor(Boolean value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setLocation(Reference value) {
        this.location = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Uri>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setMedia(Coding value) {
        this.media = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventNetwork }
     *     
     */
    public AuditEventNetwork getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventNetwork }
     *     
     */
    public void setNetwork(AuditEventNetwork value) {
        this.network = value;
    }

    /**
     * Gets the value of the purposeOfUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeOfUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeOfUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getPurposeOfUse() {
        if (purposeOfUse == null) {
            purposeOfUse = new ArrayList<Coding>();
        }
        return this.purposeOfUse;
    }

}
