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
 * <p>Java class for LinkType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="refer"/>
 *     &lt;enumeration value="seealso"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkType-list")
@XmlEnum
public enum LinkTypeList {


    /**
     * vervangen
     * 
     */
    @XmlEnumValue("replace")
    REPLACE("replace"),

    /**
     * verwijzing
     * 
     */
    @XmlEnumValue("refer")
    REFER("refer"),

    /**
     * zie ook
     * 
     */
    @XmlEnumValue("seealso")
    SEEALSO("seealso");
    private final java.lang.String value;

    LinkTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinkTypeList fromValue(java.lang.String v) {
        for (LinkTypeList c: LinkTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
