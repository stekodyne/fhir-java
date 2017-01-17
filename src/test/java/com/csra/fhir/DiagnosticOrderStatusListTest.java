/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:08:33 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DiagnosticOrderStatusListTest {

    @Test
    public void test0() throws Throwable {
        DiagnosticOrderStatusList[] diagnosticOrderStatusListArray0 = DiagnosticOrderStatusList.values();
        assertNotNull(diagnosticOrderStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.valueOf("PROPOSED");
        assertEquals(0, diagnosticOrderStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.valueOf("RECEIVED");
        assertEquals("RECEIVED", diagnosticOrderStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.fromValue("proposed");
        assertEquals("proposed", diagnosticOrderStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticOrderStatusList.valueOf((java.lang.String) null);
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
            DiagnosticOrderStatusList.valueOf("rejected");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DiagnosticOrderStatusList.rejected
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.fromValue("rejected");
        assertEquals("rejected", diagnosticOrderStatusList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticOrderStatusList.fromValue("=hd");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // =hd
            //
            assertThrownBy("com.csra.fhir.DiagnosticOrderStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.REJECTED;
        java.lang.String string0 = diagnosticOrderStatusList0.value();
        assertEquals("rejected", string0);
    }
}
