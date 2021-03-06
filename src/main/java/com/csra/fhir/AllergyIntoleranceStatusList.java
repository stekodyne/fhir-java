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
 * <p>Java class for AllergyIntoleranceStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllergyIntoleranceStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="unconfirmed"/>
 *     &lt;enumeration value="confirmed"/>
 *     &lt;enumeration value="inactive"/>
 *     &lt;enumeration value="resolved"/>
 *     &lt;enumeration value="refuted"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllergyIntoleranceStatus-list")
@XmlEnum
public enum AllergyIntoleranceStatusList {


    /**
     * An active record of a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * A low level of certainty about the propensity for a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed"),

    /**
     * A high level of certainty about the propensity for a reaction to the identified Substance, which may include clinical evidence by testing or rechallenge.
     * 
     */
    @XmlEnumValue("confirmed")
    CONFIRMED("confirmed"),

    /**
     * An inactive record of a reaction to the identified Substance.
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),

    /**
     * A reaction to the identified Substance has been clinically reassessed by testing or rechallenge and considered to be resolved.
     * 
     */
    @XmlEnumValue("resolved")
    RESOLVED("resolved"),

    /**
     * A propensity for a reaction to the identified Substance has been disproven with a high level of clinical certainty, which may include testing or rechallenge, and is refuted.
     * 
     */
    @XmlEnumValue("refuted")
    REFUTED("refuted"),

    /**
     * The statement was entered in error and is not valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    AllergyIntoleranceStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AllergyIntoleranceStatusList fromValue(java.lang.String v) {
        for (AllergyIntoleranceStatusList c: AllergyIntoleranceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
