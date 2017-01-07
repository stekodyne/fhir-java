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
 * <p>Java class for EncounterState-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterState-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="arrived"/>
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="onleave"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterState-list")
@XmlEnum
public enum EncounterStateList {


    /**
     * The Encounter has not yet started.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     * 
     */
    @XmlEnumValue("arrived")
    ARRIVED("arrived"),

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     * 
     */
    @XmlEnumValue("onleave")
    ONLEAVE("onleave"),

    /**
     * The Encounter has ended.
     * 
     */
    @XmlEnumValue("finished")
    FINISHED("finished"),

    /**
     * The Encounter has ended before it has begun.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    EncounterStateList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EncounterStateList fromValue(java.lang.String v) {
        for (EncounterStateList c: EncounterStateList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
