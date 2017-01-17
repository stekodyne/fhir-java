/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:59:45 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MedicationStatementStatusListTest {

    @Test
    public void test0() throws Throwable {
        MedicationStatementStatusList[] medicationStatementStatusListArray0 = MedicationStatementStatusList.values();
        assertNotNull(medicationStatementStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationStatementStatusList medicationStatementStatusList0 = MedicationStatementStatusList.valueOf("ACTIVE");
        assertEquals(0, medicationStatementStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        MedicationStatementStatusList medicationStatementStatusList0 = MedicationStatementStatusList.valueOf("ENTERED_IN_ERROR");
        assertEquals(MedicationStatementStatusList.ENTERED_IN_ERROR, medicationStatementStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        MedicationStatementStatusList medicationStatementStatusList0 = MedicationStatementStatusList.fromValue("completed");
        assertEquals(1, medicationStatementStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MedicationStatementStatusList.valueOf((java.lang.String) null);
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
        MedicationStatementStatusList medicationStatementStatusList0 = MedicationStatementStatusList.fromValue("active");
        assertEquals("active", medicationStatementStatusList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            MedicationStatementStatusList.fromValue("entered-en-error");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // entered-en-error
            //
            assertThrownBy("com.csra.fhir.MedicationStatementStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        MedicationStatementStatusList medicationStatementStatusList0 = MedicationStatementStatusList.COMPLETED;
        java.lang.String string0 = medicationStatementStatusList0.value();
        assertEquals("completed", string0);
    }
}
