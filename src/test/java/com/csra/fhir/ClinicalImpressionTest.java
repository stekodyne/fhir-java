/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:22:23 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ClinicalImpressionTest {

    @Test
    public void test00() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = new Reference();
        clinicalImpression0.setPatient(reference0);
        Reference reference1 = clinicalImpression0.getAssessor();
        assertNull(reference1);
    }

    @Test
    public void test01() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = new String();
        clinicalImpression0.summary = string0;
        String string1 = clinicalImpression0.getSummary();
        assertSame(string1, string0);
    }

    @Test
    public void test02() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = new String();
        clinicalImpression0.prognosis = string0;
        String string1 = clinicalImpression0.getPrognosis();
        assertSame(string1, string0);
    }

    @Test
    public void test03() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        LinkedList<ClinicalImpressionInvestigations> linkedList0 = new LinkedList<ClinicalImpressionInvestigations>();
        clinicalImpression0.investigations = (java.util.List<ClinicalImpressionInvestigations>) linkedList0;
        ClinicalImpressionInvestigations clinicalImpressionInvestigations0 = new ClinicalImpressionInvestigations();
        linkedList0.addFirst(clinicalImpressionInvestigations0);
        java.util.List<ClinicalImpressionInvestigations> list0 = clinicalImpression0.getInvestigations();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        DateTime dateTime0 = new DateTime();
        clinicalImpression0.date = dateTime0;
        DateTime dateTime1 = clinicalImpression0.getDate();
        assertNull(dateTime1.getValue());
    }

    @Test
    public void test05() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<Reference> list0 = clinicalImpression0.getAction();
        java.util.List<Reference> list1 = clinicalImpression0.getAction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<Reference> list0 = clinicalImpression0.getPlan();
        java.util.List<Reference> list1 = clinicalImpression0.getPlan();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<ClinicalImpressionRuledOut> list0 = clinicalImpression0.getRuledOut();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        LinkedList<ClinicalImpressionRuledOut> linkedList0 = new LinkedList<ClinicalImpressionRuledOut>();
        clinicalImpression0.ruledOut = (java.util.List<ClinicalImpressionRuledOut>) linkedList0;
        java.util.List<ClinicalImpressionRuledOut> list0 = clinicalImpression0.getRuledOut();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<CodeableConcept> list0 = clinicalImpression0.getResolved();
        java.util.List<CodeableConcept> list1 = clinicalImpression0.getResolved();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<ClinicalImpressionFinding> list0 = clinicalImpression0.getFinding();
        java.util.List<ClinicalImpressionFinding> list1 = clinicalImpression0.getFinding();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<ClinicalImpressionInvestigations> list0 = clinicalImpression0.getInvestigations();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test12() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        java.util.List<Reference> list0 = clinicalImpression0.getProblem();
        java.util.List<Reference> list1 = clinicalImpression0.getProblem();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Uri uri0 = new Uri();
        clinicalImpression0.setProtocol(uri0);
        Uri uri1 = clinicalImpression0.getProtocol();
        assertNull(uri1.getId());
    }

    @Test
    public void test14() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        DateTime dateTime0 = new DateTime();
        clinicalImpression0.setTriggerCodeableConceptOrTriggerReference(dateTime0);
        DateTime dateTime1 = (DateTime) clinicalImpression0.getTriggerCodeableConceptOrTriggerReference();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test15() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = new Reference();
        clinicalImpression0.setPrevious(reference0);
        Reference reference1 = clinicalImpression0.getPrevious();
        assertNull(reference1.getId());
    }

    @Test
    public void test16() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Element element0 = clinicalImpression0.getTriggerCodeableConceptOrTriggerReference();
        assertNull(element0);
    }

    @Test
    public void test17() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = clinicalImpression0.getSummary();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Uri uri0 = clinicalImpression0.getProtocol();
        assertNull(uri0);
    }

    @Test
    public void test19() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = clinicalImpression0.getPrevious();
        assertNull(reference0);
    }

    @Test
    public void test20() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        ClinicalImpressionStatus clinicalImpressionStatus0 = new ClinicalImpressionStatus();
        clinicalImpression0.setStatus(clinicalImpressionStatus0);
        ClinicalImpressionStatus clinicalImpressionStatus1 = clinicalImpression0.getStatus();
        assertNull(clinicalImpressionStatus1.getValue());
    }

    @Test
    public void test21() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = new Reference();
        clinicalImpression0.setAssessor(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test22() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = clinicalImpression0.getPrognosis();
        assertNull(string0);
    }

    @Test
    public void test23() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = new Reference();
        clinicalImpression0.setPatient(reference0);
        Reference reference1 = clinicalImpression0.getPatient();
        assertSame(reference1, reference0);
    }

    @Test
    public void test24() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = new String();
        clinicalImpression0.setSummary(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test25() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = clinicalImpression0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test26() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        DateTime dateTime0 = new DateTime();
        clinicalImpression0.setDate(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test27() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        DateTime dateTime0 = clinicalImpression0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test28() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = new String();
        clinicalImpression0.setDescription(string0);
        String string1 = clinicalImpression0.getDescription();
        assertNull(string1.getId());
    }

    @Test
    public void test29() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        String string0 = new String();
        clinicalImpression0.setPrognosis(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test30() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        Reference reference0 = clinicalImpression0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test31() throws Throwable {
        ClinicalImpression clinicalImpression0 = new ClinicalImpression();
        ClinicalImpressionStatus clinicalImpressionStatus0 = clinicalImpression0.getStatus();
        assertNull(clinicalImpressionStatus0);
    }
}
