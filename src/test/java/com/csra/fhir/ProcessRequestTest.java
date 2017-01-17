/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:58:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProcessRequestTest {

    @Test
    public void test00() throws Throwable {
        Reference reference0 = new Reference();
        ProcessRequest processRequest0 = new ProcessRequest();
        processRequest0.setTarget(reference0);
        Reference reference1 = processRequest0.getResponse();
        assertNull(reference1);
    }

    @Test
    public void test01() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.setProvider(reference0);
        Reference reference1 = processRequest0.getResponse();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.setRequest(reference0);
        Reference reference1 = processRequest0.getResponse();
        assertNull(reference1);
    }

    @Test
    public void test03() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.setOrganization(reference0);
        Reference reference1 = processRequest0.getResponse();
        assertNull(reference1);
    }

    @Test
    public void test04() throws Throwable {
        Reference reference0 = new Reference();
        ProcessRequest processRequest0 = new ProcessRequest();
        processRequest0.setTarget(reference0);
        Reference reference1 = processRequest0.getOrganization();
        assertNull(reference1);
    }

    @Test
    public void test05() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.provider = reference0;
        Reference reference1 = processRequest0.getOrganization();
        assertNull(reference1);
    }

    @Test
    public void test06() throws Throwable {
        Reference reference0 = new Reference();
        ProcessRequest processRequest0 = new ProcessRequest();
        processRequest0.setProvider(reference0);
        Reference reference1 = processRequest0.getProvider();
        assertNull(reference1.getId());
    }

    @Test
    public void test07() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Period period0 = new Period();
        processRequest0.period = period0;
        Period period1 = processRequest0.getPeriod();
        assertNull(period1.getId());
    }

    @Test
    public void test08() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Boolean boolean0 = new Boolean();
        processRequest0.nullify = boolean0;
        Boolean boolean1 = processRequest0.getNullify();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test09() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        DateTime dateTime0 = new DateTime();
        processRequest0.created = dateTime0;
        DateTime dateTime1 = processRequest0.getCreated();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test10() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        ActionList actionList0 = new ActionList();
        processRequest0.action = actionList0;
        ActionList actionList1 = processRequest0.getAction();
        assertNull(actionList1.getValue());
    }

    @Test
    public void test11() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        java.util.List<String> list0 = processRequest0.getExclude();
        java.util.List<String> list1 = processRequest0.getExclude();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        java.util.List<String> list0 = processRequest0.getInclude();
        java.util.List<String> list1 = processRequest0.getInclude();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        java.util.List<ProcessRequestItem> list0 = processRequest0.getItem();
        java.util.List<ProcessRequestItem> list1 = processRequest0.getItem();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test14() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        java.util.List<Identifier> list0 = processRequest0.getIdentifier();
        java.util.List<Identifier> list1 = processRequest0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = processRequest0.getTarget();
        assertNull(reference0);
    }

    @Test
    public void test16() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        String string0 = new String();
        processRequest0.setReference(string0);
        String string1 = processRequest0.getReference();
        assertSame(string1, string0);
    }

    @Test
    public void test17() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = processRequest0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Coding coding0 = processRequest0.getRuleset();
        assertNull(coding0);
    }

    @Test
    public void test19() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Period period0 = new Period();
        processRequest0.setPeriod(period0);
        assertNull(period0.getId());
    }

    @Test
    public void test20() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        DateTime dateTime0 = processRequest0.getCreated();
        assertNull(dateTime0);
    }

    @Test
    public void test21() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        ActionList actionList0 = processRequest0.getAction();
        assertNull(actionList0);
    }

    @Test
    public void test22() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Coding coding0 = new Coding();
        processRequest0.setRuleset(coding0);
        Coding coding1 = processRequest0.getRuleset();
        assertSame(coding1, coding0);
    }

    @Test
    public void test23() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        String string0 = processRequest0.getReference();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        Reference reference0 = new Reference();
        ProcessRequest processRequest0 = new ProcessRequest();
        processRequest0.setTarget(reference0);
        Reference reference1 = processRequest0.getTarget();
        assertNull(reference1.getId());
    }

    @Test
    public void test25() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Coding coding0 = new Coding();
        processRequest0.setOriginalRuleset(coding0);
        Coding coding1 = processRequest0.getOriginalRuleset();
        assertNull(coding1.getId());
    }

    @Test
    public void test26() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Boolean boolean0 = processRequest0.getNullify();
        assertNull(boolean0);
    }

    @Test
    public void test27() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.setRequest(reference0);
        Reference reference1 = processRequest0.getRequest();
        assertNull(reference1.getId());
    }

    @Test
    public void test28() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Boolean boolean0 = new Boolean();
        processRequest0.setNullify(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test29() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        ActionList actionList0 = new ActionList();
        processRequest0.setAction(actionList0);
        assertNull(actionList0.getId());
    }

    @Test
    public void test30() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Period period0 = processRequest0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test31() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = new Reference();
        processRequest0.setResponse(reference0);
        Reference reference1 = processRequest0.getOrganization();
        assertNull(reference1);
    }

    @Test
    public void test32() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        DateTime dateTime0 = new DateTime();
        processRequest0.setCreated(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test33() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Reference reference0 = processRequest0.getProvider();
        assertNull(reference0);
    }

    @Test
    public void test34() throws Throwable {
        ProcessRequest processRequest0 = new ProcessRequest();
        Coding coding0 = processRequest0.getOriginalRuleset();
        assertNull(coding0);
    }
}
