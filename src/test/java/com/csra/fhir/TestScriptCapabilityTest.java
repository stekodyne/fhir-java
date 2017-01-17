/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:20:34 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TestScriptCapabilityTest {

    @Test
    public void test00() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        java.util.List<Uri> list0 = testScriptCapability0.getLink();
        java.util.List<Uri> list1 = testScriptCapability0.getLink();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        testScriptCapability0.setRequired((Boolean) null);
        assertNull(testScriptCapability0.getId());
    }

    @Test
    public void test02() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        testScriptCapability0.setValidated((Boolean) null);
        assertNull(testScriptCapability0.getId());
    }

    @Test
    public void test03() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        String string0 = testScriptCapability0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        Boolean boolean0 = testScriptCapability0.getRequired();
        assertNull(boolean0);
    }

    @Test
    public void test05() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        Reference reference0 = testScriptCapability0.getConformance();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        testScriptCapability0.setDestination((Integer) null);
        assertNull(testScriptCapability0.getId());
    }

    @Test
    public void test07() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        testScriptCapability0.setDescription((String) null);
        assertNull(testScriptCapability0.getId());
    }

    @Test
    public void test08() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        testScriptCapability0.setConformance((Reference) null);
        assertNull(testScriptCapability0.getId());
    }

    @Test
    public void test09() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        Integer integer0 = testScriptCapability0.getDestination();
        assertNull(integer0);
    }

    @Test
    public void test10() throws Throwable {
        TestScriptCapability testScriptCapability0 = new TestScriptCapability();
        Boolean boolean0 = testScriptCapability0.getValidated();
        assertNull(boolean0);
    }
}
