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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Observation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Observation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}ObservationStatus"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="effectiveDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="issued" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/>
 *         &lt;/choice>
 *         &lt;element name="dataAbsentReason" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="interpretation" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="specimen" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="device" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Observation.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="related" type="{http://hl7.org/fhir}Observation.Related" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="component" type="{http://hl7.org/fhir}Observation.Component" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation", propOrder = {
    "identifier",
    "status",
    "category",
    "code",
    "subject",
    "encounter",
    "effectiveDateTimeOrEffectivePeriod",
    "issued",
    "performer",
    "valueQuantityOrValueCodeableConceptOrValueString",
    "dataAbsentReason",
    "interpretation",
    "comments",
    "bodySite",
    "method",
    "specimen",
    "device",
    "referenceRange",
    "related",
    "component"
})
public class Observation
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected ObservationStatus status;
    protected CodeableConcept category;
    @XmlElement(required = true)
    protected CodeableConcept code;
    protected Reference subject;
    protected Reference encounter;
    @XmlElements({
        @XmlElement(name = "effectiveDateTime", type = DateTime.class),
        @XmlElement(name = "effectivePeriod", type = Period.class)
    })
    protected Element effectiveDateTimeOrEffectivePeriod;
    protected Instant issued;
    protected List<Reference> performer;
    @XmlElements({
        @XmlElement(name = "valueQuantity", type = Quantity.class),
        @XmlElement(name = "valueCodeableConcept", type = CodeableConcept.class),
        @XmlElement(name = "valueString", type = String.class),
        @XmlElement(name = "valueRange", type = Range.class),
        @XmlElement(name = "valueRatio", type = Ratio.class),
        @XmlElement(name = "valueSampledData", type = SampledData.class),
        @XmlElement(name = "valueAttachment", type = Attachment.class),
        @XmlElement(name = "valueTime", type = Time.class),
        @XmlElement(name = "valueDateTime", type = DateTime.class),
        @XmlElement(name = "valuePeriod", type = Period.class)
    })
    protected Element valueQuantityOrValueCodeableConceptOrValueString;
    protected CodeableConcept dataAbsentReason;
    protected CodeableConcept interpretation;
    protected String comments;
    protected CodeableConcept bodySite;
    protected CodeableConcept method;
    protected Reference specimen;
    protected Reference device;
    protected List<ObservationReferenceRange> referenceRange;
    protected List<ObservationRelated> related;
    protected List<ObservationComponent> component;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationStatus }
     *     
     */
    public ObservationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationStatus }
     *     
     */
    public void setStatus(ObservationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCategory(CodeableConcept value) {
        this.category = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the effectiveDateTimeOrEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public Element getEffectiveDateTimeOrEffectivePeriod() {
        return effectiveDateTimeOrEffectivePeriod;
    }

    /**
     * Sets the value of the effectiveDateTimeOrEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public void setEffectiveDateTimeOrEffectivePeriod(Element value) {
        this.effectiveDateTimeOrEffectivePeriod = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIssued(Instant value) {
        this.issued = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPerformer() {
        if (performer == null) {
            performer = new ArrayList<Reference>();
        }
        return this.performer;
    }

    /**
     * Gets the value of the valueQuantityOrValueCodeableConceptOrValueString property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     {@link CodeableConcept }
     *     {@link String }
     *     {@link Range }
     *     {@link Ratio }
     *     {@link SampledData }
     *     {@link Attachment }
     *     {@link Time }
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public Element getValueQuantityOrValueCodeableConceptOrValueString() {
        return valueQuantityOrValueCodeableConceptOrValueString;
    }

    /**
     * Sets the value of the valueQuantityOrValueCodeableConceptOrValueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     {@link CodeableConcept }
     *     {@link String }
     *     {@link Range }
     *     {@link Ratio }
     *     {@link SampledData }
     *     {@link Attachment }
     *     {@link Time }
     *     {@link DateTime }
     *     {@link Period }
     *     
     */
    public void setValueQuantityOrValueCodeableConceptOrValueString(Element value) {
        this.valueQuantityOrValueCodeableConceptOrValueString = value;
    }

    /**
     * Gets the value of the dataAbsentReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDataAbsentReason() {
        return dataAbsentReason;
    }

    /**
     * Sets the value of the dataAbsentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDataAbsentReason(CodeableConcept value) {
        this.dataAbsentReason = value;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setInterpretation(CodeableConcept value) {
        this.interpretation = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBodySite() {
        return bodySite;
    }

    /**
     * Sets the value of the bodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBodySite(CodeableConcept value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSpecimen() {
        return specimen;
    }

    /**
     * Sets the value of the specimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSpecimen(Reference value) {
        this.specimen = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setDevice(Reference value) {
        this.device = value;
    }

    /**
     * Gets the value of the referenceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationReferenceRange }
     * 
     * 
     */
    public List<ObservationReferenceRange> getReferenceRange() {
        if (referenceRange == null) {
            referenceRange = new ArrayList<ObservationReferenceRange>();
        }
        return this.referenceRange;
    }

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationRelated }
     * 
     * 
     */
    public List<ObservationRelated> getRelated() {
        if (related == null) {
            related = new ArrayList<ObservationRelated>();
        }
        return this.related;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationComponent }
     * 
     * 
     */
    public List<ObservationComponent> getComponent() {
        if (component == null) {
            component = new ArrayList<ObservationComponent>();
        }
        return this.component;
    }

}
