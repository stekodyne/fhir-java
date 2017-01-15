//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Annotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Annotation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="authorReference" type="{http://hl7.org/fhir}Reference"/>
 *           &lt;element name="authorString" type="{http://hl7.org/fhir}string"/>
 *         &lt;/choice>
 *         &lt;element name="time" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {
    "authorReferenceOrAuthorString",
    "time",
    "text"
})
public class Annotation
    extends Element
{

    @XmlElements({
        @XmlElement(name = "authorReference", type = Reference.class),
        @XmlElement(name = "authorString", type = String.class)
    })
    protected Element authorReferenceOrAuthorString;
    protected DateTime time;
    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the authorReferenceOrAuthorString property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     {@link String }
     *     
     */
    public Element getAuthorReferenceOrAuthorString() {
        return authorReferenceOrAuthorString;
    }

    /**
     * Sets the value of the authorReferenceOrAuthorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     {@link String }
     *     
     */
    public void setAuthorReferenceOrAuthorString(Element value) {
        this.authorReferenceOrAuthorString = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTime(DateTime value) {
        this.time = value;
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

}
