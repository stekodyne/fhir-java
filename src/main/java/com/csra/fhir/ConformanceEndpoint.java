//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Java class for Conformance.Endpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Endpoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="protocol" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}uri"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Endpoint", propOrder = {
    "protocol",
    "address"
})
public class ConformanceEndpoint
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding protocol;
    @XmlElement(required = true)
    protected Uri address;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setProtocol(Coding value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setAddress(Uri value) {
        this.address = value;
    }

}
