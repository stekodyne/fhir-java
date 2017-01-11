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
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * 
 * <p>Java class for QuestionnaireResponse.Answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionnaireResponse.Answer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal"/>
 *           &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer"/>
 *           &lt;element name="valueDate" type="{http://hl7.org/fhir}date"/>
 *           &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant"/>
 *           &lt;element name="valueTime" type="{http://hl7.org/fhir}time"/>
 *           &lt;element name="valueString" type="{http://hl7.org/fhir}string"/>
 *           &lt;element name="valueUri" type="{http://hl7.org/fhir}uri"/>
 *           &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment"/>
 *           &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding"/>
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/>
 *           &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;/choice>
 *         &lt;element name="group" type="{http://hl7.org/fhir}QuestionnaireResponse.Group" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionnaireResponse.Answer", propOrder = {
    "valueBooleanOrValueDecimalOrValueInteger",
    "group"
})
public class QuestionnaireResponseAnswer
    extends BackboneElement
{

    @XmlElements({
        @XmlElement(name = "valueBoolean", type = Boolean.class),
        @XmlElement(name = "valueDecimal", type = Decimal.class),
        @XmlElement(name = "valueInteger", type = Integer.class),
        @XmlElement(name = "valueDate", type = Date.class),
        @XmlElement(name = "valueDateTime", type = DateTime.class),
        @XmlElement(name = "valueInstant", type = Instant.class),
        @XmlElement(name = "valueTime", type = Time.class),
        @XmlElement(name = "valueString", type = String.class),
        @XmlElement(name = "valueUri", type = Uri.class),
        @XmlElement(name = "valueAttachment", type = Attachment.class),
        @XmlElement(name = "valueCoding", type = Coding.class),
        @XmlElement(name = "valueQuantity", type = Quantity.class),
        @XmlElement(name = "valueReference", type = Reference.class)
    })
    protected Element valueBooleanOrValueDecimalOrValueInteger;
    protected List<QuestionnaireResponseGroup> group;

    /**
     * Gets the value of the valueBooleanOrValueDecimalOrValueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     {@link Decimal }
     *     {@link Integer }
     *     {@link Date }
     *     {@link DateTime }
     *     {@link Instant }
     *     {@link Time }
     *     {@link String }
     *     {@link Uri }
     *     {@link Attachment }
     *     {@link Coding }
     *     {@link Quantity }
     *     {@link Reference }
     *     
     */
    public Element getValueBooleanOrValueDecimalOrValueInteger() {
        return valueBooleanOrValueDecimalOrValueInteger;
    }

    /**
     * Sets the value of the valueBooleanOrValueDecimalOrValueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     {@link Decimal }
     *     {@link Integer }
     *     {@link Date }
     *     {@link DateTime }
     *     {@link Instant }
     *     {@link Time }
     *     {@link String }
     *     {@link Uri }
     *     {@link Attachment }
     *     {@link Coding }
     *     {@link Quantity }
     *     {@link Reference }
     *     
     */
    public void setValueBooleanOrValueDecimalOrValueInteger(Element value) {
        this.valueBooleanOrValueDecimalOrValueInteger = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireResponseGroup }
     * 
     * 
     */
    public List<QuestionnaireResponseGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<QuestionnaireResponseGroup>();
        }
        return this.group;
    }

}
