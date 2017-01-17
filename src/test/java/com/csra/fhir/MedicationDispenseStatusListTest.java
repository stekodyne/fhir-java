/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:13:26 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MedicationDispenseStatusListTest {

    @Test
    public void test0() throws Throwable {
        MedicationDispenseStatusList[] medicationDispenseStatusListArray0 = MedicationDispenseStatusList.values();
        assertNotNull(medicationDispenseStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationDispenseStatusList medicationDispenseStatusList0 = MedicationDispenseStatusList.valueOf("IN_PROGRESS");
        assertEquals(0, medicationDispenseStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        MedicationDispenseStatusList medicationDispenseStatusList0 = MedicationDispenseStatusList.valueOf("STOPPED");
        assertEquals("STOPPED", medicationDispenseStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        MedicationDispenseStatusList medicationDispenseStatusList0 = MedicationDispenseStatusList.fromValue("completed");
        assertEquals(2, medicationDispenseStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MedicationDispenseStatusList.valueOf((java.lang.String) null);
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
            MedicationDispenseStatusList.valueOf("in-progress");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.MedicationDispenseStatusList.in-progress
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        MedicationDispenseStatusList medicationDispenseStatusList0 = MedicationDispenseStatusList.fromValue("in-progress");
        assertEquals("in-progress", medicationDispenseStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            MedicationDispenseStatusList.fromValue("$vJ6|Q=B7gSbT?]t4h");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // $vJ6|Q=B7gSbT?]t4h
            //
            assertThrownBy("com.csra.fhir.MedicationDispenseStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        MedicationDispenseStatusList medicationDispenseStatusList0 = MedicationDispenseStatusList.IN_PROGRESS;
        java.lang.String string0 = medicationDispenseStatusList0.value();
        assertEquals("in-progress", string0);
    }
}
