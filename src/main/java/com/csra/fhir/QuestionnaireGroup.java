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
import javax.xml.bind.annotation.XmlType;


/**
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
 * 
 * <p>Java class for Questionnaire.Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Questionnaire.Group">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="linkId" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="repeats" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="group" type="{http://hl7.org/fhir}Questionnaire.Group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="question" type="{http://hl7.org/fhir}Questionnaire.Question" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.Group", propOrder = {
    "linkId",
    "title",
    "concept",
    "text",
    "required",
    "repeats",
    "group",
    "question"
})
public class QuestionnaireGroup
    extends BackboneElement
{

    protected String linkId;
    protected String title;
    protected List<Coding> concept;
    protected String text;
    protected Boolean required;
    protected Boolean repeats;
    protected List<QuestionnaireGroup> group;
    protected List<QuestionnaireQuestion> question;

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getConcept() {
        if (concept == null) {
            concept = new ArrayList<Coding>();
        }
        return this.concept;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRepeats() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeats(Boolean value) {
        this.repeats = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireGroup }
     * 
     * 
     */
    public List<QuestionnaireGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<QuestionnaireGroup>();
        }
        return this.group;
    }

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionnaireQuestion }
     * 
     * 
     */
    public List<QuestionnaireQuestion> getQuestion() {
        if (question == null) {
            question = new ArrayList<QuestionnaireQuestion>();
        }
        return this.question;
    }

}
