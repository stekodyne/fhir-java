/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:13:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseSubDetailTest {

    @Test
    public void test0() throws Throwable {
        ClaimResponseSubDetail claimResponseSubDetail0 = new ClaimResponseSubDetail();
        java.util.List<ClaimResponseAdjudication2> list0 = claimResponseSubDetail0.getAdjudication();
        java.util.List<ClaimResponseAdjudication2> list1 = claimResponseSubDetail0.getAdjudication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ClaimResponseSubDetail claimResponseSubDetail0 = new ClaimResponseSubDetail();
        PositiveInt positiveInt0 = claimResponseSubDetail0.getSequenceLinkId();
        assertNull(positiveInt0);
    }

    @Test
    public void test2() throws Throwable {
        ClaimResponseSubDetail claimResponseSubDetail0 = new ClaimResponseSubDetail();
        claimResponseSubDetail0.setSequenceLinkId((PositiveInt) null);
    }
}
