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
 * <p>Java class for SubscriptionStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionStatus-list")
@XmlEnum
public enum SubscriptionStatusList {


    /**
     * The client has requested the subscription, and the server has not yet set it up.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The subscription is active.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The server has an error executing the notification.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * Too many errors have occurred or the subscription has expired.
     * 
     */
    @XmlEnumValue("off")
    OFF("off");
    private final java.lang.String value;

    SubscriptionStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SubscriptionStatusList fromValue(java.lang.String v) {
        for (SubscriptionStatusList c: SubscriptionStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
