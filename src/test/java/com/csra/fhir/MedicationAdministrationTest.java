/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:16:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationAdministrationTest {

    @Test
    public void test00() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        String string0 = new String();
        medicationAdministration0.setNote(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test01() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.practitioner = reference0;
        Reference reference1 = medicationAdministration0.getPrescription();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.setPractitioner(reference0);
        Reference reference1 = medicationAdministration0.getPractitioner();
        assertSame(reference1, reference0);
    }

    @Test
    public void test03() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.patient = reference0;
        Reference reference1 = medicationAdministration0.getPatient();
        assertSame(reference1, reference0);
    }

    @Test
    public void test04() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        java.util.List<Reference> list0 = medicationAdministration0.getDevice();
        java.util.List<Reference> list1 = medicationAdministration0.getDevice();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test05() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        java.util.List<CodeableConcept> list0 = medicationAdministration0.getReasonGiven();
        java.util.List<CodeableConcept> list1 = medicationAdministration0.getReasonGiven();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        java.util.List<CodeableConcept> list0 = medicationAdministration0.getReasonNotGiven();
        java.util.List<CodeableConcept> list1 = medicationAdministration0.getReasonNotGiven();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test07() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        java.util.List<Identifier> list0 = medicationAdministration0.getIdentifier();
        java.util.List<Identifier> list1 = medicationAdministration0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test09() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        MedicationAdministrationStatus medicationAdministrationStatus0 = new MedicationAdministrationStatus();
        medicationAdministration0.setStatus(medicationAdministrationStatus0);
        MedicationAdministrationStatus medicationAdministrationStatus1 = medicationAdministration0.getStatus();
        assertNull(medicationAdministrationStatus1.getId());
    }

    @Test
    public void test10() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        DateTime dateTime0 = (DateTime) medicationAdministration0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(dateTime0);
    }

    @Test
    public void test11() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.setPatient(reference0);
        Reference reference1 = medicationAdministration0.getEncounter();
        assertNull(reference1);
    }

    @Test
    public void test12() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = medicationAdministration0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        MedicationAdministrationDosage medicationAdministrationDosage0 = new MedicationAdministrationDosage();
        medicationAdministration0.setDosage(medicationAdministrationDosage0);
        MedicationAdministrationDosage medicationAdministrationDosage1 = medicationAdministration0.getDosage();
        assertNull(medicationAdministrationDosage1.getId());
    }

    @Test
    public void test14() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        DateTime dateTime0 = new DateTime();
        medicationAdministration0.setMedicationCodeableConceptOrMedicationReference(dateTime0);
        DateTime dateTime1 = (DateTime) medicationAdministration0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(dateTime1.getValue());
    }

    @Test
    public void test15() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Boolean boolean0 = new Boolean();
        medicationAdministration0.setWasNotGiven(boolean0);
        Boolean boolean1 = medicationAdministration0.getWasNotGiven();
        assertNull(boolean1.getId());
    }

    @Test
    public void test16() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        MedicationAdministrationDosage medicationAdministrationDosage0 = medicationAdministration0.getDosage();
        assertNull(medicationAdministrationDosage0);
    }

    @Test
    public void test17() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        DateTime dateTime0 = new DateTime();
        medicationAdministration0.setEffectiveTimeDateTimeOrEffectiveTimePeriod(dateTime0);
        DateTime dateTime1 = (DateTime) medicationAdministration0.getEffectiveTimeDateTimeOrEffectiveTimePeriod();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test18() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Boolean boolean0 = medicationAdministration0.getWasNotGiven();
        assertNull(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = new Reference();
        medicationAdministration0.setPrescription(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test20() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        DateTime dateTime0 = (DateTime) medicationAdministration0.getEffectiveTimeDateTimeOrEffectiveTimePeriod();
        assertNull(dateTime0);
    }

    @Test
    public void test21() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        MedicationAdministrationStatus medicationAdministrationStatus0 = medicationAdministration0.getStatus();
        assertNull(medicationAdministrationStatus0);
    }

    @Test
    public void test22() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        Reference reference0 = medicationAdministration0.getPractitioner();
        assertNull(reference0);
    }

    @Test
    public void test23() throws Throwable {
        MedicationAdministration medicationAdministration0 = new MedicationAdministration();
        String string0 = medicationAdministration0.getNote();
        assertNull(string0);
    }
}
