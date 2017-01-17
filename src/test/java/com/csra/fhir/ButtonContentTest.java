/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:57:23 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ButtonContentTest {

    @Test
    public void test0() throws Throwable {
        ButtonContent buttonContent0 = new ButtonContent();
        buttonContent0.getContent();
        java.util.List<java.lang.Object> list0 = buttonContent0.getContent();
        assertEquals(0, list0.size());
    }
}
