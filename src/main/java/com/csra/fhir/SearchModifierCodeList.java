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
 * <p>Java class for SearchModifierCode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchModifierCode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="missing"/>
 *     &lt;enumeration value="exact"/>
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="not"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="not-in"/>
 *     &lt;enumeration value="below"/>
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchModifierCode-list")
@XmlEnum
public enum SearchModifierCodeList {


    /**
     * The search parameter returns resources that have a value or not.
     * 
     */
    @XmlEnumValue("missing")
    MISSING("missing"),

    /**
     * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).
     * 
     */
    @XmlEnumValue("exact")
    EXACT("exact"),

    /**
     * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.
     * 
     */
    @XmlEnumValue("contains")
    CONTAINS("contains"),

    /**
     * The search parameter returns resources that do not contain a match .
     * 
     */
    @XmlEnumValue("not")
    NOT("not"),

    /**
     * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
     * 
     */
    @XmlEnumValue("in")
    IN("in"),

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.
     * 
     */
    @XmlEnumValue("not-in")
    NOT_IN("not-in"),

    /**
     * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).
     * 
     */
    @XmlEnumValue("below")
    BELOW("below"),

    /**
     * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).
     * 
     */
    @XmlEnumValue("type")
    TYPE("type");
    private final java.lang.String value;

    SearchModifierCodeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SearchModifierCodeList fromValue(java.lang.String v) {
        for (SearchModifierCodeList c: SearchModifierCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
