/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:40:08 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DomainResourceTest {

    @Test
    public void test0() throws Throwable {
        DomainResource domainResource0 = new DomainResource();
        java.util.List<Extension> list0 = domainResource0.getModifierExtension();
        java.util.List<Extension> list1 = domainResource0.getModifierExtension();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        DomainResource domainResource0 = new DomainResource();
        java.util.List<Extension> list0 = domainResource0.getExtension();
        java.util.List<Extension> list1 = domainResource0.getExtension();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        DomainResource domainResource0 = new DomainResource();
        java.util.List<ResourceContainer> list0 = domainResource0.getContained();
        java.util.List<ResourceContainer> list1 = domainResource0.getContained();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test3() throws Throwable {
        DomainResource domainResource0 = new DomainResource();
        Narrative narrative0 = domainResource0.getText();
        assertNull(narrative0);
    }

    @Test
    public void test4() throws Throwable {
        DomainResource domainResource0 = new DomainResource();
        domainResource0.setText((Narrative) null);
    }
}
