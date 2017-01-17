/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:40:32 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationProductTest {

    @Test
    public void test0() throws Throwable {
        MedicationProduct medicationProduct0 = new MedicationProduct();
        java.util.List<MedicationBatch> list0 = medicationProduct0.getBatch();
        java.util.List<MedicationBatch> list1 = medicationProduct0.getBatch();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        MedicationProduct medicationProduct0 = new MedicationProduct();
        java.util.List<MedicationIngredient> list0 = medicationProduct0.getIngredient();
        java.util.List<MedicationIngredient> list1 = medicationProduct0.getIngredient();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        MedicationProduct medicationProduct0 = new MedicationProduct();
        medicationProduct0.setForm((CodeableConcept) null);
        assertNull(medicationProduct0.getId());
    }

    @Test
    public void test3() throws Throwable {
        MedicationProduct medicationProduct0 = new MedicationProduct();
        CodeableConcept codeableConcept0 = medicationProduct0.getForm();
        assertNull(codeableConcept0);
    }
}
