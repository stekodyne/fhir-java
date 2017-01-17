/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:02:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SupplyRequestTest {

    @Test
    public void test00() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        java.util.List<Reference> list0 = supplyRequest0.getSupplier();
        java.util.List<Reference> list1 = supplyRequest0.getSupplier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        Reference reference0 = supplyRequest0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test02() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setSource((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setWhen((SupplyRequestWhen) null);
    }

    @Test
    public void test04() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setOrderedItem((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setReasonCodeableConceptOrReasonReference((Element) null);
    }

    @Test
    public void test06() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setIdentifier((Identifier) null);
    }

    @Test
    public void test07() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setStatus((SupplyRequestStatus) null);
    }

    @Test
    public void test08() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        Reference reference0 = supplyRequest0.getOrderedItem();
        assertNull(reference0);
    }

    @Test
    public void test09() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        CodeableConcept codeableConcept0 = supplyRequest0.getKind();
        assertNull(codeableConcept0);
    }

    @Test
    public void test10() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        Identifier identifier0 = supplyRequest0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test11() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setKind((CodeableConcept) null);
    }

    @Test
    public void test12() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setDate((DateTime) null);
    }

    @Test
    public void test13() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        DateTime dateTime0 = supplyRequest0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test14() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        SupplyRequestStatus supplyRequestStatus0 = supplyRequest0.getStatus();
        assertNull(supplyRequestStatus0);
    }

    @Test
    public void test15() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        supplyRequest0.setPatient((Reference) null);
    }

    @Test
    public void test16() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        Reference reference0 = supplyRequest0.getSource();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        SupplyRequestWhen supplyRequestWhen0 = supplyRequest0.getWhen();
        assertNull(supplyRequestWhen0);
    }

    @Test
    public void test18() throws Throwable {
        SupplyRequest supplyRequest0 = new SupplyRequest();
        Element element0 = supplyRequest0.getReasonCodeableConceptOrReasonReference();
        assertNull(element0);
    }
}
