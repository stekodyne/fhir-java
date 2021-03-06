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
 * <p>Java class for ParticipationStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="declined"/>
 *     &lt;enumeration value="tentative"/>
 *     &lt;enumeration value="needs-action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationStatus-list")
@XmlEnum
public enum ParticipationStatusList {


    /**
     * The participant has accepted the appointment.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The participant has declined the appointment and will not participate in the appointment.
     * 
     */
    @XmlEnumValue("declined")
    DECLINED("declined"),

    /**
     * The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
     * 
     */
    @XmlEnumValue("tentative")
    TENTATIVE("tentative"),

    /**
     * The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
     * 
     */
    @XmlEnumValue("needs-action")
    NEEDS_ACTION("needs-action");
    private final java.lang.String value;

    ParticipationStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ParticipationStatusList fromValue(java.lang.String v) {
        for (ParticipationStatusList c: ParticipationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
