//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRules.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRules">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="groups"/>
 *     &lt;enumeration value="rows"/>
 *     &lt;enumeration value="cols"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRules", namespace = "http://www.w3.org/1999/xhtml")
@XmlEnum
public enum TRules {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("groups")
    GROUPS("groups"),
    @XmlEnumValue("rows")
    ROWS("rows"),
    @XmlEnumValue("cols")
    COLS("cols"),
    @XmlEnumValue("all")
    ALL("all");
    private final java.lang.String value;

    TRules(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TRules fromValue(java.lang.String v) {
        for (TRules c: TRules.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
