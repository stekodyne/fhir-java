/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:02:35 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DiagnosticReportStatusListTest {

    @Test
    public void test0() throws Throwable {
        DiagnosticReportStatusList[] diagnosticReportStatusListArray0 = DiagnosticReportStatusList.values();
        assertNotNull(diagnosticReportStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DiagnosticReportStatusList diagnosticReportStatusList0 = DiagnosticReportStatusList.valueOf("REGISTERED");
        assertEquals("REGISTERED", diagnosticReportStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DiagnosticReportStatusList diagnosticReportStatusList0 = DiagnosticReportStatusList.valueOf("PARTIAL");
        assertEquals("PARTIAL", diagnosticReportStatusList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        DiagnosticReportStatusList diagnosticReportStatusList0 = DiagnosticReportStatusList.fromValue("registered");
        assertEquals("registered", diagnosticReportStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticReportStatusList.valueOf((java.lang.String) null);
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
            DiagnosticReportStatusList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DiagnosticReportStatusList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            DiagnosticReportStatusList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.DiagnosticReportStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        DiagnosticReportStatusList diagnosticReportStatusList0 = DiagnosticReportStatusList.fromValue("entered-in-error");
        java.lang.String string0 = diagnosticReportStatusList0.value();
        assertEquals("entered-in-error", string0);
    }
}
