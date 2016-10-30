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
 * <p>Java class for NoteType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoteType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="display"/>
 *     &lt;enumeration value="print"/>
 *     &lt;enumeration value="printoper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoteType-list")
@XmlEnum
public enum NoteTypeList {


    /**
     * Display the note.
     * 
     */
    @XmlEnumValue("display")
    DISPLAY("display"),

    /**
     * Print the note on the form.
     * 
     */
    @XmlEnumValue("print")
    PRINT("print"),

    /**
     * Print the note for the operator.
     * 
     */
    @XmlEnumValue("printoper")
    PRINTOPER("printoper");
    private final java.lang.String value;

    NoteTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NoteTypeList fromValue(java.lang.String v) {
        for (NoteTypeList c: NoteTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
