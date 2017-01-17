/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:06:23 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ProcedureRequestStatusListTest {

    @Test
    public void test0() throws Throwable {
        ProcedureRequestStatusList[] procedureRequestStatusListArray0 = ProcedureRequestStatusList.values();
        assertNotNull(procedureRequestStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ProcedureRequestStatusList procedureRequestStatusList0 = ProcedureRequestStatusList.valueOf("PROPOSED");
        assertEquals(ProcedureRequestStatusList.PROPOSED, procedureRequestStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        ProcedureRequestStatusList procedureRequestStatusList0 = ProcedureRequestStatusList.valueOf("IN_PROGRESS");
        assertEquals(ProcedureRequestStatusList.IN_PROGRESS, procedureRequestStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        ProcedureRequestStatusList procedureRequestStatusList0 = ProcedureRequestStatusList.fromValue("rejected");
        assertEquals("REJECTED", procedureRequestStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureRequestStatusList.valueOf((java.lang.String) null);
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
            ProcedureRequestStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ProcedureRequestStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ProcedureRequestStatusList procedureRequestStatusList0 = ProcedureRequestStatusList.fromValue("proposed");
        assertEquals("PROPOSED", procedureRequestStatusList0.name());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureRequestStatusList.fromValue("@sfV%lVL@>");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // @sfV%lVL@>
            //
            assertThrownBy("com.csra.fhir.ProcedureRequestStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ProcedureRequestStatusList procedureRequestStatusList0 = ProcedureRequestStatusList.PROPOSED;
        java.lang.String string0 = procedureRequestStatusList0.value();
        assertEquals("proposed", string0);
    }
}
