//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for HTTPVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTTPVerb">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}HTTPVerb-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTTPVerb")
public class HTTPVerb
    extends Element
{

    @XmlAttribute(name = "value")
    protected HTTPVerbList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPVerbList }
     *     
     */
    public HTTPVerbList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPVerbList }
     *     
     */
    public void setValue(HTTPVerbList value) {
        this.value = value;
    }

}
