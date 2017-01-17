/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:50:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DocumentReferenceTest {

    @Test
    public void test00() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        String string0 = new String();
        documentReference0.setDescription(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test01() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Code code0 = new Code();
        documentReference0.language = code0;
        Code code1 = documentReference0.getStatus();
        assertNull(code1);
    }

    @Test
    public void test02() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = new Reference();
        documentReference0.setCustodian(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test03() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = new Reference();
        documentReference0.setAuthenticator(reference0);
        Reference reference1 = documentReference0.getCustodian();
        assertNull(reference1);
    }

    @Test
    public void test04() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        documentReference0.setClazz(codeableConcept0);
        CodeableConcept codeableConcept1 = documentReference0.getType();
        assertNull(codeableConcept1);
    }

    @Test
    public void test05() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = new Reference();
        documentReference0.subject = reference0;
        Reference reference1 = documentReference0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test06() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Identifier identifier0 = new Identifier();
        documentReference0.setMasterIdentifier(identifier0);
        Identifier identifier1 = documentReference0.getMasterIdentifier();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test07() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        documentReference0.docStatus = codeableConcept0;
        CodeableConcept codeableConcept1 = documentReference0.getDocStatus();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test08() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        LinkedList<DocumentReferenceContent> linkedList0 = new LinkedList<DocumentReferenceContent>();
        documentReference0.content = (java.util.List<DocumentReferenceContent>) linkedList0;
        DocumentReferenceContent documentReferenceContent0 = new DocumentReferenceContent();
        linkedList0.add(documentReferenceContent0);
        java.util.List<DocumentReferenceContent> list0 = documentReference0.getContent();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        java.util.List<DocumentReferenceContent> list0 = documentReference0.getContent();
        assertEquals(0, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        java.util.List<CodeableConcept> list0 = documentReference0.getSecurityLabel();
        java.util.List<CodeableConcept> list1 = documentReference0.getSecurityLabel();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        java.util.List<DocumentReferenceRelatesTo> list0 = documentReference0.getRelatesTo();
        java.util.List<DocumentReferenceRelatesTo> list1 = documentReference0.getRelatesTo();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        java.util.List<Reference> list0 = documentReference0.getAuthor();
        java.util.List<Reference> list1 = documentReference0.getAuthor();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        java.util.List<Identifier> list0 = documentReference0.getIdentifier();
        java.util.List<Identifier> list1 = documentReference0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Instant instant0 = documentReference0.getIndexed();
        assertNull(instant0);
    }

    @Test
    public void test15() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Instant instant0 = new Instant();
        documentReference0.setIndexed(instant0);
        Instant instant1 = documentReference0.getIndexed();
        assertNull(instant1.getId());
    }

    @Test
    public void test16() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Code code0 = new Code();
        documentReference0.setStatus(code0);
        assertNull(code0.getValue());
    }

    @Test
    public void test17() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        DocumentReferenceContext documentReferenceContext0 = documentReference0.getContext();
        assertNull(documentReferenceContext0);
    }

    @Test
    public void test18() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        DateTime dateTime0 = new DateTime();
        documentReference0.setCreated(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test19() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        DateTime dateTime0 = documentReference0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test20() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = documentReference0.getAuthenticator();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = documentReference0.getClazz();
        assertNull(codeableConcept0);
    }

    @Test
    public void test22() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        String string0 = documentReference0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test23() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = new Reference();
        documentReference0.setSubject(reference0);
        Reference reference1 = documentReference0.getAuthenticator();
        assertNull(reference1);
    }

    @Test
    public void test24() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        documentReference0.setDocStatus(codeableConcept0);
        CodeableConcept codeableConcept1 = documentReference0.getType();
        assertNull(codeableConcept1);
    }

    @Test
    public void test25() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        documentReference0.setType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test26() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        CodeableConcept codeableConcept0 = documentReference0.getDocStatus();
        assertNull(codeableConcept0);
    }

    @Test
    public void test27() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        DocumentReferenceContext documentReferenceContext0 = new DocumentReferenceContext();
        documentReference0.setContext(documentReferenceContext0);
        DocumentReferenceContext documentReferenceContext1 = documentReference0.getContext();
        assertSame(documentReferenceContext1, documentReferenceContext0);
    }

    @Test
    public void test28() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Reference reference0 = documentReference0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test29() throws Throwable {
        DocumentReference documentReference0 = new DocumentReference();
        Identifier identifier0 = documentReference0.getMasterIdentifier();
        assertNull(identifier0);
    }
}
