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
 * <p>Java class for ExtensionContext-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionContext-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="datatype"/>
 *     &lt;enumeration value="mapping"/>
 *     &lt;enumeration value="extension"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionContext-list")
@XmlEnum
public enum ExtensionContextList {


    /**
     * The context is all elements matching a particular resource element path.
     * 
     */
    @XmlEnumValue("resource")
    RESOURCE("resource"),

    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     * 
     */
    @XmlEnumValue("datatype")
    DATATYPE("datatype"),

    /**
     * The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.
     * 
     */
    @XmlEnumValue("mapping")
    MAPPING("mapping"),

    /**
     * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension");
    private final java.lang.String value;

    ExtensionContextList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExtensionContextList fromValue(java.lang.String v) {
        for (ExtensionContextList c: ExtensionContextList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
