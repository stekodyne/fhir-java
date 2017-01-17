/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:43:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetIncludeTest {

    @Test
    public void test0() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        java.util.List<ValueSetFilter> list0 = valueSetInclude0.getFilter();
        java.util.List<ValueSetFilter> list1 = valueSetInclude0.getFilter();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        java.util.List<ValueSetConcept1> list0 = valueSetInclude0.getConcept();
        java.util.List<ValueSetConcept1> list1 = valueSetInclude0.getConcept();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        valueSetInclude0.setSystem((Uri) null);
        assertNull(valueSetInclude0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        Uri uri0 = valueSetInclude0.getSystem();
        assertNull(uri0);
    }

    @Test
    public void test4() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        valueSetInclude0.setVersion((String) null);
        assertNull(valueSetInclude0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ValueSetInclude valueSetInclude0 = new ValueSetInclude();
        String string0 = valueSetInclude0.getVersion();
        assertNull(string0);
    }
}
