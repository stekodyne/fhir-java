/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:06:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class VisionEyesListTest {

    @Test
    public void test0() throws Throwable {
        VisionEyesList[] visionEyesListArray0 = VisionEyesList.values();
        assertNotNull(visionEyesListArray0);
    }

    @Test
    public void test1() throws Throwable {
        VisionEyesList visionEyesList0 = VisionEyesList.valueOf("LEFT");
        assertEquals(1, visionEyesList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        VisionEyesList visionEyesList0 = VisionEyesList.fromValue("right");
        assertEquals("RIGHT", visionEyesList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            VisionEyesList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            VisionEyesList.valueOf("s1>@[ LhAjo#");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.VisionEyesList.s1>@[ LhAjo#
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        VisionEyesList visionEyesList0 = VisionEyesList.fromValue("left");
        assertEquals("LEFT", visionEyesList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            VisionEyesList.fromValue("LEFT");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // LEFT
            //
            assertThrownBy("com.csra.fhir.VisionEyesList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        VisionEyesList visionEyesList0 = VisionEyesList.valueOf("RIGHT");
        java.lang.String string0 = visionEyesList0.value();
        assertEquals("right", string0);
    }
}
