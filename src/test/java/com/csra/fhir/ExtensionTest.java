/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:24:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ExtensionTest {

    @Test
    public void test0() throws Throwable {
        Extension extension0 = new Extension();
        extension0.setValueBooleanOrValueIntegerOrValueDecimal(extension0);
        assertNull(extension0.getUrl());
    }

    @Test
    public void test1() throws Throwable {
        Extension extension0 = new Extension();
        extension0.valueBooleanOrValueIntegerOrValueDecimal = (Element) extension0;
        Extension extension1 = (Extension) extension0.getValueBooleanOrValueIntegerOrValueDecimal();
        assertNull(extension1.getId());
    }

    @Test
    public void test2() throws Throwable {
        Extension extension0 = new Extension();
        extension0.setUrl("pk<<");
        java.lang.String string0 = extension0.getUrl();
        assertEquals("pk<<", string0);
    }

    @Test
    public void test3() throws Throwable {
        Extension extension0 = new Extension();
        extension0.setUrl("");
        java.lang.String string0 = extension0.getUrl();
        assertEquals("", string0);
    }

    @Test
    public void test4() throws Throwable {
        Extension extension0 = new Extension();
        java.lang.String string0 = extension0.getUrl();
        assertNull(string0);
    }

    @Test
    public void test5() throws Throwable {
        Extension extension0 = new Extension();
        Element element0 = extension0.getValueBooleanOrValueIntegerOrValueDecimal();
        assertNull(element0);
    }
}
