/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:14:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingObjectSelectionSeriesTest {

    @Test
    public void test0() throws Throwable {
        ImagingObjectSelectionSeries imagingObjectSelectionSeries0 = new ImagingObjectSelectionSeries();
        java.util.List<ImagingObjectSelectionInstance> list0 = imagingObjectSelectionSeries0.getInstance();
        java.util.List<ImagingObjectSelectionInstance> list1 = imagingObjectSelectionSeries0.getInstance();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImagingObjectSelectionSeries imagingObjectSelectionSeries0 = new ImagingObjectSelectionSeries();
        imagingObjectSelectionSeries0.setUid((Oid) null);
        assertNull(imagingObjectSelectionSeries0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ImagingObjectSelectionSeries imagingObjectSelectionSeries0 = new ImagingObjectSelectionSeries();
        imagingObjectSelectionSeries0.setUrl((Uri) null);
        assertNull(imagingObjectSelectionSeries0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ImagingObjectSelectionSeries imagingObjectSelectionSeries0 = new ImagingObjectSelectionSeries();
        Uri uri0 = imagingObjectSelectionSeries0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test4() throws Throwable {
        ImagingObjectSelectionSeries imagingObjectSelectionSeries0 = new ImagingObjectSelectionSeries();
        imagingObjectSelectionSeries0.getUid();
    }
}
