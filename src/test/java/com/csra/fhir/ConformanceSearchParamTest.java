/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:38:25 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConformanceSearchParamTest {

    @Test
    public void test00() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        java.util.List<String> list0 = conformanceSearchParam0.getChain();
        java.util.List<String> list1 = conformanceSearchParam0.getChain();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        java.util.List<SearchModifierCode> list0 = conformanceSearchParam0.getModifier();
        java.util.List<SearchModifierCode> list1 = conformanceSearchParam0.getModifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        java.util.List<Code> list0 = conformanceSearchParam0.getTarget();
        java.util.List<Code> list1 = conformanceSearchParam0.getTarget();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        String string0 = conformanceSearchParam0.getDocumentation();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        Code code0 = conformanceSearchParam0.getType();
        assertNull(code0);
    }

    @Test
    public void test05() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        conformanceSearchParam0.setDocumentation((String) null);
        assertNull(conformanceSearchParam0.getId());
    }

    @Test
    public void test06() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        Uri uri0 = conformanceSearchParam0.getDefinition();
        assertNull(uri0);
    }

    @Test
    public void test07() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        conformanceSearchParam0.setDefinition((Uri) null);
        assertNull(conformanceSearchParam0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        conformanceSearchParam0.setType((Code) null);
        assertNull(conformanceSearchParam0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        conformanceSearchParam0.setName((String) null);
        assertNull(conformanceSearchParam0.getId());
    }

    @Test
    public void test10() throws Throwable {
        ConformanceSearchParam conformanceSearchParam0 = new ConformanceSearchParam();
        String string0 = conformanceSearchParam0.getName();
        assertNull(string0);
    }
}
