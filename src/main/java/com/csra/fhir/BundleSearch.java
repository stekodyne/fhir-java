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
 * A container for a collection of resources.
 * 
 * <p>Java class for Bundle.Search complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Search">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}SearchEntryMode" minOccurs="0"/>
 *         &lt;element name="score" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Search", propOrder = {
    "mode",
    "score"
})
public class BundleSearch
    extends BackboneElement
{

    protected SearchEntryMode mode;
    protected Decimal score;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEntryMode }
     *     
     */
    public SearchEntryMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEntryMode }
     *     
     */
    public void setMode(SearchEntryMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setScore(Decimal value) {
        this.score = value;
    }

}
