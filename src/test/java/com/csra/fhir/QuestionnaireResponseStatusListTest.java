/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:41:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class QuestionnaireResponseStatusListTest {

    @Test
    public void test0() throws Throwable {
        QuestionnaireResponseStatusList[] questionnaireResponseStatusListArray0 = QuestionnaireResponseStatusList.values();
        assertNotNull(questionnaireResponseStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        QuestionnaireResponseStatusList questionnaireResponseStatusList0 = QuestionnaireResponseStatusList.valueOf("IN_PROGRESS");
        assertEquals(0, questionnaireResponseStatusList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        QuestionnaireResponseStatusList questionnaireResponseStatusList0 = QuestionnaireResponseStatusList.valueOf("COMPLETED");
        assertEquals("COMPLETED", questionnaireResponseStatusList0.toString());
    }

    @Test
    public void test3() throws Throwable {
        QuestionnaireResponseStatusList questionnaireResponseStatusList0 = QuestionnaireResponseStatusList.fromValue("completed");
        assertEquals("completed", questionnaireResponseStatusList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            QuestionnaireResponseStatusList.valueOf((java.lang.String) null);
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
            QuestionnaireResponseStatusList.valueOf("in-progress");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.QuestionnaireResponseStatusList.in-progress
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        QuestionnaireResponseStatusList questionnaireResponseStatusList0 = QuestionnaireResponseStatusList.fromValue("in-progress");
        assertEquals("IN_PROGRESS", questionnaireResponseStatusList0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            QuestionnaireResponseStatusList.fromValue("compueted");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // compueted
            //
            assertThrownBy("com.csra.fhir.QuestionnaireResponseStatusList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        QuestionnaireResponseStatusList questionnaireResponseStatusList0 = QuestionnaireResponseStatusList.COMPLETED;
        java.lang.String string0 = questionnaireResponseStatusList0.value();
        assertEquals("completed", string0);
    }
}
