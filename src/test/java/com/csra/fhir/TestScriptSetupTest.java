/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:56:32 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TestScriptSetupTest {

    @Test
    public void test0() throws Throwable {
        TestScriptSetup testScriptSetup0 = new TestScriptSetup();
        java.util.List<TestScriptAction> list0 = testScriptSetup0.getAction();
        java.util.List<TestScriptAction> list1 = testScriptSetup0.getAction();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        TestScriptSetup testScriptSetup0 = new TestScriptSetup();
        TestScriptMetadata testScriptMetadata0 = testScriptSetup0.getMetadata();
        assertNull(testScriptMetadata0);
    }

    @Test
    public void test2() throws Throwable {
        TestScriptSetup testScriptSetup0 = new TestScriptSetup();
        testScriptSetup0.setMetadata((TestScriptMetadata) null);
        assertNull(testScriptSetup0.getId());
    }
}
