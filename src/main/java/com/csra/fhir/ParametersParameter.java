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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
 * 
 * <p>Java class for Parameters.Parameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parameters.Parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary"/>
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueCode" type="{http://hl7.org/fhir}code"/>
 *           &lt;element name="valueOid" type="{http://hl7.org/fhir}oid"/>
 *           &lt;element name="valueUuid" type="{http://hl7.org/fhir}uuid"/>
 *           &lt;element name="valueId" type="{http://hl7.org/fhir}id"/>
 *           &lt;element name="valueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt"/>
 *           &lt;element name="valuePositiveInt" type="{http://hl7.org/fhir}positiveInt"/>
 *           &lt;element name="valueMarkdown" type="{http://hl7.org/fhir}markdown"/>
 *           &lt;element name="valueAnnotation" type="{http://hl7.org/fhir}Annotation"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueIdentifier" type="{http://hl7.org/fhir}Identifier"/>
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/>
 *           &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio"/>
 *           &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData"/>
 *           &lt;element name="valueSignature" type="{http://hl7.org/fhir}Signature"/>
 *           &lt;element name="valueHumanName" type="{http://hl7.org/fhir}HumanName"/>
 *           &lt;element name="valueAddress" type="{http://hl7.org/fhir}Address"/>
 *           &lt;element name="valueContactPoint" type="{http://hl7.org/fhir}ContactPoint"/>
 *           &lt;element name="valueTiming" type="{http://hl7.org/fhir}Timing"/>
 *           &lt;element name="valueMeta" type="{http://hl7.org/fhir}Meta"/>
 *           &lt;element name="valueElementDefinition" type="{http://hl7.org/fhir}ElementDefinition"/>
 *         &lt;/choice>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}ResourceContainer" minOccurs="0"/>
 *         &lt;element name="part" type="{http://hl7.org/fhir}Parameters.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameters.Parameter", propOrder = {
    "name",
    "valueBoolean",
    "valueInteger",
    "valueDecimal",
    "valueBase64Binary",
    "valueInstant",
    "valueString",
    "valueUri",
    "valueDate",
    "valueDateTime",
    "valueTime",
    "valueCode",
    "valueOid",
    "valueUuid",
    "valueId",
    "valueUnsignedInt",
    "valuePositiveInt",
    "valueMarkdown",
    "valueAnnotation",
    "valueAttachment",
    "valueIdentifier",
    "valueCodeableConcept",
    "valueCoding",
    "valueQuantity",
    "valueRange",
    "valuePeriod",
    "valueRatio",
    "valueReference",
    "valueSampledData",
    "valueSignature",
    "valueHumanName",
    "valueAddress",
    "valueContactPoint",
    "valueTiming",
    "valueMeta",
    "valueElementDefinition",
    "resource",
    "part"
})
public class ParametersParameter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String name;
    protected Boolean valueBoolean;
    protected Integer valueInteger;
    protected Decimal valueDecimal;
    protected Base64Binary valueBase64Binary;
    protected Instant valueInstant;
    protected String valueString;
    protected Uri valueUri;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Time valueTime;
    protected Code valueCode;
    protected Oid valueOid;
    protected Uuid valueUuid;
    protected Id valueId;
    protected UnsignedInt valueUnsignedInt;
    protected PositiveInt valuePositiveInt;
    protected Markdown valueMarkdown;
    protected Annotation valueAnnotation;
    protected Attachment valueAttachment;
    protected Identifier valueIdentifier;
    protected CodeableConcept valueCodeableConcept;
    protected Coding valueCoding;
    protected Quantity valueQuantity;
    protected Range valueRange;
    protected Period valuePeriod;
    protected Ratio valueRatio;
    protected Reference valueReference;
    protected SampledData valueSampledData;
    protected Signature valueSignature;
    protected HumanName valueHumanName;
    protected Address valueAddress;
    protected ContactPoint valueContactPoint;
    protected Timing valueTiming;
    protected Meta valueMeta;
    protected ElementDefinition valueElementDefinition;
    protected ResourceContainer resource;
    protected List<ParametersParameter> part;

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
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Gets the value of the valueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInteger(Integer value) {
        this.valueInteger = value;
    }

    /**
     * Gets the value of the valueDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Sets the value of the valueDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * Gets the value of the valueBase64Binary property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Sets the value of the valueBase64Binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
    }

    /**
     * Gets the value of the valueInstant property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getValueInstant() {
        return valueInstant;
    }

    /**
     * Sets the value of the valueInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setValueInstant(Instant value) {
        this.valueInstant = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * Sets the value of the valueUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * Gets the value of the valueTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getValueTime() {
        return valueTime;
    }

    /**
     * Sets the value of the valueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setValueTime(Time value) {
        this.valueTime = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the valueOid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getValueOid() {
        return valueOid;
    }

    /**
     * Sets the value of the valueOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setValueOid(Oid value) {
        this.valueOid = value;
    }

    /**
     * Gets the value of the valueUuid property.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getValueUuid() {
        return valueUuid;
    }

    /**
     * Sets the value of the valueUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setValueUuid(Uuid value) {
        this.valueUuid = value;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setValueId(Id value) {
        this.valueId = value;
    }

    /**
     * Gets the value of the valueUnsignedInt property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getValueUnsignedInt() {
        return valueUnsignedInt;
    }

    /**
     * Sets the value of the valueUnsignedInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setValueUnsignedInt(UnsignedInt value) {
        this.valueUnsignedInt = value;
    }

    /**
     * Gets the value of the valuePositiveInt property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getValuePositiveInt() {
        return valuePositiveInt;
    }

    /**
     * Sets the value of the valuePositiveInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setValuePositiveInt(PositiveInt value) {
        this.valuePositiveInt = value;
    }

    /**
     * Gets the value of the valueMarkdown property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getValueMarkdown() {
        return valueMarkdown;
    }

    /**
     * Sets the value of the valueMarkdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setValueMarkdown(Markdown value) {
        this.valueMarkdown = value;
    }

    /**
     * Gets the value of the valueAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getValueAnnotation() {
        return valueAnnotation;
    }

    /**
     * Sets the value of the valueAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setValueAnnotation(Annotation value) {
        this.valueAnnotation = value;
    }

    /**
     * Gets the value of the valueAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * Sets the value of the valueAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * Gets the value of the valueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * Sets the value of the valueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = value;
    }

    /**
     * Gets the value of the valueCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * Sets the value of the valueCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * Gets the value of the valueCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * Sets the value of the valueCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * Gets the value of the valuePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * Sets the value of the valuePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * Gets the value of the valueRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * Sets the value of the valueRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
    }

    /**
     * Gets the value of the valueReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * Sets the value of the valueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setValueReference(Reference value) {
        this.valueReference = value;
    }

    /**
     * Gets the value of the valueSampledData property.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * Sets the value of the valueSampledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * Gets the value of the valueSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getValueSignature() {
        return valueSignature;
    }

    /**
     * Sets the value of the valueSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setValueSignature(Signature value) {
        this.valueSignature = value;
    }

    /**
     * Gets the value of the valueHumanName property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * Sets the value of the valueHumanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setValueHumanName(HumanName value) {
        this.valueHumanName = value;
    }

    /**
     * Gets the value of the valueAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * Sets the value of the valueAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setValueAddress(Address value) {
        this.valueAddress = value;
    }

    /**
     * Gets the value of the valueContactPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getValueContactPoint() {
        return valueContactPoint;
    }

    /**
     * Sets the value of the valueContactPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setValueContactPoint(ContactPoint value) {
        this.valueContactPoint = value;
    }

    /**
     * Gets the value of the valueTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getValueTiming() {
        return valueTiming;
    }

    /**
     * Sets the value of the valueTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setValueTiming(Timing value) {
        this.valueTiming = value;
    }

    /**
     * Gets the value of the valueMeta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getValueMeta() {
        return valueMeta;
    }

    /**
     * Sets the value of the valueMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setValueMeta(Meta value) {
        this.valueMeta = value;
    }

    /**
     * Gets the value of the valueElementDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ElementDefinition }
     *     
     */
    public ElementDefinition getValueElementDefinition() {
        return valueElementDefinition;
    }

    /**
     * Sets the value of the valueElementDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDefinition }
     *     
     */
    public void setValueElementDefinition(ElementDefinition value) {
        this.valueElementDefinition = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContainer }
     *     
     */
    public ResourceContainer getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContainer }
     *     
     */
    public void setResource(ResourceContainer value) {
        this.resource = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersParameter }
     * 
     * 
     */
    public List<ParametersParameter> getPart() {
        if (part == null) {
            part = new ArrayList<ParametersParameter>();
        }
        return this.part;
    }

}
