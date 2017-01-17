/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:11:25 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingObjectSelectionStudyTest {

    @Test
    public void test0() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        java.util.List<ImagingObjectSelectionSeries> list0 = imagingObjectSelectionStudy0.getSeries();
        java.util.List<ImagingObjectSelectionSeries> list1 = imagingObjectSelectionStudy0.getSeries();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        Uri uri0 = imagingObjectSelectionStudy0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test2() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        Oid oid0 = imagingObjectSelectionStudy0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test3() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        imagingObjectSelectionStudy0.setUrl((Uri) null);
        assertNull(imagingObjectSelectionStudy0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        Reference reference0 = imagingObjectSelectionStudy0.getImagingStudy();
        assertNull(reference0);
    }

    @Test
    public void test5() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        imagingObjectSelectionStudy0.setImagingStudy((Reference) null);
        assertNull(imagingObjectSelectionStudy0.getId());
    }

    @Test
    public void test6() throws Throwable {
        ImagingObjectSelectionStudy imagingObjectSelectionStudy0 = new ImagingObjectSelectionStudy();
        imagingObjectSelectionStudy0.setUid((Oid) null);
    }
}
