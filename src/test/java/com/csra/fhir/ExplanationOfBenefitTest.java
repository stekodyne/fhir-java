/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:19:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ExplanationOfBenefitTest {

    @Test
    public void test00() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        java.util.List<Identifier> list0 = explanationOfBenefit0.getIdentifier();
        java.util.List<Identifier> list1 = explanationOfBenefit0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setRequestOrganization((Reference) null);
    }

    @Test
    public void test02() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setRequestProvider((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test04() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Reference reference0 = explanationOfBenefit0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        DateTime dateTime0 = explanationOfBenefit0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test06() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setRequest((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Coding coding0 = explanationOfBenefit0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test08() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Coding coding0 = explanationOfBenefit0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test09() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        String string0 = explanationOfBenefit0.getDisposition();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Reference reference0 = explanationOfBenefit0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setOutcome((Code) null);
    }

    @Test
    public void test12() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Reference reference0 = explanationOfBenefit0.getRequestOrganization();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setCreated((DateTime) null);
    }

    @Test
    public void test14() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Code code0 = explanationOfBenefit0.getOutcome();
        assertNull(code0);
    }

    @Test
    public void test15() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setOrganization((Reference) null);
    }

    @Test
    public void test16() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setRuleset((Coding) null);
    }

    @Test
    public void test17() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        Reference reference0 = explanationOfBenefit0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        ExplanationOfBenefit explanationOfBenefit0 = new ExplanationOfBenefit();
        explanationOfBenefit0.setDisposition((String) null);
    }
}
