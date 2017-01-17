/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:19:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SupplyDeliveryTest {

    @Test
    public void test00() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        java.util.List<Reference> list0 = supplyDelivery0.getReceiver();
        java.util.List<Reference> list1 = supplyDelivery0.getReceiver();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        SimpleQuantity simpleQuantity0 = supplyDelivery0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test02() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        SupplyDeliveryStatus supplyDeliveryStatus0 = supplyDelivery0.getStatus();
        assertNull(supplyDeliveryStatus0);
    }

    @Test
    public void test03() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setSuppliedItem((Reference) null);
    }

    @Test
    public void test04() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        DateTime dateTime0 = supplyDelivery0.getTime();
        assertNull(dateTime0);
    }

    @Test
    public void test05() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setDestination((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setSupplier((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setWhenPrepared((Period) null);
    }

    @Test
    public void test08() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setIdentifier((Identifier) null);
    }

    @Test
    public void test09() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Reference reference0 = supplyDelivery0.getSupplier();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setStatus((SupplyDeliveryStatus) null);
    }

    @Test
    public void test11() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Reference reference0 = supplyDelivery0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Reference reference0 = supplyDelivery0.getSuppliedItem();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Reference reference0 = supplyDelivery0.getDestination();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        CodeableConcept codeableConcept0 = supplyDelivery0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test15() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setTime((DateTime) null);
    }

    @Test
    public void test16() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setType((CodeableConcept) null);
    }

    @Test
    public void test17() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Identifier identifier0 = supplyDelivery0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test18() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        Period period0 = supplyDelivery0.getWhenPrepared();
        assertNull(period0);
    }

    @Test
    public void test19() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setQuantity((SimpleQuantity) null);
    }

    @Test
    public void test20() throws Throwable {
        SupplyDelivery supplyDelivery0 = new SupplyDelivery();
        supplyDelivery0.setPatient((Reference) null);
    }
}
