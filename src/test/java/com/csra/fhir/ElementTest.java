/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:58:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ElementTest {

    @Test
    public void test0() throws Throwable {
        Element element0 = new Element();
        element0.id = "vC%";
        java.lang.String string0 = element0.getId();
        assertEquals("vC%", string0);
    }

    @Test
    public void test1() throws Throwable {
        Element element0 = new Element();
        element0.getExtension();
        java.util.List<Extension> list0 = element0.getExtension();
        assertEquals(0, list0.size());
    }

    @Test
    public void test2() throws Throwable {
        Element element0 = new Element();
        java.lang.String string0 = element0.getId();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        Element element0 = new Element();
        element0.setId("");
        java.lang.String string0 = element0.getId();
        assertEquals("", string0);
    }
}
