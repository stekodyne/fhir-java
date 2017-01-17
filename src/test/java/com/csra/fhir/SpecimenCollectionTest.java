/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:04:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SpecimenCollectionTest {

    @Test
    public void test00() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.setCollectedDateTimeOrCollectedPeriod(specimenCollection0);
        SpecimenCollection specimenCollection1 = (SpecimenCollection) specimenCollection0.getCollectedDateTimeOrCollectedPeriod();
        assertSame(specimenCollection1, specimenCollection0);
    }

    @Test
    public void test01() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        java.util.List<String> list0 = specimenCollection0.getComment();
        java.util.List<String> list1 = specimenCollection0.getComment();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.setMethod((CodeableConcept) null);
        assertNull(specimenCollection0.getId());
    }

    @Test
    public void test03() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        Reference reference0 = specimenCollection0.getCollector();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        CodeableConcept codeableConcept0 = specimenCollection0.getMethod();
        assertNull(codeableConcept0);
    }

    @Test
    public void test05() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.setQuantity((SimpleQuantity) null);
        assertNull(specimenCollection0.getId());
    }

    @Test
    public void test06() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.setBodySite((CodeableConcept) null);
        assertNull(specimenCollection0.getId());
    }

    @Test
    public void test07() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        CodeableConcept codeableConcept0 = specimenCollection0.getBodySite();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.setCollector((Reference) null);
        assertNull(specimenCollection0.getId());
    }

    @Test
    public void test09() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        SimpleQuantity simpleQuantity0 = specimenCollection0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test10() throws Throwable {
        SpecimenCollection specimenCollection0 = new SpecimenCollection();
        specimenCollection0.getCollectedDateTimeOrCollectedPeriod();
    }
}
