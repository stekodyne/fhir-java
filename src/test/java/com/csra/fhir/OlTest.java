/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:55:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OlTest {

    @Test
    public void test00() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setDir("d8Q]?zs^J6dGqxA):");
        assertEquals("d8Q]?zs^J6dGqxA):", ol0.getDir());
    }

    @Test
    public void test01() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setTitle("w]?U8ZDa{%~W-");
        java.lang.String string0 = ol0.getTitle();
        assertEquals("w]?U8ZDa{%~W-", string0);
    }

    @Test
    public void test02() throws Throwable {
        Ol ol0 = new Ol();
        ol0.title = "";
        java.lang.String string0 = ol0.getTitle();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Ol ol0 = new Ol();
        ol0.style = "P1LA$;";
        java.lang.String string0 = ol0.getStyle();
        assertEquals("P1LA$;", string0);
    }

    @Test
    public void test04() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setStyle("");
        java.lang.String string0 = ol0.getStyle();
        assertEquals("", string0);
    }

    @Test
    public void test05() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmouseup("QX");
        java.lang.String string0 = ol0.getOnmouseup();
        assertEquals("QX", string0);
    }

    @Test
    public void test06() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmouseup("");
        java.lang.String string0 = ol0.getOnmouseup();
        assertEquals("", string0);
    }

    @Test
    public void test07() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmouseover("r8x0^2ItdTy`@H+fag");
        java.lang.String string0 = ol0.getOnmouseover();
        assertEquals("r8x0^2ItdTy`@H+fag", string0);
    }

    @Test
    public void test08() throws Throwable {
        Ol ol0 = new Ol();
        ol0.onmouseover = "";
        java.lang.String string0 = ol0.getOnmouseover();
        assertEquals("", string0);
    }

    @Test
    public void test09() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmouseout("t`r#Q[,gk");
        java.lang.String string0 = ol0.getOnmouseout();
        assertEquals("t`r#Q[,gk", string0);
    }

    @Test
    public void test10() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmousemove("keYW{\"%R*HPa(4ySn%N");
        java.lang.String string0 = ol0.getOnmousemove();
        assertEquals("keYW{\"%R*HPa(4ySn%N", string0);
    }

    @Test
    public void test11() throws Throwable {
        Ol ol0 = new Ol();
        ol0.onmousemove = "";
        java.lang.String string0 = ol0.getOnmousemove();
        assertEquals("", string0);
    }

    @Test
    public void test12() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmousedown("e");
        java.lang.String string0 = ol0.getOnmousedown();
        assertEquals("e", string0);
    }

    @Test
    public void test13() throws Throwable {
        Ol ol0 = new Ol();
        ol0.onmousedown = "";
        java.lang.String string0 = ol0.getOnmousedown();
        assertEquals("", string0);
    }

    @Test
    public void test14() throws Throwable {
        Ol ol0 = new Ol();
        ol0.onkeyup = "~hcZYF),^T`mM";
        java.lang.String string0 = ol0.getOnkeyup();
        assertEquals("~hcZYF),^T`mM", string0);
    }

    @Test
    public void test15() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnkeypress("e");
        java.lang.String string0 = ol0.getOnkeypress();
        assertEquals("e", string0);
    }

    @Test
    public void test16() throws Throwable {
        Ol ol0 = new Ol();
        ol0.onkeypress = "";
        java.lang.String string0 = ol0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test17() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnkeydown("udDwK-H:TE9fg!{x");
        java.lang.String string0 = ol0.getOnkeydown();
        assertEquals("udDwK-H:TE9fg!{x", string0);
    }

    @Test
    public void test18() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnkeydown("");
        java.lang.String string0 = ol0.getOnkeydown();
        assertEquals("", string0);
    }

    @Test
    public void test19() throws Throwable {
        Ol ol0 = new Ol();
        ol0.ondblclick = "I_FI|1";
        java.lang.String string0 = ol0.getOndblclick();
        assertEquals("I_FI|1", string0);
    }

    @Test
    public void test20() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOndblclick("");
        java.lang.String string0 = ol0.getOndblclick();
        assertEquals("", string0);
    }

    @Test
    public void test21() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnclick("(q");
        java.lang.String string0 = ol0.getOnclick();
        assertEquals("(q", string0);
    }

    @Test
    public void test22() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setLanguage("%G");
        java.lang.String string0 = ol0.getLanguage();
        assertEquals("%G", string0);
    }

    @Test
    public void test23() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setLang("69YdP");
        java.lang.String string0 = ol0.getLang();
        assertEquals("69YdP", string0);
    }

    @Test
    public void test24() throws Throwable {
        Ol ol0 = new Ol();
        ol0.lang = "";
        java.lang.String string0 = ol0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test25() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setId("Aj/#[,t.J[+38Wx");
        java.lang.String string0 = ol0.getId();
        assertEquals("Aj/#[,t.J[+38Wx", string0);
    }

    @Test
    public void test26() throws Throwable {
        Ol ol0 = new Ol();
        ol0.id = "";
        java.lang.String string0 = ol0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test27() throws Throwable {
        Ol ol0 = new Ol();
        ol0.dir = "Ly_wY:]";
        java.lang.String string0 = ol0.getDir();
        assertEquals("Ly_wY:]", string0);
    }

    @Test
    public void test28() throws Throwable {
        Ol ol0 = new Ol();
        ol0.dir = "";
        java.lang.String string0 = ol0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test29() throws Throwable {
        Ol ol0 = new Ol();
        java.util.List<java.lang.String> list0 = ol0.getClazz();
        java.util.List<java.lang.String> list1 = ol0.getClazz();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test30() throws Throwable {
        Ol ol0 = new Ol();
        java.util.List<Li> list0 = ol0.getLi();
        java.util.List<Li> list1 = ol0.getLi();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test31() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test32() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test33() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test34() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test35() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test36() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test37() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test38() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test39() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test40() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnclick("");
        java.lang.String string0 = ol0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test41() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test42() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnmouseout("");
        java.lang.String string0 = ol0.getOnmouseout();
        assertEquals("", string0);
    }

    @Test
    public void test43() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test44() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getId();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setOnkeyup("");
        java.lang.String string0 = ol0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test46() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test47() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getLang();
        assertNull(string0);
    }

    @Test
    public void test49() throws Throwable {
        Ol ol0 = new Ol();
        java.lang.String string0 = ol0.getDir();
        assertNull(string0);
    }

    @Test
    public void test50() throws Throwable {
        Ol ol0 = new Ol();
        ol0.setLanguage("");
        java.lang.String string0 = ol0.getLanguage();
        assertEquals("", string0);
    }
}
