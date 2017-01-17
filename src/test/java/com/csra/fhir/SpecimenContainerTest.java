/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:07:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SpecimenContainerTest {

    @Test
    public void test00() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.setAdditiveCodeableConceptOrAdditiveReference(specimenContainer0);
        assertNull(specimenContainer0.getId());
    }

    @Test
    public void test01() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.additiveCodeableConceptOrAdditiveReference = (Element) specimenContainer0;
        SpecimenContainer specimenContainer1 = (SpecimenContainer) specimenContainer0.getAdditiveCodeableConceptOrAdditiveReference();
        assertSame(specimenContainer0, specimenContainer1);
    }

    @Test
    public void test02() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        java.util.List<Identifier> list0 = specimenContainer0.getIdentifier();
        java.util.List<Identifier> list1 = specimenContainer0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.setDescription((String) null);
        assertNull(specimenContainer0.getId());
    }

    @Test
    public void test04() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.setType((CodeableConcept) null);
        assertNull(specimenContainer0.getId());
    }

    @Test
    public void test05() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        CodeableConcept codeableConcept0 = specimenContainer0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        SpecimenContainer specimenContainer1 = (SpecimenContainer) specimenContainer0.getAdditiveCodeableConceptOrAdditiveReference();
        assertNull(specimenContainer1);
    }

    @Test
    public void test07() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        SimpleQuantity simpleQuantity0 = specimenContainer0.getCapacity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test08() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        String string0 = specimenContainer0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.setSpecimenQuantity((SimpleQuantity) null);
        assertNull(specimenContainer0.getId());
    }

    @Test
    public void test10() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        SimpleQuantity simpleQuantity0 = specimenContainer0.getSpecimenQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test11() throws Throwable {
        SpecimenContainer specimenContainer0 = new SpecimenContainer();
        specimenContainer0.setCapacity((SimpleQuantity) null);
    }
}
