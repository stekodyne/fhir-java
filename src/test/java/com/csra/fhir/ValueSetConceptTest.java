/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:32:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetConceptTest {

    @Test
    public void test0() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        java.util.List<ValueSetConcept> list0 = valueSetConcept0.getConcept();
        java.util.List<ValueSetConcept> list1 = valueSetConcept0.getConcept();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        java.util.List<ValueSetDesignation> list0 = valueSetConcept0.getDesignation();
        java.util.List<ValueSetDesignation> list1 = valueSetConcept0.getDesignation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        valueSetConcept0.setDefinition((String) null);
        assertNull(valueSetConcept0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        valueSetConcept0.setCode((Code) null);
        assertNull(valueSetConcept0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        Code code0 = valueSetConcept0.getCode();
        assertNull(code0);
    }

    @Test
    public void test5() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        valueSetConcept0.setAbstract((Boolean) null);
        assertNull(valueSetConcept0.getId());
    }

    @Test
    public void test6() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        Boolean boolean0 = valueSetConcept0.getAbstract();
        assertNull(boolean0);
    }

    @Test
    public void test7() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        valueSetConcept0.setDisplay((String) null);
        assertNull(valueSetConcept0.getId());
    }

    @Test
    public void test8() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        String string0 = valueSetConcept0.getDefinition();
        assertNull(string0);
    }

    @Test
    public void test9() throws Throwable {
        ValueSetConcept valueSetConcept0 = new ValueSetConcept();
        valueSetConcept0.getDisplay();
    }
}
