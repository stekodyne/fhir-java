/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:03:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ParamTest {

    @Test
    public void test00() throws Throwable {
        Param param0 = new Param();
        param0.value = "u1jX\"8";
        java.lang.String string0 = param0.getValue();
        assertEquals("u1jX\"8", string0);
    }

    @Test
    public void test01() throws Throwable {
        Param param0 = new Param();
        param0.value = "";
        java.lang.String string0 = param0.getValue();
        assertEquals("", string0);
    }

    @Test
    public void test02() throws Throwable {
        Param param0 = new Param();
        param0.type = "r-hoM'9TLG2fM!0)]w";
        java.lang.String string0 = param0.getType();
        assertEquals("r-hoM'9TLG2fM!0)]w", string0);
    }

    @Test
    public void test03() throws Throwable {
        Param param0 = new Param();
        param0.setType("");
        java.lang.String string0 = param0.getType();
        assertEquals("", string0);
    }

    @Test
    public void test04() throws Throwable {
        Param param0 = new Param();
        param0.name = "bL|-/F";
        java.lang.String string0 = param0.getName();
        assertEquals("bL|-/F", string0);
    }

    @Test
    public void test05() throws Throwable {
        Param param0 = new Param();
        param0.name = "";
        java.lang.String string0 = param0.getName();
        assertEquals("", string0);
    }

    @Test
    public void test06() throws Throwable {
        Param param0 = new Param();
        param0.id = "";
        param0.id = "t)IPXj(";
        java.lang.String string0 = param0.getId();
        assertEquals("t)IPXj(", string0);
    }

    @Test
    public void test07() throws Throwable {
        Param param0 = new Param();
        java.lang.String string0 = param0.getValuetype();
        assertNotNull(string0);
        assertEquals("data", string0);
    }

    @Test
    public void test08() throws Throwable {
        Param param0 = new Param();
        java.lang.String string0 = param0.getType();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Param param0 = new Param();
        param0.setValue("");
        assertEquals("", param0.getValue());
    }

    @Test
    public void test10() throws Throwable {
        Param param0 = new Param();
        java.lang.String string0 = param0.getName();
        assertNull(string0);
    }

    @Test
    public void test11() throws Throwable {
        Param param0 = new Param();
        java.lang.String string0 = param0.getValue();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Param param0 = new Param();
        param0.setName("");
        assertNull(param0.getId());
    }

    @Test
    public void test13() throws Throwable {
        Param param0 = new Param();
        java.lang.String string0 = param0.getId();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        Param param0 = new Param();
        param0.setValuetype("");
        param0.getValuetype();
        assertEquals("", param0.getValuetype());
    }

    @Test
    public void test15() throws Throwable {
        Param param0 = new Param();
        param0.setId("");
        java.lang.String string0 = param0.getId();
        assertEquals("", string0);
    }
}
