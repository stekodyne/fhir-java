/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:36:09 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetExpansionTest {

    @Test
    public void test0() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        java.util.List<ValueSetContains> list0 = valueSetExpansion0.getContains();
        java.util.List<ValueSetContains> list1 = valueSetExpansion0.getContains();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        java.util.List<ValueSetParameter> list0 = valueSetExpansion0.getParameter();
        java.util.List<ValueSetParameter> list1 = valueSetExpansion0.getParameter();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        DateTime dateTime0 = valueSetExpansion0.getTimestamp();
        assertNull(dateTime0);
    }

    @Test
    public void test3() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        valueSetExpansion0.setTotal((Integer) null);
        assertNull(valueSetExpansion0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        Integer integer0 = valueSetExpansion0.getTotal();
        assertNull(integer0);
    }

    @Test
    public void test5() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        valueSetExpansion0.setTimestamp((DateTime) null);
        assertNull(valueSetExpansion0.getId());
    }

    @Test
    public void test6() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        valueSetExpansion0.setIdentifier((Uri) null);
        assertNull(valueSetExpansion0.getId());
    }

    @Test
    public void test7() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        valueSetExpansion0.setOffset((Integer) null);
        assertNull(valueSetExpansion0.getId());
    }

    @Test
    public void test8() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        Integer integer0 = valueSetExpansion0.getOffset();
        assertNull(integer0);
    }

    @Test
    public void test9() throws Throwable {
        ValueSetExpansion valueSetExpansion0 = new ValueSetExpansion();
        valueSetExpansion0.getIdentifier();
    }
}
