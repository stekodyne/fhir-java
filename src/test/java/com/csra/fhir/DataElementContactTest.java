/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:50:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DataElementContactTest {

    @Test
    public void test0() throws Throwable {
        DataElementContact dataElementContact0 = new DataElementContact();
        java.util.List<ContactPoint> list0 = dataElementContact0.getTelecom();
        java.util.List<ContactPoint> list1 = dataElementContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        DataElementContact dataElementContact0 = new DataElementContact();
        String string0 = dataElementContact0.getName();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        DataElementContact dataElementContact0 = new DataElementContact();
        dataElementContact0.setName((String) null);
        assertNull(dataElementContact0.getId());
    }
}
