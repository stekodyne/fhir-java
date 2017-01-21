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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 * 
 * <p>Java class for ImagingObjectSelection.Instance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingObjectSelection.Instance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="sopClass" type="{http://hl7.org/fhir}oid"/>
 *         &lt;element name="uid" type="{http://hl7.org/fhir}oid"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri"/>
 *         &lt;element name="frames" type="{http://hl7.org/fhir}ImagingObjectSelection.Frames" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingObjectSelection.Instance", propOrder = {
    "sopClass",
    "uid",
    "url",
    "frames"
})
public class ImagingObjectSelectionInstance
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Oid sopClass;
    @XmlElement(required = true)
    protected Oid uid;
    @XmlElement(required = true)
    protected Uri url;
    protected List<ImagingObjectSelectionFrames> frames;

    /**
     * Gets the value of the sopClass property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getSopClass() {
        return sopClass;
    }

    /**
     * Sets the value of the sopClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setSopClass(Oid value) {
        this.sopClass = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setUid(Oid value) {
        this.uid = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the frames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagingObjectSelectionFrames }
     * 
     * 
     */
    public List<ImagingObjectSelectionFrames> getFrames() {
        if (frames == null) {
            frames = new ArrayList<ImagingObjectSelectionFrames>();
        }
        return this.frames;
    }

}
