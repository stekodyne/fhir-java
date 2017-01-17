/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:34:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OrderTest {

    @Test
    public void test00() throws Throwable {
        Order order0 = new Order();
        java.util.List<Reference> list0 = order0.getDetail();
        java.util.List<Reference> list1 = order0.getDetail();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Order order0 = new Order();
        java.util.List<Identifier> list0 = order0.getIdentifier();
        java.util.List<Identifier> list1 = order0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Order order0 = new Order();
        order0.setReasonCodeableConceptOrReasonReference((Element) null);
    }

    @Test
    public void test03() throws Throwable {
        Order order0 = new Order();
        DateTime dateTime0 = order0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test04() throws Throwable {
        Order order0 = new Order();
        order0.setSource((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        Order order0 = new Order();
        Reference reference0 = order0.getSource();
        assertNull(reference0);
    }

    @Test
    public void test06() throws Throwable {
        Order order0 = new Order();
        Reference reference0 = order0.getTarget();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        Order order0 = new Order();
        order0.setDate((DateTime) null);
    }

    @Test
    public void test08() throws Throwable {
        Order order0 = new Order();
        Reference reference0 = order0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test09() throws Throwable {
        Order order0 = new Order();
        OrderWhen orderWhen0 = order0.getWhen();
        assertNull(orderWhen0);
    }

    @Test
    public void test10() throws Throwable {
        Order order0 = new Order();
        Element element0 = order0.getReasonCodeableConceptOrReasonReference();
        assertNull(element0);
    }

    @Test
    public void test11() throws Throwable {
        Order order0 = new Order();
        order0.setTarget((Reference) null);
    }

    @Test
    public void test12() throws Throwable {
        Order order0 = new Order();
        order0.setSubject((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        Order order0 = new Order();
        order0.setWhen((OrderWhen) null);
    }
}
