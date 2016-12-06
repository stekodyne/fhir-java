//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.05 at 04:54:01 PM PST 
//


package com.csra.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}p"/>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h1"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h2"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h3"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h4"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h5"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}h6"/>
 *               &lt;/choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}div"/>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}ul"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}ol"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}dl"/>
 *               &lt;/choice>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}pre"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}hr"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}blockquote"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}address"/>
 *               &lt;/choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}fieldset"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}table"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}form"/>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}noscript"/>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}ins"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}del"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}script"/>
 *               &lt;/choice>
 *             &lt;/choice>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}area" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}events"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}i18n"/>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="style" type="{http://www.w3.org/1999/xhtml}StyleSheet" />
 *       &lt;attribute name="title" type="{http://www.w3.org/1999/xhtml}Text" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pOrH1OrH2",
    "area"
})
@XmlRootElement(name = "map", namespace = "http://www.w3.org/1999/xhtml")
public class Map {

    @XmlElements({
        @XmlElement(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class),
        @XmlElement(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class),
        @XmlElement(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class),
        @XmlElement(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class),
        @XmlElement(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class),
        @XmlElement(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class),
        @XmlElement(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class),
        @XmlElement(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class),
        @XmlElement(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class),
        @XmlElement(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class),
        @XmlElement(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class),
        @XmlElement(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class),
        @XmlElement(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class),
        @XmlElement(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class),
        @XmlElement(name = "address", namespace = "http://www.w3.org/1999/xhtml", type = Address2 .class),
        @XmlElement(name = "fieldset", namespace = "http://www.w3.org/1999/xhtml", type = Fieldset.class),
        @XmlElement(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class),
        @XmlElement(name = "form", namespace = "http://www.w3.org/1999/xhtml", type = Form.class),
        @XmlElement(name = "noscript", namespace = "http://www.w3.org/1999/xhtml", type = Noscript.class),
        @XmlElement(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class),
        @XmlElement(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class),
        @XmlElement(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class)
    })
    protected List<java.lang.Object> pOrH1OrH2;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml")
    protected List<Area> area;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected java.lang.String clazz;
    @XmlAttribute(name = "style")
    protected java.lang.String style;
    @XmlAttribute(name = "title")
    protected java.lang.String title;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String name;
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
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String dir;

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

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Area }
     * 
     * 
     */
    public List<Area> getArea() {
        if (area == null) {
            area = new ArrayList<Area>();
        }
        return this.area;
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setClazz(java.lang.String value) {
        this.clazz = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
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

}
