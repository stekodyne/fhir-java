/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:40:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MedicationPackageTest {

    @Test
    public void test0() throws Throwable {
        MedicationPackage medicationPackage0 = new MedicationPackage();
        java.util.List<MedicationContent> list0 = medicationPackage0.getContent();
        java.util.List<MedicationContent> list1 = medicationPackage0.getContent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        MedicationPackage medicationPackage0 = new MedicationPackage();
        medicationPackage0.setContainer((CodeableConcept) null);
        assertNull(medicationPackage0.getId());
    }

    @Test
    public void test2() throws Throwable {
        MedicationPackage medicationPackage0 = new MedicationPackage();
        medicationPackage0.getContainer();
    }
}
