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
import javax.xml.bind.annotation.XmlType;


/**
 * A container for a collection of resources.
 * 
 * <p>Java class for Bundle.Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bundle.Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="method" type="{http://hl7.org/fhir}HTTPVerb"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="ifNoneMatch" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ifModifiedSince" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="ifMatch" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="ifNoneExist" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bundle.Request", propOrder = {
    "method",
    "url",
    "ifNoneMatch",
    "ifModifiedSince",
    "ifMatch",
    "ifNoneExist"
})
public class BundleRequest
    extends BackboneElement
{

    @XmlElement(required = true)
    protected HTTPVerb method;
    @XmlElement(required = true)
    protected Uri url;
    protected String ifNoneMatch;
    protected Instant ifModifiedSince;
    protected String ifMatch;
    protected String ifNoneExist;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link HTTPVerb }
     *     
     */
    public HTTPVerb getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPVerb }
     *     
     */
    public void setMethod(HTTPVerb value) {
        this.method = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the ifNoneMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * Sets the value of the ifNoneMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoneMatch(String value) {
        this.ifNoneMatch = value;
    }

    /**
     * Gets the value of the ifModifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * Sets the value of the ifModifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIfModifiedSince(Instant value) {
        this.ifModifiedSince = value;
    }

    /**
     * Gets the value of the ifMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Sets the value of the ifMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfMatch(String value) {
        this.ifMatch = value;
    }

    /**
     * Gets the value of the ifNoneExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoneExist() {
        return ifNoneExist;
    }

    /**
     * Sets the value of the ifNoneExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoneExist(String value) {
        this.ifNoneExist = value;
    }

}
