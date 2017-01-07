//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * 
 * <p>Java class for Medication.Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medication.Content">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication.Content", propOrder = {
    "item",
    "amount"
})
public class MedicationContent
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference item;
    protected SimpleQuantity amount;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setItem(Reference value) {
        this.item = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setAmount(SimpleQuantity value) {
        this.amount = value;
    }

}
