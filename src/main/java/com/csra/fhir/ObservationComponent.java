//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
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
 * Measurements and simple assertions made about a patient, device or other subject.
 * 
 * <p>Java class for Observation.Component complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Observation.Component">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
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
 *         &lt;element name="referenceRange" type="{http://hl7.org/fhir}Observation.ReferenceRange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Observation.Component", propOrder = {
    "code",
    "valueQuantityOrValueCodeableConceptOrValueString",
    "dataAbsentReason",
    "referenceRange"
})
public class ObservationComponent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept code;
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
    protected List<ObservationReferenceRange> referenceRange;

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

}
