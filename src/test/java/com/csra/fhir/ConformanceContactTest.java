/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:45:26 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConformanceContactTest {

    @Test
    public void test0() throws Throwable {
        ConformanceContact conformanceContact0 = new ConformanceContact();
        java.util.List<ContactPoint> list0 = conformanceContact0.getTelecom();
        java.util.List<ContactPoint> list1 = conformanceContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceContact conformanceContact0 = new ConformanceContact();
        String string0 = conformanceContact0.getName();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        ConformanceContact conformanceContact0 = new ConformanceContact();
        conformanceContact0.setName((String) null);
    }
}
