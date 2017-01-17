/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:13:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ProcedureRequestPriorityListTest {

    @Test
    public void test0() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureRequestPriorityList.fromValue("dsap");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // dsap
            //
            assertThrownBy("com.csra.fhir.ProcedureRequestPriorityList", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        ProcedureRequestPriorityList[] procedureRequestPriorityListArray0 = ProcedureRequestPriorityList.values();
        assertNotNull(procedureRequestPriorityListArray0);
    }

    @Test
    public void test2() throws Throwable {
        ProcedureRequestPriorityList procedureRequestPriorityList0 = ProcedureRequestPriorityList.valueOf("ROUTINE");
        assertEquals("ROUTINE", procedureRequestPriorityList0.name());
    }

    @Test
    public void test3() throws Throwable {
        ProcedureRequestPriorityList procedureRequestPriorityList0 = ProcedureRequestPriorityList.valueOf("URGENT");
        assertEquals("urgent", procedureRequestPriorityList0.value());
    }

    @Test
    public void test4() throws Throwable {
        ProcedureRequestPriorityList procedureRequestPriorityList0 = ProcedureRequestPriorityList.fromValue("stat");
        assertEquals(2, procedureRequestPriorityList0.ordinal());
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureRequestPriorityList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            ProcedureRequestPriorityList.valueOf("WM@ g5s");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ProcedureRequestPriorityList.WM@ g5s
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        ProcedureRequestPriorityList procedureRequestPriorityList0 = ProcedureRequestPriorityList.fromValue("routine");
        assertEquals(0, procedureRequestPriorityList0.ordinal());
    }

    @Test
    public void test8() throws Throwable {
        ProcedureRequestPriorityList procedureRequestPriorityList0 = ProcedureRequestPriorityList.ROUTINE;
        java.lang.String string0 = procedureRequestPriorityList0.value();
        assertEquals("routine", string0);
    }
}
