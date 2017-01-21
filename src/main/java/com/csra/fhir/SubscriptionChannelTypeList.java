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
 * <p>Java class for SubscriptionChannelType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionChannelType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rest-hook"/>
 *     &lt;enumeration value="websocket"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="message"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionChannelType-list")
@XmlEnum
public enum SubscriptionChannelTypeList {


    /**
     * The channel is executed by making a post to the URI. If a payload is included, the URL is interpreted as the service base, and an update (PUT) is made.
     * 
     */
    @XmlEnumValue("rest-hook")
    REST_HOOK("rest-hook"),

    /**
     * The channel is executed by sending a packet across a web socket connection maintained by the client. The URL identifies the websocket, and the client binds to this URL.
     * 
     */
    @XmlEnumValue("websocket")
    WEBSOCKET("websocket"),

    /**
     * The channel is executed by sending an email to the email addressed in the URI (which must be a mailto:).
     * 
     */
    @XmlEnumValue("email")
    EMAIL("email"),

    /**
     * The channel is executed by sending an SMS message to the phone number identified in the URL (tel:).
     * 
     */
    @XmlEnumValue("sms")
    SMS("sms"),

    /**
     * The channel is executed by sending a message (e.g. a Bundle with a MessageHeader resource etc.) to the application identified in the URI.
     * 
     */
    @XmlEnumValue("message")
    MESSAGE("message");
    private final java.lang.String value;

    SubscriptionChannelTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SubscriptionChannelTypeList fromValue(java.lang.String v) {
        for (SubscriptionChannelTypeList c: SubscriptionChannelTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
