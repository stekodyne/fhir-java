/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:31:08 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationOrderTest {

    @Test
    public void test00() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        java.util.List<MedicationOrderDosageInstruction> list0 = medicationOrder0.getDosageInstruction();
        java.util.List<MedicationOrderDosageInstruction> list1 = medicationOrder0.getDosageInstruction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        java.util.List<Identifier> list0 = medicationOrder0.getIdentifier();
        java.util.List<Identifier> list1 = medicationOrder0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setPrescriber((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setStatus((MedicationOrderStatus) null);
    }

    @Test
    public void test04() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Element element0 = medicationOrder0.getReasonCodeableConceptOrReasonReference();
        assertNull(element0);
    }

    @Test
    public void test05() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setEncounter((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setReasonEnded((CodeableConcept) null);
    }

    @Test
    public void test07() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Reference reference0 = medicationOrder0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        DateTime dateTime0 = medicationOrder0.getDateWritten();
        assertNull(dateTime0);
    }

    @Test
    public void test09() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        MedicationOrderStatus medicationOrderStatus0 = medicationOrder0.getStatus();
        assertNull(medicationOrderStatus0);
    }

    @Test
    public void test10() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        MedicationOrderSubstitution medicationOrderSubstitution0 = medicationOrder0.getSubstitution();
        assertNull(medicationOrderSubstitution0);
    }

    @Test
    public void test11() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Reference reference0 = medicationOrder0.getPrescriber();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setPatient((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setSubstitution((MedicationOrderSubstitution) null);
    }

    @Test
    public void test14() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setDispenseRequest((MedicationOrderDispenseRequest) null);
    }

    @Test
    public void test15() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        MedicationOrderDispenseRequest medicationOrderDispenseRequest0 = medicationOrder0.getDispenseRequest();
        assertNull(medicationOrderDispenseRequest0);
    }

    @Test
    public void test16() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Reference reference0 = medicationOrder0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setPriorPrescription((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Reference reference0 = medicationOrder0.getPriorPrescription();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        Element element0 = medicationOrder0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(element0);
    }

    @Test
    public void test20() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        DateTime dateTime0 = medicationOrder0.getDateEnded();
        assertNull(dateTime0);
    }

    @Test
    public void test21() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setReasonCodeableConceptOrReasonReference((Element) null);
    }

    @Test
    public void test22() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setNote((String) null);
    }

    @Test
    public void test23() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        String string0 = medicationOrder0.getNote();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setDateEnded((DateTime) null);
    }

    @Test
    public void test25() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        CodeableConcept codeableConcept0 = medicationOrder0.getReasonEnded();
        assertNull(codeableConcept0);
    }

    @Test
    public void test26() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setDateWritten((DateTime) null);
    }

    @Test
    public void test27() throws Throwable {
        MedicationOrder medicationOrder0 = new MedicationOrder();
        medicationOrder0.setMedicationCodeableConceptOrMedicationReference((Element) null);
    }
}
