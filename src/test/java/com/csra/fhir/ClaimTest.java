/*
 * This file was created by Steffen Kory
 * Mon Jan 16 16:57:58 GMT 2017
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

public class ClaimTest {

    @Test
    public void test00() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.fundsReserve = coding0;
        Coding coding1 = claim0.getAccidentType();
        assertNull(coding1);
    }

    @Test
    public void test01() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setPatient(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test02() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.prescription = reference0;
        Reference reference1 = claim0.getPatient();
        assertNull(reference1);
    }

    @Test
    public void test03() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getException();
        assertNotNull(list0);

        claim0.condition = list0;
        java.util.List<Coding> list1 = claim0.getCondition();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test04() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setReferral(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test05() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setTarget(reference0);
        Reference reference1 = claim0.getOriginalPrescription();
        assertNull(reference1);
    }

    @Test
    public void test06() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.referral = reference0;
        Reference reference1 = claim0.getPrescription();
        assertNull(reference1);
    }

    @Test
    public void test07() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setFacility(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test08() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.prescription = reference0;
        Reference reference1 = claim0.getFacility();
        assertNull(reference1);
    }

    @Test
    public void test09() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.setPriority(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test10() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.accidentType = coding0;
        Coding coding1 = claim0.getPriority();
        assertNull(coding1);
    }

    @Test
    public void test11() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.originalPrescription = reference0;
        Reference reference1 = claim0.getOrganization();
        assertNull(reference1);
    }

    @Test
    public void test12() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.patient = reference0;
        Reference reference1 = claim0.getProvider();
        assertNull(reference1);
    }

    @Test
    public void test13() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setEnterer(reference0);
        Reference reference1 = claim0.getTarget();
        assertNull(reference1);
    }

    @Test
    public void test14() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.setOriginalRuleset(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test15() throws Throwable {
        Claim claim0 = new Claim();
        Use use0 = new Use();
        claim0.setUse(use0);
        Use use1 = claim0.getUse();
        assertNull(use1.getId());
    }

    @Test
    public void test16() throws Throwable {
        Claim claim0 = new Claim();
        ClaimType claimType0 = new ClaimType();
        claim0.type = claimType0;
        ClaimType claimType1 = claim0.getType();
        assertSame(claimType1, claimType0);
    }

    @Test
    public void test17() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.referral = reference0;
        Reference reference1 = claim0.getReferral();
        assertNull(reference1.getId());
    }

    @Test
    public void test18() throws Throwable {
        Claim claim0 = new Claim();
        ClaimPayee claimPayee0 = new ClaimPayee();
        claim0.payee = claimPayee0;
        ClaimPayee claimPayee1 = claim0.getPayee();
        assertNull(claimPayee1.getId());
    }

    @Test
    public void test19() throws Throwable {
        Claim claim0 = new Claim();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        Identifier identifier0 = new Identifier();
        linkedList0.addFirst(identifier0);
        claim0.identifier = (java.util.List<Identifier>) linkedList0;
        java.util.List<Identifier> list0 = claim0.getIdentifier();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test20() throws Throwable {
        Claim claim0 = new Claim();
        DateTime dateTime0 = new DateTime();
        claim0.created = dateTime0;
        DateTime dateTime1 = claim0.getCreated();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test21() throws Throwable {
        Claim claim0 = new Claim();
        LinkedList<ClaimCoverage> linkedList0 = new LinkedList<ClaimCoverage>();
        claim0.coverage = (java.util.List<ClaimCoverage>) linkedList0;
        linkedList0.add((ClaimCoverage) null);
        java.util.List<ClaimCoverage> list0 = claim0.getCoverage();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test22() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<ClaimMissingTeeth> list0 = claim0.getMissingTeeth();
        java.util.List<ClaimMissingTeeth> list1 = claim0.getMissingTeeth();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test23() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getAdditionalMaterials();
        java.util.List<Coding> list1 = claim0.getAdditionalMaterials();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test24() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<ClaimItem> list0 = claim0.getItem();
        java.util.List<ClaimItem> list1 = claim0.getItem();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test25() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getInterventionException();
        java.util.List<Coding> list1 = claim0.getInterventionException();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test26() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getException();
        java.util.List<Coding> list1 = claim0.getException();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test27() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<ClaimCoverage> list0 = claim0.getCoverage();
        assertEquals(0, list0.size());
    }

    @Test
    public void test28() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getCondition();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test29() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Coding> list0 = claim0.getAdditionalMaterials();
        assertNotNull(list0);

        claim0.condition = list0;
        java.util.List<Coding> list1 = claim0.getCondition();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test30() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<ClaimDiagnosis> list0 = claim0.getDiagnosis();
        java.util.List<ClaimDiagnosis> list1 = claim0.getDiagnosis();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test31() throws Throwable {
        Claim claim0 = new Claim();
        java.util.List<Identifier> list0 = claim0.getIdentifier();
        assertEquals(0, list0.size());
    }

    @Test
    public void test32() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.setRuleset(coding0);
        Coding coding1 = claim0.getRuleset();
        assertNull(coding1.getId());
    }

    @Test
    public void test33() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = claim0.getFundsReserve();
        assertNull(coding0);
    }

    @Test
    public void test34() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = claim0.getEnterer();
        assertNull(reference0);
    }

    @Test
    public void test35() throws Throwable {
        Claim claim0 = new Claim();
        ClaimType claimType0 = new ClaimType();
        claim0.setType(claimType0);
        assertNull(claimType0.getId());
    }

    @Test
    public void test36() throws Throwable {
        Claim claim0 = new Claim();
        Date date0 = claim0.getAccident();
        assertNull(date0);
    }

    @Test
    public void test37() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = claim0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test38() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setOrganization(reference0);
        Reference reference1 = claim0.getPrescription();
        assertNull(reference1);
    }

    @Test
    public void test39() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setProvider(reference0);
        Reference reference1 = claim0.getEnterer();
        assertNull(reference1);
    }

    @Test
    public void test40() throws Throwable {
        Claim claim0 = new Claim();
        ClaimPayee claimPayee0 = claim0.getPayee();
        assertNull(claimPayee0);
    }

    @Test
    public void test41() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.setFundsReserve(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test42() throws Throwable {
        Claim claim0 = new Claim();
        Use use0 = claim0.getUse();
        assertNull(use0);
    }

    @Test
    public void test43() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setOriginalPrescription(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test44() throws Throwable {
        Claim claim0 = new Claim();
        String string0 = claim0.getSchool();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Claim claim0 = new Claim();
        ClaimPayee claimPayee0 = new ClaimPayee();
        claim0.setPayee(claimPayee0);
        assertNull(claimPayee0.getId());
    }

    @Test
    public void test46() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setTarget(reference0);
        Reference reference1 = claim0.getFacility();
        assertNull(reference1);
    }

    @Test
    public void test47() throws Throwable {
        Claim claim0 = new Claim();
        DateTime dateTime0 = new DateTime();
        claim0.setCreated(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test48() throws Throwable {
        Claim claim0 = new Claim();
        ClaimType claimType0 = claim0.getType();
        assertNull(claimType0);
    }

    @Test
    public void test49() throws Throwable {
        Claim claim0 = new Claim();
        DateTime dateTime0 = claim0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test50() throws Throwable {
        Claim claim0 = new Claim();
        String string0 = new String();
        claim0.setSchool(string0);
        String string1 = claim0.getSchool();
        assertNull(string1.getId());
    }

    @Test
    public void test51() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = new Reference();
        claim0.setPrescription(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test52() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = new Coding();
        claim0.setAccidentType(coding0);
        assertNull(coding0.getId());
    }

    @Test
    public void test53() throws Throwable {
        Claim claim0 = new Claim();
        Date date0 = new Date();
        claim0.setAccident(date0);
        Date date1 = claim0.getAccident();
        assertNull(date1.getId());
    }

    @Test
    public void test54() throws Throwable {
        Claim claim0 = new Claim();
        Reference reference0 = claim0.getReferral();
        assertNull(reference0);
    }

    @Test
    public void test55() throws Throwable {
        Claim claim0 = new Claim();
        Coding coding0 = claim0.getRuleset();
        assertNull(coding0);
    }
}
