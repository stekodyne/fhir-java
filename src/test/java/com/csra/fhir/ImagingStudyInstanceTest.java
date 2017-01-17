/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:10:55 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingStudyInstanceTest {

    @Test
    public void test00() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        java.util.List<Attachment> list0 = imagingStudyInstance0.getContent();
        java.util.List<Attachment> list1 = imagingStudyInstance0.getContent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        Oid oid0 = imagingStudyInstance0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test02() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.setSopClass((Oid) null);
        assertNull(imagingStudyInstance0.getId());
    }

    @Test
    public void test03() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        String string0 = imagingStudyInstance0.getType();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        Oid oid0 = imagingStudyInstance0.getSopClass();
        assertNull(oid0);
    }

    @Test
    public void test05() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.setTitle((String) null);
        assertNull(imagingStudyInstance0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.setUid((Oid) null);
        assertNull(imagingStudyInstance0.getId());
    }

    @Test
    public void test07() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.setType((String) null);
        assertNull(imagingStudyInstance0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.setNumber((UnsignedInt) null);
        assertNull(imagingStudyInstance0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        String string0 = imagingStudyInstance0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        ImagingStudyInstance imagingStudyInstance0 = new ImagingStudyInstance();
        imagingStudyInstance0.getNumber();
    }
}
