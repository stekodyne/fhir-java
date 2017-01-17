/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:56:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DeviceUseRequestStatusListTest {

    @Test
    public void test0() throws Throwable {
        DeviceUseRequestStatusList[] deviceUseRequestStatusListArray0 = DeviceUseRequestStatusList.values();
        assertNotNull(deviceUseRequestStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DeviceUseRequestStatusList deviceUseRequestStatusList0 = DeviceUseRequestStatusList.valueOf("PROPOSED");
        assertEquals(DeviceUseRequestStatusList.PROPOSED, deviceUseRequestStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        DeviceUseRequestStatusList deviceUseRequestStatusList0 = DeviceUseRequestStatusList.valueOf("COMPLETED");
        assertEquals(DeviceUseRequestStatusList.COMPLETED, deviceUseRequestStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        DeviceUseRequestStatusList deviceUseRequestStatusList0 = DeviceUseRequestStatusList.fromValue("rejected");
        assertEquals("REJECTED", deviceUseRequestStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DeviceUseRequestStatusList.valueOf((java.lang.String) null);
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
        DeviceUseRequestStatusList deviceUseRequestStatusList0 = DeviceUseRequestStatusList.fromValue("proposed");
        assertEquals("PROPOSED", deviceUseRequestStatusList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DeviceUseRequestStatusList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.DeviceUseRequestStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DeviceUseRequestStatusList deviceUseRequestStatusList0 = DeviceUseRequestStatusList.REJECTED;
        java.lang.String string0 = deviceUseRequestStatusList0.value();
        assertEquals("rejected", string0);
    }
}
