/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:29:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ObservationStatusListTest {

    @Test
    public void test0() throws Throwable {
        ObservationStatusList[] observationStatusListArray0 = ObservationStatusList.values();
        assertNotNull(observationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ObservationStatusList observationStatusList0 = ObservationStatusList.valueOf("REGISTERED");
        assertEquals(ObservationStatusList.REGISTERED, observationStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        ObservationStatusList observationStatusList0 = ObservationStatusList.valueOf("FINAL");
        assertEquals("FINAL", observationStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ObservationStatusList observationStatusList0 = ObservationStatusList.fromValue("registered");
        assertEquals(0, observationStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ObservationStatusList.valueOf((java.lang.String) null);
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
            ObservationStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ObservationStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ObservationStatusList observationStatusList0 = ObservationStatusList.fromValue("entered-in-error");
        assertEquals("ENTERED_IN_ERROR", observationStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ObservationStatusList.fromValue("REGISTERED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // REGISTERED
            //
            assertThrownBy("com.csra.fhir.ObservationStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ObservationStatusList observationStatusList0 = ObservationStatusList.REGISTERED;
        java.lang.String string0 = observationStatusList0.value();
        assertEquals("registered", string0);
    }
}
