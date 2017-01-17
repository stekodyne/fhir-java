/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:38:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MedicationOrderStatusListTest {

    @Test
    public void test0() throws Throwable {
        MedicationOrderStatusList[] medicationOrderStatusListArray0 = MedicationOrderStatusList.values();
        assertNotNull(medicationOrderStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationOrderStatusList medicationOrderStatusList0 = MedicationOrderStatusList.valueOf("ACTIVE");
        assertEquals(0, medicationOrderStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        MedicationOrderStatusList medicationOrderStatusList0 = MedicationOrderStatusList.valueOf("STOPPED");
        assertEquals("STOPPED", medicationOrderStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        MedicationOrderStatusList medicationOrderStatusList0 = MedicationOrderStatusList.fromValue("stopped");
        assertEquals("STOPPED", medicationOrderStatusList0.name());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MedicationOrderStatusList.valueOf((java.lang.String) null);
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
            MedicationOrderStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.MedicationOrderStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        MedicationOrderStatusList medicationOrderStatusList0 = MedicationOrderStatusList.fromValue("active");
        assertEquals(0, medicationOrderStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            MedicationOrderStatusList.fromValue("STOPPED");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // STOPPED
            //
            assertThrownBy("com.csra.fhir.MedicationOrderStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        MedicationOrderStatusList medicationOrderStatusList0 = MedicationOrderStatusList.ENTERED_IN_ERROR;
        java.lang.String string0 = medicationOrderStatusList0.value();
        assertEquals("entered-in-error", string0);
    }
}
