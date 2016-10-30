//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.29 at 04:21:59 PM PDT 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConformanceResourceStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConformanceResourceStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="retired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConformanceResourceStatus-list")
@XmlEnum
public enum ConformanceResourceStatusList {


    /**
     * ontwerp
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * actief
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * verouderd
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final java.lang.String value;

    ConformanceResourceStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConformanceResourceStatusList fromValue(java.lang.String v) {
        for (ConformanceResourceStatusList c: ConformanceResourceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
