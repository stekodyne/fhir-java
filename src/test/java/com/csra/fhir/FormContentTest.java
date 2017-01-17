/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:24:46 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FormContentTest {

    @Test
    public void test0() throws Throwable {
        FormContent formContent0 = new FormContent();
        java.util.List<java.lang.Object> list0 = formContent0.getPOrH1OrH2();
        java.util.List<java.lang.Object> list1 = formContent0.getPOrH1OrH2();
        assertSame(list1, list0);
    }
}
