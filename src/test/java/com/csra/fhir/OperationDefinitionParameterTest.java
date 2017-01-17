/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:11:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OperationDefinitionParameterTest {

    @Test
    public void test00() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        java.util.List<OperationDefinitionParameter> list0 = operationDefinitionParameter0.getPart();
        java.util.List<OperationDefinitionParameter> list1 = operationDefinitionParameter0.getPart();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        String string0 = operationDefinitionParameter0.getDocumentation();
        assertNull(string0);
    }

    @Test
    public void test02() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setUse((OperationParameterUse) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test03() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        Reference reference0 = operationDefinitionParameter0.getProfile();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setType((Code) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test05() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        Code code0 = operationDefinitionParameter0.getType();
        assertNull(code0);
    }

    @Test
    public void test06() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setBinding((OperationDefinitionBinding) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test07() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setProfile((Reference) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test08() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        OperationDefinitionBinding operationDefinitionBinding0 = operationDefinitionParameter0.getBinding();
        assertNull(operationDefinitionBinding0);
    }

    @Test
    public void test09() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setName((Code) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test10() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setDocumentation((String) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test11() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        String string0 = operationDefinitionParameter0.getMax();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setMin((Integer) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test13() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        operationDefinitionParameter0.setMax((String) null);
        assertNull(operationDefinitionParameter0.getId());
    }

    @Test
    public void test14() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        Integer integer0 = operationDefinitionParameter0.getMin();
        assertNull(integer0);
    }

    @Test
    public void test15() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        OperationParameterUse operationParameterUse0 = operationDefinitionParameter0.getUse();
        assertNull(operationParameterUse0);
    }

    @Test
    public void test16() throws Throwable {
        OperationDefinitionParameter operationDefinitionParameter0 = new OperationDefinitionParameter();
        Code code0 = operationDefinitionParameter0.getName();
        assertNull(code0);
    }
}
