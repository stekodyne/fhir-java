/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:43:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DocumentReferenceContentTest {

    @Test
    public void test0() throws Throwable {
        DocumentReferenceContent documentReferenceContent0 = new DocumentReferenceContent();
        java.util.List<Coding> list0 = documentReferenceContent0.getFormat();
        java.util.List<Coding> list1 = documentReferenceContent0.getFormat();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        DocumentReferenceContent documentReferenceContent0 = new DocumentReferenceContent();
        documentReferenceContent0.setAttachment((Attachment) null);
        assertNull(documentReferenceContent0.getId());
    }

    @Test
    public void test2() throws Throwable {
        DocumentReferenceContent documentReferenceContent0 = new DocumentReferenceContent();
        documentReferenceContent0.getAttachment();
    }
}
