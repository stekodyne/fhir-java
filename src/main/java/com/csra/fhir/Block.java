//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.11 at 12:22:25 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Block">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}p"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}address"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}fieldset"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}table"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}form"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}noscript"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}ins"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}del"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *             &lt;/choice>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block", namespace = "http://www.w3.org/1999/xhtml", propOrder = {
    "pOrH1OrH2"
})
@XmlSeeAlso({
    Body.class,
    Blockquote.class,
    Noscript.class
})
public class Block {

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "h1", type = H1 .class),
        @XmlElement(name = "h2", type = H2 .class),
        @XmlElement(name = "h3", type = H3 .class),
        @XmlElement(name = "h4", type = H4 .class),
        @XmlElement(name = "h5", type = H5 .class),
        @XmlElement(name = "h6", type = H6 .class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "ul", type = Ul.class),
        @XmlElement(name = "ol", type = Ol.class),
        @XmlElement(name = "dl", type = Dl.class),
        @XmlElement(name = "pre", type = Pre.class),
        @XmlElement(name = "hr", type = Hr.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "address", type = Address2 .class),
        @XmlElement(name = "fieldset", type = Fieldset.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "form", type = Form.class),
        @XmlElement(name = "noscript", type = Noscript.class),
        @XmlElement(name = "ins", type = Ins.class),
        @XmlElement(name = "del", type = Del.class),
        @XmlElement(name = "script", type = Script.class)
    })
    protected List<java.lang.Object> pOrH1OrH2;

    /**
     * Gets the value of the pOrH1OrH2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrH1OrH2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrH1OrH2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link H1 }
     * {@link H2 }
     * {@link H3 }
     * {@link H4 }
     * {@link H5 }
     * {@link H6 }
     * {@link Div }
     * {@link Ul }
     * {@link Ol }
     * {@link Dl }
     * {@link Pre }
     * {@link Hr }
     * {@link Blockquote }
     * {@link Address2 }
     * {@link Fieldset }
     * {@link Table }
     * {@link Form }
     * {@link Noscript }
     * {@link Ins }
     * {@link Del }
     * {@link Script }
     * 
     * 
     */
    public List<java.lang.Object> getPOrH1OrH2() {
        if (pOrH1OrH2 == null) {
            pOrH1OrH2 = new ArrayList<java.lang.Object>();
        }
        return this.pOrH1OrH2;
    }

}
