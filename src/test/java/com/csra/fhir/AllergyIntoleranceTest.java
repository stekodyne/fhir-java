/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:06:33 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AllergyIntoleranceTest {

    @Test
    public void test00() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        java.util.List<AllergyIntoleranceReaction> list0 = allergyIntolerance0.getReaction();
        java.util.List<AllergyIntoleranceReaction> list1 = allergyIntolerance0.getReaction();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        java.util.List<Identifier> list0 = allergyIntolerance0.getIdentifier();
        java.util.List<Identifier> list1 = allergyIntolerance0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setLastOccurence((DateTime) null);
    }

    @Test
    public void test03() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        DateTime dateTime0 = allergyIntolerance0.getLastOccurence();
        assertNull(dateTime0);
    }

    @Test
    public void test04() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        AllergyIntoleranceCriticality allergyIntoleranceCriticality0 = allergyIntolerance0.getCriticality();
        assertNull(allergyIntoleranceCriticality0);
    }

    @Test
    public void test05() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        Annotation annotation0 = allergyIntolerance0.getNote();
        assertNull(annotation0);
    }

    @Test
    public void test06() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setStatus((AllergyIntoleranceStatus) null);
    }

    @Test
    public void test07() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        AllergyIntoleranceCategory allergyIntoleranceCategory0 = allergyIntolerance0.getCategory();
        assertNull(allergyIntoleranceCategory0);
    }

    @Test
    public void test08() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        AllergyIntoleranceType allergyIntoleranceType0 = allergyIntolerance0.getType();
        assertNull(allergyIntoleranceType0);
    }

    @Test
    public void test09() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setType((AllergyIntoleranceType) null);
    }

    @Test
    public void test10() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        AllergyIntoleranceStatus allergyIntoleranceStatus0 = allergyIntolerance0.getStatus();
        assertNull(allergyIntoleranceStatus0);
    }

    @Test
    public void test11() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setPatient((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        Reference reference0 = allergyIntolerance0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setSubstance((CodeableConcept) null);
    }

    @Test
    public void test14() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setReporter((Reference) null);
    }

    @Test
    public void test15() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        DateTime dateTime0 = allergyIntolerance0.getRecordedDate();
        assertNull(dateTime0);
    }

    @Test
    public void test16() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        Reference reference0 = allergyIntolerance0.getRecorder();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setCriticality((AllergyIntoleranceCriticality) null);
    }

    @Test
    public void test18() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        Reference reference0 = allergyIntolerance0.getReporter();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setRecorder((Reference) null);
    }

    @Test
    public void test20() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setOnset((DateTime) null);
    }

    @Test
    public void test21() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setNote((Annotation) null);
    }

    @Test
    public void test22() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        CodeableConcept codeableConcept0 = allergyIntolerance0.getSubstance();
        assertNull(codeableConcept0);
    }

    @Test
    public void test23() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        DateTime dateTime0 = allergyIntolerance0.getOnset();
        assertNull(dateTime0);
    }

    @Test
    public void test24() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setRecordedDate((DateTime) null);
    }

    @Test
    public void test25() throws Throwable {
        AllergyIntolerance allergyIntolerance0 = new AllergyIntolerance();
        allergyIntolerance0.setCategory((AllergyIntoleranceCategory) null);
    }
}
