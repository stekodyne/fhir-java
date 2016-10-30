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
 * <p>Java class for GuideDependencyType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuideDependencyType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reference"/>
 *     &lt;enumeration value="inclusion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuideDependencyType-list")
@XmlEnum
public enum GuideDependencyTypeList {


    /**
     * The guide is referred to by URL.
     * 
     */
    @XmlEnumValue("reference")
    REFERENCE("reference"),

    /**
     * The guide is embedded in this guide when published.
     * 
     */
    @XmlEnumValue("inclusion")
    INCLUSION("inclusion");
    private final java.lang.String value;

    GuideDependencyTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GuideDependencyTypeList fromValue(java.lang.String v) {
        for (GuideDependencyTypeList c: GuideDependencyTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
