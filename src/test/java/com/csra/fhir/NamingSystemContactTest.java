/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:55:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NamingSystemContactTest {

    @Test
    public void test0() throws Throwable {
        NamingSystemContact namingSystemContact0 = new NamingSystemContact();
        java.util.List<ContactPoint> list0 = namingSystemContact0.getTelecom();
        java.util.List<ContactPoint> list1 = namingSystemContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        NamingSystemContact namingSystemContact0 = new NamingSystemContact();
        namingSystemContact0.setName((String) null);
        assertNull(namingSystemContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        NamingSystemContact namingSystemContact0 = new NamingSystemContact();
        namingSystemContact0.getName();
    }
}
