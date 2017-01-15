//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * 
 * <p>Java class for NutritionOrder.EnteralFormula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder.EnteralFormula">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="baseFormulaType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="baseFormulaProductName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="additiveType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="additiveProductName" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="caloricDensity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="routeofAdministration" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="administration" type="{http://hl7.org/fhir}NutritionOrder.Administration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxVolumeToDeliver" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="administrationInstruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionOrder.EnteralFormula", propOrder = {
    "baseFormulaType",
    "baseFormulaProductName",
    "additiveType",
    "additiveProductName",
    "caloricDensity",
    "routeofAdministration",
    "administration",
    "maxVolumeToDeliver",
    "administrationInstruction"
})
public class NutritionOrderEnteralFormula
    extends BackboneElement
{

    protected CodeableConcept baseFormulaType;
    protected String baseFormulaProductName;
    protected CodeableConcept additiveType;
    protected String additiveProductName;
    protected SimpleQuantity caloricDensity;
    protected CodeableConcept routeofAdministration;
    protected List<NutritionOrderAdministration> administration;
    protected SimpleQuantity maxVolumeToDeliver;
    protected String administrationInstruction;

    /**
     * Gets the value of the baseFormulaType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBaseFormulaType() {
        return baseFormulaType;
    }

    /**
     * Sets the value of the baseFormulaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBaseFormulaType(CodeableConcept value) {
        this.baseFormulaType = value;
    }

    /**
     * Gets the value of the baseFormulaProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFormulaProductName() {
        return baseFormulaProductName;
    }

    /**
     * Sets the value of the baseFormulaProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFormulaProductName(String value) {
        this.baseFormulaProductName = value;
    }

    /**
     * Gets the value of the additiveType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdditiveType() {
        return additiveType;
    }

    /**
     * Sets the value of the additiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditiveType(CodeableConcept value) {
        this.additiveType = value;
    }

    /**
     * Gets the value of the additiveProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditiveProductName() {
        return additiveProductName;
    }

    /**
     * Sets the value of the additiveProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditiveProductName(String value) {
        this.additiveProductName = value;
    }

    /**
     * Gets the value of the caloricDensity property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getCaloricDensity() {
        return caloricDensity;
    }

    /**
     * Sets the value of the caloricDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setCaloricDensity(SimpleQuantity value) {
        this.caloricDensity = value;
    }

    /**
     * Gets the value of the routeofAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRouteofAdministration() {
        return routeofAdministration;
    }

    /**
     * Sets the value of the routeofAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRouteofAdministration(CodeableConcept value) {
        this.routeofAdministration = value;
    }

    /**
     * Gets the value of the administration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderAdministration }
     * 
     * 
     */
    public List<NutritionOrderAdministration> getAdministration() {
        if (administration == null) {
            administration = new ArrayList<NutritionOrderAdministration>();
        }
        return this.administration;
    }

    /**
     * Gets the value of the maxVolumeToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getMaxVolumeToDeliver() {
        return maxVolumeToDeliver;
    }

    /**
     * Sets the value of the maxVolumeToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setMaxVolumeToDeliver(SimpleQuantity value) {
        this.maxVolumeToDeliver = value;
    }

    /**
     * Gets the value of the administrationInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationInstruction() {
        return administrationInstruction;
    }

    /**
     * Sets the value of the administrationInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationInstruction(String value) {
        this.administrationInstruction = value;
    }

}
