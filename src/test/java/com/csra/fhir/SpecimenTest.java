/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:21:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class SpecimenTest {

    @Test
    public void test00() throws Throwable {
        Specimen specimen0 = new Specimen();
        DateTime dateTime0 = new DateTime();
        specimen0.receivedTime = dateTime0;
        DateTime dateTime1 = specimen0.getReceivedTime();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test01() throws Throwable {
        Specimen specimen0 = new Specimen();
        LinkedList<SpecimenContainer> linkedList0 = new LinkedList<SpecimenContainer>();
        specimen0.container = (java.util.List<SpecimenContainer>) linkedList0;
        linkedList0.push((SpecimenContainer) null);
        java.util.List<SpecimenContainer> list0 = specimen0.getContainer();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        Specimen specimen0 = new Specimen();
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimen0.collection = specimenCollection0;
        SpecimenCollection specimenCollection1 = specimen0.getCollection();
        assertNull(specimenCollection1.getId());
    }

    @Test
    public void test03() throws Throwable {
        Specimen specimen0 = new Specimen();
        Identifier identifier0 = new Identifier();
        specimen0.setAccessionIdentifier(identifier0);
        Identifier identifier1 = specimen0.getAccessionIdentifier();
        assertNull(identifier1.getId());
    }

    @Test
    public void test04() throws Throwable {
        Specimen specimen0 = new Specimen();
        java.util.List<SpecimenContainer> list0 = specimen0.getContainer();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        Specimen specimen0 = new Specimen();
        java.util.List<SpecimenTreatment> list0 = specimen0.getTreatment();
        java.util.List<SpecimenTreatment> list1 = specimen0.getTreatment();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test06() throws Throwable {
        Specimen specimen0 = new Specimen();
        java.util.List<Reference> list0 = specimen0.getParent();
        java.util.List<Reference> list1 = specimen0.getParent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        Specimen specimen0 = new Specimen();
        java.util.List<Identifier> list0 = specimen0.getIdentifier();
        java.util.List<Identifier> list1 = specimen0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        Specimen specimen0 = new Specimen();
        SpecimenCollection specimenCollection0 = specimen0.getCollection();
        assertNull(specimenCollection0);
    }

    @Test
    public void test09() throws Throwable {
        Specimen specimen0 = new Specimen();
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimen0.setCollection(specimenCollection0);
        assertNull(specimenCollection0.getId());
    }

    @Test
    public void test10() throws Throwable {
        Specimen specimen0 = new Specimen();
        SpecimenStatus specimenStatus0 = specimen0.getStatus();
        assertNull(specimenStatus0);
    }

    @Test
    public void test11() throws Throwable {
        Specimen specimen0 = new Specimen();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        specimen0.setType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test12() throws Throwable {
        Specimen specimen0 = new Specimen();
        DateTime dateTime0 = specimen0.getReceivedTime();
        assertNull(dateTime0);
    }

    @Test
    public void test13() throws Throwable {
        Specimen specimen0 = new Specimen();
        DateTime dateTime0 = new DateTime();
        specimen0.setReceivedTime(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test14() throws Throwable {
        Specimen specimen0 = new Specimen();
        Identifier identifier0 = specimen0.getAccessionIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test15() throws Throwable {
        Specimen specimen0 = new Specimen();
        Reference reference0 = new Reference();
        specimen0.setSubject(reference0);
        Reference reference1 = specimen0.getSubject();
        assertNull(reference1.getId());
    }

    @Test
    public void test16() throws Throwable {
        Specimen specimen0 = new Specimen();
        SpecimenStatus specimenStatus0 = new SpecimenStatus();
        specimen0.setStatus(specimenStatus0);
        SpecimenStatus specimenStatus1 = specimen0.getStatus();
        assertSame(specimenStatus1, specimenStatus0);
    }

    @Test
    public void test17() throws Throwable {
        Specimen specimen0 = new Specimen();
        CodeableConcept codeableConcept0 = specimen0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test18() throws Throwable {
        Specimen specimen0 = new Specimen();
        Reference reference0 = specimen0.getSubject();
        assertNull(reference0);
    }
}
