/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:59:01 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingObjectSelectionTest {

    @Test
    public void test00() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        java.util.List<ImagingObjectSelectionStudy> list0 = imagingObjectSelection0.getStudy();
        java.util.List<ImagingObjectSelectionStudy> list1 = imagingObjectSelection0.getStudy();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setAuthor((Reference) null);
    }

    @Test
    public void test02() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        Oid oid0 = imagingObjectSelection0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test03() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        Reference reference0 = imagingObjectSelection0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setDescription((String) null);
    }

    @Test
    public void test05() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        Reference reference0 = imagingObjectSelection0.getAuthor();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setTitle((CodeableConcept) null);
    }

    @Test
    public void test07() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setAuthoringTime((DateTime) null);
    }

    @Test
    public void test08() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        DateTime dateTime0 = imagingObjectSelection0.getAuthoringTime();
        assertNull(dateTime0);
    }

    @Test
    public void test09() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        String string0 = imagingObjectSelection0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setPatient((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        CodeableConcept codeableConcept0 = imagingObjectSelection0.getTitle();
        assertNull(codeableConcept0);
    }

    @Test
    public void test12() throws Throwable {
        ImagingObjectSelection imagingObjectSelection0 = new ImagingObjectSelection();
        imagingObjectSelection0.setUid((Oid) null);
    }
}
