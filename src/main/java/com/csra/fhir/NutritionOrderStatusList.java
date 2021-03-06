//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NutritionOrderStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NutritionOrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="proposed"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="on-hold"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NutritionOrderStatus-list")
@XmlEnum
public enum NutritionOrderStatusList {


    /**
     * The request has been proposed.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * The request is in preliminary form prior to being sent.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * The request has been planned.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The request has been placed.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The request is 'actionable', but not all actions that are implied by it have occurred yet.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
     * 
     */
    @XmlEnumValue("on-hold")
    ON_HOLD("on-hold"),

    /**
     * All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The request has been withdrawn and is no longer actionable.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    NutritionOrderStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NutritionOrderStatusList fromValue(java.lang.String v) {
        for (NutritionOrderStatusList c: NutritionOrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
