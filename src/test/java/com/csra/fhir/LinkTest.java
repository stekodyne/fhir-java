/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:33:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class LinkTest {

    @Test
    public void test00() throws Throwable {
        Link link0 = new Link();
        link0.getRel();
        link0.getRev();
    }

    @Test
    public void test01() throws Throwable {
        Link link0 = new Link();
        link0.setType("e8@Q;9z sX*R\"F:");
        link0.getType();
    }

    @Test
    public void test02() throws Throwable {
        Link link0 = new Link();
        link0.type = "";
        link0.getType();
    }

    @Test
    public void test03() throws Throwable {
        Link link0 = new Link();
        link0.setTitle(")d:[H:y6G1z`-@t");
        link0.getTitle();
    }

    @Test
    public void test04() throws Throwable {
        Link link0 = new Link();
        link0.title = "";
        link0.getTitle();
    }

    @Test
    public void test05() throws Throwable {
        Link link0 = new Link();
        link0.setStyle("/rT");
        link0.getStyle();
    }

    @Test
    public void test06() throws Throwable {
        Link link0 = new Link();
        link0.setOnmouseup("+@WY(Tm");
        link0.getOnmouseup();
    }

    @Test
    public void test07() throws Throwable {
        Link link0 = new Link();
        link0.onmouseover = "UK2);)$03a6(]<W1*Vj";
        link0.getOnmouseover();
    }

    @Test
    public void test08() throws Throwable {
        Link link0 = new Link();
        link0.setOnmouseover("");
        link0.getOnmouseover();
    }

    @Test
    public void test09() throws Throwable {
        Link link0 = new Link();
        link0.setOnmouseout("o<qg?f,dWQDRQB-c:00");
        link0.getOnmouseout();
    }

    @Test
    public void test10() throws Throwable {
        Link link0 = new Link();
        link0.onmouseout = "";
        link0.getOnmouseout();
    }

    @Test
    public void test11() throws Throwable {
        Link link0 = new Link();
        link0.setOnmousemove("#%m/`S`o<v:");
        java.lang.String string0 = link0.getOnmousemove();
        assertEquals("#%m/`S`o<v:", string0);
    }

    @Test
    public void test12() throws Throwable {
        Link link0 = new Link();
        link0.onmousemove = "";
        java.lang.String string0 = link0.getOnmousemove();
        assertEquals("", string0);
    }

    @Test
    public void test13() throws Throwable {
        Link link0 = new Link();
        link0.onmousedown = "%:NQ";
        java.lang.String string0 = link0.getOnmousedown();
        assertEquals("%:NQ", string0);
    }

    @Test
    public void test14() throws Throwable {
        Link link0 = new Link();
        link0.setOnmousedown("");
        java.lang.String string0 = link0.getOnmousedown();
        assertEquals("", string0);
    }

    @Test
    public void test15() throws Throwable {
        Link link0 = new Link();
        link0.onkeyup = "1bjND#Fu oWp0 %}^p";
        java.lang.String string0 = link0.getOnkeyup();
        assertEquals("1bjND#Fu oWp0 %}^p", string0);
    }

    @Test
    public void test16() throws Throwable {
        Link link0 = new Link();
        link0.setOnkeypress(" PKd");
        java.lang.String string0 = link0.getOnkeypress();
        assertEquals(" PKd", string0);
    }

    @Test
    public void test17() throws Throwable {
        Link link0 = new Link();
        link0.setOnkeydown("+(XtVG$SJ");
        java.lang.String string0 = link0.getOnkeydown();
        assertEquals("+(XtVG$SJ", string0);
    }

    @Test
    public void test18() throws Throwable {
        Link link0 = new Link();
        link0.ondblclick = "+A0K1*<1dIV-O[%Q;s";
        java.lang.String string0 = link0.getOndblclick();
        assertEquals("+A0K1*<1dIV-O[%Q;s", string0);
    }

    @Test
    public void test19() throws Throwable {
        Link link0 = new Link();
        link0.setOndblclick("");
        java.lang.String string0 = link0.getOndblclick();
        assertEquals("", string0);
    }

    @Test
    public void test20() throws Throwable {
        Link link0 = new Link();
        link0.onclick = "#\"n_?q|Rf%vqZbU/%c";
        java.lang.String string0 = link0.getOnclick();
        assertEquals("#\"n_?q|Rf%vqZbU/%c", string0);
    }

    @Test
    public void test21() throws Throwable {
        Link link0 = new Link();
        link0.onclick = "";
        java.lang.String string0 = link0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test22() throws Throwable {
        Link link0 = new Link();
        link0.setMedia("y.%-;^");
        java.lang.String string0 = link0.getMedia();
        assertEquals("y.%-;^", string0);
    }

    @Test
    public void test23() throws Throwable {
        Link link0 = new Link();
        link0.setLanguage("{/$%=RWSx_");
        java.lang.String string0 = link0.getLanguage();
        assertEquals("{/$%=RWSx_", string0);
    }

    @Test
    public void test24() throws Throwable {
        Link link0 = new Link();
        link0.setLang("6~T=({gb");
        java.lang.String string0 = link0.getLang();
        assertEquals("6~T=({gb", string0);
    }

    @Test
    public void test25() throws Throwable {
        Link link0 = new Link();
        link0.lang = "";
        java.lang.String string0 = link0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test26() throws Throwable {
        Link link0 = new Link();
        link0.id = "E#Ol&'O";
        java.lang.String string0 = link0.getId();
        assertEquals("E#Ol&'O", string0);
    }

    @Test
    public void test27() throws Throwable {
        Link link0 = new Link();
        link0.hreflang = "\"01tCnQ";
        java.lang.String string0 = link0.getHreflang();
        assertEquals("\"01tCnQ", string0);
    }

    @Test
    public void test28() throws Throwable {
        Link link0 = new Link();
        link0.hreflang = "";
        java.lang.String string0 = link0.getHreflang();
        assertEquals("", string0);
    }

    @Test
    public void test29() throws Throwable {
        Link link0 = new Link();
        link0.href = "1Q{2XA*{Zb[i";
        java.lang.String string0 = link0.getHref();
        assertEquals("1Q{2XA*{Zb[i", string0);
    }

    @Test
    public void test30() throws Throwable {
        Link link0 = new Link();
        link0.setHref("");
        java.lang.String string0 = link0.getHref();
        assertEquals("", string0);
    }

    @Test
    public void test31() throws Throwable {
        Link link0 = new Link();
        link0.dir = "}K";
        java.lang.String string0 = link0.getDir();
        assertEquals("}K", string0);
    }

    @Test
    public void test32() throws Throwable {
        Link link0 = new Link();
        link0.dir = "";
        java.lang.String string0 = link0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test33() throws Throwable {
        Link link0 = new Link();
        link0.setCharset("5i[P#n\"");
        java.lang.String string0 = link0.getCharset();
        assertEquals("5i[P#n\"", string0);
    }

    @Test
    public void test34() throws Throwable {
        Link link0 = new Link();
        link0.charset = "";
        java.lang.String string0 = link0.getCharset();
        assertEquals("", string0);
    }

    @Test
    public void test35() throws Throwable {
        Link link0 = new Link();
        java.util.List<java.lang.String> list0 = link0.getClazz();
        java.util.List<java.lang.String> list1 = link0.getClazz();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test36() throws Throwable {
        Link link0 = new Link();
        java.util.List<java.lang.String> list0 = link0.getRel();
        assertNotNull(list0);

        link0.rev = list0;
        java.util.List<java.lang.String> list1 = link0.getRev();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test37() throws Throwable {
        Link link0 = new Link();
        java.util.List<java.lang.String> list0 = link0.getRel();
        java.util.List<java.lang.String> list1 = link0.getRel();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test38() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test39() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getMedia();
        assertNull(string0);
    }

    @Test
    public void test40() throws Throwable {
        Link link0 = new Link();
        link0.setLanguage("");
        java.lang.String string0 = link0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test41() throws Throwable {
        Link link0 = new Link();
        link0.setOnkeyup("");
        java.lang.String string0 = link0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test42() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test43() throws Throwable {
        Link link0 = new Link();
        link0.setHreflang("");
        assertNull(link0.getOnclick());
    }

    @Test
    public void test44() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getDir();
        assertNull(string0);
    }

    @Test
    public void test46() throws Throwable {
        Link link0 = new Link();
        link0.setOnkeypress("");
        java.lang.String string0 = link0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test47() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getHref();
        assertNull(string0);
    }

    @Test
    public void test49() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test50() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getHreflang();
        assertNull(string0);
    }

    @Test
    public void test51() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test52() throws Throwable {
        Link link0 = new Link();
        link0.setStyle("");
        java.lang.String string0 = link0.getStyle();
        assertEquals("", string0);
    }

    @Test
    public void test53() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test54() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test55() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test56() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getLang();
        assertNull(string0);
    }

    @Test
    public void test57() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getType();
        assertNull(string0);
    }

    @Test
    public void test58() throws Throwable {
        Link link0 = new Link();
        link0.setOnmouseup("");
        java.lang.String string0 = link0.getOnmouseup();
        assertEquals("", string0);
    }

    @Test
    public void test59() throws Throwable {
        Link link0 = new Link();
        link0.setDir("");
        assertNull(link0.getHref());
    }

    @Test
    public void test60() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test61() throws Throwable {
        Link link0 = new Link();
        link0.setId("");
        java.lang.String string0 = link0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test62() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getId();
        assertNull(string0);
    }

    @Test
    public void test63() throws Throwable {
        Link link0 = new Link();
        link0.setOnkeydown("");
        java.lang.String string0 = link0.getOnkeydown();
        assertEquals("", string0);
    }

    @Test
    public void test64() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test65() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test66() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test67() throws Throwable {
        Link link0 = new Link();
        link0.setMedia("");
        java.lang.String string0 = link0.getMedia();
        assertEquals("", string0);
    }

    @Test
    public void test68() throws Throwable {
        Link link0 = new Link();
        link0.setOnclick("");
        assertNull(link0.getLang());
    }

    @Test
    public void test69() throws Throwable {
        Link link0 = new Link();
        java.lang.String string0 = link0.getCharset();
        assertNull(string0);
    }
}
