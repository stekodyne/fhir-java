/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:48:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingStudySeriesTest {

    @Test
    public void test00() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        java.util.List<ImagingStudyInstance> list0 = imagingStudySeries0.getInstance();
        java.util.List<ImagingStudyInstance> list1 = imagingStudySeries0.getInstance();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setBodySite((Coding) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test02() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        DateTime dateTime0 = imagingStudySeries0.getStarted();
        assertNull(dateTime0);
    }

    @Test
    public void test03() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        InstanceAvailability instanceAvailability0 = imagingStudySeries0.getAvailability();
        assertNull(instanceAvailability0);
    }

    @Test
    public void test04() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setDescription((String) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test05() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        String string0 = imagingStudySeries0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test06() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        UnsignedInt unsignedInt0 = imagingStudySeries0.getNumber();
        assertNull(unsignedInt0);
    }

    @Test
    public void test07() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        Uri uri0 = imagingStudySeries0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test08() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setUid((Oid) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setModality((Coding) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test10() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        Coding coding0 = imagingStudySeries0.getBodySite();
        assertNull(coding0);
    }

    @Test
    public void test11() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        Coding coding0 = imagingStudySeries0.getLaterality();
        assertNull(coding0);
    }

    @Test
    public void test12() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setUrl((Uri) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setNumber((UnsignedInt) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test14() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setAvailability((InstanceAvailability) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test15() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setNumberOfInstances((UnsignedInt) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test16() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setLaterality((Coding) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test17() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        UnsignedInt unsignedInt0 = imagingStudySeries0.getNumberOfInstances();
        assertNull(unsignedInt0);
    }

    @Test
    public void test18() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.setStarted((DateTime) null);
        assertNull(imagingStudySeries0.getId());
    }

    @Test
    public void test19() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        Oid oid0 = imagingStudySeries0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test20() throws Throwable {
        ImagingStudySeries imagingStudySeries0 = new ImagingStudySeries();
        imagingStudySeries0.getModality();
    }
}
