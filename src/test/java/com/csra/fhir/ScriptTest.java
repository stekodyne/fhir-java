/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:53:26 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ScriptTest {

    @Test
    public void test00() throws Throwable {
        Script script0 = new Script();
        script0.setType("I56ogn");
        java.lang.String string0 = script0.getType();
        assertEquals("I56ogn", string0);
    }

    @Test
    public void test01() throws Throwable {
        Script script0 = new Script();
        script0.src = "pss2qK/oPn8+";
        java.lang.String string0 = script0.getSrc();
        assertEquals("pss2qK/oPn8+", string0);
    }

    @Test
    public void test02() throws Throwable {
        Script script0 = new Script();
        script0.src = "";
        java.lang.String string0 = script0.getSrc();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Script script0 = new Script();
        script0.space = "";
        script0.getSpace();
        assertEquals("", script0.getSpace());
    }

    @Test
    public void test04() throws Throwable {
        Script script0 = new Script();
        script0.id = "Y+/RpD1R(?";
        java.lang.String string0 = script0.getId();
        assertEquals("Y+/RpD1R(?", string0);
    }

    @Test
    public void test05() throws Throwable {
        Script script0 = new Script();
        script0.defer = "n@";
        java.lang.String string0 = script0.getDefer();
        assertEquals("n@", string0);
    }

    @Test
    public void test06() throws Throwable {
        Script script0 = new Script();
        script0.setContent("gw3hQzAO.\"5/I#,");
        java.lang.String string0 = script0.getContent();
        assertEquals("gw3hQzAO.\"5/I#,", string0);
    }

    @Test
    public void test07() throws Throwable {
        Script script0 = new Script();
        script0.content = "";
        java.lang.String string0 = script0.getContent();
        assertEquals("", string0);
    }

    @Test
    public void test08() throws Throwable {
        Script script0 = new Script();
        script0.setCharset("");
        java.lang.String string0 = script0.getCharset();
        assertEquals("", string0);
    }

    @Test
    public void test09() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getSpace();
        assertNotNull(string0);
        assertEquals("preserve", string0);
    }

    @Test
    public void test10() throws Throwable {
        Script script0 = new Script();
        script0.setSpace("u<GmgNarw#xC1O4");
        script0.getSpace();
        assertEquals("u<GmgNarw#xC1O4", script0.getSpace());
    }

    @Test
    public void test11() throws Throwable {
        Script script0 = new Script();
        script0.setCharset("h-^FEXxl}oq{c\"Rm");
        java.lang.String string0 = script0.getCharset();
        assertEquals("h-^FEXxl}oq{c\"Rm", string0);
    }

    @Test
    public void test12() throws Throwable {
        Script script0 = new Script();
        script0.setSrc("2o-\")?u\u00039< RK(V9");
        assertNull(script0.getType());
    }

    @Test
    public void test13() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getContent();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getType();
        assertNull(string0);
    }

    @Test
    public void test15() throws Throwable {
        Script script0 = new Script();
        script0.setType("");
        java.lang.String string0 = script0.getType();
        assertEquals("", string0);
    }

    @Test
    public void test16() throws Throwable {
        Script script0 = new Script();
        script0.setId("");
        java.lang.String string0 = script0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test17() throws Throwable {
        Script script0 = new Script();
        script0.setDefer("");
        java.lang.String string0 = script0.getDefer();
        assertEquals("", string0);
    }

    @Test
    public void test18() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getDefer();
        assertNull(string0);
    }

    @Test
    public void test19() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getSrc();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getCharset();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        Script script0 = new Script();
        java.lang.String string0 = script0.getId();
        assertNull(string0);
    }
}
