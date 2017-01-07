//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
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
 * <p>Java class for AuditEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="event" type="{http://hl7.org/fhir}AuditEvent.Event"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}AuditEvent.Participant" maxOccurs="unbounded"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}AuditEvent.Source"/>
 *         &lt;element name="object" type="{http://hl7.org/fhir}AuditEvent.Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent", propOrder = {
    "event",
    "participant",
    "source",
    "object"
})
public class AuditEvent
    extends DomainResource
{

    @XmlElement(required = true)
    protected AuditEventEvent event;
    @XmlElement(required = true)
    protected List<AuditEventParticipant> participant;
    @XmlElement(required = true)
    protected AuditEventSource source;
    protected List<AuditEventObject> object;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventEvent }
     *     
     */
    public AuditEventEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventEvent }
     *     
     */
    public void setEvent(AuditEventEvent value) {
        this.event = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditEventParticipant }
     * 
     * 
     */
    public List<AuditEventParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<AuditEventParticipant>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventSource }
     *     
     */
    public AuditEventSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventSource }
     *     
     */
    public void setSource(AuditEventSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditEventObject }
     * 
     * 
     */
    public List<AuditEventObject> getObject() {
        if (object == null) {
            object = new ArrayList<AuditEventObject>();
        }
        return this.object;
    }

}
