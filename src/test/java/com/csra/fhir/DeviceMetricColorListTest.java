/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:55:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceMetricColorListTest {

    @Test
    public void test0() throws Throwable {
        DeviceMetricColorList[] deviceMetricColorListArray0 = DeviceMetricColorList.values();
        assertNotNull(deviceMetricColorListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceMetricColorList deviceMetricColorList0 = DeviceMetricColorList.valueOf("BLACK");
        assertEquals(DeviceMetricColorList.BLACK, deviceMetricColorList0);
    }

    @Test
    public void test2() throws Throwable {
        DeviceMetricColorList deviceMetricColorList0 = DeviceMetricColorList.valueOf("MAGENTA");
        assertEquals("MAGENTA", deviceMetricColorList0.name());
    }

    @Test
    public void test3() throws Throwable {
        DeviceMetricColorList deviceMetricColorList0 = DeviceMetricColorList.fromValue("magenta");
        assertEquals("magenta", deviceMetricColorList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricColorList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricColorList.valueOf("black");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceMetricColorList.black
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DeviceMetricColorList deviceMetricColorList0 = DeviceMetricColorList.fromValue("black");
        assertEquals(0, deviceMetricColorList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricColorList.fromValue("MAGENTA");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // MAGENTA
            //
            assertThrownBy("com.csra.fhir.DeviceMetricColorList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DeviceMetricColorList deviceMetricColorList0 = DeviceMetricColorList.GREEN;
        java.lang.String string0 = deviceMetricColorList0.value();
        assertEquals("green", string0);
    }
}
