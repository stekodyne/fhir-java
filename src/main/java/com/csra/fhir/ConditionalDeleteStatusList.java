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
 * <p>Java class for ConditionalDeleteStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionalDeleteStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="not-supported"/>
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="multiple"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionalDeleteStatus-list")
@XmlEnum
public enum ConditionalDeleteStatusList {


    /**
     * No support for conditional deletes.
     * 
     */
    @XmlEnumValue("not-supported")
    NOT_SUPPORTED("not-supported"),

    /**
     * Conditional deletes are supported, but only single resources at a time.
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single"),

    /**
     * Conditional deletes are supported, and multiple resources can be deleted in a single interaction.
     * 
     */
    @XmlEnumValue("multiple")
    MULTIPLE("multiple");
    private final java.lang.String value;

    ConditionalDeleteStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConditionalDeleteStatusList fromValue(java.lang.String v) {
        for (ConditionalDeleteStatusList c: ConditionalDeleteStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
