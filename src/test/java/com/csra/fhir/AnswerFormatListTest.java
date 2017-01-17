/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:36:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AnswerFormatListTest {

    @Test
    public void test0() throws Throwable {
        AnswerFormatList[] answerFormatListArray0 = AnswerFormatList.values();
        assertNotNull(answerFormatListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AnswerFormatList answerFormatList0 = AnswerFormatList.valueOf("BOOLEAN");
        assertEquals(AnswerFormatList.BOOLEAN, answerFormatList0);
    }

    @Test
    public void test2() throws Throwable {
        AnswerFormatList answerFormatList0 = AnswerFormatList.valueOf("INTEGER");
        assertEquals("integer", answerFormatList0.value());
    }

    @Test
    public void test3() throws Throwable {
        AnswerFormatList answerFormatList0 = AnswerFormatList.fromValue("boolean");
        assertEquals("boolean", answerFormatList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AnswerFormatList.valueOf((java.lang.String) null);
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
            AnswerFormatList.valueOf("");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AnswerFormatList.
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AnswerFormatList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.AnswerFormatList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AnswerFormatList answerFormatList0 = AnswerFormatList.fromValue("open-choice");
        java.lang.String string0 = answerFormatList0.value();
        assertEquals("open-choice", string0);
    }
}
