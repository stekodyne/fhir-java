/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:40:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ObservationTest {

    @Test
    public void test00() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.code = codeableConcept0;
        CodeableConcept codeableConcept1 = observation0.getInterpretation();
        assertNull(codeableConcept1);
    }

    @Test
    public void test01() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.specimen = reference0;
        Reference reference1 = observation0.getSubject();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setCategory(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test03() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setDataAbsentReason(codeableConcept0);
        CodeableConcept codeableConcept1 = observation0.getCategory();
        assertNull(codeableConcept1);
    }

    @Test
    public void test04() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.specimen = reference0;
        Reference reference1 = observation0.getSpecimen();
        assertNull(reference1.getId());
    }

    @Test
    public void test05() throws Throwable {
        Observation observation0 = new Observation();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        observation0.performer = (java.util.List<Reference>) linkedList0;
        linkedList0.add((Reference) null);
        java.util.List<Reference> list0 = observation0.getPerformer();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        Observation observation0 = new Observation();
        Instant instant0 = new Instant();
        observation0.issued = instant0;
        Instant instant1 = observation0.getIssued();
        assertSame(instant1, instant0);
    }

    @Test
    public void test07() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.encounter = reference0;
        Reference reference1 = observation0.getEncounter();
        assertNull(reference1.getId());
    }

    @Test
    public void test08() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.code = codeableConcept0;
        CodeableConcept codeableConcept1 = observation0.getCode();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test09() throws Throwable {
        Observation observation0 = new Observation();
        java.util.List<ObservationComponent> list0 = observation0.getComponent();
        java.util.List<ObservationComponent> list1 = observation0.getComponent();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        Observation observation0 = new Observation();
        java.util.List<ObservationRelated> list0 = observation0.getRelated();
        java.util.List<ObservationRelated> list1 = observation0.getRelated();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        Observation observation0 = new Observation();
        java.util.List<ObservationReferenceRange> list0 = observation0.getReferenceRange();
        java.util.List<ObservationReferenceRange> list1 = observation0.getReferenceRange();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        Observation observation0 = new Observation();
        java.util.List<Reference> list0 = observation0.getPerformer();
        assertEquals(0, list0.size());
    }

    @Test
    public void test13() throws Throwable {
        Observation observation0 = new Observation();
        java.util.List<Identifier> list0 = observation0.getIdentifier();
        java.util.List<Identifier> list1 = observation0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        Observation observation0 = new Observation();
        Instant instant0 = new Instant();
        observation0.setIssued(instant0);
        assertNull(instant0.getId());
    }

    @Test
    public void test15() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setDataAbsentReason(codeableConcept0);
        CodeableConcept codeableConcept1 = observation0.getDataAbsentReason();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setMethod(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test17() throws Throwable {
        Observation observation0 = new Observation();
        ObservationStatus observationStatus0 = observation0.getStatus();
        assertNull(observationStatus0);
    }

    @Test
    public void test18() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = observation0.getMethod();
        assertNull(codeableConcept0);
    }

    @Test
    public void test19() throws Throwable {
        Observation observation0 = new Observation();
        String string0 = new String();
        observation0.setComments(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test20() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.setDevice(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test21() throws Throwable {
        Observation observation0 = new Observation();
        ObservationStatus observationStatus0 = new ObservationStatus();
        observation0.setStatus(observationStatus0);
        assertNull(observationStatus0.getValue());
    }

    @Test
    public void test22() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setCode(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test23() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.setSpecimen(reference0);
        Reference reference1 = observation0.getDevice();
        assertNull(reference1);
    }

    @Test
    public void test24() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test25() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = observation0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test26() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        observation0.setBodySite(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test27() throws Throwable {
        Observation observation0 = new Observation();
        Element element0 = observation0.getValueQuantityOrValueCodeableConceptOrValueString();
        assertNull(element0);
    }

    @Test
    public void test28() throws Throwable {
        Observation observation0 = new Observation();
        Instant instant0 = observation0.getIssued();
        assertNull(instant0);
    }

    @Test
    public void test29() throws Throwable {
        Observation observation0 = new Observation();
        ObservationStatus observationStatus0 = new ObservationStatus();
        observation0.setValueQuantityOrValueCodeableConceptOrValueString(observationStatus0);
        ObservationStatus observationStatus1 = (ObservationStatus) observation0.getValueQuantityOrValueCodeableConceptOrValueString();
        assertNull(observationStatus1.getId());
    }

    @Test
    public void test30() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = new Reference();
        observation0.setSubject(reference0);
        Reference reference1 = observation0.getDevice();
        assertNull(reference1);
    }

    @Test
    public void test31() throws Throwable {
        Observation observation0 = new Observation();
        String string0 = (String) observation0.getEffectiveDateTimeOrEffectivePeriod();
        assertNull(string0);
    }

    @Test
    public void test32() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = observation0.getBodySite();
        assertNull(codeableConcept0);
    }

    @Test
    public void test33() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = observation0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test34() throws Throwable {
        Observation observation0 = new Observation();
        Reference reference0 = observation0.getSpecimen();
        assertNull(reference0);
    }

    @Test
    public void test35() throws Throwable {
        Observation observation0 = new Observation();
        String string0 = new String();
        observation0.setEffectiveDateTimeOrEffectivePeriod(string0);
        String string1 = (String) observation0.getEffectiveDateTimeOrEffectivePeriod();
        assertNull(string1.getValue());
    }

    @Test
    public void test36() throws Throwable {
        Observation observation0 = new Observation();
        observation0.setInterpretation((CodeableConcept) null);
    }

    @Test
    public void test37() throws Throwable {
        Observation observation0 = new Observation();
        CodeableConcept codeableConcept0 = observation0.getDataAbsentReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test38() throws Throwable {
        Observation observation0 = new Observation();
        String string0 = observation0.getComments();
        assertNull(string0);
    }
}
