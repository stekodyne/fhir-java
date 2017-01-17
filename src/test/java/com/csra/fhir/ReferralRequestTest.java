/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:22:28 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ReferralRequestTest {

    @Test
    public void test00() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        java.util.List<Reference> list0 = referralRequest0.getSupportingInformation();
        java.util.List<Reference> list1 = referralRequest0.getSupportingInformation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        java.util.List<CodeableConcept> list0 = referralRequest0.getServiceRequested();
        java.util.List<CodeableConcept> list1 = referralRequest0.getServiceRequested();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        java.util.List<Reference> list0 = referralRequest0.getRecipient();
        java.util.List<Reference> list1 = referralRequest0.getRecipient();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        java.util.List<Identifier> list0 = referralRequest0.getIdentifier();
        java.util.List<Identifier> list1 = referralRequest0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setDescription((String) null);
    }

    @Test
    public void test05() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setEncounter((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        DateTime dateTime0 = referralRequest0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test07() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        DateTime dateTime0 = referralRequest0.getDateSent();
        assertNull(dateTime0);
    }

    @Test
    public void test08() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        Period period0 = referralRequest0.getFulfillmentTime();
        assertNull(period0);
    }

    @Test
    public void test09() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        CodeableConcept codeableConcept0 = referralRequest0.getSpecialty();
        assertNull(codeableConcept0);
    }

    @Test
    public void test10() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        Reference reference0 = referralRequest0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setDateSent((DateTime) null);
    }

    @Test
    public void test12() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        ReferralStatus referralStatus0 = referralRequest0.getStatus();
        assertNull(referralStatus0);
    }

    @Test
    public void test13() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setReason((CodeableConcept) null);
    }

    @Test
    public void test14() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setStatus((ReferralStatus) null);
    }

    @Test
    public void test15() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        Reference reference0 = referralRequest0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setType((CodeableConcept) null);
    }

    @Test
    public void test17() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        Reference reference0 = referralRequest0.getRequester();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setPatient((Reference) null);
    }

    @Test
    public void test19() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setFulfillmentTime((Period) null);
    }

    @Test
    public void test20() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        String string0 = referralRequest0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setSpecialty((CodeableConcept) null);
    }

    @Test
    public void test22() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setRequester((Reference) null);
    }

    @Test
    public void test23() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        CodeableConcept codeableConcept0 = referralRequest0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test24() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        CodeableConcept codeableConcept0 = referralRequest0.getPriority();
        assertNull(codeableConcept0);
    }

    @Test
    public void test25() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setDate((DateTime) null);
    }

    @Test
    public void test26() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        CodeableConcept codeableConcept0 = referralRequest0.getReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test27() throws Throwable {
        ReferralRequest referralRequest0 = new ReferralRequest();
        referralRequest0.setPriority((CodeableConcept) null);
    }
}
