/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:55:33 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProcessResponseTest {

    @Test
    public void test00() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        java.util.List<Coding> list0 = processResponse0.getError();
        java.util.List<Coding> list1 = processResponse0.getError();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        java.util.List<ProcessResponseNotes> list0 = processResponse0.getNotes();
        java.util.List<ProcessResponseNotes> list1 = processResponse0.getNotes();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        java.util.List<Identifier> list0 = processResponse0.getIdentifier();
        java.util.List<Identifier> list1 = processResponse0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Coding coding0 = processResponse0.getOriginalRuleset();
        assertNull(coding0);
    }

    @Test
    public void test04() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Coding coding0 = processResponse0.getOutcome();
        assertNull(coding0);
    }

    @Test
    public void test05() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setRequestProvider((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setRequest((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setOutcome((Coding) null);
    }

    @Test
    public void test08() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setRequestOrganization((Reference) null);
    }

    @Test
    public void test09() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setForm((Coding) null);
    }

    @Test
    public void test10() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setDisposition((String) null);
    }

    @Test
    public void test11() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setOrganization((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        String string0 = processResponse0.getDisposition();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Reference reference0 = processResponse0.getOrganization();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Reference reference0 = processResponse0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Coding coding0 = processResponse0.getForm();
        assertNull(coding0);
    }

    @Test
    public void test16() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setRuleset((Coding) null);
    }

    @Test
    public void test17() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setOriginalRuleset((Coding) null);
    }

    @Test
    public void test18() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Reference reference0 = processResponse0.getRequestOrganization();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Reference reference0 = processResponse0.getRequestProvider();
        assertNull(reference0);
    }

    @Test
    public void test20() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        processResponse0.setCreated((DateTime) null);
    }

    @Test
    public void test21() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        DateTime dateTime0 = processResponse0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test22() throws Throwable {
        ProcessResponse processResponse0 = new ProcessResponse();
        Coding coding0 = processResponse0.getRuleset();
        assertNull(coding0);
    }
}
