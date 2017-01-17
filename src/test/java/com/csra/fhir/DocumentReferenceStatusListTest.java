/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:24:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DocumentReferenceStatusListTest {

    @Test
    public void test0() throws Throwable {
        DocumentReferenceStatusList[] documentReferenceStatusListArray0 = DocumentReferenceStatusList.values();
        assertNotNull(documentReferenceStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DocumentReferenceStatusList documentReferenceStatusList0 = DocumentReferenceStatusList.valueOf("CURRENT");
        assertEquals("CURRENT", documentReferenceStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        DocumentReferenceStatusList documentReferenceStatusList0 = DocumentReferenceStatusList.valueOf("SUPERSEDED");
        assertEquals("SUPERSEDED", documentReferenceStatusList0.name());
    }

    @Test
    public void test3() throws Throwable {
        DocumentReferenceStatusList documentReferenceStatusList0 = DocumentReferenceStatusList.fromValue("entered-in-error");
        assertEquals("ENTERED_IN_ERROR", documentReferenceStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DocumentReferenceStatusList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        // Undeclared exception!
        try {
            DocumentReferenceStatusList.valueOf("current");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DocumentReferenceStatusList.current
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DocumentReferenceStatusList documentReferenceStatusList0 = DocumentReferenceStatusList.fromValue("current");
        assertEquals("CURRENT", documentReferenceStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DocumentReferenceStatusList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.DocumentReferenceStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DocumentReferenceStatusList documentReferenceStatusList0 = DocumentReferenceStatusList.SUPERSEDED;
        java.lang.String string0 = documentReferenceStatusList0.value();
        assertEquals("superseded", string0);
    }
}
