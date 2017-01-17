/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:29:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingObjectSelectionInstanceTest {

    @Test
    public void test0() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        java.util.List<ImagingObjectSelectionFrames> list0 = imagingObjectSelectionInstance0.getFrames();
        java.util.List<ImagingObjectSelectionFrames> list1 = imagingObjectSelectionInstance0.getFrames();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        imagingObjectSelectionInstance0.setUrl((Uri) null);
        assertNull(imagingObjectSelectionInstance0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        Oid oid0 = imagingObjectSelectionInstance0.getSopClass();
        assertNull(oid0);
    }

    @Test
    public void test3() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        Oid oid0 = imagingObjectSelectionInstance0.getUid();
        assertNull(oid0);
    }

    @Test
    public void test4() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        Uri uri0 = imagingObjectSelectionInstance0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test5() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        imagingObjectSelectionInstance0.setUid((Oid) null);
        assertNull(imagingObjectSelectionInstance0.getId());
    }

    @Test
    public void test6() throws Throwable {
        ImagingObjectSelectionInstance imagingObjectSelectionInstance0 = new ImagingObjectSelectionInstance();
        imagingObjectSelectionInstance0.setSopClass((Oid) null);
        assertNull(imagingObjectSelectionInstance0.getId());
    }
}
