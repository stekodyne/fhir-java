/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:22:22 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetConcept1Test {

    @Test
    public void test0() throws Throwable {
        ValueSetConcept1 valueSetConcept1_0 = new ValueSetConcept1();
        java.util.List<ValueSetDesignation> list0 = valueSetConcept1_0.getDesignation();
        java.util.List<ValueSetDesignation> list1 = valueSetConcept1_0.getDesignation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetConcept1 valueSetConcept1_0 = new ValueSetConcept1();
        Code code0 = valueSetConcept1_0.getCode();
        assertNull(code0);
    }

    @Test
    public void test2() throws Throwable {
        ValueSetConcept1 valueSetConcept1_0 = new ValueSetConcept1();
        valueSetConcept1_0.setDisplay((String) null);
        assertNull(valueSetConcept1_0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ValueSetConcept1 valueSetConcept1_0 = new ValueSetConcept1();
        String string0 = valueSetConcept1_0.getDisplay();
        assertNull(string0);
    }

    @Test
    public void test4() throws Throwable {
        ValueSetConcept1 valueSetConcept1_0 = new ValueSetConcept1();
        valueSetConcept1_0.setCode((Code) null);
    }
}
