/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:13:47 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TdTest {

    @Test
    public void test00() throws Throwable {
        Td td0 = new Td();
        td0.setOnmousedown("8Xlh;)Np(!k2K&e");
    }

    @Test
    public void test01() throws Throwable {
        Td td0 = new Td();
        BigInteger bigInteger0 = td0.getColspan();
        Td td1 = new Td();
        td1.colspan = bigInteger0;
        td1.getRowspan();
    }

    @Test
    public void test02() throws Throwable {
        Td td0 = new Td();
        td0.setValign("s GZ^@.bGbb_");
        td0.getValign();
    }

    @Test
    public void test03() throws Throwable {
        Td td0 = new Td();
        td0.valign = "";
        td0.getValign();
    }

    @Test
    public void test04() throws Throwable {
        Td td0 = new Td();
        td0.setTitle("com.csra.fhir.Scope");
        td0.getTitle();
    }

    @Test
    public void test05() throws Throwable {
        Td td0 = new Td();
        td0.setStyle("92/3");
        td0.getStyle();
    }

    @Test
    public void test06() throws Throwable {
        Td td0 = new Td();
        td0.setStyle("");
        td0.getStyle();
    }

    @Test
    public void test07() throws Throwable {
        Td td0 = new Td();
        Scope scope0 = Scope.ROW;
        td0.scope = scope0;
        td0.getScope();
    }

    @Test
    public void test08() throws Throwable {
        Td td0 = new Td();
        td0.onmouseup = "COL";
        td0.getOnmouseup();
    }

    @Test
    public void test09() throws Throwable {
        Td td0 = new Td();
        td0.setOnmouseover("");
        td0.getOnmouseover();
    }

    @Test
    public void test10() throws Throwable {
        Td td0 = new Td();
        td0.setOnmouseout("lV>ZJI:)0");
        td0.getOnmouseout();
    }

    @Test
    public void test11() throws Throwable {
        Td td0 = new Td();
        td0.onmouseout = "";
        td0.getOnmouseout();
    }

    @Test
    public void test12() throws Throwable {
        Td td0 = new Td();
        td0.onmousemove = "\"P#P) V5iB?Hp#x";
        td0.getOnmousemove();
    }

    @Test
    public void test13() throws Throwable {
        Td td0 = new Td();
        td0.onmousedown = "#sZqieA\"@mEPl[";
        td0.getOnmousedown();
    }

    @Test
    public void test14() throws Throwable {
        Td td0 = new Td();
        td0.onmousedown = "<v9Aq3z)UwQ3";
        td0.onmousedown = "";
        td0.getOnmousedown();
    }

    @Test
    public void test15() throws Throwable {
        Td td0 = new Td();
        td0.setOnkeyup("d!}>61H]'yU<0$");
        td0.getOnkeyup();
    }

    @Test
    public void test16() throws Throwable {
        Td td0 = new Td();
        td0.onkeypress = "1";
        td0.getOnkeypress();
    }

    @Test
    public void test17() throws Throwable {
        Td td0 = new Td();
        td0.onkeypress = "";
        td0.getOnkeypress();
    }

    @Test
    public void test18() throws Throwable {
        Td td0 = new Td();
        td0.onkeydown = "";
        td0.getOnkeydown();
    }

    @Test
    public void test19() throws Throwable {
        Td td0 = new Td();
        td0.setOndblclick("1");
        td0.getOndblclick();
    }

    @Test
    public void test20() throws Throwable {
        Td td0 = new Td();
        td0.setOndblclick("");
        td0.getOndblclick();
    }

    @Test
    public void test21() throws Throwable {
        Td td0 = new Td();
        td0.onclick = "row";
        td0.getOnclick();
    }

    @Test
    public void test22() throws Throwable {
        Td td0 = new Td();
        td0.setLanguage("{)RVM?G$r4s;Y");
        td0.getLanguage();
    }

    @Test
    public void test23() throws Throwable {
        Td td0 = new Td();
        td0.language = "";
        td0.getLanguage();
    }

    @Test
    public void test24() throws Throwable {
        Td td0 = new Td();
        td0.lang = "";
        td0.getLang();
    }

    @Test
    public void test25() throws Throwable {
        Td td0 = new Td();
        td0.id = "COL";
        td0.getId();
    }

    @Test
    public void test26() throws Throwable {
        Td td0 = new Td();
        td0.setId("");
        td0.getId();
    }

    @Test
    public void test27() throws Throwable {
        Td td0 = new Td();
        td0.dir = "$VALUES";
        td0.getDir();
    }

    @Test
    public void test28() throws Throwable {
        Td td0 = new Td();
        td0.dir = "";
        td0.getDir();
    }

    @Test
    public void test29() throws Throwable {
        Td td0 = new Td();
        td0.setCharoff("+I[ZcoFeWxZ");
        td0.getCharoff();
    }

    @Test
    public void test30() throws Throwable {
        Td td0 = new Td();
        td0.setCharoff("");
        java.lang.String string0 = td0.getCharoff();
        assertEquals("", string0);
    }

    @Test
    public void test31() throws Throwable {
        Td td0 = new Td();
        td0._char = "8Ap.oi";
        java.lang.String string0 = td0.getChar();
        assertEquals("8Ap.oi", string0);
    }

    @Test
    public void test32() throws Throwable {
        Td td0 = new Td();
        td0._char = "";
        java.lang.String string0 = td0.getChar();
        assertEquals("", string0);
    }

    @Test
    public void test33() throws Throwable {
        Td td0 = new Td();
        td0.axis = "F}";
        java.lang.String string0 = td0.getAxis();
        assertEquals("F}", string0);
    }

    @Test
    public void test34() throws Throwable {
        Td td0 = new Td();
        td0.setAxis("");
        java.lang.String string0 = td0.getAxis();
        assertEquals("", string0);
    }

    @Test
    public void test35() throws Throwable {
        Td td0 = new Td();
        td0.setAlign("row");
        java.lang.String string0 = td0.getAlign();
        assertEquals("row", string0);
    }

    @Test
    public void test36() throws Throwable {
        Td td0 = new Td();
        td0.setAlign("");
        java.lang.String string0 = td0.getAlign();
        assertEquals("", string0);
    }

    @Test
    public void test37() throws Throwable {
        Td td0 = new Td();
        td0.abbr = "<v9Aq3z)UwQ3";
        java.lang.String string0 = td0.getAbbr();
        assertEquals("<v9Aq3z)UwQ3", string0);
    }

    @Test
    public void test38() throws Throwable {
        Td td0 = new Td();
        td0.setAbbr("");
        java.lang.String string0 = td0.getAbbr();
        assertEquals("", string0);
    }

    @Test
    public void test39() throws Throwable {
        Td td0 = new Td();
        java.util.List<java.lang.String> list0 = td0.getClazz();
        java.util.List<java.lang.String> list1 = td0.getClazz();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test40() throws Throwable {
        Td td0 = new Td();
        BigInteger bigInteger0 = td0.getColspan();
        Td td1 = new Td();
        td1.colspan = bigInteger0;
        BigInteger bigInteger1 = td1.getColspan();
        assertNotNull(bigInteger1);
        assertSame(bigInteger1, bigInteger0);
    }

    @Test
    public void test41() throws Throwable {
        Td td0 = new Td();
        java.util.List<java.lang.Object> list0 = td0.getHeaders();
        java.util.List<java.lang.Object> list1 = td0.getHeaders();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test42() throws Throwable {
        Td td0 = new Td();
        BigInteger bigInteger0 = td0.getColspan();
        td0.setRowspan(bigInteger0);
        assertEquals(1, bigInteger0.shortValue());
    }

    @Test
    public void test43() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnmouseout();
        assertNull(string0);
    }

    @Test
    public void test44() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getValign();
        assertNull(string0);
    }

    @Test
    public void test45() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOndblclick();
        assertNull(string0);
    }

    @Test
    public void test46() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnmouseover();
        assertNull(string0);
    }

    @Test
    public void test47() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnkeyup();
        assertNull(string0);
    }

    @Test
    public void test48() throws Throwable {
        Td td0 = new Td();
        td0.setOnkeydown("ROWGROUP");
        java.lang.String string0 = td0.getOnkeydown();
        assertEquals("ROWGROUP", string0);
    }

    @Test
    public void test49() throws Throwable {
        Td td0 = new Td();
        td0.setOnmouseup("");
        java.lang.String string0 = td0.getOnmouseup();
        assertEquals("", string0);
    }

    @Test
    public void test50() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getChar();
        assertNull(string0);
    }

    @Test
    public void test51() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getAbbr();
        assertNull(string0);
    }

    @Test
    public void test52() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getAxis();
        assertNull(string0);
    }

    @Test
    public void test53() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getLanguage();
        assertNull(string0);
    }

    @Test
    public void test54() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getId();
        assertNull(string0);
    }

    @Test
    public void test55() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnkeydown();
        assertNull(string0);
    }

    @Test
    public void test56() throws Throwable {
        Td td0 = new Td();
        td0.setOnkeypress("8:BcEHs-b5wYbH= 1K");
        assertNull(td0.getTitle());
    }

    @Test
    public void test57() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnmousemove();
        assertNull(string0);
    }

    @Test
    public void test58() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getAlign();
        assertNull(string0);
    }

    @Test
    public void test59() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnclick();
        assertNull(string0);
    }

    @Test
    public void test60() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnmousedown();
        assertNull(string0);
    }

    @Test
    public void test61() throws Throwable {
        Td td0 = new Td();
        Scope scope0 = Scope.COLGROUP;
        td0.setScope(scope0);
        Scope scope1 = td0.getScope();
        assertSame(scope1, scope0);
    }

    @Test
    public void test62() throws Throwable {
        Td td0 = new Td();
        BigInteger bigInteger0 = td0.getRowspan();
        td0.setColspan(bigInteger0);
        assertNull(td0.getOnmouseout());
    }

    @Test
    public void test63() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getCharoff();
        assertNull(string0);
    }

    @Test
    public void test64() throws Throwable {
        Td td0 = new Td();
        td0.setOnclick("");
        java.lang.String string0 = td0.getOnclick();
        assertEquals("", string0);
    }

    @Test
    public void test65() throws Throwable {
        Td td0 = new Td();
        td0.setOnmouseover(".");
        java.lang.String string0 = td0.getOnmouseover();
        assertEquals(".", string0);
    }

    @Test
    public void test66() throws Throwable {
        Td td0 = new Td();
        td0.getScope();
    }

    @Test
    public void test67() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getLang();
        assertNull(string0);
    }

    @Test
    public void test68() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnkeypress();
        assertNull(string0);
    }

    @Test
    public void test69() throws Throwable {
        Td td0 = new Td();
        td0.setChar("8Ap.oi");
        assertNull(td0.getAbbr());
    }

    @Test
    public void test70() throws Throwable {
        Td td0 = new Td();
        td0.setOnkeyup("");
        java.lang.String string0 = td0.getOnkeyup();
        assertEquals("", string0);
    }

    @Test
    public void test71() throws Throwable {
        Td td0 = new Td();
        td0.setDir("1");
        assertNull(td0.getTitle());
    }

    @Test
    public void test72() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getDir();
        assertNull(string0);
    }

    @Test
    public void test73() throws Throwable {
        Td td0 = new Td();
        td0.setLang("Lr'3'(>g}YDJ[d4sXH");
        java.lang.String string0 = td0.getLang();
        assertEquals("Lr'3'(>g}YDJ[d4sXH", string0);
    }

    @Test
    public void test74() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getOnmouseup();
        assertNull(string0);
    }

    @Test
    public void test75() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getTitle();
        assertNull(string0);
    }

    @Test
    public void test76() throws Throwable {
        Td td0 = new Td();
        java.lang.String string0 = td0.getStyle();
        assertNull(string0);
    }

    @Test
    public void test77() throws Throwable {
        Td td0 = new Td();
        td0.setOnmousemove("");
        java.lang.String string0 = td0.getOnmousemove();
        assertEquals("", string0);
    }
}
