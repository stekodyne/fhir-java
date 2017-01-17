/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:10:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SearchParameterTest {

    @Test
    public void test00() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        java.util.List<Code> list0 = searchParameter0.getTarget();
        java.util.List<Code> list1 = searchParameter0.getTarget();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        java.util.List<SearchParameterContact> list0 = searchParameter0.getContact();
        java.util.List<SearchParameterContact> list1 = searchParameter0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setDate((DateTime) null);
    }

    @Test
    public void test03() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setCode((Code) null);
    }

    @Test
    public void test04() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        XPathUsageType xPathUsageType0 = searchParameter0.getXpathUsage();
        assertNull(xPathUsageType0);
    }

    @Test
    public void test05() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setBase((Code) null);
    }

    @Test
    public void test06() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setExperimental((Boolean) null);
    }

    @Test
    public void test07() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setRequirements((String) null);
    }

    @Test
    public void test08() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        String string0 = searchParameter0.getName();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setStatus((Code) null);
    }

    @Test
    public void test10() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        String string0 = searchParameter0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test11() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setXpathUsage((XPathUsageType) null);
    }

    @Test
    public void test12() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Boolean boolean0 = searchParameter0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test13() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setType((Code) null);
    }

    @Test
    public void test14() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        String string0 = searchParameter0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test15() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Code code0 = searchParameter0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test16() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Uri uri0 = searchParameter0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test17() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        String string0 = searchParameter0.getRequirements();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setName((String) null);
    }

    @Test
    public void test19() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        DateTime dateTime0 = searchParameter0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test20() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Code code0 = searchParameter0.getBase();
        assertNull(code0);
    }

    @Test
    public void test21() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setDescription((String) null);
    }

    @Test
    public void test22() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Code code0 = searchParameter0.getType();
        assertNull(code0);
    }

    @Test
    public void test23() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        String string0 = searchParameter0.getXpath();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setXpath((String) null);
    }

    @Test
    public void test25() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setPublisher((String) null);
    }

    @Test
    public void test26() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        searchParameter0.setUrl((Uri) null);
    }

    @Test
    public void test27() throws Throwable {
        SearchParameter searchParameter0 = new SearchParameter();
        Code code0 = searchParameter0.getCode();
        assertNull(code0);
    }
}
