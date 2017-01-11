//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 05:13:17 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantRequired-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantRequired-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="information-only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantRequired-list")
@XmlEnum
public enum ParticipantRequiredList {


    /**
     * The participant is required to attend the appointment.
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * The participant may optionally attend the appointment.
     * 
     */
    @XmlEnumValue("optional")
    OPTIONAL("optional"),

    /**
     * The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
     * 
     */
    @XmlEnumValue("information-only")
    INFORMATION_ONLY("information-only");
    private final java.lang.String value;

    ParticipantRequiredList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ParticipantRequiredList fromValue(java.lang.String v) {
        for (ParticipantRequiredList c: ParticipantRequiredList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
