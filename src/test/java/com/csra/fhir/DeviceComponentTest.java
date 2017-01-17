/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:33:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DeviceComponentTest {

    @Test
    public void test00() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        java.util.List<DeviceComponentProductionSpecification> list0 = deviceComponent0.getProductionSpecification();
        java.util.List<DeviceComponentProductionSpecification> list1 = deviceComponent0.getProductionSpecification();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        java.util.List<CodeableConcept> list0 = deviceComponent0.getOperationalStatus();
        java.util.List<CodeableConcept> list1 = deviceComponent0.getOperationalStatus();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        CodeableConcept codeableConcept0 = deviceComponent0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test03() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setLanguageCode((CodeableConcept) null);
    }

    @Test
    public void test04() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        Reference reference0 = deviceComponent0.getSource();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setParent((Reference) null);
    }

    @Test
    public void test06() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setIdentifier((Identifier) null);
    }

    @Test
    public void test07() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setSource((Reference) null);
    }

    @Test
    public void test08() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        Identifier identifier0 = deviceComponent0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test09() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setParameterGroup((CodeableConcept) null);
    }

    @Test
    public void test10() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setType((CodeableConcept) null);
    }

    @Test
    public void test11() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        CodeableConcept codeableConcept0 = deviceComponent0.getLanguageCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test12() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setLastSystemChange((Instant) null);
    }

    @Test
    public void test13() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        Instant instant0 = deviceComponent0.getLastSystemChange();
        assertNull(instant0);
    }

    @Test
    public void test14() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        MeasmntPrinciple measmntPrinciple0 = deviceComponent0.getMeasurementPrinciple();
        assertNull(measmntPrinciple0);
    }

    @Test
    public void test15() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        CodeableConcept codeableConcept0 = deviceComponent0.getParameterGroup();
        assertNull(codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        Reference reference0 = deviceComponent0.getParent();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        DeviceComponent deviceComponent0 = new DeviceComponent();
        deviceComponent0.setMeasurementPrinciple((MeasmntPrinciple) null);
    }
}
