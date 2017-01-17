/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:54:28 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class FamilyHistoryStatusListTest {

    @Test
    public void test0() throws Throwable {
        FamilyHistoryStatusList[] familyHistoryStatusListArray0 = FamilyHistoryStatusList.values();
        assertNotNull(familyHistoryStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        FamilyHistoryStatusList familyHistoryStatusList0 = FamilyHistoryStatusList.valueOf("PARTIAL");
        assertEquals("partial", familyHistoryStatusList0.value());
    }

    @Test
    public void test2() throws Throwable {
        FamilyHistoryStatusList familyHistoryStatusList0 = FamilyHistoryStatusList.valueOf("HEALTH_UNKNOWN");
        assertEquals(FamilyHistoryStatusList.HEALTH_UNKNOWN, familyHistoryStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        FamilyHistoryStatusList familyHistoryStatusList0 = FamilyHistoryStatusList.fromValue("completed");
        assertEquals("COMPLETED", familyHistoryStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            FamilyHistoryStatusList.valueOf((java.lang.String) null);
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
            FamilyHistoryStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.FamilyHistoryStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        FamilyHistoryStatusList familyHistoryStatusList0 = FamilyHistoryStatusList.fromValue("partial");
        assertEquals("PARTIAL", familyHistoryStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            FamilyHistoryStatusList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.FamilyHistoryStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        FamilyHistoryStatusList familyHistoryStatusList0 = FamilyHistoryStatusList.COMPLETED;
        java.lang.String string0 = familyHistoryStatusList0.value();
        assertEquals("completed", string0);
    }
}
