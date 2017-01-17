/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:01:30 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class BundleTest {

    @Test
    public void test0() throws Throwable {
        Bundle bundle0 = new Bundle();
        java.util.List<BundleEntry> list0 = bundle0.getEntry();
        java.util.List<BundleEntry> list1 = bundle0.getEntry();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        Bundle bundle0 = new Bundle();
        java.util.List<BundleLink> list0 = bundle0.getLink();
        java.util.List<BundleLink> list1 = bundle0.getLink();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        Bundle bundle0 = new Bundle();
        BundleType bundleType0 = bundle0.getType();
        assertNull(bundleType0);
    }

    @Test
    public void test3() throws Throwable {
        Bundle bundle0 = new Bundle();
        bundle0.setTotal((UnsignedInt) null);
    }

    @Test
    public void test4() throws Throwable {
        Bundle bundle0 = new Bundle();
        bundle0.setType((BundleType) null);
    }

    @Test
    public void test5() throws Throwable {
        Bundle bundle0 = new Bundle();
        UnsignedInt unsignedInt0 = bundle0.getTotal();
        assertNull(unsignedInt0);
    }

    @Test
    public void test6() throws Throwable {
        Bundle bundle0 = new Bundle();
        bundle0.setSignature((Signature) null);
    }

    @Test
    public void test7() throws Throwable {
        Bundle bundle0 = new Bundle();
        Signature signature0 = bundle0.getSignature();
        assertNull(signature0);
    }
}
