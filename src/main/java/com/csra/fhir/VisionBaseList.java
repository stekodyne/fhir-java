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
 * <p>Java class for VisionBase-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisionBase-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="out"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisionBase-list")
@XmlEnum
public enum VisionBaseList {


    /**
     * top
     * 
     */
    @XmlEnumValue("up")
    UP("up"),

    /**
     * bottom
     * 
     */
    @XmlEnumValue("down")
    DOWN("down"),

    /**
     * inner edge
     * 
     */
    @XmlEnumValue("in")
    IN("in"),

    /**
     * outer edge
     * 
     */
    @XmlEnumValue("out")
    OUT("out");
    private final java.lang.String value;

    VisionBaseList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static VisionBaseList fromValue(java.lang.String v) {
        for (VisionBaseList c: VisionBaseList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
