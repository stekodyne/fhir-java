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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}SubscriptionStatus"/>
 *         &lt;element name="error" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://hl7.org/fhir}Subscription.Channel"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "criteria",
    "contact",
    "reason",
    "status",
    "error",
    "channel",
    "end",
    "tag"
})
public class Subscription
    extends DomainResource
{

    @XmlElement(required = true)
    protected String criteria;
    protected List<ContactPoint> contact;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected SubscriptionStatus status;
    protected String error;
    @XmlElement(required = true)
    protected SubscriptionChannel channel;
    protected Instant end;
    protected List<Coding> tag;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPoint }
     * 
     * 
     */
    public List<ContactPoint> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPoint>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatus }
     *     
     */
    public SubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatus }
     *     
     */
    public void setStatus(SubscriptionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionChannel }
     *     
     */
    public SubscriptionChannel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionChannel }
     *     
     */
    public void setChannel(SubscriptionChannel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setEnd(Instant value) {
        this.end = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getTag() {
        if (tag == null) {
            tag = new ArrayList<Coding>();
        }
        return this.tag;
    }

}
