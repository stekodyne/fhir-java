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
 * <p>Java class for DeviceStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="not-available"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceStatus-list")
@XmlEnum
public enum DeviceStatusList {


    /**
     * The Device is available for use.
     * 
     */
    @XmlEnumValue("available")
    AVAILABLE("available"),

    /**
     * The Device is no longer available for use (e.g. lost, expired, damaged).
     * 
     */
    @XmlEnumValue("not-available")
    NOT_AVAILABLE("not-available"),

    /**
     * The Device was entered in error and voided.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    DeviceStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DeviceStatusList fromValue(java.lang.String v) {
        for (DeviceStatusList c: DeviceStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
