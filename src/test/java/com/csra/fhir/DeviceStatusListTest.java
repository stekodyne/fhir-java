/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:39:56 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceStatusListTest {

    @Test
    public void test0() throws Throwable {
        DeviceStatusList[] deviceStatusListArray0 = DeviceStatusList.values();
        assertNotNull(deviceStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceStatusList deviceStatusList0 = DeviceStatusList.valueOf("AVAILABLE");
        assertEquals(DeviceStatusList.AVAILABLE, deviceStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        DeviceStatusList deviceStatusList0 = DeviceStatusList.valueOf("NOT_AVAILABLE");
        assertEquals(1, deviceStatusList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        DeviceStatusList deviceStatusList0 = DeviceStatusList.fromValue("not-available");
        assertEquals("NOT_AVAILABLE", deviceStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceStatusList.valueOf((java.lang.String) null);
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
            DeviceStatusList.valueOf("3\"(3%bP!0r");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceStatusList.3\"(3%bP!0r
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DeviceStatusList deviceStatusList0 = DeviceStatusList.fromValue("available");
        assertEquals("AVAILABLE", deviceStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DeviceStatusList.fromValue("AVAILABLE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // AVAILABLE
            //
            assertThrownBy("com.csra.fhir.DeviceStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DeviceStatusList deviceStatusList0 = DeviceStatusList.NOT_AVAILABLE;
        java.lang.String string0 = deviceStatusList0.value();
        assertEquals("not-available", string0);
    }
}
