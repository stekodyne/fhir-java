/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:27:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceMetricCategoryListTest {

    @Test
    public void test0() throws Throwable {
        DeviceMetricCategoryList[] deviceMetricCategoryListArray0 = DeviceMetricCategoryList.values();
        assertNotNull(deviceMetricCategoryListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceMetricCategoryList deviceMetricCategoryList0 = DeviceMetricCategoryList.valueOf("MEASUREMENT");
        assertEquals("MEASUREMENT", deviceMetricCategoryList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DeviceMetricCategoryList deviceMetricCategoryList0 = DeviceMetricCategoryList.valueOf("CALCULATION");
        assertEquals("calculation", deviceMetricCategoryList0.value());
    }

    @Test
    public void test3() throws Throwable {
        DeviceMetricCategoryList deviceMetricCategoryList0 = DeviceMetricCategoryList.fromValue("unspecified");
        assertEquals("UNSPECIFIED", deviceMetricCategoryList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceMetricCategoryList.valueOf((java.lang.String) null);
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
            DeviceMetricCategoryList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceMetricCategoryList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DeviceMetricCategoryList deviceMetricCategoryList0 = DeviceMetricCategoryList.fromValue("measurement");
        assertEquals("measurement", deviceMetricCategoryList0.value());
    }

    @Test
    public void test7() throws Throwable {
        DeviceMetricCategoryList deviceMetricCategoryList0 = DeviceMetricCategoryList.MEASUREMENT;
        java.lang.String string0 = deviceMetricCategoryList0.value();
        assertEquals("measurement", string0);
    }
}
