/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:32:35 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class DocumentModeListTest {

    @Test
    public void test0() throws Throwable {
        DocumentModeList[] documentModeListArray0 = DocumentModeList.values();
        assertNotNull(documentModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        DocumentModeList documentModeList0 = DocumentModeList.valueOf("PRODUCER");
        assertEquals(0, documentModeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        DocumentModeList documentModeList0 = DocumentModeList.valueOf("CONSUMER");
        assertEquals(1, documentModeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        DocumentModeList documentModeList0 = DocumentModeList.fromValue("consumer");
        assertEquals("consumer", documentModeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            DocumentModeList.valueOf((java.lang.String) null);
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
            DocumentModeList.valueOf("producer");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.DocumentModeList.producer
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DocumentModeList documentModeList0 = DocumentModeList.fromValue("producer");
        assertEquals(0, documentModeList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            DocumentModeList.fromValue("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            //
            //
            assertThrownBy("com.csra.fhir.DocumentModeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        DocumentModeList documentModeList0 = DocumentModeList.PRODUCER;
        java.lang.String string0 = documentModeList0.value();
        assertEquals("producer", string0);
    }
}
