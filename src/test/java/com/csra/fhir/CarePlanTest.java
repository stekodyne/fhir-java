/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:11:16 GMT 2017
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

public class CarePlanTest {

    @Test
    public void test00() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        CarePlanStatus carePlanStatus0 = new CarePlanStatus();
        carePlan0.setStatus(carePlanStatus0);
        assertNull(carePlanStatus0.getId());
    }

    @Test
    public void test01() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Reference reference0 = new Reference();
        carePlan0.setContext(reference0);
        Reference reference1 = carePlan0.getSubject();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        CarePlanStatus carePlanStatus0 = new CarePlanStatus();
        carePlan0.status = carePlanStatus0;
        CarePlanStatus carePlanStatus1 = carePlan0.getStatus();
        assertNull(carePlanStatus1.getValue());
    }

    @Test
    public void test03() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        LinkedList<CarePlanRelatedPlan> linkedList0 = new LinkedList<CarePlanRelatedPlan>();
        CarePlanRelatedPlan carePlanRelatedPlan0 = new CarePlanRelatedPlan();
        linkedList0.add(carePlanRelatedPlan0);
        carePlan0.relatedPlan = (java.util.List<CarePlanRelatedPlan>) linkedList0;
        java.util.List<CarePlanRelatedPlan> list0 = carePlan0.getRelatedPlan();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test04() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Annotation annotation0 = new Annotation();
        carePlan0.note = annotation0;
        Annotation annotation1 = carePlan0.getNote();
        assertSame(annotation1, annotation0);
    }

    @Test
    public void test05() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        carePlan0.identifier = (java.util.List<Identifier>) linkedList0;
        linkedList0.add((Identifier) null);
        java.util.List<Identifier> list0 = carePlan0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        LinkedList<CarePlanActivity> linkedList0 = new LinkedList<CarePlanActivity>();
        carePlan0.activity = (java.util.List<CarePlanActivity>) linkedList0;
        CarePlanActivity carePlanActivity0 = new CarePlanActivity();
        linkedList0.add(carePlanActivity0);
        java.util.List<CarePlanActivity> list0 = carePlan0.getActivity();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test07() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<CarePlanActivity> list0 = carePlan0.getActivity();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<Reference> list0 = carePlan0.getGoal();
        java.util.List<Reference> list1 = carePlan0.getGoal();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<CarePlanParticipant> list0 = carePlan0.getParticipant();
        java.util.List<CarePlanParticipant> list1 = carePlan0.getParticipant();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<CarePlanRelatedPlan> list0 = carePlan0.getRelatedPlan();
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<Reference> list0 = carePlan0.getSupport();
        java.util.List<Reference> list1 = carePlan0.getSupport();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<Reference> list0 = carePlan0.getAddresses();
        java.util.List<Reference> list1 = carePlan0.getAddresses();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<CodeableConcept> list0 = carePlan0.getCategory();
        java.util.List<CodeableConcept> list1 = carePlan0.getCategory();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<Reference> list0 = carePlan0.getAuthor();
        java.util.List<Reference> list1 = carePlan0.getAuthor();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test15() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        java.util.List<Identifier> list0 = carePlan0.getIdentifier();
        assertEquals(0, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Annotation annotation0 = carePlan0.getNote();
        assertNull(annotation0);
    }

    @Test
    public void test17() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        String string0 = carePlan0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Period period0 = new Period();
        carePlan0.setPeriod(period0);
        Period period1 = carePlan0.getPeriod();
        assertNull(period1.getId());
    }

    @Test
    public void test19() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Reference reference0 = new Reference();
        carePlan0.setSubject(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test20() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Reference reference0 = carePlan0.getContext();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        DateTime dateTime0 = carePlan0.getModified();
        assertNull(dateTime0);
    }

    @Test
    public void test22() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Reference reference0 = new Reference();
        carePlan0.setContext(reference0);
        Reference reference1 = carePlan0.getContext();
        assertNull(reference1.getId());
    }

    @Test
    public void test23() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Period period0 = carePlan0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test24() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        CarePlanStatus carePlanStatus0 = carePlan0.getStatus();
        assertNull(carePlanStatus0);
    }

    @Test
    public void test25() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        String string0 = new String();
        carePlan0.setDescription(string0);
        String string1 = carePlan0.getDescription();
        assertNull(string1.getId());
    }

    @Test
    public void test26() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        Annotation annotation0 = new Annotation();
        carePlan0.setNote(annotation0);
        assertNull(annotation0.getId());
    }

    @Test
    public void test27() throws Throwable {
        CarePlan carePlan0 = new CarePlan();
        DateTime dateTime0 = new DateTime();
        carePlan0.setModified(dateTime0);
        DateTime dateTime1 = carePlan0.getModified();
        assertSame(dateTime1, dateTime0);
    }
}
