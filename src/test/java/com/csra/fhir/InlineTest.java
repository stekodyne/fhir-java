/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:14:47 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InlineTest {

    @Test
    public void test0() throws Throwable {
        Inline inline0 = new Inline();
        inline0.getContent();
        java.util.List<java.lang.Object> list0 = inline0.getContent();
        assertTrue(list0.isEmpty());
    }
}
