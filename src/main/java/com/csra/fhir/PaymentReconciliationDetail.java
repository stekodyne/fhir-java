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
 * This resource provides payment details and claim references supporting a bulk payment.
 * 
 * <p>Java class for PaymentReconciliation.Detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReconciliation.Detail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="responce" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="submitter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="payee" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReconciliation.Detail", propOrder = {
    "type",
    "request",
    "responce",
    "submitter",
    "payee",
    "date",
    "amount"
})
public class PaymentReconciliationDetail
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Coding type;
    protected Reference request;
    protected Reference responce;
    protected Reference submitter;
    protected Reference payee;
    protected Date date;
    protected Money amount;

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
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequest(Reference value) {
        this.request = value;
    }

    /**
     * Gets the value of the responce property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getResponce() {
        return responce;
    }

    /**
     * Sets the value of the responce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setResponce(Reference value) {
        this.responce = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubmitter(Reference value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPayee(Reference value) {
        this.payee = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

}
