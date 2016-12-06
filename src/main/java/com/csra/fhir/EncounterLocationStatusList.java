//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncounterLocationStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterLocationStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterLocationStatus-list")
@XmlEnum
public enum EncounterLocationStatusList {


    /**
     * The patient is planned to be moved to this location at some point in the future.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * The patient is currently at this location, or was between the period specified.
     * 
     * A system may update these records when the patient leaves the location to either reserved, or completed
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * This location is held empty for this patient.
     * 
     */
    @XmlEnumValue("reserved")
    RESERVED("reserved"),

    /**
     * The patient was at this location during the period specified.
     * 
     * Not to be used when the patient is currently at the location
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final java.lang.String value;

    EncounterLocationStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EncounterLocationStatusList fromValue(java.lang.String v) {
        for (EncounterLocationStatusList c: EncounterLocationStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
