/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:52:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EnrollmentResponseTest {

    @Test
    public void test00() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        java.util.List<Identifier> list0 = enrollmentResponse0.getIdentifier();
        java.util.List<Identifier> list1 = enrollmentResponse0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Reference reference0 = enrollmentResponse0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Code code0 = enrollmentResponse0.getOutcome();
        assertNull(code0);
    }

    @Test
    public void test03() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Coding coding0 = enrollmentResponse0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test04() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setOutcome((Code) null);
    }

    @Test
    public void test05() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setRuleset((Coding) null);
    }

    @Test
    public void test06() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        DateTime dateTime0 = enrollmentResponse0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test07() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setRequest((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test09() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        String string0 = enrollmentResponse0.getDisposition();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setRequestProvider((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Reference reference0 = enrollmentResponse0.getRequestOrganization();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setRequestOrganization((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setOrganization((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setCreated((DateTime) null);
    }

    @Test
    public void test15() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Reference reference0 = enrollmentResponse0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Coding coding0 = enrollmentResponse0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test17() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        Reference reference0 = enrollmentResponse0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        EnrollmentResponse enrollmentResponse0 = new EnrollmentResponse();
        enrollmentResponse0.setDisposition((String) null);
    }
}
