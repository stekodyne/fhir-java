/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:37:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceUseRequestPriorityListTest {

    @Test
    public void test0() throws Throwable {
        DeviceUseRequestPriorityList[] deviceUseRequestPriorityListArray0 = DeviceUseRequestPriorityList.values();
        assertNotNull(deviceUseRequestPriorityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceUseRequestPriorityList deviceUseRequestPriorityList0 = DeviceUseRequestPriorityList.valueOf("ROUTINE");
        assertEquals("ROUTINE", deviceUseRequestPriorityList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DeviceUseRequestPriorityList deviceUseRequestPriorityList0 = DeviceUseRequestPriorityList.valueOf("URGENT");
        assertEquals("URGENT", deviceUseRequestPriorityList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        DeviceUseRequestPriorityList deviceUseRequestPriorityList0 = DeviceUseRequestPriorityList.fromValue("asap");
        assertEquals(3, deviceUseRequestPriorityList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceUseRequestPriorityList.valueOf((java.lang.String) null);
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
            DeviceUseRequestPriorityList.valueOf("stat");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DeviceUseRequestPriorityList.stat
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DeviceUseRequestPriorityList deviceUseRequestPriorityList0 = DeviceUseRequestPriorityList.fromValue("routine");
        assertEquals("ROUTINE", deviceUseRequestPriorityList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DeviceUseRequestPriorityList.fromValue("URGENT");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // URGENT
            //
            assertThrownBy("com.csra.fhir.DeviceUseRequestPriorityList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DeviceUseRequestPriorityList deviceUseRequestPriorityList0 = DeviceUseRequestPriorityList.ROUTINE;
        java.lang.String string0 = deviceUseRequestPriorityList0.value();
        assertEquals("routine", string0);
    }
}
