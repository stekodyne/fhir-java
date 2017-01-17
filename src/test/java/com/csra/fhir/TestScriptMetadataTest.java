/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:02:55 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class TestScriptMetadataTest {

    @Test
    public void test0() throws Throwable {
        TestScriptMetadata testScriptMetadata0 = new TestScriptMetadata();
        java.util.List<TestScriptCapability> list0 = testScriptMetadata0.getCapability();
        java.util.List<TestScriptCapability> list1 = testScriptMetadata0.getCapability();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        TestScriptMetadata testScriptMetadata0 = new TestScriptMetadata();
        testScriptMetadata0.getLink();
        testScriptMetadata0.getLink();
    }
}
