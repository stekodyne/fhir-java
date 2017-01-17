/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:05:09 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ClaimResponseAddItemTest {

    @Test
    public void test00() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Coding coding0 = new Coding();
        claimResponseAddItem0.service = coding0;
        Coding coding1 = claimResponseAddItem0.getService();
        assertSame(coding1, coding0);
    }

    @Test
    public void test01() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        LinkedList<PositiveInt> linkedList0 = new LinkedList<PositiveInt>();
        PositiveInt positiveInt0 = new PositiveInt();
        linkedList0.addFirst(positiveInt0);
        claimResponseAddItem0.sequenceLinkId = (java.util.List<PositiveInt>) linkedList0;
        java.util.List<PositiveInt> list0 = claimResponseAddItem0.getSequenceLinkId();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test02() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        LinkedList<PositiveInt> linkedList0 = new LinkedList<PositiveInt>();
        PositiveInt positiveInt0 = new PositiveInt();
        linkedList0.addFirst(positiveInt0);
        claimResponseAddItem0.noteNumberLinkId = (java.util.List<PositiveInt>) linkedList0;
        java.util.List<PositiveInt> list0 = claimResponseAddItem0.getNoteNumberLinkId();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test03() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Money money0 = new Money();
        claimResponseAddItem0.fee = money0;
        Money money1 = claimResponseAddItem0.getFee();
        assertNull(money1.getId());
    }

    @Test
    public void test04() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        LinkedList<ClaimResponseDetail1> linkedList0 = new LinkedList<ClaimResponseDetail1>();
        ClaimResponseDetail1 claimResponseDetail1_0 = new ClaimResponseDetail1();
        linkedList0.add(claimResponseDetail1_0);
        claimResponseAddItem0.detail = (java.util.List<ClaimResponseDetail1>) linkedList0;
        java.util.List<ClaimResponseDetail1> list0 = claimResponseAddItem0.getDetail();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        LinkedList<ClaimResponseAdjudication3> linkedList0 = new LinkedList<ClaimResponseAdjudication3>();
        ClaimResponseAdjudication3 claimResponseAdjudication3_0 = new ClaimResponseAdjudication3();
        linkedList0.add(claimResponseAdjudication3_0);
        claimResponseAddItem0.adjudication = (java.util.List<ClaimResponseAdjudication3>) linkedList0;
        java.util.List<ClaimResponseAdjudication3> list0 = claimResponseAddItem0.getAdjudication();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        java.util.List<ClaimResponseDetail1> list0 = claimResponseAddItem0.getDetail();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test07() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        java.util.List<ClaimResponseAdjudication3> list0 = claimResponseAddItem0.getAdjudication();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        java.util.List<PositiveInt> list0 = claimResponseAddItem0.getNoteNumberLinkId();
        assertEquals(0, list0.size());
    }

    @Test
    public void test09() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        java.util.List<PositiveInt> list0 = claimResponseAddItem0.getSequenceLinkId();
        java.util.List<PositiveInt> list1 = claimResponseAddItem0.getSequenceLinkId();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Coding coding0 = claimResponseAddItem0.getService();
        assertNull(coding0);
    }

    @Test
    public void test11() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Money money0 = claimResponseAddItem0.getFee();
        assertNull(money0);
    }

    @Test
    public void test12() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Coding coding0 = new Coding();
        claimResponseAddItem0.setService(coding0);
        assertNull(claimResponseAddItem0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ClaimResponseAddItem claimResponseAddItem0 = new ClaimResponseAddItem();
        Money money0 = new Money();
        claimResponseAddItem0.setFee(money0);
        assertNull(claimResponseAddItem0.getId());
    }
}
