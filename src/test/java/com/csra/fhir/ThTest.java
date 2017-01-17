/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:11:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.math.BigInteger;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ThTest {

    @Test
    public void test00() throws Throwable {
        Th th0 = new Th();
        th0.setOnmousemove("");
    }

    @Test
    public void test01() throws Throwable {
        Th th0 = new Th();
        th0.valign = "?";
        th0.getValign();
    }

    @Test
    public void test02() throws Throwable {
        Th th0 = new Th();
        th0.valign = "";
        th0.getValign();
    }

    @Test
    public void test03() throws Throwable {
        Th th0 = new Th();
        th0.setTitle("");
        th0.getTitle();
    }

    @Test
    public void test04() throws Throwable {
        Th th0 = new Th();
        th0.style = "N";
        th0.getStyle();
    }

    @Test
    public void test05() throws Throwable {
        Th th0 = new Th();
        th0.style = "";
        th0.getStyle();
    }

    @Test
    public void test06() throws Throwable {
        Th th0 = new Th();
        Scope scope0 = Scope.ROW;
        th0.scope = scope0;
        th0.getScope();
    }

    @Test
    public void test07() throws Throwable {
        Th th0 = new Th();
        Scope scope0 = Scope.COLGROUP;
        th0.setScope(scope0);
        th0.getScope();
    }

    @Test
    public void test08() throws Throwable {
        Th th0 = new Th();
        th0.setOnmouseup("COLGROUP");
        th0.getOnmouseup();
    }

    @Test
    public void test09() throws Throwable {
        Th th0 = new Th();
        th0.onmouseup = "";
        th0.getOnmouseup();
    }

    @Test
    public void test10() throws Throwable {
        Th th0 = new Th();
        th0.onmouseover = "]wMF<2GF}V3ZJ";
        th0.getOnmouseover();
    }

    @Test
    public void test11() throws Throwable {
        Th th0 = new Th();
        th0.setOnmouseover("");
        th0.getOnmouseover();
    }

    @Test
    public void test12() throws Throwable {
        Th th0 = new Th();
        th0.setOnmouseout("Oz`E3uUNL");
        th0.getOnmouseout();
    }

    @Test
    public void test13() throws Throwable {
        Th th0 = new Th();
        th0.setOnmouseout("");
        th0.getOnmouseout();
    }

    @Test
    public void test14() throws Throwable {
        Th th0 = new Th();
        th0.onmousemove = "F";
        java.lang.String string0 = th0.getOnmousemove();
        assertEquals("F", string0);
    }

    @Test
    public void test15() throws Throwable {
        Th th0 = new Th();
        th0.onmousemove = "";
        java.lang.String string0 = th0.getOnmousemove();
        assertEquals("", string0);
    }

    @Test
    public void test16() throws Throwable {
        Th th0 = new Th();
        th0.setOnmousedown("get");
        java.lang.String string0 = th0.getOnmousedown();
        assertEquals("get", string0);
    }

    @Test
    public void test17() throws Throwable {
        Th th0 = new Th();
        th0.onmousedown = "";
        java.lang.String string0 = th0.getOnmousedown();
        assertEquals("", string0);
    }

    @Test
    public void test18() throws Throwable {
        Th th0 = new Th();
        th0.setOnkeyup(".h\"rD:$Yfz=Q]hl");
        java.lang.String string0 = th0.getOnkeyup();
        assertEquals(".h\"rD:$Yfz=Q]hl", string0);
    }

    @Test
    public void test19() throws Throwable {
        Th th0 = new Th();
        th0.onkeyup = "";
        java.lang.String string0 = th0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test20() throws Throwable {
        Th th0 = new Th();
        th0.setOnkeypress(",Seja9zJU[|;l(PC0");
        java.lang.String string0 = th0.getOnkeypress();
        assertEquals(",Seja9zJU[|;l(PC0", string0);
    }

    @Test
    public void test21() throws Throwable {
        Th th0 = new Th();
        th0.setOnkeydown("uh6?k{1n2$9W+@e");
        java.lang.String string0 = th0.getOnkeydown();
        assertNotNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        Th th0 = new Th();
        th0.setOnkeydown("");
        java.lang.String string0 = th0.getOnkeydown();
        assertEquals("", string0);
    }

    @Test
    public void test23() throws Throwable {
        Th th0 = new Th();
        th0.ondblclick = "ROWGROUP";
        java.lang.String string0 = th0.getOndblclick();
        assertEquals("ROWGROUP", string0);
    }

    @Test
    public void test24() throws Throwable {
        Th th0 = new Th();
        th0.onclick = "$VALUES";
        java.lang.String string0 = th0.getOnclick();
        assertEquals("$VALUES", string0);
    }

    @Test
    public void test25() throws Throwable {
        Th th0 = new Th();
        th0.language = "0zdg%";
        java.lang.String string0 = th0.getLanguage();
        assertEquals("0zdg%", string0);
    }

    @Test
    public void test26() throws Throwable {
        Th th0 = new Th();
        th0.setLang("`Fs9novKC$y$&x'2ID");
        java.lang.String string0 = th0.getLang();
        assertEquals("`Fs9novKC$y$&x'2ID", string0);
    }

    @Test
    public void test27() throws Throwable {
        Th th0 = new Th();
        th0.lang = "";
        java.lang.String string0 = th0.getLang();
        assertEquals("", string0);
    }

    @Test
    public void test28() throws Throwable {
        Th th0 = new Th();
        th0.setId("_E9B8");
        java.lang.String string0 = th0.getId();
        assertEquals("_E9B8", string0);
    }

    @Test
    public void test29() throws Throwable {
        Th th0 = new Th();
        th0.id = "";
        java.lang.String string0 = th0.getId();
        assertEquals("", string0);
    }

    @Test
    public void test30() throws Throwable {
        Th th0 = new Th();
        th0.dir = " }";
        java.lang.String string0 = th0.getDir();
        assertEquals(" }", string0);
    }

    @Test
    public void test31() throws Throwable {
        Th th0 = new Th();
        th0.setDir("");
        java.lang.String string0 = th0.getDir();
        assertEquals("", string0);
    }

    @Test
    public void test32() throws Throwable {
        Th th0 = new Th();
        LinkedList<java.lang.String> linkedList0 = new LinkedList<java.lang.String>();
        linkedList0.add("colgroup");
        th0.clazz = (java.util.List<java.lang.String>) linkedList0;
        java.util.List<java.lang.String> list0 = th0.getClazz();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test33() throws Throwable {
        Th th0 = new Th();
        th0.setCharoff("$VALUES");
        java.lang.String string0 = th0.getCharoff();
        assertEquals("$VALUES", string0);
    }

    @Test
    public void test34() throws Throwable {
        Th th0 = new Th();
        th0.charoff = "";
        java.lang.String string0 = th0.getCharoff();
        assertEquals("", string0);
    }

    @Test
    public void test35() throws Throwable {
        Th th0 = new Th();
        th0.setChar("v'HVn.vc:*6\"Kzu+q");
        java.lang.String string0 = th0.getChar();
        assertEquals("v'HVn.vc:*6\"Kzu+q", string0);
    }

    @Test
    public void test36() throws Throwable {
        Th th0 = new Th();
        th0._char = "";
        java.lang.String string0 = th0.getChar();
        assertEquals("", string0);
    }

    @Test
    public void test37() throws Throwable {
        Th th0 = new Th();
        th0.setAxis("%-KGp");
        java.lang.String string0 = th0.getAxis();
        assertEquals("%-KGp", string0);
    }

    @Test
    public void test38() throws Throwable {
        Th th0 = new Th();
        th0.setAlign("f7[");
        java.lang.String string0 = th0.getAlign();
        assertEquals("f7[", string0);
    }

    @Test
    public void test39() throws Throwable {
        Th th0 = new Th();
        th0.setAlign("");
        java.lang.String string0 = th0.getAlign();
        assertEquals("", string0);
    }

    @Test
    public void test40() throws Throwable {
        Th th0 = new Th();
        th0.setAbbr("--.SL]i-|*.B");
        java.lang.String string0 = th0.getAbbr();
        assertEquals("--.SL]i-|*.B", string0);
    }

    @Test
    public void test41() throws Throwable {
        Th th0 = new Th();
        java.util.List<java.lang.String> list0 = th0.getClazz();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test42() throws Throwable {
        Th th0 = new Th();
        BigInteger bigInteger0 = th0.getRowspan();
        assertNotNull(bigInteger0);

        th0.colspan = bigInteger0;
        BigInteger bigInteger1 = th0.getColspan();
        assertSame(bigInteger1, bigInteger0);
        assertNotNull(bigInteger1);
    }

    @Test
    public void test43() throws Throwable {
        Th th0 = new Th();
        BigInteger bigInteger0 = th0.getRowspan();
        th0.rowspan = bigInteger0;
        BigInteger bigInteger1 = th0.getRowspan();
        assertSame(bigInteger1, bigInteger0);
        assertNotNull(bigInteger1);
    }

    @Test
    public void test44() throws Throwable {
        Th th0 = new Th();
        java.util.List<java.lang.Object> list0 = th0.getHeaders();
        java.util.List<java.lang.Object> list1 = th0.getHeaders();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test45() throws Throwable {
        Th th0 = new Th();
        th0.setAbbr("");
        java.lang.String string0 = th0.getAbbr();
        assertEquals("", string0);
    }

    @Test
    public void test46() throws Throwable {
        Th th0 = new Th();
        th0.setOnclick("");
        java.lang.String string0 = th0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test47() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getAlign();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Th th0 = new Th();
        BigInteger bigInteger0 = th0.getColspan();
        th0.setColspan(bigInteger0);
        assertNull(th0.getLanguage());
    }

    @Test
    public void test49() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test50() throws Throwable {
        Th th0 = new Th();
        th0.setOndblclick("");
        java.lang.String string0 = th0.getOndblclick();
        assertEquals("", string0);
    }

    @Test
    public void test51() throws Throwable {
        Th th0 = new Th();
        th0.getScope();
    }

    @Test
    public void test52() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test53() throws Throwable {
        Th th0 = new Th();
        th0.setAxis("");
        java.lang.String string0 = th0.getAxis();
        assertEquals("", string0);
    }

    @Test
    public void test54() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test55() throws Throwable {
        Th th0 = new Th();
        th0.setValign("");
        assertNull(th0.getStyle());
    }

    @Test
    public void test56() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getCharoff();
        assertNull(string0);
    }

    @Test
    public void test57() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getLang();
        assertNull(string0);
    }

    @Test
    public void test58() throws Throwable {
        Th th0 = new Th();
        th0.setLanguage("");
        java.lang.String string0 = th0.getLanguage();
        assertEquals("", string0);
    }

    @Test
    public void test59() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test60() throws Throwable {
        Th th0 = new Th();
        th0.setTitle("]wMF<~2GF}3ZJ");
        java.lang.String string0 = th0.getTitle();
        assertEquals("]wMF<~2GF}3ZJ", string0);
    }

    @Test
    public void test61() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getId();
        assertNull(string0);
    }

    @Test
    public void test62() throws Throwable {
        Th th0 = new Th();
        th0.setStyle("");
        assertNull(th0.getOnmouseup());
    }

    @Test
    public void test63() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test64() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getDir();
        assertNull(string0);
    }

    @Test
    public void test65() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test66() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test67() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test68() throws Throwable {
        Th th0 = new Th();
        th0.setOnkeypress("");
        java.lang.String string0 = th0.getOnkeypress();
        assertEquals("", string0);
    }

    @Test
    public void test69() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test70() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test71() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getAbbr();
        assertNull(string0);
    }

    @Test
    public void test72() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test73() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test74() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getChar();
        assertNull(string0);
    }

    @Test
    public void test75() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getValign();
        assertNull(string0);
    }

    @Test
    public void test76() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test77() throws Throwable {
        Th th0 = new Th();
        BigInteger bigInteger0 = th0.getColspan();
        th0.setRowspan(bigInteger0);
        assertNull(th0.getLang());
    }

    @Test
    public void test78() throws Throwable {
        Th th0 = new Th();
        java.lang.String string0 = th0.getAxis();
        assertNull(string0);
    }
}
