//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * 
 * <p>Java class for Conformance.Rest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Rest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}RestfulConformanceMode"/>
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="security" type="{http://hl7.org/fhir}Conformance.Security" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}Conformance.Resource" maxOccurs="unbounded"/>
 *         &lt;element name="interaction" type="{http://hl7.org/fhir}Conformance.Interaction1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transactionMode" type="{http://hl7.org/fhir}TransactionMode" minOccurs="0"/>
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}Conformance.SearchParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://hl7.org/fhir}Conformance.Operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compartment" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Rest", propOrder = {
    "mode",
    "documentation",
    "security",
    "resource",
    "interaction",
    "transactionMode",
    "searchParam",
    "operation",
    "compartment"
})
public class ConformanceRest
    extends BackboneElement
{

    @XmlElement(required = true)
    protected RestfulConformanceMode mode;
    protected String documentation;
    protected ConformanceSecurity security;
    @XmlElement(required = true)
    protected List<ConformanceResource> resource;
    protected List<ConformanceInteraction1> interaction;
    protected TransactionMode transactionMode;
    protected List<ConformanceSearchParam> searchParam;
    protected List<ConformanceOperation> operation;
    protected List<Uri> compartment;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public RestfulConformanceMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestfulConformanceMode }
     *     
     */
    public void setMode(RestfulConformanceMode value) {
        this.mode = value;
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
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link ConformanceSecurity }
     *     
     */
    public ConformanceSecurity getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformanceSecurity }
     *     
     */
    public void setSecurity(ConformanceSecurity value) {
        this.security = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceResource }
     * 
     * 
     */
    public List<ConformanceResource> getResource() {
        if (resource == null) {
            resource = new ArrayList<ConformanceResource>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceInteraction1 }
     * 
     * 
     */
    public List<ConformanceInteraction1> getInteraction() {
        if (interaction == null) {
            interaction = new ArrayList<ConformanceInteraction1>();
        }
        return this.interaction;
    }

    /**
     * Gets the value of the transactionMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMode }
     *     
     */
    public TransactionMode getTransactionMode() {
        return transactionMode;
    }

    /**
     * Sets the value of the transactionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMode }
     *     
     */
    public void setTransactionMode(TransactionMode value) {
        this.transactionMode = value;
    }

    /**
     * Gets the value of the searchParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceSearchParam }
     * 
     * 
     */
    public List<ConformanceSearchParam> getSearchParam() {
        if (searchParam == null) {
            searchParam = new ArrayList<ConformanceSearchParam>();
        }
        return this.searchParam;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceOperation }
     * 
     * 
     */
    public List<ConformanceOperation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<ConformanceOperation>();
        }
        return this.operation;
    }

    /**
     * Gets the value of the compartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getCompartment() {
        if (compartment == null) {
            compartment = new ArrayList<Uri>();
        }
        return this.compartment;
    }

}
