/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:09:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseCoverageTest {

    @Test
    public void test00() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        java.util.List<String> list0 = claimResponseCoverage0.getPreAuthRef();
        java.util.List<String> list1 = claimResponseCoverage0.getPreAuthRef();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setClaimResponse((Reference) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test02() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        String string0 = claimResponseCoverage0.getBusinessArrangement();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        Boolean boolean0 = claimResponseCoverage0.getFocal();
        assertNull(boolean0);
    }

    @Test
    public void test04() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setSequence((PositiveInt) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test05() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setCoverage((Reference) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        PositiveInt positiveInt0 = claimResponseCoverage0.getSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test07() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        Reference reference0 = claimResponseCoverage0.getCoverage();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setRelationship((Coding) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setFocal((Boolean) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test10() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        Coding coding0 = claimResponseCoverage0.getRelationship();
        assertNull(coding0);
    }

    @Test
    public void test11() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        Reference reference0 = claimResponseCoverage0.getClaimResponse();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setOriginalRuleset((Coding) null);
        assertNull(claimResponseCoverage0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        Coding coding0 = claimResponseCoverage0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test14() throws Throwable {
        ClaimResponseCoverage claimResponseCoverage0 = new ClaimResponseCoverage();
        claimResponseCoverage0.setBusinessArrangement((String) null);
    }
}
