/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:32:08 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BaseTest {

    @Test
    public void test0() throws Throwable {
        Base base0 = new Base();
        base0.setId("");
        assertNull(base0.getHref());
    }

    @Test
    public void test1() throws Throwable {
        Base base0 = new Base();
        base0.id = "jhvC_s;pPj!6uYln\"";
        java.lang.String string0 = base0.getId();
        assertEquals("jhvC_s;pPj!6uYln\"", string0);
    }

    @Test
    public void test2() throws Throwable {
        Base base0 = new Base();
        base0.id = null;
        base0.id = "";
        java.lang.String string0 = base0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test3() throws Throwable {
        Base base0 = new Base();
        base0.setHref("9oDdYu& [fI*");
        java.lang.String string0 = base0.getHref();
        assertEquals("9oDdYu& [fI*", string0);
    }

    @Test
    public void test4() throws Throwable {
        Base base0 = new Base();
        base0.setHref("");
        java.lang.String string0 = base0.getHref();
        assertEquals("", string0);
    }

    @Test
    public void test5() throws Throwable {
        Base base0 = new Base();
        java.lang.String string0 = base0.getHref();
        assertNull(string0);
    }

    @Test
    public void test6() throws Throwable {
        Base base0 = new Base();
        java.lang.String string0 = base0.getId();
        assertNull(string0);
    }
}
