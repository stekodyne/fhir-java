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
 * <p>Java class for AllergyIntoleranceCertainty-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceCertainty-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unlikely"/>
 *     &lt;enumeration value="likely"/>
 *     &lt;enumeration value="confirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceCertainty-list")
@XmlEnum
public enum AllergyIntoleranceCertaintyList {


    /**
     * There is a low level of clinical certainty that the reaction was caused by the identified Substance.
     * 
     */
    @XmlEnumValue("unlikely")
    UNLIKELY("unlikely"),

    /**
     * There is a high level of clinical certainty that the reaction was caused by the identified Substance.
     * 
     */
    @XmlEnumValue("likely")
    LIKELY("likely"),

    /**
     * There is a very high level of clinical certainty that the reaction was due to the identified Substance, which may include clinical evidence by testing or rechallenge.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed");
    private final java.lang.String value;

    AllergyIntoleranceCertaintyList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AllergyIntoleranceCertaintyList fromValue(java.lang.String v) {
        for (AllergyIntoleranceCertaintyList c: AllergyIntoleranceCertaintyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
