/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:53:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OrderResponseTest {

    @Test
    public void test00() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        java.util.List<Reference> list0 = orderResponse0.getFulfillment();
        java.util.List<Reference> list1 = orderResponse0.getFulfillment();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        java.util.List<Identifier> list0 = orderResponse0.getIdentifier();
        java.util.List<Identifier> list1 = orderResponse0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        DateTime dateTime0 = orderResponse0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test03() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        Reference reference0 = orderResponse0.getRequest();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        orderResponse0.setDescription((String) null);
    }

    @Test
    public void test05() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        OrderStatus orderStatus0 = orderResponse0.getOrderStatus();
        assertNull(orderStatus0);
    }

    @Test
    public void test06() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        orderResponse0.setOrderStatus((OrderStatus) null);
    }

    @Test
    public void test07() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        Reference reference0 = orderResponse0.getWho();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        String string0 = orderResponse0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        orderResponse0.setRequest((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        orderResponse0.setDate((DateTime) null);
    }

    @Test
    public void test11() throws Throwable {
        OrderResponse orderResponse0 = new OrderResponse();
        orderResponse0.setWho((Reference) null);
    }
}
