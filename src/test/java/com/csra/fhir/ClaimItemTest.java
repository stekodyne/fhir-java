/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:19:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimItemTest {

    @Test
    public void test00() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        java.util.List<Coding> list0 = claimItem0.getModifier();
        assertNotNull(list0);

        java.util.List<Coding> list1 = claimItem0.getSubSite();
        assertNotNull(list1);
        assertNotSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        java.util.List<ClaimDetail> list0 = claimItem0.getDetail();
        java.util.List<ClaimDetail> list1 = claimItem0.getDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        java.util.List<Coding> list0 = claimItem0.getModifier();
        java.util.List<Coding> list1 = claimItem0.getModifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        java.util.List<Coding> list0 = claimItem0.getModifier();
        assertNotNull(list0);

        claimItem0.subSite = list0;
        java.util.List<Coding> list1 = claimItem0.getSubSite();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test04() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        java.util.List<PositiveInt> list0 = claimItem0.getDiagnosisLinkId();
        java.util.List<PositiveInt> list1 = claimItem0.getDiagnosisLinkId();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test05() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setUnitPrice((Money) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setProsthesis((ClaimProsthesis) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test07() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        ClaimProsthesis claimProsthesis0 = claimItem0.getProsthesis();
        assertNull(claimProsthesis0);
    }

    @Test
    public void test08() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Decimal decimal0 = claimItem0.getFactor();
        assertNull(decimal0);
    }

    @Test
    public void test09() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setBodySite((Coding) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test10() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Coding coding0 = claimItem0.getBodySite();
        assertNull(coding0);
    }

    @Test
    public void test11() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setProvider((Reference) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test12() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setUdi((Coding) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test13() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Coding coding0 = claimItem0.getService();
        assertNull(coding0);
    }

    @Test
    public void test14() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Decimal decimal0 = claimItem0.getPoints();
        assertNull(decimal0);
    }

    @Test
    public void test15() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setPoints((Decimal) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test16() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Coding coding0 = claimItem0.getType();
        assertNull(coding0);
    }

    @Test
    public void test17() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        SimpleQuantity simpleQuantity0 = claimItem0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test18() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        PositiveInt positiveInt0 = claimItem0.getSequence();
        assertNull(positiveInt0);
    }

    @Test
    public void test19() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setNet((Money) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test20() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Money money0 = claimItem0.getUnitPrice();
        assertNull(money0);
    }

    @Test
    public void test21() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Money money0 = claimItem0.getNet();
        assertNull(money0);
    }

    @Test
    public void test22() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setService((Coding) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test23() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setFactor((Decimal) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test24() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Coding coding0 = claimItem0.getUdi();
        assertNull(coding0);
    }

    @Test
    public void test25() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setSequence((PositiveInt) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test26() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setType((Coding) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test27() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setServiceDate((Date) null);
        assertNull(claimItem0.getId());
    }

    @Test
    public void test28() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Date date0 = claimItem0.getServiceDate();
        assertNull(date0);
    }

    @Test
    public void test29() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        Reference reference0 = claimItem0.getProvider();
        assertNull(reference0);
    }

    @Test
    public void test30() throws Throwable {
        ClaimItem claimItem0 = new ClaimItem();
        claimItem0.setQuantity((SimpleQuantity) null);
    }
}
