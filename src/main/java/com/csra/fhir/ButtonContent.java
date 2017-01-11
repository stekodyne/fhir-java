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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				button uses "Flow" but excludes a, form and form controls
 * 			
 * 
 * <p>Java class for button.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="button.content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}p"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}address"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}table"/>
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
@XmlType(name = "button.content", namespace = "http://www.w3.org/1999/xhtml", propOrder = {
    "content"
})
@XmlSeeAlso({
    Button.class
})
public class ButtonContent {

    @XmlElementRefs({
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = com.csra.fhir.Object.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code2 .class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.w3.org/1999/xhtml", type = Address2 .class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class, required = false),
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class, required = false),
        @XmlElementRef(name = "noscript", namespace = "http://www.w3.org/1999/xhtml", type = Noscript.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;

    /**
     * 
     * 				button uses "Flow" but excludes a, form and form controls
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
     * {@link H6 }
     * {@link Q }
     * {@link Img }
     * {@link Ol }
     * {@link com.csra.fhir.Object }
     * {@link Pre }
     * {@link I }
     * {@link H5 }
     * {@link Div }
     * {@link Tt }
     * {@link Strong }
     * {@link Var }
     * {@link Code2 }
     * {@link Small }
     * {@link P }
     * {@link Cite }
     * {@link Kbd }
     * {@link Em }
     * {@link B }
     * {@link Bdo }
     * {@link Address2 }
     * {@link Map }
     * {@link Big }
     * {@link Hr }
     * {@link Script }
     * {@link H3 }
     * {@link Dl }
     * {@link Table }
     * {@link H1 }
     * {@link Noscript }
     * {@link Span }
     * {@link Ul }
     * {@link Blockquote }
     * {@link H4 }
     * {@link Abbr }
     * {@link Dfn }
     * {@link Samp }
     * {@link Del }
     * {@link Sub }
     * {@link Acronym }
     * {@link Br }
     * {@link H2 }
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
