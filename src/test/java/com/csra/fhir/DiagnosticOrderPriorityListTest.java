/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:25:42 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DiagnosticOrderPriorityListTest {

    @Test
    public void test0() throws Throwable {
        DiagnosticOrderPriorityList[] diagnosticOrderPriorityListArray0 = DiagnosticOrderPriorityList.values();
        assertNotNull(diagnosticOrderPriorityListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DiagnosticOrderPriorityList diagnosticOrderPriorityList0 = DiagnosticOrderPriorityList.valueOf("ROUTINE");
        assertEquals(DiagnosticOrderPriorityList.ROUTINE, diagnosticOrderPriorityList0);
    }

    @Test
    public void test2() throws Throwable {
        DiagnosticOrderPriorityList diagnosticOrderPriorityList0 = DiagnosticOrderPriorityList.valueOf("STAT");
        assertEquals(2, diagnosticOrderPriorityList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        DiagnosticOrderPriorityList diagnosticOrderPriorityList0 = DiagnosticOrderPriorityList.fromValue("urgent");
        assertEquals("urgent", diagnosticOrderPriorityList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticOrderPriorityList.valueOf((java.lang.String) null);
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
            DiagnosticOrderPriorityList.valueOf("X[td,lN1&r");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DiagnosticOrderPriorityList.X[td,lN1&r
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DiagnosticOrderPriorityList diagnosticOrderPriorityList0 = DiagnosticOrderPriorityList.fromValue("routine");
        assertEquals(0, diagnosticOrderPriorityList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticOrderPriorityList.fromValue("ROUTINE");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ROUTINE
            //
            assertThrownBy("com.csra.fhir.DiagnosticOrderPriorityList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DiagnosticOrderPriorityList diagnosticOrderPriorityList0 = DiagnosticOrderPriorityList.ASAP;
        java.lang.String string0 = diagnosticOrderPriorityList0.value();
        assertEquals("asap", string0);
    }
}
