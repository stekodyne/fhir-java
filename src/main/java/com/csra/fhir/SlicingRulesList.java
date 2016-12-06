//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlicingRules-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SlicingRules-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="openAtEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SlicingRules-list")
@XmlEnum
public enum SlicingRulesList {


    /**
     * No additional content is allowed other than that described by the slices in this profile.
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed"),

    /**
     * Additional content is allowed anywhere in the list.
     * 
     */
    @XmlEnumValue("open")
    OPEN("open"),

    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.
     * 
     */
    @XmlEnumValue("openAtEnd")
    OPEN_AT_END("openAtEnd");
    private final java.lang.String value;

    SlicingRulesList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SlicingRulesList fromValue(java.lang.String v) {
        for (SlicingRulesList c: SlicingRulesList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
