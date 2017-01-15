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
 * <p>Java class for GuideResourcePurpose-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuideResourcePurpose-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="example"/>
 *     &lt;enumeration value="terminology"/>
 *     &lt;enumeration value="profile"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="dictionary"/>
 *     &lt;enumeration value="logical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuideResourcePurpose-list")
@XmlEnum
public enum GuideResourcePurposeList {


    /**
     * The resource is intended as an example.
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example"),

    /**
     * The resource defines a value set or concept map used in the implementation guide.
     * 
     */
    @XmlEnumValue("terminology")
    TERMINOLOGY("terminology"),

    /**
     * The resource defines a profile (StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("profile")
    PROFILE("profile"),

    /**
     * The resource defines an extension (StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension"),

    /**
     * The resource contains a dictionary that is part of the implementation guide.
     * 
     */
    @XmlEnumValue("dictionary")
    DICTIONARY("dictionary"),

    /**
     * The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide.
     * 
     */
    @XmlEnumValue("logical")
    LOGICAL("logical");
    private final java.lang.String value;

    GuideResourcePurposeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GuideResourcePurposeList fromValue(java.lang.String v) {
        for (GuideResourcePurposeList c: GuideResourcePurposeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
