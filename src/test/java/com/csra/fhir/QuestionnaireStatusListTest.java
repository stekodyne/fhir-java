/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:29:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class QuestionnaireStatusListTest {

    @Test
    public void test0() throws Throwable {
        QuestionnaireStatusList[] questionnaireStatusListArray0 = QuestionnaireStatusList.values();
        assertNotNull(questionnaireStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        QuestionnaireStatusList questionnaireStatusList0 = QuestionnaireStatusList.valueOf("DRAFT");
        assertEquals(QuestionnaireStatusList.DRAFT, questionnaireStatusList0);
    }

    @Test
    public void test2() throws Throwable {
        QuestionnaireStatusList questionnaireStatusList0 = QuestionnaireStatusList.valueOf("RETIRED");
        assertEquals("RETIRED", questionnaireStatusList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        QuestionnaireStatusList questionnaireStatusList0 = QuestionnaireStatusList.fromValue("draft");
        assertEquals(0, questionnaireStatusList0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            QuestionnaireStatusList.valueOf((java.lang.String) null);
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
            QuestionnaireStatusList.valueOf("K");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.QuestionnaireStatusList.K
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        QuestionnaireStatusList questionnaireStatusList0 = QuestionnaireStatusList.fromValue("published");
        assertEquals(1, questionnaireStatusList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            QuestionnaireStatusList.fromValue("ay?L");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // ay?L
            //
            assertThrownBy("com.csra.fhir.QuestionnaireStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        QuestionnaireStatusList questionnaireStatusList0 = QuestionnaireStatusList.DRAFT;
        java.lang.String string0 = questionnaireStatusList0.value();
        assertEquals("draft", string0);
    }
}
