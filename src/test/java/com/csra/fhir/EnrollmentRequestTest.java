/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:00:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class EnrollmentRequestTest {

    @Test
    public void test00() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        java.util.List<Identifier> list0 = enrollmentRequest0.getIdentifier();
        java.util.List<Identifier> list1 = enrollmentRequest0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        DateTime dateTime0 = enrollmentRequest0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test02() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Coding coding0 = enrollmentRequest0.getRelationship();
        assertNull(coding0);
    }

    @Test
    public void test03() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setRelationship((Coding) null);
    }

    @Test
    public void test04() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Coding coding0 = enrollmentRequest0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test05() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Reference reference0 = enrollmentRequest0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Reference reference0 = enrollmentRequest0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setCreated((DateTime) null);
    }

    @Test
    public void test08() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setTarget((Reference) null);
    }

    @Test
    public void test09() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setCoverage((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Reference reference0 = enrollmentRequest0.getTarget();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test12() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Reference reference0 = enrollmentRequest0.getCoverage();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setOrganization((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setProvider((Reference) null);
    }

    @Test
    public void test15() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Reference reference0 = enrollmentRequest0.getProvider();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setRuleset((Coding) null);
    }

    @Test
    public void test17() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        enrollmentRequest0.setSubject((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        EnrollmentRequest enrollmentRequest0 = new EnrollmentRequest();
        Coding coding0 = enrollmentRequest0.getOriginalRuleset();
        assertNull(coding0);
    }
}
