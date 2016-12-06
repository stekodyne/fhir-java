//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for ElementDefinition.Constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Constraint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://hl7.org/fhir}string-primitive"/>
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string-primitive" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}ConstraintSeverity"/>
 *         &lt;element name="human" type="{http://hl7.org/fhir}string-primitive"/>
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string-primitive"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Constraint", propOrder = {
    "key",
    "requirements",
    "severity",
    "human",
    "xpath"
})
public class ElementDefinitionConstraint
    extends Element
{

    @XmlElement(required = true)
    protected java.lang.String key;
    protected java.lang.String requirements;
    @XmlElement(required = true)
    protected ConstraintSeverity severity;
    @XmlElement(required = true)
    protected java.lang.String human;
    @XmlElement(required = true)
    protected java.lang.String xpath;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKey(java.lang.String value) {
        this.key = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRequirements(java.lang.String value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintSeverity }
     *     
     */
    public ConstraintSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintSeverity }
     *     
     */
    public void setSeverity(ConstraintSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the human property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHuman() {
        return human;
    }

    /**
     * Sets the value of the human property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHuman(java.lang.String value) {
        this.human = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setXpath(java.lang.String value) {
        this.xpath = value;
    }

}
