/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:47:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MedicationAdministrationStatusListTest {

    @Test
    public void test0() throws Throwable {
        MedicationAdministrationStatusList[] medicationAdministrationStatusListArray0 = MedicationAdministrationStatusList.values();
        assertNotNull(medicationAdministrationStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationAdministrationStatusList medicationAdministrationStatusList0 = MedicationAdministrationStatusList.valueOf("IN_PROGRESS");
        assertEquals(0, medicationAdministrationStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        MedicationAdministrationStatusList medicationAdministrationStatusList0 = MedicationAdministrationStatusList.valueOf("ON_HOLD");
        assertEquals("ON_HOLD", medicationAdministrationStatusList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        MedicationAdministrationStatusList medicationAdministrationStatusList0 = MedicationAdministrationStatusList.fromValue("entered-in-error");
        assertEquals("entered-in-error", medicationAdministrationStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MedicationAdministrationStatusList.valueOf((java.lang.String) null);
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
            MedicationAdministrationStatusList.valueOf("on-hold");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.MedicationAdministrationStatusList.on-hold
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            MedicationAdministrationStatusList.fromValue("stoppjK");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // stoppjK
            //
            assertThrownBy("com.csra.fhir.MedicationAdministrationStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        MedicationAdministrationStatusList medicationAdministrationStatusList0 = MedicationAdministrationStatusList.fromValue("in-progress");
        java.lang.String string0 = medicationAdministrationStatusList0.value();
        assertEquals("in-progress", string0);
    }
}
