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
 * <p>Java class for DiagnosticOrderPriority-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticOrderPriority-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="routine"/>
 *     &lt;enumeration value="urgent"/>
 *     &lt;enumeration value="stat"/>
 *     &lt;enumeration value="asap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticOrderPriority-list")
@XmlEnum
public enum DiagnosticOrderPriorityList {


    /**
     * The order has a normal priority .
     * 
     */
    @XmlEnumValue("routine")
    ROUTINE("routine"),

    /**
     * The order should be urgently.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * The order is time-critical.
     * 
     */
    @XmlEnumValue("stat")
    STAT("stat"),

    /**
     * The order should be acted on as soon as possible.
     * 
     */
    @XmlEnumValue("asap")
    ASAP("asap");
    private final java.lang.String value;

    DiagnosticOrderPriorityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOrderPriorityList fromValue(java.lang.String v) {
        for (DiagnosticOrderPriorityList c: DiagnosticOrderPriorityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
