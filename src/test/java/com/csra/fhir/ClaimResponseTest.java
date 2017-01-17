/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:27:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ClaimResponseTest {

    @Test
    public void test00() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setReserved(coding0);
        Coding coding1 = claimResponse0.getForm();
        assertNull(coding1);
    }

    @Test
    public void test01() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setPaymentAdjustmentReason(coding0);
        Coding coding1 = claimResponse0.getForm();
        assertNull(coding1);
    }

    @Test
    public void test02() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.ruleset = coding0;
        Coding coding1 = claimResponse0.getForm();
        assertNull(coding1);
    }

    @Test
    public void test03() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.unallocDeductable = money0;
        Money money1 = claimResponse0.getPaymentAmount();
        assertNull(money1);
    }

    @Test
    public void test04() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Date date0 = new Date();
        claimResponse0.setPaymentDate(date0);
        assertNull(date0.getValue());
    }

    @Test
    public void test05() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.setPaymentAdjustment(money0);
        assertNull(money0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.totalBenefit = money0;
        Money money1 = claimResponse0.getPaymentAdjustment();
        assertNull(money1);
    }

    @Test
    public void test07() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.setTotalBenefit(money0);
        assertNull(money0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.setUnallocDeductable(money0);
        assertNull(money0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.setPaymentAmount(money0);
        Money money1 = claimResponse0.getUnallocDeductable();
        assertNull(money1);
    }

    @Test
    public void test10() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setReserved(coding0);
        Coding coding1 = claimResponse0.getPayeeType();
        assertNull(coding1);
    }

    @Test
    public void test11() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setPaymentAdjustmentReason(coding0);
        Coding coding1 = claimResponse0.getPayeeType();
        assertNull(coding1);
    }

    @Test
    public void test12() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setOriginalRuleset(coding0);
        Coding coding1 = claimResponse0.getPayeeType();
        assertNull(coding1);
    }

    @Test
    public void test13() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.ruleset = coding0;
        Coding coding1 = claimResponse0.getPayeeType();
        assertNull(coding1);
    }

    @Test
    public void test14() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        String string0 = new String();
        claimResponse0.setDisposition(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test15() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Code code0 = new Code();
        claimResponse0.setOutcome(code0);
        assertNull(code0.getValue());
    }

    @Test
    public void test16() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setRequestOrganization(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test17() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.organization = reference0;
        Reference reference1 = claimResponse0.getRequestOrganization();
        assertNull(reference1);
    }

    @Test
    public void test18() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setRequestProvider(reference0);
        Reference reference1 = claimResponse0.getRequestOrganization();
        assertNull(reference1);
    }

    @Test
    public void test19() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setOrganization(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test20() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        DateTime dateTime0 = new DateTime();
        claimResponse0.created = dateTime0;
        claimResponse0.setCreated((DateTime) null);
    }

    @Test
    public void test21() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.requestOrganization = reference0;
        Reference reference1 = claimResponse0.getRequest();
        assertNull(reference1);
    }

    @Test
    public void test22() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setRequestProvider(reference0);
        Reference reference1 = claimResponse0.getRequest();
        assertNull(reference1);
    }

    @Test
    public void test23() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.totalBenefit = money0;
        Money money1 = claimResponse0.getTotalBenefit();
        assertSame(money1, money0);
    }

    @Test
    public void test24() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.ruleset = coding0;
        Coding coding1 = claimResponse0.getRuleset();
        assertNull(coding1.getId());
    }

    @Test
    public void test25() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Date date0 = new Date();
        claimResponse0.paymentDate = date0;
        Date date1 = claimResponse0.getPaymentDate();
        assertNull(date1.getId());
    }

    @Test
    public void test26() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.organization = reference0;
        Reference reference1 = claimResponse0.getOrganization();
        assertSame(reference1, reference0);
    }

    @Test
    public void test27() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<ClaimResponseCoverage> list0 = claimResponse0.getCoverage();
        java.util.List<ClaimResponseCoverage> list1 = claimResponse0.getCoverage();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test28() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<ClaimResponseNote> list0 = claimResponse0.getNote();
        java.util.List<ClaimResponseNote> list1 = claimResponse0.getNote();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test29() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<ClaimResponseError> list0 = claimResponse0.getError();
        java.util.List<ClaimResponseError> list1 = claimResponse0.getError();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test30() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<ClaimResponseAddItem> list0 = claimResponse0.getAddItem();
        java.util.List<ClaimResponseAddItem> list1 = claimResponse0.getAddItem();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test31() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<ClaimResponseItem> list0 = claimResponse0.getItem();
        java.util.List<ClaimResponseItem> list1 = claimResponse0.getItem();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test32() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        java.util.List<Identifier> list0 = claimResponse0.getIdentifier();
        java.util.List<Identifier> list1 = claimResponse0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test33() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setForm(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test34() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setPaymentAdjustmentReason(coding0);
        Coding coding1 = claimResponse0.getPaymentAdjustmentReason();
        assertSame(coding1, coding0);
    }

    @Test
    public void test35() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = claimResponse0.getPaymentAdjustmentReason();
        assertNull(coding0);
    }

    @Test
    public void test36() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setPayeeType(coding0);
        Coding coding1 = claimResponse0.getForm();
        assertNull(coding1);
    }

    @Test
    public void test37() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        String string0 = claimResponse0.getDisposition();
        assertNull(string0);
    }

    @Test
    public void test38() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = claimResponse0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test39() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Date date0 = claimResponse0.getPaymentDate();
        assertNull(date0);
    }

    @Test
    public void test40() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setReserved(coding0);
        Coding coding1 = claimResponse0.getReserved();
        assertNull(coding1.getId());
    }

    @Test
    public void test41() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setRequestProvider(reference0);
        Reference reference1 = claimResponse0.getRequestProvider();
        assertNull(reference1.getId());
    }

    @Test
    public void test42() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setOriginalRuleset(coding0);
        Coding coding1 = claimResponse0.getOriginalRuleset();
        assertNull(coding1.getId());
    }

    @Test
    public void test43() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = claimResponse0.getReserved();
        assertNull(coding0);
    }

    @Test
    public void test44() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = new Money();
        claimResponse0.setTotalCost(money0);
        assertNull(money0.getId());
    }

    @Test
    public void test45() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = new Coding();
        claimResponse0.setRuleset(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test46() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Identifier identifier0 = claimResponse0.getPaymentRef();
        assertNull(identifier0);
    }

    @Test
    public void test47() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = claimResponse0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test48() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = claimResponse0.getTotalBenefit();
        assertNull(money0);
    }

    @Test
    public void test49() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Code code0 = claimResponse0.getOutcome();
        assertNull(code0);
    }

    @Test
    public void test50() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = claimResponse0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test51() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Reference reference0 = new Reference();
        claimResponse0.setRequest(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test52() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        DateTime dateTime0 = claimResponse0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test53() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Coding coding0 = claimResponse0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test54() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Identifier identifier0 = new Identifier();
        claimResponse0.setPaymentRef(identifier0);
        Identifier identifier1 = claimResponse0.getPaymentRef();
        assertNull(identifier1.getId());
    }

    @Test
    public void test55() throws Throwable {
        ClaimResponse claimResponse0 = new ClaimResponse();
        Money money0 = claimResponse0.getTotalCost();
        assertNull(money0);
    }
}
