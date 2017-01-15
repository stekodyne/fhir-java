//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Filter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="op" type="{http://hl7.org/fhir}FilterOperator"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}code"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Filter", propOrder = {
    "property",
    "op",
    "value"
})
public class ValueSetFilter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code property;
    @XmlElement(required = true)
    protected FilterOperator op;
    @XmlElement(required = true)
    protected Code value;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProperty(Code value) {
        this.property = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOperator }
     *     
     */
    public FilterOperator getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOperator }
     *     
     */
    public void setOp(FilterOperator value) {
        this.op = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValue(Code value) {
        this.value = value;
    }

}
