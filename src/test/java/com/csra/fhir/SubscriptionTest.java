/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:10:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SubscriptionTest {

    @Test
    public void test00() throws Throwable {
        Subscription subscription0 = new Subscription();
        java.util.List<Coding> list0 = subscription0.getTag();
        java.util.List<Coding> list1 = subscription0.getTag();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Subscription subscription0 = new Subscription();
        java.util.List<ContactPoint> list0 = subscription0.getContact();
        java.util.List<ContactPoint> list1 = subscription0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        Subscription subscription0 = new Subscription();
        SubscriptionStatus subscriptionStatus0 = subscription0.getStatus();
        assertNull(subscriptionStatus0);
    }

    @Test
    public void test03() throws Throwable {
        Subscription subscription0 = new Subscription();
        Instant instant0 = subscription0.getEnd();
        assertNull(instant0);
    }

    @Test
    public void test04() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setStatus((SubscriptionStatus) null);
    }

    @Test
    public void test05() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setCriteria((String) null);
    }

    @Test
    public void test06() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setChannel((SubscriptionChannel) null);
    }

    @Test
    public void test07() throws Throwable {
        Subscription subscription0 = new Subscription();
        String string0 = subscription0.getReason();
        assertNull(string0);
    }

    @Test
    public void test08() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setError((String) null);
    }

    @Test
    public void test09() throws Throwable {
        Subscription subscription0 = new Subscription();
        SubscriptionChannel subscriptionChannel0 = subscription0.getChannel();
        assertNull(subscriptionChannel0);
    }

    @Test
    public void test10() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setEnd((Instant) null);
    }

    @Test
    public void test11() throws Throwable {
        Subscription subscription0 = new Subscription();
        String string0 = subscription0.getError();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Subscription subscription0 = new Subscription();
        subscription0.setReason((String) null);
    }

    @Test
    public void test13() throws Throwable {
        Subscription subscription0 = new Subscription();
        String string0 = subscription0.getCriteria();
        assertNull(string0);
    }
}
