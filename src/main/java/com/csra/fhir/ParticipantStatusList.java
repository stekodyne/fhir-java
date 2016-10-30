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
 * <p>Java class for ParticipantStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="tentative"/>
 *     &lt;enumeration value="in-process"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="needs-action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipantStatus-list")
@XmlEnum
public enum ParticipantStatusList {


    /**
     * The appointment participant has accepted that they can attend the appointment at the time specified in the AppointmentResponse.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The appointment participant has declined the appointment.
     * 
     */
    @XmlEnumValue("declined")
    DECLINED("declined"),

    /**
     * The appointment participant has tentatively accepted the appointment.
     * 
     */
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),

    /**
     * The participant has in-process the appointment.
     * 
     */
    @XmlEnumValue("in-process")
    IN_PROCESS("in-process"),

    /**
     * The participant has completed the appointment.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * This is the intitial status of an appointment participant until a participant has replied. It implies that there is no commitment for the appointment.
     * 
     */
    @XmlEnumValue("needs-action")
    NEEDS_ACTION("needs-action");
    private final java.lang.String value;

    ParticipantStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ParticipantStatusList fromValue(java.lang.String v) {
        for (ParticipantStatusList c: ParticipantStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
