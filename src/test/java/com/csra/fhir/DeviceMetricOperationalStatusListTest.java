/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:01:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceMetricOperationalStatusListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricOperationalStatusList.fromValue("pff");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // pff
            //
            assertThrownBy("com.csra.fhir.DeviceMetricOperationalStatusList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        DeviceMetricOperationalStatusList[] deviceMetricOperationalStatusListArray0 = DeviceMetricOperationalStatusList.values();
        assertNotNull(deviceMetricOperationalStatusListArray0);
    }

    @Test
    public void test2() throws Throwable {
        DeviceMetricOperationalStatusList deviceMetricOperationalStatusList0 = DeviceMetricOperationalStatusList.valueOf("STANDBY");
        assertEquals(DeviceMetricOperationalStatusList.STANDBY, deviceMetricOperationalStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricOperationalStatusList.valueOf((java.lang.String) null);
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
            DeviceMetricOperationalStatusList.valueOf("@delggu7SR}rBepD@O");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceMetricOperationalStatusList.@delggu7SR}rBepD@O
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        DeviceMetricOperationalStatusList deviceMetricOperationalStatusList0 = DeviceMetricOperationalStatusList.fromValue("standby");
        assertEquals("standby", deviceMetricOperationalStatusList0.value());
    }

    @Test
    public void test6() throws Throwable {
        DeviceMetricOperationalStatusList deviceMetricOperationalStatusList0 = DeviceMetricOperationalStatusList.fromValue("on");
        assertEquals("ON", deviceMetricOperationalStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        DeviceMetricOperationalStatusList deviceMetricOperationalStatusList0 = DeviceMetricOperationalStatusList.valueOf("ON");
        java.lang.String string0 = deviceMetricOperationalStatusList0.value();
        assertEquals("on", string0);
    }
}
