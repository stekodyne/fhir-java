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
 * <p>Java class for ProcedureStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcedureStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="in-progress"/>
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcedureStatus-list")
@XmlEnum
public enum ProcedureStatusList {


    /**
     * The procedure is still occurring.
     * 
     */
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress"),

    /**
     * The procedure was terminated without completing successfully.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * All actions involved in the procedure have taken place.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The statement was entered in error and Is not valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    ProcedureStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProcedureStatusList fromValue(java.lang.String v) {
        for (ProcedureStatusList c: ProcedureStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
