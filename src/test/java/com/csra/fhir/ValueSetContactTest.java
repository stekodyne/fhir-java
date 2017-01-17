/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:26:23 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetContactTest {

    @Test
    public void test0() throws Throwable {
        ValueSetContact valueSetContact0 = new ValueSetContact();
        java.util.List<ContactPoint> list0 = valueSetContact0.getTelecom();
        java.util.List<ContactPoint> list1 = valueSetContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ValueSetContact valueSetContact0 = new ValueSetContact();
        valueSetContact0.setName((String) null);
        assertNull(valueSetContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ValueSetContact valueSetContact0 = new ValueSetContact();
        valueSetContact0.getName();
    }
}
