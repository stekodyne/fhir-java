//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://hl7.org/fhir}Quantity">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityComparator" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleQuantity")
public class SimpleQuantity
    extends Quantity
{


}
