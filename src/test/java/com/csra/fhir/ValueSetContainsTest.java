/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:34:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetContainsTest {

    @Test
    public void test00() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        java.util.List<ValueSetContains> list0 = valueSetContains0.getContains();
        java.util.List<ValueSetContains> list1 = valueSetContains0.getContains();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        Boolean boolean0 = valueSetContains0.getAbstract();
        assertNull(boolean0);
    }

    @Test
    public void test02() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        String string0 = valueSetContains0.getDisplay();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        valueSetContains0.setDisplay((String) null);
        assertNull(valueSetContains0.getId());
    }

    @Test
    public void test04() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        valueSetContains0.setVersion((String) null);
        assertNull(valueSetContains0.getId());
    }

    @Test
    public void test05() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        String string0 = valueSetContains0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test06() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        Uri uri0 = valueSetContains0.getSystem();
        assertNull(uri0);
    }

    @Test
    public void test07() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        valueSetContains0.setSystem((Uri) null);
        assertNull(valueSetContains0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        valueSetContains0.setCode((Code) null);
        assertNull(valueSetContains0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        Code code0 = valueSetContains0.getCode();
        assertNull(code0);
    }

    @Test
    public void test10() throws Throwable {
        ValueSetContains valueSetContains0 = new ValueSetContains();
        valueSetContains0.setAbstract((Boolean) null);
    }
}
