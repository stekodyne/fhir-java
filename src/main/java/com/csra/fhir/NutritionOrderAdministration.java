//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 * <p>Java class for NutritionOrder.Administration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder.Administration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="schedule" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="rateQuantity" type="{http://hl7.org/fhir}SimpleQuantity"/>
 *           &lt;element name="rateRatio" type="{http://hl7.org/fhir}Ratio"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionOrder.Administration", propOrder = {
    "schedule",
    "quantity",
    "rateQuantityOrRateRatio"
})
public class NutritionOrderAdministration
    extends BackboneElement
{

    protected Timing schedule;
    protected SimpleQuantity quantity;
    @XmlElements({
        @XmlElement(name = "rateQuantity", type = SimpleQuantity.class),
        @XmlElement(name = "rateRatio", type = Ratio.class)
    })
    protected Element rateQuantityOrRateRatio;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setSchedule(Timing value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rateQuantityOrRateRatio property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     {@link Ratio }
     *     
     */
    public Element getRateQuantityOrRateRatio() {
        return rateQuantityOrRateRatio;
    }

    /**
     * Sets the value of the rateQuantityOrRateRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     {@link Ratio }
     *     
     */
    public void setRateQuantityOrRateRatio(Element value) {
        this.rateQuantityOrRateRatio = value;
    }

}
