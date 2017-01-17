/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:29:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationDispenseSubstitutionTest {

    @Test
    public void test0() throws Throwable {
        MedicationDispenseSubstitution medicationDispenseSubstitution0 = new MedicationDispenseSubstitution();
        java.util.List<Reference> list0 = medicationDispenseSubstitution0.getResponsibleParty();
        java.util.List<Reference> list1 = medicationDispenseSubstitution0.getResponsibleParty();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationDispenseSubstitution medicationDispenseSubstitution0 = new MedicationDispenseSubstitution();
        java.util.List<CodeableConcept> list0 = medicationDispenseSubstitution0.getReason();
        java.util.List<CodeableConcept> list1 = medicationDispenseSubstitution0.getReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        MedicationDispenseSubstitution medicationDispenseSubstitution0 = new MedicationDispenseSubstitution();
        CodeableConcept codeableConcept0 = medicationDispenseSubstitution0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test3() throws Throwable {
        MedicationDispenseSubstitution medicationDispenseSubstitution0 = new MedicationDispenseSubstitution();
        medicationDispenseSubstitution0.setType((CodeableConcept) null);
    }
}
