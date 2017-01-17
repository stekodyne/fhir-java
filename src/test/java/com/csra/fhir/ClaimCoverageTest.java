/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:12:32 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimCoverageTest {

    @Test
    public void test00() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        java.util.List<String> list0 = claimCoverage0.getPreAuthRef();
        java.util.List<String> list1 = claimCoverage0.getPreAuthRef();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        Coding coding0 = claimCoverage0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test02() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setClaimResponse((Reference) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test03() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        Coding coding0 = claimCoverage0.getRelationship();
        assertNull(coding0);
    }

    @Test
    public void test04() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        Reference reference0 = claimCoverage0.getCoverage();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setFocal((Boolean) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setRelationship((Coding) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test07() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        PositiveInt positiveInt0 = claimCoverage0.getSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test08() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        Reference reference0 = claimCoverage0.getClaimResponse();
        assertNull(reference0);
    }

    @Test
    public void test09() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setSequence((PositiveInt) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test10() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setOriginalRuleset((Coding) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test11() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        String string0 = claimCoverage0.getBusinessArrangement();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setBusinessArrangement((String) null);
        assertNull(claimCoverage0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        Boolean boolean0 = claimCoverage0.getFocal();
        assertNull(boolean0);
    }

    @Test
    public void test14() throws Throwable {
        ClaimCoverage claimCoverage0 = new ClaimCoverage();
        claimCoverage0.setCoverage((Reference) null);
    }
}
