//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * 
 * <p>Java class for Claim.Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim.Item">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://hl7.org/fhir}positiveInt"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="provider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="diagnosisLinkId" type="{http://hl7.org/fhir}positiveInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="serviceDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}SimpleQuantity" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="factor" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="points" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="net" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="udi" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="bodySite" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="subSite" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modifier" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}Claim.Detail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prosthesis" type="{http://hl7.org/fhir}Claim.Prosthesis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim.Item", propOrder = {
    "sequence",
    "type",
    "provider",
    "diagnosisLinkId",
    "service",
    "serviceDate",
    "quantity",
    "unitPrice",
    "factor",
    "points",
    "net",
    "udi",
    "bodySite",
    "subSite",
    "modifier",
    "detail",
    "prosthesis"
})
public class ClaimItem
    extends BackboneElement
{

    @XmlElement(required = true)
    protected PositiveInt sequence;
    @XmlElement(required = true)
    protected Coding type;
    protected Reference provider;
    protected List<PositiveInt> diagnosisLinkId;
    @XmlElement(required = true)
    protected Coding service;
    protected Date serviceDate;
    protected SimpleQuantity quantity;
    protected Money unitPrice;
    protected Decimal factor;
    protected Decimal points;
    protected Money net;
    protected Coding udi;
    protected Coding bodySite;
    protected List<Coding> subSite;
    protected List<Coding> modifier;
    protected List<ClaimDetail> detail;
    protected ClaimProsthesis prosthesis;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSequence(PositiveInt value) {
        this.sequence = value;
    }

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
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setProvider(Reference value) {
        this.provider = value;
    }

    /**
     * Gets the value of the diagnosisLinkId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosisLinkId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosisLinkId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositiveInt }
     * 
     * 
     */
    public List<PositiveInt> getDiagnosisLinkId() {
        if (diagnosisLinkId == null) {
            diagnosisLinkId = new ArrayList<PositiveInt>();
        }
        return this.diagnosisLinkId;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setService(Coding value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleQuantity }
     *     
     */
    public SimpleQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleQuantity }
     *     
     */
    public void setQuantity(SimpleQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFactor(Decimal value) {
        this.factor = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPoints(Decimal value) {
        this.points = value;
    }

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNet(Money value) {
        this.net = value;
    }

    /**
     * Gets the value of the udi property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getUdi() {
        return udi;
    }

    /**
     * Sets the value of the udi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setUdi(Coding value) {
        this.udi = value;
    }

    /**
     * Gets the value of the bodySite property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getBodySite() {
        return bodySite;
    }

    /**
     * Sets the value of the bodySite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setBodySite(Coding value) {
        this.bodySite = value;
    }

    /**
     * Gets the value of the subSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getSubSite() {
        if (subSite == null) {
            subSite = new ArrayList<Coding>();
        }
        return this.subSite;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<Coding>();
        }
        return this.modifier;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimDetail }
     * 
     * 
     */
    public List<ClaimDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ClaimDetail>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the prosthesis property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimProsthesis }
     *     
     */
    public ClaimProsthesis getProsthesis() {
        return prosthesis;
    }

    /**
     * Sets the value of the prosthesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimProsthesis }
     *     
     */
    public void setProsthesis(ClaimProsthesis value) {
        this.prosthesis = value;
    }

}
