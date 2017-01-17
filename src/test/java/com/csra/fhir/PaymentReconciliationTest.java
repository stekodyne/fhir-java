/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:56:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PaymentReconciliationTest {

    @Test
    public void test00() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        java.util.List<PaymentReconciliationNote> list0 = paymentReconciliation0.getNote();
        java.util.List<PaymentReconciliationNote> list1 = paymentReconciliation0.getNote();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        java.util.List<PaymentReconciliationDetail> list0 = paymentReconciliation0.getDetail();
        java.util.List<PaymentReconciliationDetail> list1 = paymentReconciliation0.getDetail();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        java.util.List<Identifier> list0 = paymentReconciliation0.getIdentifier();
        java.util.List<Identifier> list1 = paymentReconciliation0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setDisposition((String) null);
    }

    @Test
    public void test04() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setOutcome((Code) null);
    }

    @Test
    public void test05() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Coding coding0 = paymentReconciliation0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test06() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Coding coding0 = paymentReconciliation0.getForm();
        assertNull(coding0);
    }

    @Test
    public void test07() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Code code0 = paymentReconciliation0.getOutcome();
        assertNull(code0);
    }

    @Test
    public void test08() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setTotal((Money) null);
    }

    @Test
    public void test09() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        String string0 = paymentReconciliation0.getDisposition();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Reference reference0 = paymentReconciliation0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setRequestOrganization((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setCreated((DateTime) null);
    }

    @Test
    public void test13() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setRequest((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Period period0 = paymentReconciliation0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test15() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Coding coding0 = paymentReconciliation0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test16() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test17() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Reference reference0 = paymentReconciliation0.getRequestOrganization();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setPeriod((Period) null);
    }

    @Test
    public void test19() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setForm((Coding) null);
    }

    @Test
    public void test20() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Reference reference0 = paymentReconciliation0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Money money0 = paymentReconciliation0.getTotal();
        assertNull(money0);
    }

    @Test
    public void test22() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        Reference reference0 = paymentReconciliation0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test23() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        DateTime dateTime0 = paymentReconciliation0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test24() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setOrganization((Reference) null);
    }

    @Test
    public void test25() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setRequestProvider((Reference) null);
    }

    @Test
    public void test26() throws Throwable {
        PaymentReconciliation paymentReconciliation0 = new PaymentReconciliation();
        paymentReconciliation0.setRuleset((Coding) null);
    }
}
