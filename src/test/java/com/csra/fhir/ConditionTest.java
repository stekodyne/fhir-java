/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:29:27 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConditionTest {

    @Test
    public void test00() throws Throwable {
        Condition condition0 = new Condition();
        java.util.List<CodeableConcept> list0 = condition0.getBodySite();
        java.util.List<CodeableConcept> list1 = condition0.getBodySite();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Condition condition0 = new Condition();
        java.util.List<ConditionEvidence> list0 = condition0.getEvidence();
        java.util.List<ConditionEvidence> list1 = condition0.getEvidence();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Condition condition0 = new Condition();
        java.util.List<Identifier> list0 = condition0.getIdentifier();
        java.util.List<Identifier> list1 = condition0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setCategory((CodeableConcept) null);
    }

    @Test
    public void test04() throws Throwable {
        Condition condition0 = new Condition();
        Reference reference0 = condition0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        Condition condition0 = new Condition();
        Reference reference0 = condition0.getAsserter();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setPatient((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        Condition condition0 = new Condition();
        CodeableConcept codeableConcept0 = condition0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setVerificationStatus((ConditionVerificationStatus) null);
    }

    @Test
    public void test09() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setAbatementDateTimeOrAbatementQuantityOrAbatementBoolean((Element) null);
    }

    @Test
    public void test10() throws Throwable {
        Condition condition0 = new Condition();
        ConditionVerificationStatus conditionVerificationStatus0 = condition0.getVerificationStatus();
        assertNull(conditionVerificationStatus0);
    }

    @Test
    public void test11() throws Throwable {
        Condition condition0 = new Condition();
        String string0 = condition0.getNotes();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Condition condition0 = new Condition();
        Element element0 = condition0.getOnsetDateTimeOrOnsetQuantityOrOnsetPeriod();
        assertNull(element0);
    }

    @Test
    public void test13() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setNotes((String) null);
    }

    @Test
    public void test14() throws Throwable {
        Condition condition0 = new Condition();
        Element element0 = condition0.getAbatementDateTimeOrAbatementQuantityOrAbatementBoolean();
        assertNull(element0);
    }

    @Test
    public void test15() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setDateRecorded((Date) null);
    }

    @Test
    public void test16() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setOnsetDateTimeOrOnsetQuantityOrOnsetPeriod((Element) null);
    }

    @Test
    public void test17() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setStage((ConditionStage) null);
    }

    @Test
    public void test18() throws Throwable {
        Condition condition0 = new Condition();
        Code code0 = condition0.getClinicalStatus();
        assertNull(code0);
    }

    @Test
    public void test19() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setClinicalStatus((Code) null);
    }

    @Test
    public void test20() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setEncounter((Reference) null);
    }

    @Test
    public void test21() throws Throwable {
        Condition condition0 = new Condition();
        CodeableConcept codeableConcept0 = condition0.getSeverity();
        assertNull(codeableConcept0);
    }

    @Test
    public void test22() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setSeverity((CodeableConcept) null);
    }

    @Test
    public void test23() throws Throwable {
        Condition condition0 = new Condition();
        Reference reference0 = condition0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test24() throws Throwable {
        Condition condition0 = new Condition();
        Date date0 = condition0.getDateRecorded();
        assertNull(date0);
    }

    @Test
    public void test25() throws Throwable {
        Condition condition0 = new Condition();
        ConditionStage conditionStage0 = condition0.getStage();
        assertNull(conditionStage0);
    }

    @Test
    public void test26() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setCode((CodeableConcept) null);
    }

    @Test
    public void test27() throws Throwable {
        Condition condition0 = new Condition();
        CodeableConcept codeableConcept0 = condition0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test28() throws Throwable {
        Condition condition0 = new Condition();
        condition0.setAsserter((Reference) null);
    }
}
