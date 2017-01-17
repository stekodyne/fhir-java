/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:17:26 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetCodeSystemTest {

    @Test
    public void test0() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        java.util.List<ValueSetConcept> list0 = valueSetCodeSystem0.getConcept();
        java.util.List<ValueSetConcept> list1 = valueSetCodeSystem0.getConcept();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        valueSetCodeSystem0.setCaseSensitive((Boolean) null);
        assertNull(valueSetCodeSystem0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        Boolean boolean0 = valueSetCodeSystem0.getCaseSensitive();
        assertNull(boolean0);
    }

    @Test
    public void test3() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        valueSetCodeSystem0.setVersion((String) null);
        assertNull(valueSetCodeSystem0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        valueSetCodeSystem0.setSystem((Uri) null);
        assertNull(valueSetCodeSystem0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        String string0 = valueSetCodeSystem0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test6() throws Throwable {
        ValueSetCodeSystem valueSetCodeSystem0 = new ValueSetCodeSystem();
        Uri uri0 = valueSetCodeSystem0.getSystem();
        assertNull(uri0);
    }
}
