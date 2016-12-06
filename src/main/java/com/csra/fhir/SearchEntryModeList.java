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
 * <p>Java class for SearchEntryMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchEntryMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="match"/>
 *     &lt;enumeration value="include"/>
 *     &lt;enumeration value="outcome"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchEntryMode-list")
@XmlEnum
public enum SearchEntryModeList {


    /**
     * This resource matched the search specification.
     * 
     */
    @XmlEnumValue("match")
    MATCH("match"),

    /**
     * This resource is returned because it is referred to from another resource in the search set.
     * 
     */
    @XmlEnumValue("include")
    INCLUDE("include"),

    /**
     * An OperationOutcome that provides additional information about the processing of a search.
     * 
     */
    @XmlEnumValue("outcome")
    OUTCOME("outcome");
    private final java.lang.String value;

    SearchEntryModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SearchEntryModeList fromValue(java.lang.String v) {
        for (SearchEntryModeList c: SearchEntryModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
