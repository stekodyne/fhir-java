/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:07:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class FieldsetTest {

    @Test
    public void test00() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setTitle("");
        java.lang.String string0 = fieldset0.getTitle();
        assertEquals("", string0);
    }

    @Test
    public void test01() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.style = "Uk";
        java.lang.String string0 = fieldset0.getStyle();
        assertEquals("Uk", string0);
    }

    @Test
    public void test02() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setStyle("");
        java.lang.String string0 = fieldset0.getStyle();
        assertEquals("", string0);
    }

    @Test
    public void test03() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmouseup("5%");
        java.lang.String string0 = fieldset0.getOnmouseup();
        assertEquals("5%", string0);
    }

    @Test
    public void test04() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmouseup("");
        java.lang.String string0 = fieldset0.getOnmouseup();
        assertEquals("", string0);
    }

    @Test
    public void test05() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onmouseover = "AnX}_";
        java.lang.String string0 = fieldset0.getOnmouseover();
        assertEquals("AnX}_", string0);
    }

    @Test
    public void test06() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onmouseout = "cm,~vvP7,{nCUkp";
        java.lang.String string0 = fieldset0.getOnmouseout();
        assertEquals("cm,~vvP7,{nCUkp", string0);
    }

    @Test
    public void test07() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmousemove("CUy{@Z4,* |");
        java.lang.String string0 = fieldset0.getOnmousemove();
        assertEquals("CUy{@Z4,* |", string0);
    }

    @Test
    public void test08() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onmousemove = "";
        java.lang.String string0 = fieldset0.getOnmousemove();
        assertEquals("", string0);
    }

    @Test
    public void test09() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmousedown("Aa");
        java.lang.String string0 = fieldset0.getOnmousedown();
        assertEquals("Aa", string0);
    }

    @Test
    public void test10() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onkeyup = "Agm|hsuWwC";
        java.lang.String string0 = fieldset0.getOnkeyup();
        assertEquals("Agm|hsuWwC", string0);
    }

    @Test
    public void test11() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onkeypress = "gCJjmQ4";
        java.lang.String string0 = fieldset0.getOnkeypress();
        assertEquals("gCJjmQ4", string0);
    }

    @Test
    public void test12() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnkeydown("gCJjmQ4");
        java.lang.String string0 = fieldset0.getOnkeydown();
        assertEquals("gCJjmQ4", string0);
    }

    @Test
    public void test13() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnkeydown("");
        java.lang.String string0 = fieldset0.getOnkeydown();
        assertEquals("", string0);
    }

    @Test
    public void test14() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.ondblclick = "submit";
        java.lang.String string0 = fieldset0.getOndblclick();
        assertEquals("submit", string0);
    }

    @Test
    public void test15() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnclick("x%'rw)%tz#O;o{");
        java.lang.String string0 = fieldset0.getOnclick();
        assertEquals("x%'rw)%tz#O;o{", string0);
    }

    @Test
    public void test16() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.onclick = "";
        java.lang.String string0 = fieldset0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test17() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.language = "jW<%";
        java.lang.String string0 = fieldset0.getLanguage();
        assertEquals("jW<%", string0);
    }

    @Test
    public void test18() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setLang("get");
        java.lang.String string0 = fieldset0.getLang();
        assertEquals("get", string0);
    }

    @Test
    public void test19() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setId("SJMEmsads<iAofNcW8");
        java.lang.String string0 = fieldset0.getId();
        assertEquals("SJMEmsads<iAofNcW8", string0);
    }

    @Test
    public void test20() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.id = "";
        java.lang.String string0 = fieldset0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test21() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setDir("nt");
        java.lang.String string0 = fieldset0.getDir();
        assertEquals("nt", string0);
    }

    @Test
    public void test22() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.dir = "";
        java.lang.String string0 = fieldset0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test23() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.util.List<java.lang.String> list0 = fieldset0.getClazz();
        java.util.List<java.lang.String> list1 = fieldset0.getClazz();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test24() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.util.List<java.lang.Object> list0 = fieldset0.getContent();
        java.util.List<java.lang.Object> list1 = fieldset0.getContent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test25() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getId();
        assertNull(string0);
    }

    @Test
    public void test26() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnkeyup("");
        java.lang.String string0 = fieldset0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test27() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test28() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmouseout("");
        java.lang.String string0 = fieldset0.getOnmouseout();
        assertEquals("", string0);
    }

    @Test
    public void test29() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getLang();
        assertNull(string0);
    }

    @Test
    public void test30() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnkeypress("");
        java.lang.String string0 = fieldset0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test31() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setLang("");
        java.lang.String string0 = fieldset0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test32() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test33() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getDir();
        assertNull(string0);
    }

    @Test
    public void test34() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmousedown("");
        java.lang.String string0 = fieldset0.getOnmousedown();
        assertEquals("", string0);
    }

    @Test
    public void test35() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test36() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test37() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test38() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test39() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test40() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test41() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOnmouseover("");
        java.lang.String string0 = fieldset0.getOnmouseover();
        assertEquals("", string0);
    }

    @Test
    public void test42() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test43() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test44() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test46() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        java.lang.String string0 = fieldset0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test47() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setOndblclick("");
        java.lang.String string0 = fieldset0.getOndblclick();
        assertEquals("", string0);
    }

    @Test
    public void test48() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setLanguage("");
        java.lang.String string0 = fieldset0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test49() throws Throwable {
        Fieldset fieldset0 = new Fieldset();
        fieldset0.setTitle("']");
        java.lang.String string0 = fieldset0.getTitle();
        assertEquals("']", string0);
    }
}
