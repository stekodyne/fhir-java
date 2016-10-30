//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.29 at 04:21:59 PM PDT 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
 * 
 * <p>Java class for DeviceComponent.ProductionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceComponent.ProductionSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="specType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="componentId" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="productionSpec" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceComponent.ProductionSpecification", propOrder = {
    "specType",
    "componentId",
    "productionSpec"
})
public class DeviceComponentProductionSpecification
    extends BackboneElement
{

    protected CodeableConcept specType;
    protected Identifier componentId;
    protected String productionSpec;

    /**
     * Gets the value of the specType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSpecType() {
        return specType;
    }

    /**
     * Sets the value of the specType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSpecType(CodeableConcept value) {
        this.specType = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setComponentId(Identifier value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the productionSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionSpec() {
        return productionSpec;
    }

    /**
     * Sets the value of the productionSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionSpec(String value) {
        this.productionSpec = value;
    }

}
