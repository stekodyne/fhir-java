/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:20:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SearchParameterContactTest {

    @Test
    public void test0() throws Throwable {
        SearchParameterContact searchParameterContact0 = new SearchParameterContact();
        java.util.List<ContactPoint> list0 = searchParameterContact0.getTelecom();
        java.util.List<ContactPoint> list1 = searchParameterContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        SearchParameterContact searchParameterContact0 = new SearchParameterContact();
        searchParameterContact0.setName((String) null);
        assertNull(searchParameterContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        SearchParameterContact searchParameterContact0 = new SearchParameterContact();
        String string0 = searchParameterContact0.getName();
        assertNull(string0);
    }
}
