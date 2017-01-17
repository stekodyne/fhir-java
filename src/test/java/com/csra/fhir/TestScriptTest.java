/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:24:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TestScriptTest {

    @Test
    public void test00() throws Throwable {
        TestScript testScript0 = new TestScript();
        Boolean boolean0 = new Boolean();
        testScript0.setMultiserver(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test01() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setPublisher(string0);
        String string1 = testScript0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test02() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setDescription(string0);
        String string1 = testScript0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test03() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setDescription(string0);
        String string1 = testScript0.getRequirements();
        assertNull(string1);
    }

    @Test
    public void test04() throws Throwable {
        TestScript testScript0 = new TestScript();
        Code code0 = new Code();
        testScript0.setStatus(code0);
        assertNull(code0.getValue());
    }

    @Test
    public void test05() throws Throwable {
        TestScript testScript0 = new TestScript();
        Code code0 = new Code();
        testScript0.setLanguage(code0);
        Code code1 = testScript0.getStatus();
        assertNull(code1);
    }

    @Test
    public void test06() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setName(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test07() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.copyright = string0;
        String string1 = testScript0.getName();
        assertNull(string1);
    }

    @Test
    public void test08() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setPublisher(string0);
        String string1 = testScript0.getName();
        assertNull(string1);
    }

    @Test
    public void test09() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setDescription(string0);
        String string1 = testScript0.getName();
        assertNull(string1);
    }

    @Test
    public void test10() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setVersion(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test11() throws Throwable {
        TestScript testScript0 = new TestScript();
        LinkedList<TestScriptVariable> linkedList0 = new LinkedList<TestScriptVariable>();
        testScript0.variable = (java.util.List<TestScriptVariable>) linkedList0;
        TestScriptVariable testScriptVariable0 = new TestScriptVariable();
        linkedList0.add(0, testScriptVariable0);
        java.util.List<TestScriptVariable> list0 = testScript0.getVariable();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        TestScript testScript0 = new TestScript();
        Uri uri0 = new Uri();
        testScript0.url = uri0;
        Uri uri1 = testScript0.getUrl();
        assertSame(uri1, uri0);
    }

    @Test
    public void test13() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptSetup testScriptSetup0 = new TestScriptSetup();
        testScript0.setup = testScriptSetup0;
        TestScriptSetup testScriptSetup1 = testScript0.getSetup();
        assertNull(testScriptSetup1.getId());
    }

    @Test
    public void test14() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.publisher = string0;
        String string1 = testScript0.getPublisher();
        assertNull(string1.getId());
    }

    @Test
    public void test15() throws Throwable {
        TestScript testScript0 = new TestScript();
        Boolean boolean0 = new Boolean();
        testScript0.multiserver = boolean0;
        Boolean boolean1 = testScript0.getMultiserver();
        assertNull(boolean1.getId());
    }

    @Test
    public void test16() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<TestScriptFixture> list0 = testScript0.getFixture();
        assertNotNull(list0);

        LinkedList<TestScriptFixture> linkedList0 = new LinkedList<TestScriptFixture>((Collection<? extends TestScriptFixture>) list0);
        TestScriptFixture testScriptFixture0 = new TestScriptFixture();
        linkedList0.add(testScriptFixture0);
        testScript0.fixture = (java.util.List<TestScriptFixture>) linkedList0;
        java.util.List<TestScriptFixture> list1 = testScript0.getFixture();
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test17() throws Throwable {
        TestScript testScript0 = new TestScript();
        Boolean boolean0 = new Boolean();
        testScript0.setExperimental(boolean0);
        Boolean boolean1 = testScript0.getExperimental();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test18() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<TestScriptTest> list0 = testScript0.getTest();
        java.util.List<TestScriptTest> list1 = testScript0.getTest();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test19() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<TestScriptVariable> list0 = testScript0.getVariable();
        assertEquals(0, list0.size());
    }

    @Test
    public void test20() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<Reference> list0 = testScript0.getProfile();
        java.util.List<Reference> list1 = testScript0.getProfile();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test21() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<CodeableConcept> list0 = testScript0.getUseContext();
        java.util.List<CodeableConcept> list1 = testScript0.getUseContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test22() throws Throwable {
        TestScript testScript0 = new TestScript();
        java.util.List<TestScriptContact> list0 = testScript0.getContact();
        java.util.List<TestScriptContact> list1 = testScript0.getContact();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test23() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptTeardown testScriptTeardown0 = new TestScriptTeardown();
        testScript0.setTeardown(testScriptTeardown0);
        TestScriptTeardown testScriptTeardown1 = testScript0.getTeardown();
        assertNull(testScriptTeardown1.getId());
    }

    @Test
    public void test24() throws Throwable {
        TestScript testScript0 = new TestScript();
        Uri uri0 = testScript0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test25() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = testScript0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test26() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptTeardown testScriptTeardown0 = testScript0.getTeardown();
        assertNull(testScriptTeardown0);
    }

    @Test
    public void test27() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setDescription(string0);
        String string1 = testScript0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test28() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setCopyright(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test29() throws Throwable {
        TestScript testScript0 = new TestScript();
        Boolean boolean0 = testScript0.getMultiserver();
        assertNull(boolean0);
    }

    @Test
    public void test30() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptSetup testScriptSetup0 = testScript0.getSetup();
        assertNull(testScriptSetup0);
    }

    @Test
    public void test31() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptSetup testScriptSetup0 = new TestScriptSetup();
        testScript0.setSetup(testScriptSetup0);
        assertNull(testScriptSetup0.getId());
    }

    @Test
    public void test32() throws Throwable {
        TestScript testScript0 = new TestScript();
        Uri uri0 = new Uri();
        testScript0.setUrl(uri0);
        assertNull(uri0.getId());
    }

    @Test
    public void test33() throws Throwable {
        TestScript testScript0 = new TestScript();
        DateTime dateTime0 = testScript0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test34() throws Throwable {
        TestScript testScript0 = new TestScript();
        Boolean boolean0 = testScript0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test35() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = testScript0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test36() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptMetadata testScriptMetadata0 = testScript0.getMetadata();
        assertNull(testScriptMetadata0);
    }

    @Test
    public void test37() throws Throwable {
        TestScript testScript0 = new TestScript();
        Identifier identifier0 = testScript0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test38() throws Throwable {
        TestScript testScript0 = new TestScript();
        Identifier identifier0 = new Identifier();
        testScript0.setIdentifier(identifier0);
        Identifier identifier1 = testScript0.getIdentifier();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test39() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setPublisher(string0);
        String string1 = testScript0.getVersion();
        assertNull(string1);
    }

    @Test
    public void test40() throws Throwable {
        TestScript testScript0 = new TestScript();
        TestScriptMetadata testScriptMetadata0 = new TestScriptMetadata();
        testScript0.setMetadata(testScriptMetadata0);
        assertNull(testScriptMetadata0.getId());
    }

    @Test
    public void test41() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = new String();
        testScript0.setRequirements(string0);
        String string1 = testScript0.getCopyright();
        assertNull(string1);
    }

    @Test
    public void test42() throws Throwable {
        TestScript testScript0 = new TestScript();
        DateTime dateTime0 = new DateTime();
        testScript0.setDate(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test43() throws Throwable {
        TestScript testScript0 = new TestScript();
        String string0 = testScript0.getPublisher();
        assertNull(string0);
    }
}
