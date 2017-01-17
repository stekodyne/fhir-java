/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:06:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AContentTest {

    @Test
    public void test0() throws Throwable {
        AContent aContent0 = new AContent();
        aContent0.getContent();
        java.util.List<java.lang.Object> list0 = aContent0.getContent();
        assertEquals(0, list0.size());
    }
}
