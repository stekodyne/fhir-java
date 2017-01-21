//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.21 at 10:43:33 AM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				a elements use "Inline" excluding a
 * 			
 * 
 * <p>Java class for a.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="a.content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}br"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}span"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}map"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}img"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}i"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}b"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}big"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}small"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}em"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}code"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}q"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}var"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}input"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}select"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}textarea"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}label"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}button"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}ins"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}del"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
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
@XmlType(name = "a.content", namespace = "http://www.w3.org/1999/xhtml", propOrder = {
    "content"
})
@XmlSeeAlso({
    A.class
})
public class AContent {

    @XmlElementRefs({
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = com.csra.fhir.Object.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code2 .class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class, required = false),
        @XmlElementRef(name = "button", namespace = "http://www.w3.org/1999/xhtml", type = Button.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class, required = false),
        @XmlElementRef(name = "textarea", namespace = "http://www.w3.org/1999/xhtml", type = Textarea.class, required = false),
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class, required = false),
        @XmlElementRef(name = "label", namespace = "http://www.w3.org/1999/xhtml", type = Label.class, required = false),
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/1999/xhtml", type = Input.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class, required = false),
        @XmlElementRef(name = "select", namespace = "http://www.w3.org/1999/xhtml", type = Select.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;

    /**
     * 
     * 				a elements use "Inline" excluding a
     * 			Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sup }
     * {@link Ins }
     * {@link java.lang.String }
     * {@link Q }
     * {@link Img }
     * {@link com.csra.fhir.Object }
     * {@link I }
     * {@link Tt }
     * {@link Strong }
     * {@link Var }
     * {@link Code2 }
     * {@link Small }
     * {@link Cite }
     * {@link Kbd }
     * {@link Button }
     * {@link Em }
     * {@link B }
     * {@link Bdo }
     * {@link Map }
     * {@link Big }
     * {@link Textarea }
     * {@link Script }
     * {@link Label }
     * {@link Input }
     * {@link Span }
     * {@link Select }
     * {@link Abbr }
     * {@link Dfn }
     * {@link Samp }
     * {@link Del }
     * {@link Sub }
     * {@link Acronym }
     * {@link Br }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

}
