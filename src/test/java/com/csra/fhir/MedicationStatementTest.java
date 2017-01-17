/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:10:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationStatementTest {

    @Test
    public void test00() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        DateTime dateTime0 = new DateTime();
        medicationStatement0.setDateAsserted(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test01() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Identifier identifier0 = new Identifier();
        Reference reference0 = new Reference();
        identifier0.assigner = reference0;
        medicationStatement0.setInformationSource(identifier0.assigner);
        Reference reference1 = medicationStatement0.getInformationSource();
        assertSame(reference1, reference0);
    }

    @Test
    public void test02() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        DateTime dateTime0 = new DateTime();
        medicationStatement0.dateAsserted = dateTime0;
        DateTime dateTime1 = medicationStatement0.getDateAsserted();
        assertNull(dateTime1.getValue());
    }

    @Test
    public void test03() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        java.util.List<MedicationStatementDosage> list0 = medicationStatement0.getDosage();
        java.util.List<MedicationStatementDosage> list1 = medicationStatement0.getDosage();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        java.util.List<Reference> list0 = medicationStatement0.getSupportingInformation();
        java.util.List<Reference> list1 = medicationStatement0.getSupportingInformation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test05() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        java.util.List<CodeableConcept> list0 = medicationStatement0.getReasonNotTaken();
        java.util.List<CodeableConcept> list1 = medicationStatement0.getReasonNotTaken();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        java.util.List<Identifier> list0 = medicationStatement0.getIdentifier();
        java.util.List<Identifier> list1 = medicationStatement0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test07() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        DateTime dateTime0 = medicationStatement0.getDateAsserted();
        assertNull(dateTime0);
    }

    @Test
    public void test08() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        MedicationStatementStatus medicationStatementStatus0 = medicationStatement0.getStatus();
        assertNull(medicationStatementStatus0);
    }

    @Test
    public void test09() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        String string0 = new String();
        medicationStatement0.setNote(string0);
        String string1 = medicationStatement0.getNote();
        assertSame(string1, string0);
    }

    @Test
    public void test10() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Reference reference0 = new Reference();
        medicationStatement0.setEffectiveDateTimeOrEffectivePeriod(reference0);
        Reference reference1 = (Reference) medicationStatement0.getEffectiveDateTimeOrEffectivePeriod();
        assertNull(reference1.getId());
    }

    @Test
    public void test11() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Element element0 = medicationStatement0.getReasonForUseCodeableConceptOrReasonForUseReference();
        assertNull(element0);
    }

    @Test
    public void test12() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        MedicationStatementStatus medicationStatementStatus0 = new MedicationStatementStatus();
        medicationStatement0.setStatus(medicationStatementStatus0);
        MedicationStatementStatus medicationStatementStatus1 = medicationStatement0.getStatus();
        assertSame(medicationStatementStatus1, medicationStatementStatus0);
    }

    @Test
    public void test13() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        MedicationStatementStatus medicationStatementStatus0 = new MedicationStatementStatus();
        medicationStatement0.setMedicationCodeableConceptOrMedicationReference(medicationStatementStatus0);
        MedicationStatementStatus medicationStatementStatus1 = (MedicationStatementStatus) medicationStatement0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(medicationStatementStatus1.getValue());
    }

    @Test
    public void test14() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Code code0 = new Code();
        medicationStatement0.setReasonForUseCodeableConceptOrReasonForUseReference(code0);
        Code code1 = (Code) medicationStatement0.getReasonForUseCodeableConceptOrReasonForUseReference();
        assertSame(code1, code0);
    }

    @Test
    public void test15() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        medicationStatement0.setWasNotTaken((Boolean) null);
    }

    @Test
    public void test16() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Reference reference0 = medicationStatement0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Reference reference0 = medicationStatement0.getInformationSource();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        MedicationStatementStatus medicationStatementStatus0 = (MedicationStatementStatus) medicationStatement0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(medicationStatementStatus0);
    }

    @Test
    public void test19() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Reference reference0 = new Reference();
        medicationStatement0.setPatient(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test20() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        String string0 = medicationStatement0.getNote();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Element element0 = medicationStatement0.getEffectiveDateTimeOrEffectivePeriod();
        assertNull(element0);
    }

    @Test
    public void test22() throws Throwable {
        MedicationStatement medicationStatement0 = new MedicationStatement();
        Boolean boolean0 = medicationStatement0.getWasNotTaken();
        assertNull(boolean0);
    }
}
