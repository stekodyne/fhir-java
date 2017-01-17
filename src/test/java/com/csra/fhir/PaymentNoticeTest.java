/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:15:09 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PaymentNoticeTest {

    @Test
    public void test00() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        java.util.List<Identifier> list0 = paymentNotice0.getIdentifier();
        java.util.List<Identifier> list1 = paymentNotice0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Reference reference0 = paymentNotice0.getResponse();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setTarget((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Reference reference0 = paymentNotice0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setProvider((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Reference reference0 = paymentNotice0.getTarget();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Coding coding0 = paymentNotice0.getPaymentStatus();
        assertNull(coding0);
    }

    @Test
    public void test07() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setOrganization((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        DateTime dateTime0 = paymentNotice0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test09() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test10() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setResponse((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setRequest((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setCreated((DateTime) null);
    }

    @Test
    public void test13() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Reference reference0 = paymentNotice0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Coding coding0 = paymentNotice0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test15() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Reference reference0 = paymentNotice0.getProvider();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        Coding coding0 = paymentNotice0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test17() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setPaymentStatus((Coding) null);
    }

    @Test
    public void test18() throws Throwable {
        PaymentNotice paymentNotice0 = new PaymentNotice();
        paymentNotice0.setRuleset((Coding) null);
    }
}
