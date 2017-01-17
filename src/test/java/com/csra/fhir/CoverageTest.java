/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:36:55 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CoverageTest {

    @Test
    public void test00() throws Throwable {
        Coverage coverage0 = new Coverage();
        java.util.List<Reference> list0 = coverage0.getContract();
        java.util.List<Reference> list1 = coverage0.getContract();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Coverage coverage0 = new Coverage();
        java.util.List<Identifier> list0 = coverage0.getIdentifier();
        java.util.List<Identifier> list1 = coverage0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setBin((Identifier) null);
    }

    @Test
    public void test03() throws Throwable {
        Coverage coverage0 = new Coverage();
        Reference reference0 = coverage0.getIssuer();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setSequence((PositiveInt) null);
    }

    @Test
    public void test05() throws Throwable {
        Coverage coverage0 = new Coverage();
        Coding coding0 = coverage0.getType();
        assertNull(coding0);
    }

    @Test
    public void test06() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setNetwork((Identifier) null);
    }

    @Test
    public void test07() throws Throwable {
        Coverage coverage0 = new Coverage();
        Identifier identifier0 = coverage0.getNetwork();
        assertNull(identifier0);
    }

    @Test
    public void test08() throws Throwable {
        Coverage coverage0 = new Coverage();
        Identifier identifier0 = coverage0.getBin();
        assertNull(identifier0);
    }

    @Test
    public void test09() throws Throwable {
        Coverage coverage0 = new Coverage();
        Reference reference0 = coverage0.getSubscriber();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setDependent((PositiveInt) null);
    }

    @Test
    public void test11() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setSubscriber((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setGroup((String) null);
    }

    @Test
    public void test13() throws Throwable {
        Coverage coverage0 = new Coverage();
        Period period0 = coverage0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test14() throws Throwable {
        Coverage coverage0 = new Coverage();
        String string0 = coverage0.getGroup();
        assertNull(string0);
    }

    @Test
    public void test15() throws Throwable {
        Coverage coverage0 = new Coverage();
        String string0 = coverage0.getSubPlan();
        assertNull(string0);
    }

    @Test
    public void test16() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setType((Coding) null);
    }

    @Test
    public void test17() throws Throwable {
        Coverage coverage0 = new Coverage();
        PositiveInt positiveInt0 = coverage0.getSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test18() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setPeriod((Period) null);
    }

    @Test
    public void test19() throws Throwable {
        Coverage coverage0 = new Coverage();
        String string0 = coverage0.getPlan();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setSubscriberId((Identifier) null);
    }

    @Test
    public void test21() throws Throwable {
        Coverage coverage0 = new Coverage();
        PositiveInt positiveInt0 = coverage0.getDependent();
        assertNull(positiveInt0);
    }

    @Test
    public void test22() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setIssuer((Reference) null);
    }

    @Test
    public void test23() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setPlan((String) null);
    }

    @Test
    public void test24() throws Throwable {
        Coverage coverage0 = new Coverage();
        Identifier identifier0 = coverage0.getSubscriberId();
        assertNull(identifier0);
    }

    @Test
    public void test25() throws Throwable {
        Coverage coverage0 = new Coverage();
        coverage0.setSubPlan((String) null);
    }
}
