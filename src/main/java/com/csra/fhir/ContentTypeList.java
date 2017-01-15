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
 * <p>Java class for ContentType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="json"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentType-list")
@XmlEnum
public enum ContentTypeList {


    /**
     * XML content-type corresponding to the application/xml+fhir mime-type.
     * 
     */
    @XmlEnumValue("xml")
    XML("xml"),

    /**
     * JSON content-type corresponding to the application/json+fhir mime-type.
     * 
     */
    @XmlEnumValue("json")
    JSON("json");
    private final java.lang.String value;

    ContentTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContentTypeList fromValue(java.lang.String v) {
        for (ContentTypeList c: ContentTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
