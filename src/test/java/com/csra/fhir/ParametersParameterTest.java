/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:54:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ParametersParameterTest {

    @Test
    public void test0() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        parametersParameter0.setValueBooleanOrValueIntegerOrValueDecimal(parametersParameter0);
        assertNull(parametersParameter0.getId());
    }

    @Test
    public void test1() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        ParametersParameter parametersParameter1 = new ParametersParameter();
        parametersParameter1.valueBooleanOrValueIntegerOrValueDecimal = (Element) parametersParameter0;
        ParametersParameter parametersParameter2 = (ParametersParameter) parametersParameter1.getValueBooleanOrValueIntegerOrValueDecimal();
        assertNotSame(parametersParameter1, parametersParameter2);
    }

    @Test
    public void test2() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        java.util.List<ParametersParameter> list0 = parametersParameter0.getPart();
        java.util.List<ParametersParameter> list1 = parametersParameter0.getPart();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test3() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        ResourceContainer resourceContainer0 = parametersParameter0.getResource();
        assertNull(resourceContainer0);
    }

    @Test
    public void test4() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        String string0 = parametersParameter0.getName();
        assertNull(string0);
    }

    @Test
    public void test5() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        Element element0 = parametersParameter0.getValueBooleanOrValueIntegerOrValueDecimal();
        assertNull(element0);
    }

    @Test
    public void test6() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        parametersParameter0.setResource((ResourceContainer) null);
        assertNull(parametersParameter0.getId());
    }

    @Test
    public void test7() throws Throwable {
        ParametersParameter parametersParameter0 = new ParametersParameter();
        parametersParameter0.setName((String) null);
    }
}
