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
 * <p>Java class for OrderStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="review"/>
 *     &lt;enumeration value="rejected"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="accepted"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="replaced"/>
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus-list")
@XmlEnum
public enum OrderStatusList {


    /**
     * The order is known, but no processing has occurred at this time
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending"),

    /**
     * The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review)
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * The order was rejected because of a workflow/business logic reason
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The order was unable to be processed because of a technical error (i.e. unexpected error)
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * The order has been accepted, and work is in progress.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * Processing the order was halted at the initiators request.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The order has been cancelled and replaced by another.
     * 
     */
    @XmlEnumValue("replaced")
    REPLACED("replaced"),

    /**
     * Processing the order was stopped because of some workflow/business logic reason.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * The order has been completed.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final java.lang.String value;

    OrderStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static OrderStatusList fromValue(java.lang.String v) {
        for (OrderStatusList c: OrderStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
