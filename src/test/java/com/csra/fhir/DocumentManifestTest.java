/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:47:51 GMT 2017
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

public class DocumentManifestTest {

    @Test
    public void test00() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        documentManifest0.setType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test01() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Code code0 = new Code();
        documentManifest0.status = code0;
        Code code1 = documentManifest0.getStatus();
        assertNull(code1.getValue());
    }

    @Test
    public void test02() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Uri uri0 = new Uri();
        documentManifest0.source = uri0;
        Uri uri1 = documentManifest0.getSource();
        assertSame(uri1, uri0);
    }

    @Test
    public void test03() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        LinkedList<DocumentManifestRelated> linkedList0 = new LinkedList<DocumentManifestRelated>();
        DocumentManifestRelated documentManifestRelated0 = new DocumentManifestRelated();
        linkedList0.add(documentManifestRelated0);
        documentManifest0.related = (java.util.List<DocumentManifestRelated>) linkedList0;
        java.util.List<DocumentManifestRelated> list0 = documentManifest0.getRelated();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        documentManifest0.recipient = (java.util.List<Reference>) linkedList0;
        Reference reference0 = new Reference();
        linkedList0.add(reference0);
        java.util.List<Reference> list0 = documentManifest0.getRecipient();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Identifier identifier0 = new Identifier();
        documentManifest0.setMasterIdentifier(identifier0);
        Identifier identifier1 = documentManifest0.getMasterIdentifier();
        assertNull(identifier1.getId());
    }

    @Test
    public void test06() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        String string0 = new String();
        documentManifest0.description = string0;
        String string1 = documentManifest0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test07() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        LinkedList<DocumentManifestContent> linkedList0 = new LinkedList<DocumentManifestContent>();
        documentManifest0.content = (java.util.List<DocumentManifestContent>) linkedList0;
        DocumentManifestContent documentManifestContent0 = new DocumentManifestContent();
        linkedList0.add(documentManifestContent0);
        java.util.List<DocumentManifestContent> list0 = documentManifest0.getContent();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        java.util.List<DocumentManifestRelated> list0 = documentManifest0.getRelated();
        assertEquals(0, list0.size());
    }

    @Test
    public void test09() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        java.util.List<DocumentManifestContent> list0 = documentManifest0.getContent();
        assertEquals(0, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        java.util.List<Reference> list0 = documentManifest0.getAuthor();
        java.util.List<Reference> list1 = documentManifest0.getAuthor();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        java.util.List<Reference> list0 = documentManifest0.getRecipient();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test12() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        java.util.List<Identifier> list0 = documentManifest0.getIdentifier();
        java.util.List<Identifier> list1 = documentManifest0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Identifier identifier0 = documentManifest0.getMasterIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test14() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Uri uri0 = documentManifest0.getSource();
        assertNull(uri0);
    }

    @Test
    public void test15() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Code code0 = documentManifest0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test16() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Uri uri0 = new Uri();
        documentManifest0.setSource(uri0);
        assertNull(uri0.getValue());
    }

    @Test
    public void test17() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        DateTime dateTime0 = documentManifest0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test18() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Code code0 = new Code();
        documentManifest0.setStatus(code0);
        assertNull(code0.getId());
    }

    @Test
    public void test19() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        String string0 = documentManifest0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Reference reference0 = documentManifest0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        String string0 = new String();
        documentManifest0.setDescription(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test22() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        Reference reference0 = new Reference();
        documentManifest0.setSubject(reference0);
        Reference reference1 = documentManifest0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test23() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        CodeableConcept codeableConcept0 = documentManifest0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test24() throws Throwable {
        DocumentManifest documentManifest0 = new DocumentManifest();
        DateTime dateTime0 = new DateTime();
        documentManifest0.setCreated(dateTime0);
        DateTime dateTime1 = documentManifest0.getCreated();
        assertNull(dateTime1.getValue());
    }
}
