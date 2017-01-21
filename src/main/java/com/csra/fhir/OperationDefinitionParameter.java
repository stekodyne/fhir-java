//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * 
 * <p>Java class for OperationDefinition.Parameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationDefinition.Parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}OperationParameterUse"/>
 *         &lt;element name="min" type="{http://hl7.org/fhir}integer"/>
 *         &lt;element name="max" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="binding" type="{http://hl7.org/fhir}OperationDefinition.Binding" minOccurs="0"/>
 *         &lt;element name="part" type="{http://hl7.org/fhir}OperationDefinition.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationDefinition.Parameter", propOrder = {
    "name",
    "use",
    "min",
    "max",
    "documentation",
    "type",
    "profile",
    "binding",
    "part"
})
public class OperationDefinitionParameter
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Code name;
    @XmlElement(required = true)
    protected OperationParameterUse use;
    @XmlElement(required = true)
    protected Integer min;
    @XmlElement(required = true)
    protected String max;
    protected String documentation;
    protected Code type;
    protected Reference profile;
    protected OperationDefinitionBinding binding;
    protected List<OperationDefinitionParameter> part;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setName(Code value) {
        this.name = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link OperationParameterUse }
     *     
     */
    public OperationParameterUse getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationParameterUse }
     *     
     */
    public void setUse(OperationParameterUse value) {
        this.use = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMin(Integer value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProfile(Reference value) {
        this.profile = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link OperationDefinitionBinding }
     *     
     */
    public OperationDefinitionBinding getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationDefinitionBinding }
     *     
     */
    public void setBinding(OperationDefinitionBinding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationDefinitionParameter }
     * 
     * 
     */
    public List<OperationDefinitionParameter> getPart() {
        if (part == null) {
            part = new ArrayList<OperationDefinitionParameter>();
        }
        return this.part;
    }

}
