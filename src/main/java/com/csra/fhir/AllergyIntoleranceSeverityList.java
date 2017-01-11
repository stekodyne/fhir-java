//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllergyIntoleranceSeverity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceSeverity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mild"/>
 *     &lt;enumeration value="moderate"/>
 *     &lt;enumeration value="severe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceSeverity-list")
@XmlEnum
public enum AllergyIntoleranceSeverityList {


    /**
     * Causes mild physiological effects.
     * 
     */
    @XmlEnumValue("mild")
    MILD("mild"),

    /**
     * Causes moderate physiological effects.
     * 
     */
    @XmlEnumValue("moderate")
    MODERATE("moderate"),

    /**
     * Causes severe physiological effects.
     * 
     */
    @XmlEnumValue("severe")
    SEVERE("severe");
    private final java.lang.String value;

    AllergyIntoleranceSeverityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AllergyIntoleranceSeverityList fromValue(java.lang.String v) {
        for (AllergyIntoleranceSeverityList c: AllergyIntoleranceSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
