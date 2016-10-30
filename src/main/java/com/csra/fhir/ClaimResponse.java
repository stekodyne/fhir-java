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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ClaimResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="request" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="ruleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="originalRuleset" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="requestProvider" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="requestOrganization" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="disposition" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="payeeType" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="item" type="{http://hl7.org/fhir}ClaimResponse.Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addItem" type="{http://hl7.org/fhir}ClaimResponse.AddItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{http://hl7.org/fhir}ClaimResponse.Error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCost" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="unallocDeductable" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="totalBenefit" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="paymentAdjustment" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="paymentAdjustmentReason" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="paymentAmount" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="paymentRef" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="reserved" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="form" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}ClaimResponse.Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}ClaimResponse.Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse", propOrder = {
    "identifier",
    "request",
    "ruleset",
    "originalRuleset",
    "created",
    "organization",
    "requestProvider",
    "requestOrganization",
    "outcome",
    "disposition",
    "payeeType",
    "item",
    "addItem",
    "error",
    "totalCost",
    "unallocDeductable",
    "totalBenefit",
    "paymentAdjustment",
    "paymentAdjustmentReason",
    "paymentDate",
    "paymentAmount",
    "paymentRef",
    "reserved",
    "form",
    "note",
    "coverage"
})
public class ClaimResponse
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected Reference request;
    protected Coding ruleset;
    protected Coding originalRuleset;
    protected DateTime created;
    protected Reference organization;
    protected Reference requestProvider;
    protected Reference requestOrganization;
    protected Code outcome;
    protected String disposition;
    protected Coding payeeType;
    protected List<ClaimResponseItem> item;
    protected List<ClaimResponseAddItem> addItem;
    protected List<ClaimResponseError> error;
    protected Money totalCost;
    protected Money unallocDeductable;
    protected Money totalBenefit;
    protected Money paymentAdjustment;
    protected Coding paymentAdjustmentReason;
    protected Date paymentDate;
    protected Money paymentAmount;
    protected Identifier paymentRef;
    protected Coding reserved;
    protected Coding form;
    protected List<ClaimResponseNote> note;
    protected List<ClaimResponseCoverage> coverage;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
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
     * Gets the value of the ruleset property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getRuleset() {
        return ruleset;
    }

    /**
     * Sets the value of the ruleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setRuleset(Coding value) {
        this.ruleset = value;
    }

    /**
     * Gets the value of the originalRuleset property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getOriginalRuleset() {
        return originalRuleset;
    }

    /**
     * Sets the value of the originalRuleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setOriginalRuleset(Coding value) {
        this.originalRuleset = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * Gets the value of the requestProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequestProvider() {
        return requestProvider;
    }

    /**
     * Sets the value of the requestProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequestProvider(Reference value) {
        this.requestProvider = value;
    }

    /**
     * Gets the value of the requestOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getRequestOrganization() {
        return requestOrganization;
    }

    /**
     * Sets the value of the requestOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setRequestOrganization(Reference value) {
        this.requestOrganization = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setOutcome(Code value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the payeeType property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPayeeType() {
        return payeeType;
    }

    /**
     * Sets the value of the payeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPayeeType(Coding value) {
        this.payeeType = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseItem }
     * 
     * 
     */
    public List<ClaimResponseItem> getItem() {
        if (item == null) {
            item = new ArrayList<ClaimResponseItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the addItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseAddItem }
     * 
     * 
     */
    public List<ClaimResponseAddItem> getAddItem() {
        if (addItem == null) {
            addItem = new ArrayList<ClaimResponseAddItem>();
        }
        return this.addItem;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseError }
     * 
     * 
     */
    public List<ClaimResponseError> getError() {
        if (error == null) {
            error = new ArrayList<ClaimResponseError>();
        }
        return this.error;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalCost(Money value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the unallocDeductable property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnallocDeductable() {
        return unallocDeductable;
    }

    /**
     * Sets the value of the unallocDeductable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnallocDeductable(Money value) {
        this.unallocDeductable = value;
    }

    /**
     * Gets the value of the totalBenefit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBenefit() {
        return totalBenefit;
    }

    /**
     * Sets the value of the totalBenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBenefit(Money value) {
        this.totalBenefit = value;
    }

    /**
     * Gets the value of the paymentAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAdjustment() {
        return paymentAdjustment;
    }

    /**
     * Sets the value of the paymentAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAdjustment(Money value) {
        this.paymentAdjustment = value;
    }

    /**
     * Gets the value of the paymentAdjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getPaymentAdjustmentReason() {
        return paymentAdjustmentReason;
    }

    /**
     * Sets the value of the paymentAdjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setPaymentAdjustmentReason(Coding value) {
        this.paymentAdjustmentReason = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPaymentDate(Date value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAmount(Money value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPaymentRef(Identifier value) {
        this.paymentRef = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setReserved(Coding value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setForm(Coding value) {
        this.form = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseNote }
     * 
     * 
     */
    public List<ClaimResponseNote> getNote() {
        if (note == null) {
            note = new ArrayList<ClaimResponseNote>();
        }
        return this.note;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResponseCoverage }
     * 
     * 
     */
    public List<ClaimResponseCoverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<ClaimResponseCoverage>();
        }
        return this.coverage;
    }

}
