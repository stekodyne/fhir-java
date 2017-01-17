/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:30:53 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OperationDefinitionTest {

    @Test
    public void test00() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        java.util.List<OperationDefinitionParameter> list0 = operationDefinition0.getParameter();
        java.util.List<OperationDefinitionParameter> list1 = operationDefinition0.getParameter();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        java.util.List<Code> list0 = operationDefinition0.getType();
        java.util.List<Code> list1 = operationDefinition0.getType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        java.util.List<OperationDefinitionContact> list0 = operationDefinition0.getContact();
        java.util.List<OperationDefinitionContact> list1 = operationDefinition0.getContact();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setKind((OperationKind) null);
    }

    @Test
    public void test04() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getName();
        assertNull(string0);
    }

    @Test
    public void test05() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Boolean boolean0 = operationDefinition0.getSystem();
        assertNull(boolean0);
    }

    @Test
    public void test06() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setDescription((String) null);
    }

    @Test
    public void test07() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test08() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setSystem((Boolean) null);
    }

    @Test
    public void test09() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setCode((Code) null);
    }

    @Test
    public void test10() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        DateTime dateTime0 = operationDefinition0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test11() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Reference reference0 = operationDefinition0.getBase();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setInstance((Boolean) null);
    }

    @Test
    public void test13() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setIdempotent((Boolean) null);
    }

    @Test
    public void test14() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setPublisher((String) null);
    }

    @Test
    public void test15() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setStatus((Code) null);
    }

    @Test
    public void test16() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setNotes((String) null);
    }

    @Test
    public void test18() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setDate((DateTime) null);
    }

    @Test
    public void test19() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getRequirements();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Code code0 = operationDefinition0.getCode();
        assertNull(code0);
    }

    @Test
    public void test21() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Boolean boolean0 = operationDefinition0.getInstance();
        assertNull(boolean0);
    }

    @Test
    public void test22() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getNotes();
        assertNull(string0);
    }

    @Test
    public void test23() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setUrl((Uri) null);
    }

    @Test
    public void test24() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setName((String) null);
    }

    @Test
    public void test25() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Boolean boolean0 = operationDefinition0.getIdempotent();
        assertNull(boolean0);
    }

    @Test
    public void test26() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Boolean boolean0 = operationDefinition0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test27() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setVersion((String) null);
    }

    @Test
    public void test28() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        String string0 = operationDefinition0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test29() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setExperimental((Boolean) null);
    }

    @Test
    public void test30() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Uri uri0 = operationDefinition0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test31() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setRequirements((String) null);
    }

    @Test
    public void test32() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        OperationKind operationKind0 = operationDefinition0.getKind();
        assertNull(operationKind0);
    }

    @Test
    public void test33() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        Code code0 = operationDefinition0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test34() throws Throwable {
        OperationDefinition operationDefinition0 = new OperationDefinition();
        operationDefinition0.setBase((Reference) null);
    }
}
