/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:14:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DiagnosticReportTest {

    @Test
    public void test00() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = new Reference();
        diagnosticReport0.setPerformer(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test01() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = new Reference();
        diagnosticReport0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test02() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        DiagnosticReportStatus diagnosticReportStatus0 = new DiagnosticReportStatus();
        diagnosticReport0.setStatus(diagnosticReportStatus0);
        assertNull(diagnosticReportStatus0.getValue());
    }

    @Test
    public void test03() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        DiagnosticReportStatus diagnosticReportStatus0 = new DiagnosticReportStatus();
        diagnosticReport0.status = diagnosticReportStatus0;
        DiagnosticReportStatus diagnosticReportStatus1 = diagnosticReport0.getStatus();
        assertSame(diagnosticReportStatus1, diagnosticReportStatus0);
    }

    @Test
    public void test04() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = new Reference();
        diagnosticReport0.performer = reference0;
        Reference reference1 = diagnosticReport0.getPerformer();
        assertSame(reference1, reference0);
    }

    @Test
    public void test05() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        diagnosticReport0.imagingStudy = (java.util.List<Reference>) linkedList0;
        linkedList0.add((Reference) null);
        java.util.List<Reference> list0 = diagnosticReport0.getImagingStudy();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        diagnosticReport0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        java.util.List<Identifier> list0 = diagnosticReport0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test07() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = new Reference();
        diagnosticReport0.encounter = reference0;
        Reference reference1 = diagnosticReport0.getEncounter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test08() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Attachment> list0 = diagnosticReport0.getPresentedForm();
        java.util.List<Attachment> list1 = diagnosticReport0.getPresentedForm();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test09() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<CodeableConcept> list0 = diagnosticReport0.getCodedDiagnosis();
        java.util.List<CodeableConcept> list1 = diagnosticReport0.getCodedDiagnosis();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<DiagnosticReportImage> list0 = diagnosticReport0.getImage();
        java.util.List<DiagnosticReportImage> list1 = diagnosticReport0.getImage();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Reference> list0 = diagnosticReport0.getImagingStudy();
        assertEquals(0, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Reference> list0 = diagnosticReport0.getResult();
        java.util.List<Reference> list1 = diagnosticReport0.getResult();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Reference> list0 = diagnosticReport0.getSpecimen();
        java.util.List<Reference> list1 = diagnosticReport0.getSpecimen();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test14() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Reference> list0 = diagnosticReport0.getRequest();
        java.util.List<Reference> list1 = diagnosticReport0.getRequest();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        java.util.List<Identifier> list0 = diagnosticReport0.getIdentifier();
        assertEquals(0, list0.size());
    }

    @Test
    public void test16() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = diagnosticReport0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Instant instant0 = new Instant();
        diagnosticReport0.setIssued(instant0);
        Instant instant1 = diagnosticReport0.getIssued();
        assertNull(instant1.getId());
    }

    @Test
    public void test18() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        CodeableConcept codeableConcept0 = diagnosticReport0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test19() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Identifier identifier0 = new Identifier();
        diagnosticReport0.setEffectiveDateTimeOrEffectivePeriod(identifier0);
        Identifier identifier1 = (Identifier) diagnosticReport0.getEffectiveDateTimeOrEffectivePeriod();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test20() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        diagnosticReport0.setCategory(codeableConcept0);
        CodeableConcept codeableConcept1 = diagnosticReport0.getCategory();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test21() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = new Reference();
        diagnosticReport0.setSubject(reference0);
        Reference reference1 = diagnosticReport0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test22() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Identifier identifier0 = (Identifier) diagnosticReport0.getEffectiveDateTimeOrEffectivePeriod();
        assertNull(identifier0);
    }

    @Test
    public void test23() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = diagnosticReport0.getPerformer();
        assertNull(reference0);
    }

    @Test
    public void test24() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Instant instant0 = diagnosticReport0.getIssued();
        assertNull(instant0);
    }

    @Test
    public void test25() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        CodeableConcept codeableConcept0 = diagnosticReport0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test26() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        String string0 = new String();
        diagnosticReport0.setConclusion(string0);
        String string1 = diagnosticReport0.getConclusion();
        assertNull(string1.getValue());
    }

    @Test
    public void test27() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        diagnosticReport0.setCode(codeableConcept0);
        CodeableConcept codeableConcept1 = diagnosticReport0.getCode();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test28() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        DiagnosticReportStatus diagnosticReportStatus0 = diagnosticReport0.getStatus();
        assertNull(diagnosticReportStatus0);
    }

    @Test
    public void test29() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        String string0 = diagnosticReport0.getConclusion();
        assertNull(string0);
    }

    @Test
    public void test30() throws Throwable {
        DiagnosticReport diagnosticReport0 = new DiagnosticReport();
        Reference reference0 = diagnosticReport0.getSubject();
        assertNull(reference0);
    }
}
