//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.07 at 12:14:51 PM PST 
//


package com.csra.fhir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeRestfulInteraction-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeRestfulInteraction-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="read"/>
 *     &lt;enumeration value="vread"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="history-instance"/>
 *     &lt;enumeration value="validate"/>
 *     &lt;enumeration value="history-type"/>
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="search-type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeRestfulInteraction-list")
@XmlEnum
public enum TypeRestfulInteractionList {

    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("vread")
    VREAD("vread"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("history-instance")
    HISTORY_INSTANCE("history-instance"),
    @XmlEnumValue("validate")
    VALIDATE("validate"),
    @XmlEnumValue("history-type")
    HISTORY_TYPE("history-type"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("search-type")
    SEARCH_TYPE("search-type");
    private final java.lang.String value;

    TypeRestfulInteractionList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TypeRestfulInteractionList fromValue(java.lang.String v) {
        for (TypeRestfulInteractionList c: TypeRestfulInteractionList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
