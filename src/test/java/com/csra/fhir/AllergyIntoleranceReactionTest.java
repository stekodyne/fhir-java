/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:01:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AllergyIntoleranceReactionTest {

    @Test
    public void test00() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        java.util.List<CodeableConcept> list0 = allergyIntoleranceReaction0.getManifestation();
        java.util.List<CodeableConcept> list1 = allergyIntoleranceReaction0.getManifestation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        AllergyIntoleranceSeverity allergyIntoleranceSeverity0 = allergyIntoleranceReaction0.getSeverity();
        assertNull(allergyIntoleranceSeverity0);
    }

    @Test
    public void test02() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        AllergyIntoleranceCertainty allergyIntoleranceCertainty0 = allergyIntoleranceReaction0.getCertainty();
        assertNull(allergyIntoleranceCertainty0);
    }

    @Test
    public void test03() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setSubstance((CodeableConcept) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test04() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        Annotation annotation0 = allergyIntoleranceReaction0.getNote();
        assertNull(annotation0);
    }

    @Test
    public void test05() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        DateTime dateTime0 = allergyIntoleranceReaction0.getOnset();
        assertNull(dateTime0);
    }

    @Test
    public void test06() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setCertainty((AllergyIntoleranceCertainty) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test07() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setExposureRoute((CodeableConcept) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test08() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setNote((Annotation) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test09() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setSeverity((AllergyIntoleranceSeverity) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test10() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        CodeableConcept codeableConcept0 = allergyIntoleranceReaction0.getSubstance();
        assertNull(codeableConcept0);
    }

    @Test
    public void test11() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setDescription((String) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test12() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        CodeableConcept codeableConcept0 = allergyIntoleranceReaction0.getExposureRoute();
        assertNull(codeableConcept0);
    }

    @Test
    public void test13() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.setOnset((DateTime) null);
        assertNull(allergyIntoleranceReaction0.getId());
    }

    @Test
    public void test14() throws Throwable {
        AllergyIntoleranceReaction allergyIntoleranceReaction0 = new AllergyIntoleranceReaction();
        allergyIntoleranceReaction0.getDescription();
    }
}
