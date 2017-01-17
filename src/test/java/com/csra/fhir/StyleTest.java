/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:05:01 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class StyleTest {

    @Test
    public void test00() throws Throwable {
        Style style0 = new Style();
        style0.type = "preserve";
        java.lang.String string0 = style0.getType();
        assertEquals("preserve", string0);
    }

    @Test
    public void test01() throws Throwable {
        Style style0 = new Style();
        style0.setType("");
        java.lang.String string0 = style0.getType();
        assertEquals("", string0);
    }

    @Test
    public void test02() throws Throwable {
        Style style0 = new Style();
        style0.setTitle("");
        java.lang.String string0 = style0.getTitle();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Style style0 = new Style();
        style0.setMedia("T.m@Ef!Z*#\"G-QTA");
        java.lang.String string0 = style0.getMedia();
        assertEquals("T.m@Ef!Z*#\"G-QTA", string0);
    }

    @Test
    public void test04() throws Throwable {
        Style style0 = new Style();
        style0.media = "";
        java.lang.String string0 = style0.getMedia();
        assertEquals("", string0);
    }

    @Test
    public void test05() throws Throwable {
        Style style0 = new Style();
        style0.language = "";
        java.lang.String string0 = style0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test06() throws Throwable {
        Style style0 = new Style();
        style0.setLang("A9c6aD470OB_'9D^qS");
        java.lang.String string0 = style0.getLang();
        assertEquals("A9c6aD470OB_'9D^qS", string0);
    }

    @Test
    public void test07() throws Throwable {
        Style style0 = new Style();
        style0.id = "Mc";
        java.lang.String string0 = style0.getId();
        assertEquals("Mc", string0);
    }

    @Test
    public void test08() throws Throwable {
        Style style0 = new Style();
        style0.dir = "preserve";
        java.lang.String string0 = style0.getDir();
        assertEquals("preserve", string0);
    }

    @Test
    public void test09() throws Throwable {
        Style style0 = new Style();
        style0.dir = "";
        java.lang.String string0 = style0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test10() throws Throwable {
        Style style0 = new Style();
        style0.setContent("z+(v*sT)0)KQM");
        java.lang.String string0 = style0.getContent();
        assertEquals("z+(v*sT)0)KQM", string0);
    }

    @Test
    public void test11() throws Throwable {
        Style style0 = new Style();
        style0.content = "";
        java.lang.String string0 = style0.getContent();
        assertEquals("", string0);
    }

    @Test
    public void test12() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getSpace();
        assertEquals("preserve", string0);
        assertNotNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test15() throws Throwable {
        Style style0 = new Style();
        style0.setSpace("");
        style0.getSpace();
        assertEquals("", style0.getSpace());
    }

    @Test
    public void test16() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getDir();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        Style style0 = new Style();
        style0.setDir("+");
        assertNull(style0.getType());
    }

    @Test
    public void test18() throws Throwable {
        Style style0 = new Style();
        style0.setLang("");
        java.lang.String string0 = style0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test19() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getId();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getContent();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        Style style0 = new Style();
        style0.setId("");
        java.lang.String string0 = style0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test22() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getMedia();
        assertNull(string0);
    }

    @Test
    public void test23() throws Throwable {
        Style style0 = new Style();
        style0.setLanguage("Kg1");
        java.lang.String string0 = style0.getLanguage();
        assertEquals("Kg1", string0);
    }

    @Test
    public void test24() throws Throwable {
        Style style0 = new Style();
        style0.setTitle("+");
        java.lang.String string0 = style0.getTitle();
        assertEquals("+", string0);
    }

    @Test
    public void test25() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getLang();
        assertNull(string0);
    }

    @Test
    public void test26() throws Throwable {
        Style style0 = new Style();
        java.lang.String string0 = style0.getType();
        assertNull(string0);
    }
}
