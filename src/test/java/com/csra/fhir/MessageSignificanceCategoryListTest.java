/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:51:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class MessageSignificanceCategoryListTest {

    @Test
    public void test0() throws Throwable {
        MessageSignificanceCategoryList[] messageSignificanceCategoryListArray0 = MessageSignificanceCategoryList.values();
        assertNotNull(messageSignificanceCategoryListArray0);
    }

    @Test
    public void test1() throws Throwable {
        MessageSignificanceCategoryList messageSignificanceCategoryList0 = MessageSignificanceCategoryList.valueOf("CONSEQUENCE");
        assertEquals("CONSEQUENCE", messageSignificanceCategoryList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        MessageSignificanceCategoryList messageSignificanceCategoryList0 = MessageSignificanceCategoryList.fromValue("Notification");
        assertEquals(2, messageSignificanceCategoryList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            MessageSignificanceCategoryList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            MessageSignificanceCategoryList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.MessageSignificanceCategoryList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        MessageSignificanceCategoryList messageSignificanceCategoryList0 = MessageSignificanceCategoryList.fromValue("Consequence");
        assertEquals("CONSEQUENCE", messageSignificanceCategoryList0.toString());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            MessageSignificanceCategoryList.fromValue("pX-y");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // pX-y
            //
            assertThrownBy("com.csra.fhir.MessageSignificanceCategoryList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        MessageSignificanceCategoryList messageSignificanceCategoryList0 = MessageSignificanceCategoryList.valueOf("CURRENCY");
        java.lang.String string0 = messageSignificanceCategoryList0.value();
        assertEquals("Currency", string0);
    }
}
