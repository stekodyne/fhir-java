/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:55:56 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MetaTest {

    @Test
    public void test0() throws Throwable {
        Meta meta0 = new Meta();
        java.util.List<Coding> list0 = meta0.getTag();
        java.util.List<Coding> list1 = meta0.getTag();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        Meta meta0 = new Meta();
        java.util.List<Coding> list0 = meta0.getSecurity();
        java.util.List<Coding> list1 = meta0.getSecurity();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test2() throws Throwable {
        Meta meta0 = new Meta();
        java.util.List<Uri> list0 = meta0.getProfile();
        java.util.List<Uri> list1 = meta0.getProfile();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test3() throws Throwable {
        Meta meta0 = new Meta();
        Id id0 = meta0.getVersionId();
        assertNull(id0);
    }

    @Test
    public void test4() throws Throwable {
        Meta meta0 = new Meta();
        meta0.setLastUpdated((Instant) null);
        assertNull(meta0.getId());
    }

    @Test
    public void test5() throws Throwable {
        Meta meta0 = new Meta();
        meta0.setVersionId((Id) null);
        assertNull(meta0.getId());
    }

    @Test
    public void test6() throws Throwable {
        Meta meta0 = new Meta();
        Instant instant0 = meta0.getLastUpdated();
        assertNull(instant0);
    }
}
