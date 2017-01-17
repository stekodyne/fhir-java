/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:29:00 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class HeadTest {

    @Test
    public void test00() throws Throwable {
        Head head0 = new Head();
        head0.setId("");
        assertNull(head0.getLang());
    }

    @Test
    public void test01() throws Throwable {
        Head head0 = new Head();
        head0.profile = "";
        java.lang.String string0 = head0.getProfile();
        assertEquals("", string0);
    }

    @Test
    public void test02() throws Throwable {
        Head head0 = new Head();
        head0.setLanguage("");
        java.lang.String string0 = head0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Head head0 = new Head();
        head0.setLang("!n-}'d");
        java.lang.String string0 = head0.getLang();
        assertEquals("!n-}'d", string0);
    }

    @Test
    public void test04() throws Throwable {
        Head head0 = new Head();
        head0.setLang("");
        java.lang.String string0 = head0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test05() throws Throwable {
        Head head0 = new Head();
        head0.id = "preserve";
        java.lang.String string0 = head0.getId();
        assertEquals("preserve", string0);
    }

    @Test
    public void test06() throws Throwable {
        Head head0 = new Head();
        head0.id = null;
        head0.id = "";
        java.lang.String string0 = head0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test07() throws Throwable {
        Head head0 = new Head();
        head0.dir = "hK/hdOt8s!";
        java.lang.String string0 = head0.getDir();
        assertEquals("hK/hdOt8s!", string0);
    }

    @Test
    public void test08() throws Throwable {
        Head head0 = new Head();
        head0.dir = "";
        java.lang.String string0 = head0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test09() throws Throwable {
        Head head0 = new Head();
        java.util.List<java.lang.Object> list0 = head0.getTitleAndScriptOrStyle();
        java.util.List<java.lang.Object> list1 = head0.getTitleAndScriptOrStyle();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        Head head0 = new Head();
        java.util.List<java.lang.Object> list0 = head0.getScriptOrStyleOrMeta();
        java.util.List<java.lang.Object> list1 = head0.getScriptOrStyleOrMeta();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test11() throws Throwable {
        Head head0 = new Head();
        java.lang.String string0 = head0.getProfile();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Head head0 = new Head();
        java.lang.String string0 = head0.getId();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Head head0 = new Head();
        java.lang.String string0 = head0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        Head head0 = new Head();
        head0.setLanguage("q'A");
        java.lang.String string0 = head0.getLanguage();
        assertEquals("q'A", string0);
    }

    @Test
    public void test15() throws Throwable {
        Head head0 = new Head();
        head0.setProfile("!n-}'d");
        java.lang.String string0 = head0.getProfile();
        assertEquals("!n-}'d", string0);
    }

    @Test
    public void test16() throws Throwable {
        Head head0 = new Head();
        java.lang.String string0 = head0.getLang();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        Head head0 = new Head();
        head0.setDir(",<.,W#p");
        assertNull(head0.getId());
    }

    @Test
    public void test18() throws Throwable {
        Head head0 = new Head();
        java.lang.String string0 = head0.getDir();
        assertNull(string0);
    }
}
