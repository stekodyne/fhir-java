/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:31:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProvenanceTest {

    @Test
    public void test00() throws Throwable {
        Provenance provenance0 = new Provenance();
        Period period0 = new Period();
        provenance0.setPeriod(period0);
        assertNull(period0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Provenance provenance0 = new Provenance();
        Instant instant0 = new Instant();
        provenance0.recorded = instant0;
        Instant instant1 = provenance0.getRecorded();
        assertNull(instant1.getId());
    }

    @Test
    public void test02() throws Throwable {
        Provenance provenance0 = new Provenance();
        Period period0 = new Period();
        provenance0.period = period0;
        Period period1 = provenance0.getPeriod();
        assertNull(period1.getId());
    }

    @Test
    public void test03() throws Throwable {
        Provenance provenance0 = new Provenance();
        LinkedList<ProvenanceAgent> linkedList0 = new LinkedList<ProvenanceAgent>();
        provenance0.agent = (java.util.List<ProvenanceAgent>) linkedList0;
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        linkedList0.add(provenanceAgent0);
        java.util.List<ProvenanceAgent> list0 = provenance0.getAgent();
        assertFalse(list0.isEmpty());
        assertNotNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        Provenance provenance0 = new Provenance();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        provenance0.activity = codeableConcept0;
        CodeableConcept codeableConcept1 = provenance0.getActivity();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test05() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<Signature> list0 = provenance0.getSignature();
        java.util.List<Signature> list1 = provenance0.getSignature();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<ProvenanceEntity> list0 = provenance0.getEntity();
        java.util.List<ProvenanceEntity> list1 = provenance0.getEntity();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test07() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<ProvenanceAgent> list0 = provenance0.getAgent();
        java.util.List<ProvenanceAgent> list1 = provenance0.getAgent();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test08() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<Uri> list0 = provenance0.getPolicy();
        java.util.List<Uri> list1 = provenance0.getPolicy();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<CodeableConcept> list0 = provenance0.getReason();
        java.util.List<CodeableConcept> list1 = provenance0.getReason();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        Provenance provenance0 = new Provenance();
        java.util.List<Reference> list0 = provenance0.getTarget();
        java.util.List<Reference> list1 = provenance0.getTarget();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        Provenance provenance0 = new Provenance();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        provenance0.setActivity(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test12() throws Throwable {
        Provenance provenance0 = new Provenance();
        CodeableConcept codeableConcept0 = provenance0.getActivity();
        assertNull(codeableConcept0);
    }

    @Test
    public void test13() throws Throwable {
        Provenance provenance0 = new Provenance();
        Period period0 = provenance0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test14() throws Throwable {
        Provenance provenance0 = new Provenance();
        Instant instant0 = new Instant();
        provenance0.setRecorded(instant0);
        assertNull(instant0.getId());
    }

    @Test
    public void test15() throws Throwable {
        Provenance provenance0 = new Provenance();
        Reference reference0 = new Reference();
        provenance0.setLocation(reference0);
        Reference reference1 = provenance0.getLocation();
        assertSame(reference1, reference0);
    }

    @Test
    public void test16() throws Throwable {
        Provenance provenance0 = new Provenance();
        Instant instant0 = provenance0.getRecorded();
        assertNull(instant0);
    }

    @Test
    public void test17() throws Throwable {
        Provenance provenance0 = new Provenance();
        Reference reference0 = provenance0.getLocation();
        assertNull(reference0);
    }
}
