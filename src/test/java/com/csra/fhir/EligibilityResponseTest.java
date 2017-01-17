/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:13:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EligibilityResponseTest {

    @Test
    public void test00() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        java.util.List<Identifier> list0 = eligibilityResponse0.getIdentifier();
        java.util.List<Identifier> list1 = eligibilityResponse0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Reference reference0 = eligibilityResponse0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setRequest((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setRequestOrganization((Reference) null);
    }

    @Test
    public void test04() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Reference reference0 = eligibilityResponse0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setOrganization((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Coding coding0 = eligibilityResponse0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test07() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setOutcome((Code) null);
    }

    @Test
    public void test08() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setDisposition((String) null);
    }

    @Test
    public void test09() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setCreated((DateTime) null);
    }

    @Test
    public void test10() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Reference reference0 = eligibilityResponse0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Code code0 = eligibilityResponse0.getOutcome();
        assertNull(code0);
    }

    @Test
    public void test12() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test13() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setRequestProvider((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        eligibilityResponse0.setRuleset((Coding) null);
    }

    @Test
    public void test15() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Coding coding0 = eligibilityResponse0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test16() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        Reference reference0 = eligibilityResponse0.getRequestOrganization();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        DateTime dateTime0 = eligibilityResponse0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test18() throws Throwable {
        EligibilityResponse eligibilityResponse0 = new EligibilityResponse();
        String string0 = eligibilityResponse0.getDisposition();
        assertNull(string0);
    }
}
