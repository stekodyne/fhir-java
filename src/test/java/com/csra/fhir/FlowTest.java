/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:07:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FlowTest {

    @Test
    public void test0() throws Throwable {
        Flow flow0 = new Flow();
        java.util.List<java.lang.Object> list0 = flow0.getContent();
        java.util.List<java.lang.Object> list1 = flow0.getContent();
        assertSame(list1, list0);
    }
}
