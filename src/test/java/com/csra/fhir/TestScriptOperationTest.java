/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:04:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class TestScriptOperationTest {

    @Test
    public void test00() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        java.util.List<TestScriptRequestHeader> list0 = testScriptOperation0.getRequestHeader();
        java.util.List<TestScriptRequestHeader> list1 = testScriptOperation0.getRequestHeader();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Integer integer0 = testScriptOperation0.getDestination();
        assertNull(integer0);
    }

    @Test
    public void test02() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setParams((String) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test03() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setResponseId((Id) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test04() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setContentType((ContentType) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test05() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setTargetId((Id) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test06() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        String string0 = testScriptOperation0.getLabel();
        assertNull(string0);
    }

    @Test
    public void test07() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setType((Coding) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test08() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Id id0 = testScriptOperation0.getTargetId();
        assertNull(id0);
    }

    @Test
    public void test09() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Id id0 = testScriptOperation0.getSourceId();
        assertNull(id0);
    }

    @Test
    public void test10() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setUrl((String) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test11() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setEncodeRequestUrl((Boolean) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test12() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        ContentType contentType0 = testScriptOperation0.getContentType();
        assertNull(contentType0);
    }

    @Test
    public void test13() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setLabel((String) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test14() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setResource((Code) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test15() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setDestination((Integer) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test16() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setAccept((ContentType) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test17() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Id id0 = testScriptOperation0.getResponseId();
        assertNull(id0);
    }

    @Test
    public void test18() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        String string0 = testScriptOperation0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test19() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Code code0 = testScriptOperation0.getResource();
        assertNull(code0);
    }

    @Test
    public void test20() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Coding coding0 = testScriptOperation0.getType();
        assertNull(coding0);
    }

    @Test
    public void test21() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setSourceId((Id) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test22() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        String string0 = testScriptOperation0.getParams();
        assertNull(string0);
    }

    @Test
    public void test23() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.setDescription((String) null);
        assertNull(testScriptOperation0.getId());
    }

    @Test
    public void test24() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        String string0 = testScriptOperation0.getUrl();
        assertNull(string0);
    }

    @Test
    public void test25() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        Boolean boolean0 = testScriptOperation0.getEncodeRequestUrl();
        assertNull(boolean0);
    }

    @Test
    public void test26() throws Throwable {
        TestScriptOperation testScriptOperation0 = new TestScriptOperation();
        testScriptOperation0.getAccept();
    }
}
