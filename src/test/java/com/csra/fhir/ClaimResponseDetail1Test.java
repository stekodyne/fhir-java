/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:48:46 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseDetail1Test {

    @Test
    public void test0() throws Throwable {
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        java.util.List<ClaimResponseAdjudication4> list0 = claimResponseDetail1_0.getAdjudication();
        java.util.List<ClaimResponseAdjudication4> list1 = claimResponseDetail1_0.getAdjudication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        claimResponseDetail1_0.setService((Coding) null);
        assertNull(claimResponseDetail1_0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        Money money0 = claimResponseDetail1_0.getFee();
        assertNull(money0);
    }

    @Test
    public void test3() throws Throwable {
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        Coding coding0 = claimResponseDetail1_0.getService();
        assertNull(coding0);
    }

    @Test
    public void test4() throws Throwable {
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        claimResponseDetail1_0.setFee((Money) null);
        assertNull(claimResponseDetail1_0.getId());
    }
}
