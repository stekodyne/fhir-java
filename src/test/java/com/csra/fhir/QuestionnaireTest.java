/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:38:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class QuestionnaireTest {

    @Test
    public void test00() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        java.util.List<Code> list0 = questionnaire0.getSubjectType();
        java.util.List<Code> list1 = questionnaire0.getSubjectType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        java.util.List<ContactPoint> list0 = questionnaire0.getTelecom();
        java.util.List<ContactPoint> list1 = questionnaire0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        java.util.List<Identifier> list0 = questionnaire0.getIdentifier();
        java.util.List<Identifier> list1 = questionnaire0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        questionnaire0.setGroup((QuestionnaireGroup) null);
    }

    @Test
    public void test04() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        String string0 = questionnaire0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test05() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        QuestionnaireGroup questionnaireGroup0 = questionnaire0.getGroup();
        assertNull(questionnaireGroup0);
    }

    @Test
    public void test06() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        questionnaire0.setDate((DateTime) null);
    }

    @Test
    public void test07() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        questionnaire0.setVersion((String) null);
    }

    @Test
    public void test08() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        String string0 = questionnaire0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        questionnaire0.setStatus((QuestionnaireStatus) null);
    }

    @Test
    public void test10() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        QuestionnaireStatus questionnaireStatus0 = questionnaire0.getStatus();
        assertNull(questionnaireStatus0);
    }

    @Test
    public void test11() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        questionnaire0.setPublisher((String) null);
    }

    @Test
    public void test12() throws Throwable {
        Questionnaire questionnaire0 = new Questionnaire();
        DateTime dateTime0 = questionnaire0.getDate();
        assertNull(dateTime0);
    }
}
