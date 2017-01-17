/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:54:39 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AppointmentStatusListTest {

    @Test
    public void test0() throws Throwable {
        AppointmentStatusList[] appointmentStatusListArray0 = AppointmentStatusList.values();
        assertNotNull(appointmentStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AppointmentStatusList appointmentStatusList0 = AppointmentStatusList.valueOf("PROPOSED");
        assertEquals("proposed", appointmentStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        AppointmentStatusList appointmentStatusList0 = AppointmentStatusList.valueOf("NOSHOW");
        assertEquals("noshow", appointmentStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        AppointmentStatusList appointmentStatusList0 = AppointmentStatusList.fromValue("proposed");
        assertEquals("PROPOSED", appointmentStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AppointmentStatusList.valueOf((java.lang.String) null);
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
        AppointmentStatusList appointmentStatusList0 = AppointmentStatusList.fromValue("fulfilled");
        assertEquals("FULFILLED", appointmentStatusList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AppointmentStatusList.fromValue("zBX#@");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // zBX#@
            //
            assertThrownBy("com.csra.fhir.AppointmentStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AppointmentStatusList appointmentStatusList0 = AppointmentStatusList.FULFILLED;
        java.lang.String string0 = appointmentStatusList0.value();
        assertEquals("fulfilled", string0);
    }
}
