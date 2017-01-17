/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:33:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ColgroupTest {

    @Test
    public void test00() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.width = "";
        colgroup0.getWidth();
    }

    @Test
    public void test01() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.valign = "|";
        colgroup0.getValign();
    }

    @Test
    public void test02() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.valign = "";
        colgroup0.getValign();
    }

    @Test
    public void test03() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.title = "1";
        colgroup0.getTitle();
    }

    @Test
    public void test04() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setTitle("");
        colgroup0.getTitle();
    }

    @Test
    public void test05() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setStyle("");
        colgroup0.getStyle();
    }

    @Test
    public void test06() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmouseup("[1");
        colgroup0.getOnmouseup();
    }

    @Test
    public void test07() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onmouseover = "!D~U[P:wp%S-6HOY2";
        colgroup0.getOnmouseover();
    }

    @Test
    public void test08() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onmouseover = "";
        colgroup0.getOnmouseover();
    }

    @Test
    public void test09() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onmouseout = null;
        colgroup0.onmouseout = "q4";
        colgroup0.getOnmouseout();
    }

    @Test
    public void test10() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmouseout("");
        colgroup0.getOnmouseout();
    }

    @Test
    public void test11() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onmousemove = "{W";
        colgroup0.getOnmousemove();
    }

    @Test
    public void test12() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmousemove("");
        colgroup0.getOnmousemove();
    }

    @Test
    public void test13() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onmousedown = "1";
        colgroup0.getOnmousedown();
    }

    @Test
    public void test14() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmousedown("");
        colgroup0.getOnmousedown();
    }

    @Test
    public void test15() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnkeyup("!=lyG@+");
        colgroup0.getOnkeyup();
    }

    @Test
    public void test16() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnkeyup("");
        colgroup0.getOnkeyup();
    }

    @Test
    public void test17() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnkeypress("_}lA");
        colgroup0.getOnkeypress();
    }

    @Test
    public void test18() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnkeydown("1");
        colgroup0.getOnkeydown();
    }

    @Test
    public void test19() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.onkeydown = "";
        colgroup0.getOnkeydown();
    }

    @Test
    public void test20() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.ondblclick = ">/&|,dwd8ZFs";
        colgroup0.getOndblclick();
    }

    @Test
    public void test21() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.ondblclick = "";
        colgroup0.getOndblclick();
    }

    @Test
    public void test22() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnclick("1");
        colgroup0.getOnclick();
    }

    @Test
    public void test23() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnclick("");
        colgroup0.getOnclick();
    }

    @Test
    public void test24() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setLanguage("; Dl;Mg5a7Q4");
        java.lang.String string0 = colgroup0.getLanguage();
        assertEquals("; Dl;Mg5a7Q4", string0);
    }

    @Test
    public void test25() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.language = "";
        java.lang.String string0 = colgroup0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test26() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setLang(",Sj%");
        java.lang.String string0 = colgroup0.getLang();
        assertEquals(",Sj%", string0);
    }

    @Test
    public void test27() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setId("DLF#)!{xWDL@SJ<;");
        java.lang.String string0 = colgroup0.getId();
        assertEquals("DLF#)!{xWDL@SJ<;", string0);
    }

    @Test
    public void test28() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.id = "!=lyG@+";
        colgroup0.id = "1";
        colgroup0.id = "";
        java.lang.String string0 = colgroup0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test29() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.dir = "zy9#dR ,q8J-UJL;E";
        java.lang.String string0 = colgroup0.getDir();
        assertEquals("zy9#dR ,q8J-UJL;E", string0);
    }

    @Test
    public void test30() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setDir("");
        java.lang.String string0 = colgroup0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test31() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.charoff = "q8yp>";
        java.lang.String string0 = colgroup0.getCharoff();
        assertEquals("q8yp>", string0);
    }

    @Test
    public void test32() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setCharoff("");
        java.lang.String string0 = colgroup0.getCharoff();
        assertEquals("", string0);
    }

    @Test
    public void test33() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setChar("");
        java.lang.String string0 = colgroup0.getChar();
        assertEquals("", string0);
    }

    @Test
    public void test34() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setAlign(")TsL}`;7{=Do~-}BM");
        java.lang.String string0 = colgroup0.getAlign();
        assertEquals(")TsL}`;7{=Do~-}BM", string0);
    }

    @Test
    public void test35() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.align = "";
        java.lang.String string0 = colgroup0.getAlign();
        assertEquals("", string0);
    }

    @Test
    public void test36() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.util.List<java.lang.String> list0 = colgroup0.getClazz();
        java.util.List<java.lang.String> list1 = colgroup0.getClazz();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test37() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        BigInteger bigInteger0 = colgroup0.getSpan();
        colgroup0.span = bigInteger0;
        BigInteger bigInteger1 = colgroup0.getSpan();
        assertEquals(1, bigInteger1.byteValue());
    }

    @Test
    public void test38() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.util.List<Col> list0 = colgroup0.getCol();
        java.util.List<Col> list1 = colgroup0.getCol();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test39() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnkeypress("");
        java.lang.String string0 = colgroup0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test40() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        BigInteger bigInteger0 = colgroup0.getSpan();
        colgroup0.setSpan(bigInteger0);
        assertNull(colgroup0.getOnkeypress());
    }

    @Test
    public void test41() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmouseover("1");
        assertNull(colgroup0.getOnmouseup());
    }

    @Test
    public void test42() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOndblclick("");
        assertNull(colgroup0.getChar());
    }

    @Test
    public void test43() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getDir();
        assertNull(string0);
    }

    @Test
    public void test44() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getId();
        assertNull(string0);
    }

    @Test
    public void test46() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test47() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getLang();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test49() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setWidth("1");
        java.lang.String string0 = colgroup0.getWidth();
        assertEquals("1", string0);
    }

    @Test
    public void test50() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getAlign();
        assertNull(string0);
    }

    @Test
    public void test51() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setChar("1");
        java.lang.String string0 = colgroup0.getChar();
        assertEquals("1", string0);
    }

    @Test
    public void test52() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setOnmouseup("");
        java.lang.String string0 = colgroup0.getOnmouseup();
        assertEquals("", string0);
    }

    @Test
    public void test53() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setStyle("#");
        java.lang.String string0 = colgroup0.getStyle();
        assertEquals("#", string0);
    }

    @Test
    public void test54() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test55() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test56() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getChar();
        assertNull(string0);
    }

    @Test
    public void test57() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getCharoff();
        assertNull(string0);
    }

    @Test
    public void test58() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test59() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setValign("!=lyG@+");
        assertNull(colgroup0.getOnmouseover());
    }

    @Test
    public void test60() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test61() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test62() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getValign();
        assertNull(string0);
    }

    @Test
    public void test63() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test64() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test65() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test66() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test67() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test68() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        colgroup0.setLang("");
        java.lang.String string0 = colgroup0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test69() throws Throwable {
        Colgroup colgroup0 = new Colgroup();
        java.lang.String string0 = colgroup0.getWidth();
        assertNull(string0);
    }
}
