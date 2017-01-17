/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:51:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseItemTest {

    @Test
    public void test0() throws Throwable {
        ClaimResponseItem claimResponseItem0 = new ClaimResponseItem();
        java.util.List<ClaimResponseDetail> list0 = claimResponseItem0.getDetail();
        java.util.List<ClaimResponseDetail> list1 = claimResponseItem0.getDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ClaimResponseItem claimResponseItem0 = new ClaimResponseItem();
        java.util.List<ClaimResponseAdjudication> list0 = claimResponseItem0.getAdjudication();
        java.util.List<ClaimResponseAdjudication> list1 = claimResponseItem0.getAdjudication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        ClaimResponseItem claimResponseItem0 = new ClaimResponseItem();
        java.util.List<PositiveInt> list0 = claimResponseItem0.getNoteNumber();
        java.util.List<PositiveInt> list1 = claimResponseItem0.getNoteNumber();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test3() throws Throwable {
        ClaimResponseItem claimResponseItem0 = new ClaimResponseItem();
        claimResponseItem0.setSequenceLinkId((PositiveInt) null);
        assertNull(claimResponseItem0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ClaimResponseItem claimResponseItem0 = new ClaimResponseItem();
        PositiveInt positiveInt0 = claimResponseItem0.getSequenceLinkId();
        assertNull(positiveInt0);
    }
}
