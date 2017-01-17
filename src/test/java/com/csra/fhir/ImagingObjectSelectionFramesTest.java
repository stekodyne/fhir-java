/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:00:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImagingObjectSelectionFramesTest {

    @Test
    public void test0() throws Throwable {
        ImagingObjectSelectionFrames imagingObjectSelectionFrames0 = new ImagingObjectSelectionFrames();
        java.util.List<UnsignedInt> list0 = imagingObjectSelectionFrames0.getFrameNumbers();
        java.util.List<UnsignedInt> list1 = imagingObjectSelectionFrames0.getFrameNumbers();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ImagingObjectSelectionFrames imagingObjectSelectionFrames0 = new ImagingObjectSelectionFrames();
        imagingObjectSelectionFrames0.setUrl((Uri) null);
        assertNull(imagingObjectSelectionFrames0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ImagingObjectSelectionFrames imagingObjectSelectionFrames0 = new ImagingObjectSelectionFrames();
        imagingObjectSelectionFrames0.getUrl();
    }
}
