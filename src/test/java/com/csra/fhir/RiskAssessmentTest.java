/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:32:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class RiskAssessmentTest {

    @Test
    public void test00() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        java.util.List<RiskAssessmentPrediction> list0 = riskAssessment0.getPrediction();
        java.util.List<RiskAssessmentPrediction> list1 = riskAssessment0.getPrediction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        java.util.List<Reference> list0 = riskAssessment0.getBasis();
        java.util.List<Reference> list1 = riskAssessment0.getBasis();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        Reference reference0 = riskAssessment0.getPerformer();
        assertNull(reference0);
    }

    @Test
    public void test03() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        Reference reference0 = riskAssessment0.getCondition();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setCondition((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setMethod((CodeableConcept) null);
    }

    @Test
    public void test06() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setMitigation((String) null);
    }

    @Test
    public void test07() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        Identifier identifier0 = riskAssessment0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test08() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setPerformer((Reference) null);
    }

    @Test
    public void test09() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        DateTime dateTime0 = riskAssessment0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test10() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setIdentifier((Identifier) null);
    }

    @Test
    public void test11() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setEncounter((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        String string0 = riskAssessment0.getMitigation();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        Reference reference0 = riskAssessment0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        Reference reference0 = riskAssessment0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        CodeableConcept codeableConcept0 = riskAssessment0.getMethod();
        assertNull(codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setSubject((Reference) null);
    }

    @Test
    public void test17() throws Throwable {
        RiskAssessment riskAssessment0 = new RiskAssessment();
        riskAssessment0.setDate((DateTime) null);
    }
}
