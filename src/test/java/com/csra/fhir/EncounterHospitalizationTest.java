/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:43:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EncounterHospitalizationTest {

    @Test
    public void test00() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounterHospitalization0.reAdmission = codeableConcept0;
        CodeableConcept codeableConcept1 = encounterHospitalization0.getReAdmission();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test01() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Identifier identifier0 = new Identifier();
        encounterHospitalization0.preAdmissionIdentifier = identifier0;
        Identifier identifier1 = encounterHospitalization0.getPreAdmissionIdentifier();
        assertNull(identifier1.getId());
    }

    @Test
    public void test02() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = new Reference();
        encounterHospitalization0.destination = reference0;
        Reference reference1 = encounterHospitalization0.getDestination();
        assertNull(reference1.getId());
    }

    @Test
    public void test03() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = new Reference();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        encounterHospitalization0.admittingDiagnosis = (java.util.List<Reference>) linkedList0;
        linkedList0.add(reference0);
        java.util.List<Reference> list0 = encounterHospitalization0.getAdmittingDiagnosis();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounterHospitalization0.admitSource = codeableConcept0;
        CodeableConcept codeableConcept1 = encounterHospitalization0.getAdmitSource();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test05() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        java.util.List<Reference> list0 = encounterHospitalization0.getDischargeDiagnosis();
        java.util.List<Reference> list1 = encounterHospitalization0.getDischargeDiagnosis();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        java.util.List<CodeableConcept> list0 = encounterHospitalization0.getSpecialArrangement();
        java.util.List<CodeableConcept> list1 = encounterHospitalization0.getSpecialArrangement();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test07() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        java.util.List<CodeableConcept> list0 = encounterHospitalization0.getSpecialCourtesy();
        java.util.List<CodeableConcept> list1 = encounterHospitalization0.getSpecialCourtesy();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        java.util.List<CodeableConcept> list0 = encounterHospitalization0.getDietPreference();
        java.util.List<CodeableConcept> list1 = encounterHospitalization0.getDietPreference();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        java.util.List<Reference> list0 = encounterHospitalization0.getAdmittingDiagnosis();
        assertEquals(0, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = encounterHospitalization0.getReAdmission();
        assertNull(codeableConcept0);
    }

    @Test
    public void test11() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounterHospitalization0.setDischargeDisposition(codeableConcept0);
        CodeableConcept codeableConcept1 = encounterHospitalization0.getDischargeDisposition();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test12() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = encounterHospitalization0.getDischargeDisposition();
        assertNull(codeableConcept0);
    }

    @Test
    public void test13() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Identifier identifier0 = new Identifier();
        encounterHospitalization0.setPreAdmissionIdentifier(identifier0);
        assertNull(encounterHospitalization0.getId());
    }

    @Test
    public void test14() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = encounterHospitalization0.getDestination();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = new Reference();
        encounterHospitalization0.setOrigin(reference0);
        Reference reference1 = encounterHospitalization0.getOrigin();
        assertSame(reference1, reference0);
    }

    @Test
    public void test16() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Identifier identifier0 = encounterHospitalization0.getPreAdmissionIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test17() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounterHospitalization0.setReAdmission(codeableConcept0);
        assertNull(encounterHospitalization0.getId());
    }

    @Test
    public void test18() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        encounterHospitalization0.setAdmitSource(codeableConcept0);
        assertNull(encounterHospitalization0.getId());
    }

    @Test
    public void test19() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = new Reference();
        encounterHospitalization0.setDestination(reference0);
        assertNull(encounterHospitalization0.getId());
    }

    @Test
    public void test20() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        Reference reference0 = encounterHospitalization0.getOrigin();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        EncounterHospitalization encounterHospitalization0 = new EncounterHospitalization();
        encounterHospitalization0.getAdmitSource();
    }
}
