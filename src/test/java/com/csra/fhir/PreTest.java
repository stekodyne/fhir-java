/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:25:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PreTest {

    @Test
    public void test00() throws Throwable {
        Pre pre0 = new Pre();
        pre0.title = "preserve";
        pre0.getTitle();
    }

    @Test
    public void test01() throws Throwable {
        Pre pre0 = new Pre();
        pre0.title = "";
        pre0.getTitle();
    }

    @Test
    public void test02() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setStyle("!");
        pre0.getStyle();
    }

    @Test
    public void test03() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onmouseup = "(mQE=6Gfq";
        pre0.getOnmouseup();
    }

    @Test
    public void test04() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onmouseup = "";
        pre0.getOnmouseup();
    }

    @Test
    public void test05() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmouseover("preserve");
        pre0.getOnmouseover();
    }

    @Test
    public void test06() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onmouseover = "";
        pre0.getOnmouseover();
    }

    @Test
    public void test07() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onmouseout = "+wl0TlmA{L-va9";
        pre0.getOnmouseout();
    }

    @Test
    public void test08() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmousemove("AVTGz/!ex0S!It");
        java.lang.String string0 = pre0.getOnmousemove();
        assertEquals("AVTGz/!ex0S!It", string0);
    }

    @Test
    public void test09() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmousemove("");
        java.lang.String string0 = pre0.getOnmousemove();
        assertEquals("", string0);
    }

    @Test
    public void test10() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmousedown("*CKs}{Yogl}.sIJS<");
        java.lang.String string0 = pre0.getOnmousedown();
        assertEquals("*CKs}{Yogl}.sIJS<", string0);
    }

    @Test
    public void test11() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onmousedown = "";
        java.lang.String string0 = pre0.getOnmousedown();
        assertEquals("", string0);
    }

    @Test
    public void test12() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnkeyup("-E,c3;)}qS]lNK?Ggg");
        java.lang.String string0 = pre0.getOnkeyup();
        assertEquals("-E,c3;)}qS]lNK?Ggg", string0);
    }

    @Test
    public void test13() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onkeypress = "o<vtTN_8";
        java.lang.String string0 = pre0.getOnkeypress();
        assertEquals("o<vtTN_8", string0);
    }

    @Test
    public void test14() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onkeydown = "(_r#yQ";
        java.lang.String string0 = pre0.getOnkeydown();
        assertEquals("(_r#yQ", string0);
    }

    @Test
    public void test15() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onkeydown = "";
        java.lang.String string0 = pre0.getOnkeydown();
        assertEquals("", string0);
    }

    @Test
    public void test16() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOndblclick("}?|Bk>gBaZBskfc+iUF");
        java.lang.String string0 = pre0.getOndblclick();
        assertEquals("}?|Bk>gBaZBskfc+iUF", string0);
    }

    @Test
    public void test17() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOndblclick("");
        java.lang.String string0 = pre0.getOndblclick();
        assertEquals("", string0);
    }

    @Test
    public void test18() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onclick = "Fl| k; yGw[6";
        java.lang.String string0 = pre0.getOnclick();
        assertEquals("Fl| k; yGw[6", string0);
    }

    @Test
    public void test19() throws Throwable {
        Pre pre0 = new Pre();
        pre0.onclick = "";
        java.lang.String string0 = pre0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test20() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setLanguage("");
        java.lang.String string0 = pre0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test21() throws Throwable {
        Pre pre0 = new Pre();
        pre0.lang = "<)";
        java.lang.String string0 = pre0.getLang();
        assertEquals("<)", string0);
    }

    @Test
    public void test22() throws Throwable {
        Pre pre0 = new Pre();
        pre0.lang = "";
        java.lang.String string0 = pre0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test23() throws Throwable {
        Pre pre0 = new Pre();
        pre0.id = "+wl0TlmA{L-va9";
        java.lang.String string0 = pre0.getId();
        assertEquals("+wl0TlmA{L-va9", string0);
    }

    @Test
    public void test24() throws Throwable {
        Pre pre0 = new Pre();
        pre0.id = "";
        java.lang.String string0 = pre0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test25() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setDir("`H+)");
        java.lang.String string0 = pre0.getDir();
        assertEquals("`H+)", string0);
    }

    @Test
    public void test26() throws Throwable {
        Pre pre0 = new Pre();
        pre0.dir = "";
        java.lang.String string0 = pre0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test27() throws Throwable {
        Pre pre0 = new Pre();
        java.util.List<java.lang.String> list0 = pre0.getClazz();
        java.util.List<java.lang.String> list1 = pre0.getClazz();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test28() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getSpace();
        assertNotNull(string0);
        assertEquals("preserve", string0);
    }

    @Test
    public void test29() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test30() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test31() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test32() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnkeyup("");
        java.lang.String string0 = pre0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test33() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getDir();
        assertNull(string0);
    }

    @Test
    public void test34() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setLang("preserve");
        assertNull(pre0.getLanguage());
    }

    @Test
    public void test35() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnclick("QODohR;M1j&TG8O}");
        assertNull(pre0.getOnkeydown());
    }

    @Test
    public void test36() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnkeypress("");
        java.lang.String string0 = pre0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test37() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test38() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test39() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnkeydown("");
        assertNull(pre0.getDir());
    }

    @Test
    public void test40() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setTitle("");
        assertNull(pre0.getOndblclick());
    }

    @Test
    public void test41() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmouseout("");
        java.lang.String string0 = pre0.getOnmouseout();
        assertEquals("", string0);
    }

    @Test
    public void test42() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test43() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setOnmouseup("");
        assertNull(pre0.getOndblclick());
    }

    @Test
    public void test44() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setSpace("");
        pre0.getSpace();
        assertEquals("", pre0.getSpace());
    }

    @Test
    public void test46() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test47() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setStyle("");
        java.lang.String string0 = pre0.getStyle();
        assertEquals("", string0);
    }

    @Test
    public void test49() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setLanguage("QODohR;M1j&TG8O}");
        java.lang.String string0 = pre0.getLanguage();
        assertEquals("QODohR;M1j&TG8O}", string0);
    }

    @Test
    public void test50() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test51() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test52() throws Throwable {
        Pre pre0 = new Pre();
        pre0.setId("preserve");
        assertNull(pre0.getStyle());
    }

    @Test
    public void test53() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getLang();
        assertNull(string0);
    }

    @Test
    public void test54() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getId();
        assertNull(string0);
    }

    @Test
    public void test55() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test56() throws Throwable {
        Pre pre0 = new Pre();
        java.lang.String string0 = pre0.getOnkeypress();
        assertNull(string0);
    }
}
