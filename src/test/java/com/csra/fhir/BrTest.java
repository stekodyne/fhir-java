/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:21:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BrTest {

    @Test
    public void test00() throws Throwable {
        Br br0 = new Br();
        br0.setTitle("*kt-?.i'{v_RU");
        java.lang.String string0 = br0.getTitle();
        assertEquals("*kt-?.i'{v_RU", string0);
    }

    @Test
    public void test01() throws Throwable {
        Br br0 = new Br();
        br0.style = "gyO#]*X&k3t:TtL:R#[";
        java.lang.String string0 = br0.getStyle();
        assertEquals("gyO#]*X&k3t:TtL:R#[", string0);
    }

    @Test
    public void test02() throws Throwable {
        Br br0 = new Br();
        br0.style = "";
        java.lang.String string0 = br0.getStyle();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Br br0 = new Br();
        br0.setId("");
        java.lang.String string0 = br0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test04() throws Throwable {
        Br br0 = new Br();
        br0.getClazz();
        java.util.List<java.lang.String> list0 = br0.getClazz();
        assertEquals(0, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        Br br0 = new Br();
        br0.setId("L0*6srv");
        java.lang.String string0 = br0.getId();
        assertEquals("L0*6srv", string0);
    }

    @Test
    public void test06() throws Throwable {
        Br br0 = new Br();
        br0.setTitle("");
        java.lang.String string0 = br0.getTitle();
        assertEquals("", string0);
    }

    @Test
    public void test07() throws Throwable {
        Br br0 = new Br();
        br0.setStyle("");
        assertNull(br0.getId());
    }

    @Test
    public void test08() throws Throwable {
        Br br0 = new Br();
        java.lang.String string0 = br0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Br br0 = new Br();
        java.lang.String string0 = br0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        Br br0 = new Br();
        java.lang.String string0 = br0.getId();
        assertNull(string0);
    }
}
