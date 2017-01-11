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
 * <p>Java class for ResponseType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="transient-error"/>
 *     &lt;enumeration value="fatal-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseType-list")
@XmlEnum
public enum ResponseTypeList {


    /**
     * The message was accepted and processed without error.
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
     * 
     */
    @XmlEnumValue("transient-error")
    TRANSIENT_ERROR("transient-error"),

    /**
     * The message was rejected because of some content in it. There is no point in re-sending without change. The response narrative SHALL describe the issue.
     * 
     */
    @XmlEnumValue("fatal-error")
    FATAL_ERROR("fatal-error");
    private final java.lang.String value;

    ResponseTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResponseTypeList fromValue(java.lang.String v) {
        for (ResponseTypeList c: ResponseTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
