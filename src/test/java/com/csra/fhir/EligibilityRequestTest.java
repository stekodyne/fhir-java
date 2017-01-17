/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:31:53 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EligibilityRequestTest {

    @Test
    public void test00() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        java.util.List<Identifier> list0 = eligibilityRequest0.getIdentifier();
        java.util.List<Identifier> list1 = eligibilityRequest0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        Reference reference0 = eligibilityRequest0.getTarget();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        Reference reference0 = eligibilityRequest0.getProvider();
        assertNull(reference0);
    }

    @Test
    public void test03() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        Coding coding0 = eligibilityRequest0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test04() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setRuleset((Coding) null);
    }

    @Test
    public void test05() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test06() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        Coding coding0 = eligibilityRequest0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test07() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setProvider((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        DateTime dateTime0 = eligibilityRequest0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test09() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setOrganization((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setTarget((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        eligibilityRequest0.setCreated((DateTime) null);
    }

    @Test
    public void test12() throws Throwable {
        EligibilityRequest eligibilityRequest0 = new EligibilityRequest();
        Reference reference0 = eligibilityRequest0.getOrganization();
        assertNull(reference0);
    }
}
