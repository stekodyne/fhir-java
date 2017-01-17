/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:29:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ImplementationGuideTest {

    @Test
    public void test00() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.setDescription(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test01() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Boolean boolean0 = new Boolean();
        implementationGuide0.setExperimental(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test02() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.version = string0;
        String string1 = implementationGuide0.getVersion();
        assertNull(string1.getId());
    }

    @Test
    public void test03() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Code code0 = new Code();
        implementationGuide0.setStatus(code0);
        Code code1 = implementationGuide0.getStatus();
        assertNull(code1.getValue());
    }

    @Test
    public void test04() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.publisher = string0;
        String string1 = implementationGuide0.getPublisher();
        assertNull(string1.getId());
    }

    @Test
    public void test05() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuide0.page = implementationGuidePage0;
        ImplementationGuidePage implementationGuidePage1 = implementationGuide0.getPage();
        assertSame(implementationGuidePage1, implementationGuidePage0);
    }

    @Test
    public void test06() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.name = string0;
        String string1 = implementationGuide0.getName();
        assertNull(string1.getId());
    }

    @Test
    public void test07() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Boolean boolean0 = new Boolean();
        implementationGuide0.experimental = boolean0;
        Boolean boolean1 = implementationGuide0.getExperimental();
        assertNull(boolean1.getId());
    }

    @Test
    public void test08() throws Throwable {
        String string0 = new String();
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        implementationGuide0.description = string0;
        String string1 = implementationGuide0.getDescription();
        assertSame(string1, string0);
    }

    @Test
    public void test09() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        LinkedList<ImplementationGuideDependency> linkedList0 = new LinkedList<ImplementationGuideDependency>();
        implementationGuide0.dependency = (java.util.List<ImplementationGuideDependency>) linkedList0;
        ImplementationGuideDependency implementationGuideDependency0 = new ImplementationGuideDependency();
        linkedList0.add(implementationGuideDependency0);
        java.util.List<ImplementationGuideDependency> list0 = implementationGuide0.getDependency();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test10() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        DateTime dateTime0 = new DateTime();
        implementationGuide0.date = dateTime0;
        DateTime dateTime1 = implementationGuide0.getDate();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test11() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.copyright = string0;
        String string1 = implementationGuide0.getCopyright();
        assertNull(string1.getId());
    }

    @Test
    public void test12() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<Uri> list0 = implementationGuide0.getBinary();
        java.util.List<Uri> list1 = implementationGuide0.getBinary();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<ImplementationGuideGlobal> list0 = implementationGuide0.getGlobal();
        java.util.List<ImplementationGuideGlobal> list1 = implementationGuide0.getGlobal();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test14() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<ImplementationGuidePackage> list0 = implementationGuide0.getPackage();
        java.util.List<ImplementationGuidePackage> list1 = implementationGuide0.getPackage();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test15() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<ImplementationGuideDependency> list0 = implementationGuide0.getDependency();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test16() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<CodeableConcept> list0 = implementationGuide0.getUseContext();
        java.util.List<CodeableConcept> list1 = implementationGuide0.getUseContext();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test17() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        java.util.List<ImplementationGuideContact> list0 = implementationGuide0.getContact();
        java.util.List<ImplementationGuideContact> list1 = implementationGuide0.getContact();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test18() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = implementationGuide0.getCopyright();
        assertNull(string0);
    }

    @Test
    public void test19() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.setName(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test20() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.setVersion(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test21() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Id id0 = implementationGuide0.getFhirVersion();
        assertNull(id0);
    }

    @Test
    public void test22() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Boolean boolean0 = implementationGuide0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test23() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = implementationGuide0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test24() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        DateTime dateTime0 = new DateTime();
        implementationGuide0.setDate(dateTime0);
        assertNull(dateTime0.getId());
    }

    @Test
    public void test25() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Uri uri0 = new Uri();
        implementationGuide0.setUrl(uri0);
        Uri uri1 = implementationGuide0.getUrl();
        assertNull(uri1.getId());
    }

    @Test
    public void test26() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        ImplementationGuidePage implementationGuidePage0 = new ImplementationGuidePage();
        implementationGuide0.setPage(implementationGuidePage0);
        assertNull(implementationGuidePage0.getId());
    }

    @Test
    public void test27() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = implementationGuide0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test28() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.setCopyright(string0);
        assertNull(string0.getId());
    }

    @Test
    public void test29() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = new String();
        implementationGuide0.setPublisher(string0);
        assertNull(string0.getValue());
    }

    @Test
    public void test30() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Id id0 = new Id();
        implementationGuide0.setFhirVersion(id0);
        Id id1 = implementationGuide0.getFhirVersion();
        assertNull(id1.getValue());
    }

    @Test
    public void test31() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Code code0 = implementationGuide0.getStatus();
        implementationGuide0.setStatus(code0);
    }

    @Test
    public void test32() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        ImplementationGuidePage implementationGuidePage0 = implementationGuide0.getPage();
        assertNull(implementationGuidePage0);
    }

    @Test
    public void test33() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        DateTime dateTime0 = implementationGuide0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test34() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        Uri uri0 = implementationGuide0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test35() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = implementationGuide0.getName();
        assertNull(string0);
    }

    @Test
    public void test36() throws Throwable {
        ImplementationGuide implementationGuide0 = new ImplementationGuide();
        String string0 = implementationGuide0.getVersion();
        assertNull(string0);
    }
}
