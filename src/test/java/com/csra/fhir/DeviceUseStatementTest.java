/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:42:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DeviceUseStatementTest {

    @Test
    public void test00() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        java.util.List<String> list0 = deviceUseStatement0.getNotes();
        java.util.List<String> list1 = deviceUseStatement0.getNotes();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        java.util.List<CodeableConcept> list0 = deviceUseStatement0.getIndication();
        java.util.List<CodeableConcept> list1 = deviceUseStatement0.getIndication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        java.util.List<Identifier> list0 = deviceUseStatement0.getIdentifier();
        java.util.List<Identifier> list1 = deviceUseStatement0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        Reference reference0 = deviceUseStatement0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        Element element0 = deviceUseStatement0.getTimingTimingOrTimingPeriodOrTimingDateTime();
        assertNull(element0);
    }

    @Test
    public void test05() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setRecordedOn((DateTime) null);
    }

    @Test
    public void test06() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setDevice((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setSubject((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setWhenUsed((Period) null);
    }

    @Test
    public void test09() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setBodySiteCodeableConceptOrBodySiteReference((Element) null);
    }

    @Test
    public void test10() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        Element element0 = deviceUseStatement0.getBodySiteCodeableConceptOrBodySiteReference();
        assertNull(element0);
    }

    @Test
    public void test11() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        deviceUseStatement0.setTimingTimingOrTimingPeriodOrTimingDateTime((Element) null);
    }

    @Test
    public void test12() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        Reference reference0 = deviceUseStatement0.getDevice();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        DateTime dateTime0 = deviceUseStatement0.getRecordedOn();
        assertNull(dateTime0);
    }

    @Test
    public void test14() throws Throwable {
        DeviceUseStatement deviceUseStatement0 = new DeviceUseStatement();
        Period period0 = deviceUseStatement0.getWhenUsed();
        assertNull(period0);
    }
}
