/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:07:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DeviceUseRequestTest {

    @Test
    public void test00() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        java.util.List<CodeableConcept> list0 = deviceUseRequest0.getPrnReason();
        java.util.List<CodeableConcept> list1 = deviceUseRequest0.getPrnReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        java.util.List<String> list0 = deviceUseRequest0.getNotes();
        java.util.List<String> list1 = deviceUseRequest0.getNotes();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        java.util.List<CodeableConcept> list0 = deviceUseRequest0.getIndication();
        java.util.List<CodeableConcept> list1 = deviceUseRequest0.getIndication();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        java.util.List<Identifier> list0 = deviceUseRequest0.getIdentifier();
        java.util.List<Identifier> list1 = deviceUseRequest0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        Reference reference0 = deviceUseRequest0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setRecordedOn((DateTime) null);
    }

    @Test
    public void test06() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setTimingTimingOrTimingPeriodOrTimingDateTime((Element) null);
    }

    @Test
    public void test07() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        DeviceUseRequestPriority deviceUseRequestPriority0 = deviceUseRequest0.getPriority();
        assertNull(deviceUseRequestPriority0);
    }

    @Test
    public void test08() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setOrderedOn((DateTime) null);
    }

    @Test
    public void test09() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        Reference reference0 = deviceUseRequest0.getDevice();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        DeviceUseRequestStatus deviceUseRequestStatus0 = deviceUseRequest0.getStatus();
        assertNull(deviceUseRequestStatus0);
    }

    @Test
    public void test11() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        Element element0 = deviceUseRequest0.getBodySiteCodeableConceptOrBodySiteReference();
        assertNull(element0);
    }

    @Test
    public void test12() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        Reference reference0 = deviceUseRequest0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setDevice((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setStatus((DeviceUseRequestStatus) null);
    }

    @Test
    public void test15() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setSubject((Reference) null);
    }

    @Test
    public void test16() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setPriority((DeviceUseRequestPriority) null);
    }

    @Test
    public void test17() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        DateTime dateTime0 = deviceUseRequest0.getRecordedOn();
        assertNull(dateTime0);
    }

    @Test
    public void test18() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setEncounter((Reference) null);
    }

    @Test
    public void test19() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        DateTime dateTime0 = deviceUseRequest0.getOrderedOn();
        assertNull(dateTime0);
    }

    @Test
    public void test20() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        Element element0 = deviceUseRequest0.getTimingTimingOrTimingPeriodOrTimingDateTime();
        assertNull(element0);
    }

    @Test
    public void test21() throws Throwable {
        DeviceUseRequest deviceUseRequest0 = new DeviceUseRequest();
        deviceUseRequest0.setBodySiteCodeableConceptOrBodySiteReference((Element) null);
    }
}
