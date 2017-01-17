/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:39:38 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DocumentReferenceContextTest {

    @Test
    public void test00() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        java.util.List<DocumentReferenceRelated> list0 = documentReferenceContext0.getRelated();
        java.util.List<DocumentReferenceRelated> list1 = documentReferenceContext0.getRelated();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        java.util.List<CodeableConcept> list0 = documentReferenceContext0.getEvent();
        java.util.List<CodeableConcept> list1 = documentReferenceContext0.getEvent();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReferenceContext0.setPeriod((Period) null);
        assertNull(documentReferenceContext0.getId());
    }

    @Test
    public void test03() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReferenceContext0.setFacilityType((CodeableConcept) null);
        assertNull(documentReferenceContext0.getId());
    }

    @Test
    public void test04() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        Period period0 = documentReferenceContext0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test05() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        Reference reference0 = documentReferenceContext0.getSourcePatientInfo();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        CodeableConcept codeableConcept0 = documentReferenceContext0.getPracticeSetting();
        assertNull(codeableConcept0);
    }

    @Test
    public void test07() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        CodeableConcept codeableConcept0 = documentReferenceContext0.getFacilityType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReferenceContext0.setSourcePatientInfo((Reference) null);
        assertNull(documentReferenceContext0.getId());
    }

    @Test
    public void test09() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReferenceContext0.setEncounter((Reference) null);
        assertNull(documentReferenceContext0.getId());
    }

    @Test
    public void test10() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        Reference reference0 = documentReferenceContext0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReferenceContext0.setPracticeSetting((CodeableConcept) null);
        assertNull(documentReferenceContext0.getId());
    }
}
