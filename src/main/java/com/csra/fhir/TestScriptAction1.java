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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>Java class for TestScript.Action1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Action1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}TestScript.Operation" minOccurs="0"/>
 *         &lt;element name="assert" type="{http://hl7.org/fhir}TestScript.Assert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Action1", propOrder = {
    "operation",
    "_assert"
})
public class TestScriptAction1
    extends BackboneElement
{

    protected TestScriptOperation operation;
    @XmlElement(name = "assert")
    protected TestScriptAssert _assert;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptOperation }
     *     
     */
    public TestScriptOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptOperation }
     *     
     */
    public void setOperation(TestScriptOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the assert property.
     * 
     * @return
     *     possible object is
     *     {@link TestScriptAssert }
     *     
     */
    public TestScriptAssert getAssert() {
        return _assert;
    }

    /**
     * Sets the value of the assert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestScriptAssert }
     *     
     */
    public void setAssert(TestScriptAssert value) {
        this._assert = value;
    }

}
