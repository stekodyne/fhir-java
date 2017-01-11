//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarePlanRelationship-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanRelationship-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="includes"/>
 *     &lt;enumeration value="replaces"/>
 *     &lt;enumeration value="fulfills"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanRelationship-list")
@XmlEnum
public enum CarePlanRelationshipList {


    /**
     * The referenced plan is considered to be part of this plan.
     * 
     */
    @XmlEnumValue("includes")
    INCLUDES("includes"),

    /**
     * This plan takes the places of the referenced plan.
     * 
     */
    @XmlEnumValue("replaces")
    REPLACES("replaces"),

    /**
     * This plan provides details about how to perform activities defined at a higher level by the referenced plan.
     * 
     */
    @XmlEnumValue("fulfills")
    FULFILLS("fulfills");
    private final java.lang.String value;

    CarePlanRelationshipList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CarePlanRelationshipList fromValue(java.lang.String v) {
        for (CarePlanRelationshipList c: CarePlanRelationshipList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
