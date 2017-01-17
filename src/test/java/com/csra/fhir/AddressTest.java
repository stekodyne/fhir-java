/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:38:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class AddressTest {

    @Test
    public void test00() throws Throwable {
        Address address0 = new Address();
        java.util.List<String> list0 = address0.getLine();
        java.util.List<String> list1 = address0.getLine();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Address address0 = new Address();
        address0.setType((AddressType) null);
        assertNull(address0.getId());
    }

    @Test
    public void test02() throws Throwable {
        Address address0 = new Address();
        Period period0 = address0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test03() throws Throwable {
        Address address0 = new Address();
        address0.setCity((String) null);
        assertNull(address0.getId());
    }

    @Test
    public void test04() throws Throwable {
        Address address0 = new Address();
        AddressType addressType0 = address0.getType();
        assertNull(addressType0);
    }

    @Test
    public void test05() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getCity();
        assertNull(string0);
    }

    @Test
    public void test06() throws Throwable {
        Address address0 = new Address();
        address0.setPeriod((Period) null);
        assertNull(address0.getId());
    }

    @Test
    public void test07() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getPostalCode();
        assertNull(string0);
    }

    @Test
    public void test08() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getText();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Address address0 = new Address();
        address0.setCountry((String) null);
        assertNull(address0.getId());
    }

    @Test
    public void test10() throws Throwable {
        Address address0 = new Address();
        address0.setDistrict((String) null);
        assertNull(address0.getId());
    }

    @Test
    public void test11() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getCountry();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getDistrict();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Address address0 = new Address();
        address0.setUse((AddressUse) null);
        assertNull(address0.getId());
    }

    @Test
    public void test14() throws Throwable {
        Address address0 = new Address();
        address0.setText((String) null);
        assertNull(address0.getId());
    }

    @Test
    public void test15() throws Throwable {
        Address address0 = new Address();
        address0.setPostalCode((String) null);
        assertNull(address0.getId());
    }

    @Test
    public void test16() throws Throwable {
        Address address0 = new Address();
        AddressUse addressUse0 = address0.getUse();
        assertNull(addressUse0);
    }

    @Test
    public void test17() throws Throwable {
        Address address0 = new Address();
        String string0 = address0.getState();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        Address address0 = new Address();
        address0.setState((String) null);
        assertNull(address0.getId());
    }
}
