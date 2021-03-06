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
 * <p>Java class for DeviceMetricCalibrationState-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceMetricCalibrationState-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="not-calibrated"/>
 *     &lt;enumeration value="calibration-required"/>
 *     &lt;enumeration value="calibrated"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceMetricCalibrationState-list")
@XmlEnum
public enum DeviceMetricCalibrationStateList {


    /**
     * The metric has not been calibrated.
     * 
     */
    @XmlEnumValue("not-calibrated")
    NOT_CALIBRATED("not-calibrated"),

    /**
     * The metric needs to be calibrated.
     * 
     */
    @XmlEnumValue("calibration-required")
    CALIBRATION_REQUIRED("calibration-required"),

    /**
     * The metric has been calibrated.
     * 
     */
    @XmlEnumValue("calibrated")
    CALIBRATED("calibrated"),

    /**
     * The state of calibration of this metric is unspecified.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final java.lang.String value;

    DeviceMetricCalibrationStateList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DeviceMetricCalibrationStateList fromValue(java.lang.String v) {
        for (DeviceMetricCalibrationStateList c: DeviceMetricCalibrationStateList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
