/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:37:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseDetailTest {

    @Test
    public void test0() throws Throwable {
        ClaimResponseDetail claimResponseDetail0 = new ClaimResponseDetail();
        java.util.List<ClaimResponseSubDetail> list0 = claimResponseDetail0.getSubDetail();
        java.util.List<ClaimResponseSubDetail> list1 = claimResponseDetail0.getSubDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ClaimResponseDetail claimResponseDetail0 = new ClaimResponseDetail();
        java.util.List<ClaimResponseAdjudication1> list0 = claimResponseDetail0.getAdjudication();
        java.util.List<ClaimResponseAdjudication1> list1 = claimResponseDetail0.getAdjudication();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ClaimResponseDetail claimResponseDetail0 = new ClaimResponseDetail();
        PositiveInt positiveInt0 = claimResponseDetail0.getSequenceLinkId();
        assertNull(positiveInt0);
    }

    @Test
    public void test3() throws Throwable {
        ClaimResponseDetail claimResponseDetail0 = new ClaimResponseDetail();
        claimResponseDetail0.setSequenceLinkId((PositiveInt) null);
    }
}
