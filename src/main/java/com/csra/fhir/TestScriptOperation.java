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
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * 
 * <p>Java class for TestScript.Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestScript.Operation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="accept" type="{http://hl7.org/fhir}ContentType" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}ContentType" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="encodeRequestUrl" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="params" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="requestHeader" type="{http://hl7.org/fhir}TestScript.RequestHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="responseId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="targetId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestScript.Operation", propOrder = {
    "type",
    "resource",
    "label",
    "description",
    "accept",
    "contentType",
    "destination",
    "encodeRequestUrl",
    "params",
    "requestHeader",
    "responseId",
    "sourceId",
    "targetId",
    "url"
})
public class TestScriptOperation
    extends BackboneElement
{

    protected Coding type;
    protected Code resource;
    protected String label;
    protected String description;
    protected ContentType accept;
    protected ContentType contentType;
    protected Integer destination;
    protected Boolean encodeRequestUrl;
    protected String params;
    protected List<TestScriptRequestHeader> requestHeader;
    protected Id responseId;
    protected Id sourceId;
    protected Id targetId;
    protected String url;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setResource(Code value) {
        this.resource = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setAccept(ContentType value) {
        this.accept = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestination(Integer value) {
        this.destination = value;
    }

    /**
     * Gets the value of the encodeRequestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEncodeRequestUrl() {
        return encodeRequestUrl;
    }

    /**
     * Sets the value of the encodeRequestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncodeRequestUrl(Boolean value) {
        this.encodeRequestUrl = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestScriptRequestHeader }
     * 
     * 
     */
    public List<TestScriptRequestHeader> getRequestHeader() {
        if (requestHeader == null) {
            requestHeader = new ArrayList<TestScriptRequestHeader>();
        }
        return this.requestHeader;
    }

    /**
     * Gets the value of the responseId property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setResponseId(Id value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setSourceId(Id value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the targetId property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getTargetId() {
        return targetId;
    }

    /**
     * Sets the value of the targetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setTargetId(Id value) {
        this.targetId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
