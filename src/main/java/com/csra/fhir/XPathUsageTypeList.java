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
 * <p>Java class for XPathUsageType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XPathUsageType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="phonetic"/>
 *     &lt;enumeration value="nearby"/>
 *     &lt;enumeration value="distance"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XPathUsageType-list")
@XmlEnum
public enum XPathUsageTypeList {


    /**
     * The search parameter is derived directly from the selected nodes based on the type definitions.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * The search parameter is derived by a phonetic transform from the selected nodes.
     * 
     */
    @XmlEnumValue("phonetic")
    PHONETIC("phonetic"),

    /**
     * The search parameter is based on a spatial transform of the selected nodes.
     * 
     */
    @XmlEnumValue("nearby")
    NEARBY("nearby"),

    /**
     * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.
     * 
     */
    @XmlEnumValue("distance")
    DISTANCE("distance"),

    /**
     * The interpretation of the xpath statement is unknown (and can't be automated).
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    XPathUsageTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static XPathUsageTypeList fromValue(java.lang.String v) {
        for (XPathUsageTypeList c: XPathUsageTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
