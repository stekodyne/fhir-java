/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:48:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DiagnosticOrderItemTest {

    @Test
    public void test0() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        java.util.List<DiagnosticOrderEvent> list0 = diagnosticOrderItem0.getEvent();
        java.util.List<DiagnosticOrderEvent> list1 = diagnosticOrderItem0.getEvent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        java.util.List<Reference> list0 = diagnosticOrderItem0.getSpecimen();
        java.util.List<Reference> list1 = diagnosticOrderItem0.getSpecimen();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        diagnosticOrderItem0.setStatus((DiagnosticOrderStatus) null);
        assertNull(diagnosticOrderItem0.getId());
    }

    @Test
    public void test3() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        CodeableConcept codeableConcept0 = diagnosticOrderItem0.getBodySite();
        assertNull(codeableConcept0);
    }

    @Test
    public void test4() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        DiagnosticOrderStatus diagnosticOrderStatus0 = diagnosticOrderItem0.getStatus();
        assertNull(diagnosticOrderStatus0);
    }

    @Test
    public void test5() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        diagnosticOrderItem0.setBodySite((CodeableConcept) null);
        assertNull(diagnosticOrderItem0.getId());
    }

    @Test
    public void test6() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        diagnosticOrderItem0.setCode((CodeableConcept) null);
        assertNull(diagnosticOrderItem0.getId());
    }

    @Test
    public void test7() throws Throwable {
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        diagnosticOrderItem0.getCode();
    }
}
