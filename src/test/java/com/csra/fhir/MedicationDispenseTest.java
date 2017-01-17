/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:54:32 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationDispenseTest {

    @Test
    public void test00() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        java.util.List<MedicationDispenseDosageInstruction> list0 = medicationDispense0.getDosageInstruction();
        java.util.List<MedicationDispenseDosageInstruction> list1 = medicationDispense0.getDosageInstruction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        java.util.List<Reference> list0 = medicationDispense0.getReceiver();
        java.util.List<Reference> list1 = medicationDispense0.getReceiver();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        java.util.List<Reference> list0 = medicationDispense0.getAuthorizingPrescription();
        java.util.List<Reference> list1 = medicationDispense0.getAuthorizingPrescription();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setWhenHandedOver((DateTime) null);
    }

    @Test
    public void test04() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        Element element0 = medicationDispense0.getMedicationCodeableConceptOrMedicationReference();
        assertNull(element0);
    }

    @Test
    public void test05() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        Identifier identifier0 = medicationDispense0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test06() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        CodeableConcept codeableConcept0 = medicationDispense0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test07() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        String string0 = medicationDispense0.getNote();
        assertNull(string0);
    }

    @Test
    public void test08() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setDaysSupply((SimpleQuantity) null);
    }

    @Test
    public void test09() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setWhenPrepared((DateTime) null);
    }

    @Test
    public void test10() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        SimpleQuantity simpleQuantity0 = medicationDispense0.getDaysSupply();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test11() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setType((CodeableConcept) null);
    }

    @Test
    public void test12() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setPatient((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        Reference reference0 = medicationDispense0.getDispenser();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        MedicationDispenseSubstitution medicationDispenseSubstitution0 = medicationDispense0.getSubstitution();
        assertNull(medicationDispenseSubstitution0);
    }

    @Test
    public void test15() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        SimpleQuantity simpleQuantity0 = medicationDispense0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test16() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setDestination((Reference) null);
    }

    @Test
    public void test17() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        MedicationDispenseStatus medicationDispenseStatus0 = medicationDispense0.getStatus();
        assertNull(medicationDispenseStatus0);
    }

    @Test
    public void test18() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setStatus((MedicationDispenseStatus) null);
    }

    @Test
    public void test19() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        DateTime dateTime0 = medicationDispense0.getWhenPrepared();
        assertNull(dateTime0);
    }

    @Test
    public void test20() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        Reference reference0 = medicationDispense0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        Reference reference0 = medicationDispense0.getDestination();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setIdentifier((Identifier) null);
    }

    @Test
    public void test23() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        DateTime dateTime0 = medicationDispense0.getWhenHandedOver();
        assertNull(dateTime0);
    }

    @Test
    public void test24() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setDispenser((Reference) null);
    }

    @Test
    public void test25() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setQuantity((SimpleQuantity) null);
    }

    @Test
    public void test26() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setNote((String) null);
    }

    @Test
    public void test27() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setSubstitution((MedicationDispenseSubstitution) null);
    }

    @Test
    public void test28() throws Throwable {
        MedicationDispense medicationDispense0 = new MedicationDispense();
        medicationDispense0.setMedicationCodeableConceptOrMedicationReference((Element) null);
    }
}
