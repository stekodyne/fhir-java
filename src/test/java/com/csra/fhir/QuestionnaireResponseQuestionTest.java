/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:01:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireResponseQuestionTest {

    @Test
    public void test0() throws Throwable {
        QuestionnaireResponseQuestion questionnaireResponseQuestion0 = new QuestionnaireResponseQuestion();
        java.util.List<QuestionnaireResponseAnswer> list0 = questionnaireResponseQuestion0.getAnswer();
        java.util.List<QuestionnaireResponseAnswer> list1 = questionnaireResponseQuestion0.getAnswer();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        QuestionnaireResponseQuestion questionnaireResponseQuestion0 = new QuestionnaireResponseQuestion();
        String string0 = questionnaireResponseQuestion0.getText();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        QuestionnaireResponseQuestion questionnaireResponseQuestion0 = new QuestionnaireResponseQuestion();
        questionnaireResponseQuestion0.setText((String) null);
        assertNull(questionnaireResponseQuestion0.getId());
    }

    @Test
    public void test3() throws Throwable {
        QuestionnaireResponseQuestion questionnaireResponseQuestion0 = new QuestionnaireResponseQuestion();
        questionnaireResponseQuestion0.setLinkId((String) null);
        assertNull(questionnaireResponseQuestion0.getId());
    }

    @Test
    public void test4() throws Throwable {
        QuestionnaireResponseQuestion questionnaireResponseQuestion0 = new QuestionnaireResponseQuestion();
        questionnaireResponseQuestion0.getLinkId();
    }
}
