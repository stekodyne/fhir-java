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
 * <p>Java class for DeviceMetricColor-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricColor-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="black"/>
 *     &lt;enumeration value="red"/>
 *     &lt;enumeration value="green"/>
 *     &lt;enumeration value="yellow"/>
 *     &lt;enumeration value="blue"/>
 *     &lt;enumeration value="magenta"/>
 *     &lt;enumeration value="cyan"/>
 *     &lt;enumeration value="white"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricColor-list")
@XmlEnum
public enum DeviceMetricColorList {


    /**
     * Color for representation - black.
     * 
     */
    @XmlEnumValue("black")
    BLACK("black"),

    /**
     * Color for representation - red.
     * 
     */
    @XmlEnumValue("red")
    RED("red"),

    /**
     * Color for representation - green.
     * 
     */
    @XmlEnumValue("green")
    GREEN("green"),

    /**
     * Color for representation - yellow.
     * 
     */
    @XmlEnumValue("yellow")
    YELLOW("yellow"),

    /**
     * Color for representation - blue.
     * 
     */
    @XmlEnumValue("blue")
    BLUE("blue"),

    /**
     * Color for representation - magenta.
     * 
     */
    @XmlEnumValue("magenta")
    MAGENTA("magenta"),

    /**
     * Color for representation - cyan.
     * 
     */
    @XmlEnumValue("cyan")
    CYAN("cyan"),

    /**
     * Color for representation - white.
     * 
     */
    @XmlEnumValue("white")
    WHITE("white");
    private final java.lang.String value;

    DeviceMetricColorList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DeviceMetricColorList fromValue(java.lang.String v) {
        for (DeviceMetricColorList c: DeviceMetricColorList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
