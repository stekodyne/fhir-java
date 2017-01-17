/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:47:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ValueSetComposeTest {

    @Test
    public void test0() throws Throwable {
        ValueSetCompose valueSetCompose0 = new ValueSetCompose();
        java.util.List<ValueSetInclude> list0 = valueSetCompose0.getExclude();
        java.util.List<ValueSetInclude> list1 = valueSetCompose0.getExclude();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetCompose valueSetCompose0 = new ValueSetCompose();
        java.util.List<ValueSetInclude> list0 = valueSetCompose0.getInclude();
        java.util.List<ValueSetInclude> list1 = valueSetCompose0.getInclude();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        ValueSetCompose valueSetCompose0 = new ValueSetCompose();
        java.util.List<Uri> list0 = valueSetCompose0.getImport();
        java.util.List<Uri> list1 = valueSetCompose0.getImport();
        assertSame(list1, list0);
        assertNotNull(list1);
    }
}
