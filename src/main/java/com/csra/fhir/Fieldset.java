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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}legend"/>
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
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}a"/>
 *             &lt;choice>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}br"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}span"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}map"/>
 *               &lt;/choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}object"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}img"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}i"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}b"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}big"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}small"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}em"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}code"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}q"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}var"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}input"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}select"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}textarea"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}label"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}button"/>
 *             &lt;/choice>
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
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "fieldset", namespace = "http://www.w3.org/1999/xhtml")
public class Fieldset {

    @XmlElementRefs({
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class),
        @XmlElementRef(name = "address", namespace = "http://www.w3.org/1999/xhtml", type = Address2 .class),
        @XmlElementRef(name = "textarea", namespace = "http://www.w3.org/1999/xhtml", type = Textarea.class),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class),
        @XmlElementRef(name = "noscript", namespace = "http://www.w3.org/1999/xhtml", type = Noscript.class),
        @XmlElementRef(name = "select", namespace = "http://www.w3.org/1999/xhtml", type = Select.class),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class),
        @XmlElementRef(name = "fieldset", namespace = "http://www.w3.org/1999/xhtml", type = Fieldset.class),
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = com.csra.fhir.Object.class),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code2 .class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class),
        @XmlElementRef(name = "button", namespace = "http://www.w3.org/1999/xhtml", type = Button.class),
        @XmlElementRef(name = "legend", namespace = "http://www.w3.org/1999/xhtml", type = Legend.class),
        @XmlElementRef(name = "form", namespace = "http://www.w3.org/1999/xhtml", type = Form.class),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class),
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class),
        @XmlElementRef(name = "label", namespace = "http://www.w3.org/1999/xhtml", type = Label.class),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class),
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/1999/xhtml", type = Input.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String dir;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<java.lang.String> clazz;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "title")
    protected java.lang.String title;
    @XmlAttribute(name = "onclick")
    protected java.lang.String onclick;
    @XmlAttribute(name = "ondblclick")
    protected java.lang.String ondblclick;
    @XmlAttribute(name = "onmousedown")
    protected java.lang.String onmousedown;
    @XmlAttribute(name = "onmouseup")
    protected java.lang.String onmouseup;
    @XmlAttribute(name = "onmouseover")
    protected java.lang.String onmouseover;
    @XmlAttribute(name = "onmousemove")
    protected java.lang.String onmousemove;
    @XmlAttribute(name = "onmouseout")
    protected java.lang.String onmouseout;
    @XmlAttribute(name = "onkeypress")
    protected java.lang.String onkeypress;
    @XmlAttribute(name = "onkeydown")
    protected java.lang.String onkeydown;
    @XmlAttribute(name = "onkeyup")
    protected java.lang.String onkeyup;

    /**
     * Gets the value of the content property.
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
     * {@link Q }
     * {@link Img }
     * {@link Ol }
     * {@link H5 }
     * {@link Tt }
     * {@link Strong }
     * {@link Small }
     * {@link P }
     * {@link Cite }
     * {@link Em }
     * {@link B }
     * {@link Bdo }
     * {@link Address2 }
     * {@link Textarea }
     * {@link H3 }
     * {@link H1 }
     * {@link Noscript }
     * {@link Select }
     * {@link Del }
     * {@link Sub }
     * {@link A }
     * {@link Ins }
     * {@link java.lang.String }
     * {@link H6 }
     * {@link Fieldset }
     * {@link com.csra.fhir.Object }
     * {@link Pre }
     * {@link I }
     * {@link Div }
     * {@link Var }
     * {@link Code2 }
     * {@link Kbd }
     * {@link Button }
     * {@link Legend }
     * {@link Form }
     * {@link Map }
     * {@link Big }
     * {@link Hr }
     * {@link Script }
     * {@link Label }
     * {@link Dl }
     * {@link Table }
     * {@link Input }
     * {@link Span }
     * {@link Ul }
     * {@link Blockquote }
     * {@link H4 }
     * {@link Abbr }
     * {@link Dfn }
     * {@link Samp }
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

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLanguage(java.lang.String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDir(java.lang.String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<java.lang.String>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStyle(java.lang.String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTitle(java.lang.String value) {
        this.title = value;
    }

    /**
     * Gets the value of the onclick property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnclick() {
        return onclick;
    }

    /**
     * Sets the value of the onclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnclick(java.lang.String value) {
        this.onclick = value;
    }

    /**
     * Gets the value of the ondblclick property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOndblclick() {
        return ondblclick;
    }

    /**
     * Sets the value of the ondblclick property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOndblclick(java.lang.String value) {
        this.ondblclick = value;
    }

    /**
     * Gets the value of the onmousedown property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnmousedown() {
        return onmousedown;
    }

    /**
     * Sets the value of the onmousedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnmousedown(java.lang.String value) {
        this.onmousedown = value;
    }

    /**
     * Gets the value of the onmouseup property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnmouseup() {
        return onmouseup;
    }

    /**
     * Sets the value of the onmouseup property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnmouseup(java.lang.String value) {
        this.onmouseup = value;
    }

    /**
     * Gets the value of the onmouseover property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnmouseover() {
        return onmouseover;
    }

    /**
     * Sets the value of the onmouseover property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnmouseover(java.lang.String value) {
        this.onmouseover = value;
    }

    /**
     * Gets the value of the onmousemove property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnmousemove() {
        return onmousemove;
    }

    /**
     * Sets the value of the onmousemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnmousemove(java.lang.String value) {
        this.onmousemove = value;
    }

    /**
     * Gets the value of the onmouseout property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnmouseout() {
        return onmouseout;
    }

    /**
     * Sets the value of the onmouseout property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnmouseout(java.lang.String value) {
        this.onmouseout = value;
    }

    /**
     * Gets the value of the onkeypress property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnkeypress() {
        return onkeypress;
    }

    /**
     * Sets the value of the onkeypress property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnkeypress(java.lang.String value) {
        this.onkeypress = value;
    }

    /**
     * Gets the value of the onkeydown property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnkeydown() {
        return onkeydown;
    }

    /**
     * Sets the value of the onkeydown property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnkeydown(java.lang.String value) {
        this.onkeydown = value;
    }

    /**
     * Gets the value of the onkeyup property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOnkeyup() {
        return onkeyup;
    }

    /**
     * Sets the value of the onkeyup property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOnkeyup(java.lang.String value) {
        this.onkeyup = value;
    }

}
