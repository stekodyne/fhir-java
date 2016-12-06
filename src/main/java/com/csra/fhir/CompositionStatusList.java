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
 * <p>Java class for CompositionStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositionStatus-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="preliminary"/>
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="amended"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompositionStatus-list")
@XmlEnum
public enum CompositionStatusList {


    /**
     * This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.
     * 
     */
    @XmlEnumValue("preliminary")
    PRELIMINARY("preliminary"),

    /**
     * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
     * 
     */
    @XmlEnumValue("final")
    FINAL("final"),

    /**
     * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("amended")
    AMENDED("amended"),

    /**
     * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    CompositionStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CompositionStatusList fromValue(java.lang.String v) {
        for (CompositionStatusList c: CompositionStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
