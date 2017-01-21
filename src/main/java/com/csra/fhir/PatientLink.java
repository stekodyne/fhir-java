//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * 
 * <p>Java class for Patient.Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient.Link">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="other" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}LinkType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient.Link", propOrder = {
    "other",
    "type"
})
public class PatientLink
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference other;
    @XmlElement(required = true)
    protected LinkType type;

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOther(Reference value) {
        this.other = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setType(LinkType value) {
        this.type = value;
    }

}
