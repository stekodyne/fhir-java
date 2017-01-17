/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:15:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceMetricCalibrationStateListTest {

    @Test
    public void test0() throws Throwable {
        DeviceMetricCalibrationStateList[] deviceMetricCalibrationStateListArray0 = DeviceMetricCalibrationStateList.values();
        assertNotNull(deviceMetricCalibrationStateListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceMetricCalibrationStateList deviceMetricCalibrationStateList0 = DeviceMetricCalibrationStateList.valueOf("UNSPECIFIED");
        assertEquals(3, deviceMetricCalibrationStateList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DeviceMetricCalibrationStateList deviceMetricCalibrationStateList0 = DeviceMetricCalibrationStateList.fromValue("calibrated");
        assertEquals("CALIBRATED", deviceMetricCalibrationStateList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricCalibrationStateList.valueOf((java.lang.String) null);
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
            DeviceMetricCalibrationStateList.valueOf("not-calibrated");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceMetricCalibrationStateList.not-calibrated
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        DeviceMetricCalibrationStateList deviceMetricCalibrationStateList0 = DeviceMetricCalibrationStateList.fromValue("not-calibrated");
        assertEquals("NOT_CALIBRATED", deviceMetricCalibrationStateList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricCalibrationStateList.fromValue("not-cafibrated");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // not-cafibrated
            //
            assertThrownBy("com.csra.fhir.DeviceMetricCalibrationStateList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DeviceMetricCalibrationStateList deviceMetricCalibrationStateList0 = DeviceMetricCalibrationStateList.valueOf("NOT_CALIBRATED");
        java.lang.String string0 = deviceMetricCalibrationStateList0.value();
        assertEquals("not-calibrated", string0);
    }
}
