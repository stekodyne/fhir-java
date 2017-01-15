//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:53:11 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferralStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferralStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="requested"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferralStatus-list")
@XmlEnum
public enum ReferralStatusList {


    /**
     * A draft referral that has yet to be send.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * The referral has been transmitted, but not yet acknowledged by the recipient.
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The referral has been acknowledged by the recipient, and is in the process of being actioned.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The referral has been cancelled without being completed. For example it is no longer needed.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The recipient has agreed to deliver the care requested by the referral.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * The recipient has declined to accept the referral.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The referral has been completely actioned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final java.lang.String value;

    ReferralStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ReferralStatusList fromValue(java.lang.String v) {
        for (ReferralStatusList c: ReferralStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
