//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for AuditEvent.Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent.Object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="role" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="lifecycle" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="securityLabel" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}AuditEvent.Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent.Object", propOrder = {
    "identifier",
    "reference",
    "type",
    "role",
    "lifecycle",
    "securityLabel",
    "name",
    "description",
    "query",
    "detail"
})
public class AuditEventObject
    extends BackboneElement
{

    protected Identifier identifier;
    protected Reference reference;
    protected Coding type;
    protected Coding role;
    protected Coding lifecycle;
    protected List<Coding> securityLabel;
    protected String name;
    protected String description;
    protected Base64Binary query;
    protected List<AuditEventDetail> detail;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRole(Coding value) {
        this.role = value;
    }

    /**
     * Gets the value of the lifecycle property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getLifecycle() {
        return lifecycle;
    }

    /**
     * Sets the value of the lifecycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setLifecycle(Coding value) {
        this.lifecycle = value;
    }

    /**
     * Gets the value of the securityLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getSecurityLabel() {
        if (securityLabel == null) {
            securityLabel = new ArrayList<Coding>();
        }
        return this.securityLabel;
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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setQuery(Base64Binary value) {
        this.query = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditEventDetail }
     * 
     * 
     */
    public List<AuditEventDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<AuditEventDetail>();
        }
        return this.detail;
    }

}
