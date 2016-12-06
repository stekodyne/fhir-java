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
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 * 
 * <p>Java class for ConceptMap.DependsOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.DependsOn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="element" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="codeSystem" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}string-primitive"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.DependsOn", propOrder = {
    "element",
    "codeSystem",
    "code"
})
public class ConceptMapDependsOn
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Uri element;
    @XmlElement(required = true)
    protected Uri codeSystem;
    @XmlElement(required = true)
    protected java.lang.String code;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setElement(Uri value) {
        this.element = value;
    }

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setCodeSystem(Uri value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCode(java.lang.String value) {
        this.code = value;
    }

}
