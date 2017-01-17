/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:46:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreContentTest {

    @Test
    public void test0() throws Throwable {
        PreContent preContent0 = new PreContent();
        preContent0.getContent();
        java.util.List<java.lang.Object> list0 = preContent0.getContent();
        assertEquals(0, list0.size());
    }
}
