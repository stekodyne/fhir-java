/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:39:54 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimDetailTest {

    @Test
    public void test00() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        java.util.List<ClaimSubDetail> list0 = claimDetail0.getSubDetail();
        java.util.List<ClaimSubDetail> list1 = claimDetail0.getSubDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setPoints((Decimal) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test02() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setService((Coding) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test03() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Money money0 = claimDetail0.getUnitPrice();
        assertNull(money0);
    }

    @Test
    public void test04() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setType((Coding) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test05() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setUnitPrice((Money) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Coding coding0 = claimDetail0.getService();
        assertNull(coding0);
    }

    @Test
    public void test07() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Coding coding0 = claimDetail0.getType();
        assertNull(coding0);
    }

    @Test
    public void test08() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setNet((Money) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        SimpleQuantity simpleQuantity0 = claimDetail0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test10() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setSequence((PositiveInt) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test11() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setUdi((Coding) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test12() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Coding coding0 = claimDetail0.getUdi();
        assertNull(coding0);
    }

    @Test
    public void test13() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Money money0 = claimDetail0.getNet();
        assertNull(money0);
    }

    @Test
    public void test14() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        PositiveInt positiveInt0 = claimDetail0.getSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test15() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Decimal decimal0 = claimDetail0.getFactor();
        assertNull(decimal0);
    }

    @Test
    public void test16() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setQuantity((SimpleQuantity) null);
        assertNull(claimDetail0.getId());
    }

    @Test
    public void test17() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        Decimal decimal0 = claimDetail0.getPoints();
        assertNull(decimal0);
    }

    @Test
    public void test18() throws Throwable {
        ClaimDetail claimDetail0 = new ClaimDetail();
        claimDetail0.setFactor((Decimal) null);
    }
}
