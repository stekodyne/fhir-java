/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:50:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TestScriptContactTest {

    @Test
    public void test0() throws Throwable {
        TestScriptContact testScriptContact0 = new TestScriptContact();
        java.util.List<ContactPoint> list0 = testScriptContact0.getTelecom();
        java.util.List<ContactPoint> list1 = testScriptContact0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        TestScriptContact testScriptContact0 = new TestScriptContact();
        testScriptContact0.setName((String) null);
        assertNull(testScriptContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        TestScriptContact testScriptContact0 = new TestScriptContact();
        String string0 = testScriptContact0.getName();
        assertNull(string0);
    }
}
