/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:08:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceMetricCalibrationTypeListTest {

    @Test
    public void test0() throws Throwable {
        DeviceMetricCalibrationTypeList[] deviceMetricCalibrationTypeListArray0 = DeviceMetricCalibrationTypeList.values();
        assertNotNull(deviceMetricCalibrationTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList0 = DeviceMetricCalibrationTypeList.valueOf("UNSPECIFIED");
        assertEquals(0, deviceMetricCalibrationTypeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList0 = DeviceMetricCalibrationTypeList.valueOf("GAIN");
        assertEquals("gain", deviceMetricCalibrationTypeList0.value());
    }

    @Test
    public void test3() throws Throwable {
        DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList0 = DeviceMetricCalibrationTypeList.fromValue("two-point");
        assertEquals("TWO_POINT", deviceMetricCalibrationTypeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricCalibrationTypeList.valueOf((java.lang.String) null);
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
        DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList0 = DeviceMetricCalibrationTypeList.fromValue("unspecified");
        assertEquals("UNSPECIFIED", deviceMetricCalibrationTypeList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricCalibrationTypeList.fromValue("UNSPECIFIED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // UNSPECIFIED
            //
            assertThrownBy("com.csra.fhir.DeviceMetricCalibrationTypeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList0 = DeviceMetricCalibrationTypeList.TWO_POINT;
        java.lang.String string0 = deviceMetricCalibrationTypeList0.value();
        assertEquals("two-point", string0);
    }
}
