/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:37:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireGroupTest {

    @Test
    public void test00() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        java.util.List<QuestionnaireQuestion> list0 = questionnaireGroup0.getQuestion();
        java.util.List<QuestionnaireQuestion> list1 = questionnaireGroup0.getQuestion();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        java.util.List<QuestionnaireGroup> list0 = questionnaireGroup0.getGroup();
        java.util.List<QuestionnaireGroup> list1 = questionnaireGroup0.getGroup();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        java.util.List<Coding> list0 = questionnaireGroup0.getConcept();
        java.util.List<Coding> list1 = questionnaireGroup0.getConcept();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        String string0 = questionnaireGroup0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        questionnaireGroup0.setLinkId((String) null);
        assertNull(questionnaireGroup0.getId());
    }

    @Test
    public void test05() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        questionnaireGroup0.setTitle((String) null);
        assertNull(questionnaireGroup0.getId());
    }

    @Test
    public void test06() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        Boolean boolean0 = questionnaireGroup0.getRepeats();
        assertNull(boolean0);
    }

    @Test
    public void test07() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        questionnaireGroup0.setRequired((Boolean) null);
        assertNull(questionnaireGroup0.getId());
    }

    @Test
    public void test08() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        Boolean boolean0 = questionnaireGroup0.getRequired();
        assertNull(boolean0);
    }

    @Test
    public void test09() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        String string0 = questionnaireGroup0.getLinkId();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        String string0 = questionnaireGroup0.getText();
        assertNull(string0);
    }

    @Test
    public void test11() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        questionnaireGroup0.setRepeats((Boolean) null);
        assertNull(questionnaireGroup0.getId());
    }

    @Test
    public void test12() throws Throwable {
        QuestionnaireGroup questionnaireGroup0 = new QuestionnaireGroup();
        questionnaireGroup0.setText((String) null);
    }
}
