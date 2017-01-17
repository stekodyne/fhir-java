/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:49:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class GoalTest {

    @Test
    public void test00() throws Throwable {
        Goal goal0 = new Goal();
        Reference reference0 = new Reference();
        goal0.setAuthor(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Goal goal0 = new Goal();
        GoalStatus goalStatus0 = new GoalStatus();
        goal0.setStatus(goalStatus0);
        GoalStatus goalStatus1 = goal0.getStatus();
        assertNull(goalStatus1.getId());
    }

    @Test
    public void test02() throws Throwable {
        Goal goal0 = new Goal();
        Date date0 = new Date();
        goal0.startDateOrStartCodeableConcept = (Element) date0;
        Date date1 = (Date) goal0.getStartDateOrStartCodeableConcept();
        assertNull(date1.getValue());
    }

    @Test
    public void test03() throws Throwable {
        Goal goal0 = new Goal();
        LinkedList<GoalOutcome> linkedList0 = new LinkedList<GoalOutcome>();
        GoalOutcome goalOutcome0 = new GoalOutcome();
        linkedList0.add(goalOutcome0);
        goal0.outcome = (java.util.List<GoalOutcome>) linkedList0;
        java.util.List<GoalOutcome> list0 = goal0.getOutcome();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        Goal goal0 = new Goal();
        Reference reference0 = new Reference();
        goal0.author = reference0;
        Reference reference1 = goal0.getAuthor();
        assertNull(reference1.getId());
    }

    @Test
    public void test05() throws Throwable {
        Goal goal0 = new Goal();
        java.util.List<GoalOutcome> list0 = goal0.getOutcome();
        java.util.List<GoalOutcome> list1 = goal0.getOutcome();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        Goal goal0 = new Goal();
        java.util.List<Annotation> list0 = goal0.getNote();
        java.util.List<Annotation> list1 = goal0.getNote();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        Goal goal0 = new Goal();
        java.util.List<Reference> list0 = goal0.getAddresses();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        Goal goal0 = new Goal();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        goal0.addresses = (java.util.List<Reference>) linkedList0;
        java.util.List<Reference> list0 = goal0.getAddresses();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        Goal goal0 = new Goal();
        java.util.List<CodeableConcept> list0 = goal0.getCategory();
        java.util.List<CodeableConcept> list1 = goal0.getCategory();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        Goal goal0 = new Goal();
        java.util.List<Identifier> list0 = goal0.getIdentifier();
        java.util.List<Identifier> list1 = goal0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        Goal goal0 = new Goal();
        Reference reference0 = goal0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        Goal goal0 = new Goal();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        goal0.setStatusReason(codeableConcept0);
        CodeableConcept codeableConcept1 = goal0.getStatusReason();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test13() throws Throwable {
        Goal goal0 = new Goal();
        CodeableConcept codeableConcept0 = goal0.getStatusReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test14() throws Throwable {
        Goal goal0 = new Goal();
        Date date0 = new Date();
        goal0.setStatusDate(date0);
        Date date1 = goal0.getStatusDate();
        assertNull(date1.getValue());
    }

    @Test
    public void test15() throws Throwable {
        Goal goal0 = new Goal();
        CodeableConcept codeableConcept0 = goal0.getPriority();
        assertNull(codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        Goal goal0 = new Goal();
        Annotation annotation0 = (Annotation) goal0.getTargetDateOrTargetQuantity();
        assertNull(annotation0);
    }

    @Test
    public void test17() throws Throwable {
        Goal goal0 = new Goal();
        Reference reference0 = goal0.getAuthor();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        Goal goal0 = new Goal();
        String string0 = new String();
        goal0.setDescription(string0);
        String string1 = goal0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test19() throws Throwable {
        Goal goal0 = new Goal();
        Date date0 = goal0.getStatusDate();
        assertNull(date0);
    }

    @Test
    public void test20() throws Throwable {
        Goal goal0 = new Goal();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        goal0.setPriority(codeableConcept0);
        CodeableConcept codeableConcept1 = goal0.getPriority();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test21() throws Throwable {
        Goal goal0 = new Goal();
        Date date0 = (Date) goal0.getStartDateOrStartCodeableConcept();
        assertNull(date0);
    }

    @Test
    public void test22() throws Throwable {
        Goal goal0 = new Goal();
        Annotation annotation0 = new Annotation();
        goal0.setTargetDateOrTargetQuantity(annotation0);
        Annotation annotation1 = (Annotation) goal0.getTargetDateOrTargetQuantity();
        assertSame(annotation1, annotation0);
    }

    @Test
    public void test23() throws Throwable {
        Goal goal0 = new Goal();
        GoalStatus goalStatus0 = goal0.getStatus();
        assertNull(goalStatus0);
    }

    @Test
    public void test24() throws Throwable {
        Goal goal0 = new Goal();
        String string0 = goal0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test25() throws Throwable {
        Goal goal0 = new Goal();
        Uri uri0 = new Uri();
        goal0.setStartDateOrStartCodeableConcept(uri0);
        assertNull(uri0.getId());
    }

    @Test
    public void test26() throws Throwable {
        Goal goal0 = new Goal();
        Reference reference0 = new Reference();
        goal0.setSubject(reference0);
        Reference reference1 = goal0.getSubject();
        assertSame(reference1, reference0);
    }
}
