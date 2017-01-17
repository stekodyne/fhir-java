/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:09:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImplementationGuidePackageTest {

    @Test
    public void test0() throws Throwable {
        ImplementationGuidePackage implementationGuidePackage0 = new ImplementationGuidePackage();
        java.util.List<ImplementationGuideResource> list0 = implementationGuidePackage0.getResource();
        java.util.List<ImplementationGuideResource> list1 = implementationGuidePackage0.getResource();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImplementationGuidePackage implementationGuidePackage0 = new ImplementationGuidePackage();
        implementationGuidePackage0.setName((String) null);
        assertNull(implementationGuidePackage0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ImplementationGuidePackage implementationGuidePackage0 = new ImplementationGuidePackage();
        implementationGuidePackage0.setDescription((String) null);
        assertNull(implementationGuidePackage0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ImplementationGuidePackage implementationGuidePackage0 = new ImplementationGuidePackage();
        String string0 = implementationGuidePackage0.getName();
        assertNull(string0);
    }

    @Test
    public void test4() throws Throwable {
        ImplementationGuidePackage implementationGuidePackage0 = new ImplementationGuidePackage();
        implementationGuidePackage0.getDescription();
    }
}
