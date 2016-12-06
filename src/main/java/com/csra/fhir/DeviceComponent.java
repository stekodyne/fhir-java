//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for DeviceComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="lastSystemChange" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parameterGroup" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="measurementPrinciple" type="{http://hl7.org/fhir}Measmnt-Principle" minOccurs="0"/>
 *         &lt;element name="productionSpecification" type="{http://hl7.org/fhir}DeviceComponent.ProductionSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceComponent", propOrder = {
    "type",
    "identifier",
    "lastSystemChange",
    "source",
    "parent",
    "operationalStatus",
    "parameterGroup",
    "measurementPrinciple",
    "productionSpecification",
    "languageCode"
})
public class DeviceComponent
    extends DomainResource
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(required = true)
    protected Identifier identifier;
    @XmlElement(required = true)
    protected Instant lastSystemChange;
    protected Reference source;
    protected Reference parent;
    protected List<CodeableConcept> operationalStatus;
    protected CodeableConcept parameterGroup;
    protected MeasmntPrinciple measurementPrinciple;
    protected List<DeviceComponentProductionSpecification> productionSpecification;
    protected CodeableConcept languageCode;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the lastSystemChange property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getLastSystemChange() {
        return lastSystemChange;
    }

    /**
     * Sets the value of the lastSystemChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setLastSystemChange(Instant value) {
        this.lastSystemChange = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSource(Reference value) {
        this.source = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setParent(Reference value) {
        this.parent = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getOperationalStatus() {
        if (operationalStatus == null) {
            operationalStatus = new ArrayList<CodeableConcept>();
        }
        return this.operationalStatus;
    }

    /**
     * Gets the value of the parameterGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getParameterGroup() {
        return parameterGroup;
    }

    /**
     * Sets the value of the parameterGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setParameterGroup(CodeableConcept value) {
        this.parameterGroup = value;
    }

    /**
     * Gets the value of the measurementPrinciple property.
     * 
     * @return
     *     possible object is
     *     {@link MeasmntPrinciple }
     *     
     */
    public MeasmntPrinciple getMeasurementPrinciple() {
        return measurementPrinciple;
    }

    /**
     * Sets the value of the measurementPrinciple property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasmntPrinciple }
     *     
     */
    public void setMeasurementPrinciple(MeasmntPrinciple value) {
        this.measurementPrinciple = value;
    }

    /**
     * Gets the value of the productionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceComponentProductionSpecification }
     * 
     * 
     */
    public List<DeviceComponentProductionSpecification> getProductionSpecification() {
        if (productionSpecification == null) {
            productionSpecification = new ArrayList<DeviceComponentProductionSpecification>();
        }
        return this.productionSpecification;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setLanguageCode(CodeableConcept value) {
        this.languageCode = value;
    }

}
