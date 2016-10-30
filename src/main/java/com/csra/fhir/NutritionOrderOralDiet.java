//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.29 at 04:21:59 PM PDT 
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
 * <p>Java class for NutritionOrder.OralDiet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutritionOrder.OralDiet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://hl7.org/fhir}Timing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutrient" type="{http://hl7.org/fhir}NutritionOrder.Nutrient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="texture" type="{http://hl7.org/fhir}NutritionOrder.Texture" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fluidConsistencyType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instruction" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutritionOrder.OralDiet", propOrder = {
    "type",
    "schedule",
    "nutrient",
    "texture",
    "fluidConsistencyType",
    "instruction"
})
public class NutritionOrderOralDiet
    extends BackboneElement
{

    protected List<CodeableConcept> type;
    protected List<Timing> schedule;
    protected List<NutritionOrderNutrient> nutrient;
    protected List<NutritionOrderTexture> texture;
    protected List<CodeableConcept> fluidConsistencyType;
    protected String instruction;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getType() {
        if (type == null) {
            type = new ArrayList<CodeableConcept>();
        }
        return this.type;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Timing }
     * 
     * 
     */
    public List<Timing> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Timing>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the nutrient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutrient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutrient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderNutrient }
     * 
     * 
     */
    public List<NutritionOrderNutrient> getNutrient() {
        if (nutrient == null) {
            nutrient = new ArrayList<NutritionOrderNutrient>();
        }
        return this.nutrient;
    }

    /**
     * Gets the value of the texture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionOrderTexture }
     * 
     * 
     */
    public List<NutritionOrderTexture> getTexture() {
        if (texture == null) {
            texture = new ArrayList<NutritionOrderTexture>();
        }
        return this.texture;
    }

    /**
     * Gets the value of the fluidConsistencyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluidConsistencyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFluidConsistencyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getFluidConsistencyType() {
        if (fluidConsistencyType == null) {
            fluidConsistencyType = new ArrayList<CodeableConcept>();
        }
        return this.fluidConsistencyType;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

}
