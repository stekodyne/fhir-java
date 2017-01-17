/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:22:26 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ProcedureStatusListTest {

    @Test
    public void test0() throws Throwable {
        ProcedureStatusList[] procedureStatusListArray0 = ProcedureStatusList.values();
        assertNotNull(procedureStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ProcedureStatusList procedureStatusList0 = ProcedureStatusList.valueOf("IN_PROGRESS");
        assertEquals("IN_PROGRESS", procedureStatusList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        ProcedureStatusList procedureStatusList0 = ProcedureStatusList.valueOf("ENTERED_IN_ERROR");
        assertEquals("entered-in-error", procedureStatusList0.value());
    }

    @Test
    public void test3() throws Throwable {
        ProcedureStatusList procedureStatusList0 = ProcedureStatusList.fromValue("completed");
        assertEquals(2, procedureStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureStatusList.valueOf((java.lang.String) null);
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
            ProcedureStatusList.valueOf("in-progress");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ProcedureStatusList.in-progress
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ProcedureStatusList procedureStatusList0 = ProcedureStatusList.fromValue("in-progress");
        assertEquals("IN_PROGRESS", procedureStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureStatusList.fromValue("&7%$/(&.wth;c}+R");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // &7%$/(&.wth;c}+R
            //
            assertThrownBy("com.csra.fhir.ProcedureStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ProcedureStatusList procedureStatusList0 = ProcedureStatusList.ABORTED;
        java.lang.String string0 = procedureStatusList0.value();
        assertEquals("aborted", string0);
    }
}
