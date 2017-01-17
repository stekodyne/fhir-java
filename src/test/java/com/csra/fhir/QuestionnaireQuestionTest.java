/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:26:11 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireQuestionTest {

    @Test
    public void test00() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        java.util.List<QuestionnaireGroup> list0 = questionnaireQuestion0.getGroup();
        java.util.List<QuestionnaireGroup> list1 = questionnaireQuestion0.getGroup();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        java.util.List<Coding> list0 = questionnaireQuestion0.getOption();
        java.util.List<Coding> list1 = questionnaireQuestion0.getOption();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        java.util.List<Coding> list0 = questionnaireQuestion0.getConcept();
        java.util.List<Coding> list1 = questionnaireQuestion0.getConcept();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setType((AnswerFormat) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test04() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        String string0 = questionnaireQuestion0.getText();
        assertNull(string0);
    }

    @Test
    public void test05() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setText((String) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test06() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        Boolean boolean0 = questionnaireQuestion0.getRepeats();
        assertNull(boolean0);
    }

    @Test
    public void test07() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setLinkId((String) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test08() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        AnswerFormat answerFormat0 = questionnaireQuestion0.getType();
        assertNull(answerFormat0);
    }

    @Test
    public void test09() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setOptions((Reference) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test10() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setRepeats((Boolean) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test11() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.setRequired((Boolean) null);
        assertNull(questionnaireQuestion0.getId());
    }

    @Test
    public void test12() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        Boolean boolean0 = questionnaireQuestion0.getRequired();
        assertNull(boolean0);
    }

    @Test
    public void test13() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        String string0 = questionnaireQuestion0.getLinkId();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        QuestionnaireQuestion questionnaireQuestion0 = new QuestionnaireQuestion();
        questionnaireQuestion0.getOptions();
    }
}
