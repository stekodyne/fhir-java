/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:04:34 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireResponseAnswerTest {

    @Test
    public void test0() throws Throwable {
        QuestionnaireResponseAnswer questionnaireResponseAnswer0 = new QuestionnaireResponseAnswer();
        java.util.List<QuestionnaireResponseGroup> list0 = questionnaireResponseAnswer0.getGroup();
        java.util.List<QuestionnaireResponseGroup> list1 = questionnaireResponseAnswer0.getGroup();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        QuestionnaireResponseAnswer questionnaireResponseAnswer0 = new QuestionnaireResponseAnswer();
        questionnaireResponseAnswer0.setValueBooleanOrValueDecimalOrValueInteger(questionnaireResponseAnswer0);
        QuestionnaireResponseAnswer questionnaireResponseAnswer1 = (QuestionnaireResponseAnswer) questionnaireResponseAnswer0.getValueBooleanOrValueDecimalOrValueInteger();
        assertSame(questionnaireResponseAnswer0, questionnaireResponseAnswer1);
    }

    @Test
    public void test2() throws Throwable {
        QuestionnaireResponseAnswer questionnaireResponseAnswer0 = new QuestionnaireResponseAnswer();
        questionnaireResponseAnswer0.getValueBooleanOrValueDecimalOrValueInteger();
    }
}
