//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Scope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="row"/>
 *     &lt;enumeration value="col"/>
 *     &lt;enumeration value="rowgroup"/>
 *     &lt;enumeration value="colgroup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Scope", namespace = "http://www.w3.org/1999/xhtml")
@XmlEnum
public enum Scope {

    @XmlEnumValue("row")
    ROW("row"),
    @XmlEnumValue("col")
    COL("col"),
    @XmlEnumValue("rowgroup")
    ROWGROUP("rowgroup"),
    @XmlEnumValue("colgroup")
    COLGROUP("colgroup");
    private final java.lang.String value;

    Scope(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Scope fromValue(java.lang.String v) {
        for (Scope c: Scope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
