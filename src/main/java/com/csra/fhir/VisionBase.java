//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for VisionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisionBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://hl7.org/fhir}VisionBase-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisionBase")
public class VisionBase
    extends Element
{

    @XmlAttribute(name = "value")
    protected VisionBaseList value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link VisionBaseList }
     *     
     */
    public VisionBaseList getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisionBaseList }
     *     
     */
    public void setValue(VisionBaseList value) {
        this.value = value;
    }

}
