/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:01:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SpecimenTreatmentTest {

    @Test
    public void test0() throws Throwable {
        SpecimenTreatment specimenTreatment0 = new SpecimenTreatment();
        java.util.List<Reference> list0 = specimenTreatment0.getAdditive();
        java.util.List<Reference> list1 = specimenTreatment0.getAdditive();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        SpecimenTreatment specimenTreatment0 = new SpecimenTreatment();
        specimenTreatment0.setProcedure((CodeableConcept) null);
        assertNull(specimenTreatment0.getId());
    }

    @Test
    public void test2() throws Throwable {
        SpecimenTreatment specimenTreatment0 = new SpecimenTreatment();
        specimenTreatment0.setDescription((String) null);
        assertNull(specimenTreatment0.getId());
    }

    @Test
    public void test3() throws Throwable {
        SpecimenTreatment specimenTreatment0 = new SpecimenTreatment();
        String string0 = specimenTreatment0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test4() throws Throwable {
        SpecimenTreatment specimenTreatment0 = new SpecimenTreatment();
        CodeableConcept codeableConcept0 = specimenTreatment0.getProcedure();
        assertNull(codeableConcept0);
    }
}
