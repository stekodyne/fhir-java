/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:56:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class BundleEntryTest {

    @Test
    public void test00() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        java.util.List<BundleLink> list0 = bundleEntry0.getLink();
        java.util.List<BundleLink> list1 = bundleEntry0.getLink();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        bundleEntry0.setRequest((BundleRequest) null);
        assertNull(bundleEntry0.getId());
    }

    @Test
    public void test02() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        BundleResponse bundleResponse0 = bundleEntry0.getResponse();
        assertNull(bundleResponse0);
    }

    @Test
    public void test03() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        bundleEntry0.setSearch((BundleSearch) null);
        assertNull(bundleEntry0.getId());
    }

    @Test
    public void test04() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        bundleEntry0.setResource((ResourceContainer) null);
        assertNull(bundleEntry0.getId());
    }

    @Test
    public void test05() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        ResourceContainer resourceContainer0 = bundleEntry0.getResource();
        assertNull(resourceContainer0);
    }

    @Test
    public void test06() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        BundleSearch bundleSearch0 = bundleEntry0.getSearch();
        assertNull(bundleSearch0);
    }

    @Test
    public void test07() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        bundleEntry0.setResponse((BundleResponse) null);
        assertNull(bundleEntry0.getId());
    }

    @Test
    public void test08() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        BundleRequest bundleRequest0 = bundleEntry0.getRequest();
        assertNull(bundleRequest0);
    }

    @Test
    public void test09() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        Uri uri0 = bundleEntry0.getFullUrl();
        assertNull(uri0);
    }

    @Test
    public void test10() throws Throwable {
        BundleEntry bundleEntry0 = new BundleEntry();
        bundleEntry0.setFullUrl((Uri) null);
    }
}
