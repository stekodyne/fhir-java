/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:19:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class DiagnosticOrderTest {

    @Test
    public void test00() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = new Reference();
        diagnosticOrder0.setSubject(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test01() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        diagnosticOrder0.supportingInformation = (java.util.List<Reference>) linkedList0;
        linkedList0.offer((Reference) null);
        java.util.List<Reference> list0 = diagnosticOrder0.getSupportingInformation();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = new Reference();
        diagnosticOrder0.subject = reference0;
        Reference reference1 = diagnosticOrder0.getSubject();
        assertNull(reference1.getId());
    }

    @Test
    public void test03() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        DiagnosticOrderStatus diagnosticOrderStatus0 = new DiagnosticOrderStatus();
        diagnosticOrder0.setStatus(diagnosticOrderStatus0);
        DiagnosticOrderStatus diagnosticOrderStatus1 = diagnosticOrder0.getStatus();
        assertNull(diagnosticOrderStatus1.getValue());
    }

    @Test
    public void test04() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        diagnosticOrder0.reason = (java.util.List<CodeableConcept>) linkedList0;
        linkedList0.add((CodeableConcept) null);
        java.util.List<CodeableConcept> list0 = diagnosticOrder0.getReason();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        DiagnosticOrderPriority diagnosticOrderPriority0 = new DiagnosticOrderPriority();
        diagnosticOrder0.priority = diagnosticOrderPriority0;
        DiagnosticOrderPriority diagnosticOrderPriority1 = diagnosticOrder0.getPriority();
        assertNull(diagnosticOrderPriority1.getId());
    }

    @Test
    public void test06() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = new Reference();
        diagnosticOrder0.setOrderer(reference0);
        Reference reference1 = diagnosticOrder0.getOrderer();
        assertNull(reference1.getId());
    }

    @Test
    public void test07() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
        diagnosticOrder0.note = (java.util.List<Annotation>) linkedList0;
        Annotation annotation0 = new Annotation();
        linkedList0.add(annotation0);
        java.util.List<Annotation> list0 = diagnosticOrder0.getNote();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<DiagnosticOrderItem> linkedList0 = new LinkedList<DiagnosticOrderItem>();
        diagnosticOrder0.item = (java.util.List<DiagnosticOrderItem>) linkedList0;
        DiagnosticOrderItem diagnosticOrderItem0 = new DiagnosticOrderItem();
        linkedList0.addFirst(diagnosticOrderItem0);
        java.util.List<DiagnosticOrderItem> list0 = diagnosticOrder0.getItem();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test09() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        diagnosticOrder0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        java.util.List<Identifier> list0 = diagnosticOrder0.getIdentifier();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test10() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        LinkedList<DiagnosticOrderEvent> linkedList0 = new LinkedList<DiagnosticOrderEvent>();
        diagnosticOrder0.event = (java.util.List<DiagnosticOrderEvent>) linkedList0;
        DiagnosticOrderEvent diagnosticOrderEvent0 = new DiagnosticOrderEvent();
        linkedList0.add(diagnosticOrderEvent0);
        java.util.List<DiagnosticOrderEvent> list0 = diagnosticOrder0.getEvent();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<Annotation> list0 = diagnosticOrder0.getNote();
        java.util.List<Annotation> list1 = diagnosticOrder0.getNote();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<DiagnosticOrderItem> list0 = diagnosticOrder0.getItem();
        assertEquals(0, list0.size());
    }

    @Test
    public void test13() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<DiagnosticOrderEvent> list0 = diagnosticOrder0.getEvent();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test14() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<Reference> list0 = diagnosticOrder0.getSpecimen();
        java.util.List<Reference> list1 = diagnosticOrder0.getSpecimen();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<Reference> list0 = diagnosticOrder0.getSupportingInformation();
        assertEquals(0, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<CodeableConcept> list0 = diagnosticOrder0.getReason();
        java.util.List<CodeableConcept> list1 = diagnosticOrder0.getReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test17() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        java.util.List<Identifier> list0 = diagnosticOrder0.getIdentifier();
        assertEquals(0, list0.size());
    }

    @Test
    public void test18() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        DiagnosticOrderPriority diagnosticOrderPriority0 = diagnosticOrder0.getPriority();
        assertNull(diagnosticOrderPriority0);
    }

    @Test
    public void test19() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        DiagnosticOrderStatus diagnosticOrderStatus0 = diagnosticOrder0.getStatus();
        assertNull(diagnosticOrderStatus0);
    }

    @Test
    public void test20() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = diagnosticOrder0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = diagnosticOrder0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = new Reference();
        diagnosticOrder0.setEncounter(reference0);
        Reference reference1 = diagnosticOrder0.getEncounter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test23() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        Reference reference0 = diagnosticOrder0.getOrderer();
        assertNull(reference0);
    }

    @Test
    public void test24() throws Throwable {
        DiagnosticOrder diagnosticOrder0 = new DiagnosticOrder();
        DiagnosticOrderPriority diagnosticOrderPriority0 = new DiagnosticOrderPriority();
        diagnosticOrder0.setPriority(diagnosticOrderPriority0);
        assertNull(diagnosticOrderPriority0.getValue());
    }
}
