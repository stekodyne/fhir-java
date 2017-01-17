/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:25:35 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireResponseGroupTest {

    @Test
    public void test0() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        java.util.List<QuestionnaireResponseQuestion> list0 = questionnaireResponseGroup0.getQuestion();
        java.util.List<QuestionnaireResponseQuestion> list1 = questionnaireResponseGroup0.getQuestion();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        java.util.List<QuestionnaireResponseGroup> list0 = questionnaireResponseGroup0.getGroup();
        java.util.List<QuestionnaireResponseGroup> list1 = questionnaireResponseGroup0.getGroup();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        questionnaireResponseGroup0.setLinkId((String) null);
        assertNull(questionnaireResponseGroup0.getId());
    }

    @Test
    public void test3() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        questionnaireResponseGroup0.setText((String) null);
        assertNull(questionnaireResponseGroup0.getId());
    }

    @Test
    public void test4() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        String string0 = questionnaireResponseGroup0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test5() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        String string0 = questionnaireResponseGroup0.getText();
        assertNull(string0);
    }

    @Test
    public void test6() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        questionnaireResponseGroup0.setTitle((String) null);
        assertNull(questionnaireResponseGroup0.getId());
    }

    @Test
    public void test7() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        questionnaireResponseGroup0.setSubject((Reference) null);
        assertNull(questionnaireResponseGroup0.getId());
    }

    @Test
    public void test8() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        Reference reference0 = questionnaireResponseGroup0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test9() throws Throwable {
        QuestionnaireResponseGroup questionnaireResponseGroup0 = new QuestionnaireResponseGroup();
        questionnaireResponseGroup0.getLinkId();
    }
}
