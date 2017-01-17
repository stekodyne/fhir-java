/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:50:55 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImplementationGuidePageTest {

    @Test
    public void test00() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        java.util.List<ImplementationGuidePage> list0 = implementationGuidePage0.getPage();
        java.util.List<ImplementationGuidePage> list1 = implementationGuidePage0.getPage();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        java.util.List<String> list0 = implementationGuidePage0.getPackage();
        java.util.List<String> list1 = implementationGuidePage0.getPackage();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        java.util.List<Code> list0 = implementationGuidePage0.getType();
        java.util.List<Code> list1 = implementationGuidePage0.getType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuidePage0.setKind((GuidePageKind) null);
        assertNull(implementationGuidePage0.getId());
    }

    @Test
    public void test04() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        GuidePageKind guidePageKind0 = implementationGuidePage0.getKind();
        assertNull(guidePageKind0);
    }

    @Test
    public void test05() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        Uri uri0 = implementationGuidePage0.getSource();
        assertNull(uri0);
    }

    @Test
    public void test06() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        Code code0 = implementationGuidePage0.getFormat();
        assertNull(code0);
    }

    @Test
    public void test07() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuidePage0.setName((String) null);
        assertNull(implementationGuidePage0.getId());
    }

    @Test
    public void test08() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuidePage0.setFormat((Code) null);
        assertNull(implementationGuidePage0.getId());
    }

    @Test
    public void test09() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        String string0 = implementationGuidePage0.getName();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuidePage0.setSource((Uri) null);
    }
}
