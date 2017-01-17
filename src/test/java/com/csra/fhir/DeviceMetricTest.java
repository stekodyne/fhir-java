/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:16:28 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DeviceMetricTest {

    @Test
    public void test00() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        java.util.List<DeviceMetricCalibration> list0 = deviceMetric0.getCalibration();
        java.util.List<DeviceMetricCalibration> list1 = deviceMetric0.getCalibration();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setOperationalStatus((DeviceMetricOperationalStatus) null);
    }

    @Test
    public void test02() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        Reference reference0 = deviceMetric0.getSource();
        assertNull(reference0);
    }

    @Test
    public void test03() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setSource((Reference) null);
    }

    @Test
    public void test04() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        Reference reference0 = deviceMetric0.getParent();
        assertNull(reference0);
    }

    @Test
    public void test05() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setType((CodeableConcept) null);
    }

    @Test
    public void test06() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        DeviceMetricCategory deviceMetricCategory0 = deviceMetric0.getCategory();
        assertNull(deviceMetricCategory0);
    }

    @Test
    public void test07() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setColor((DeviceMetricColor) null);
    }

    @Test
    public void test08() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        CodeableConcept codeableConcept0 = deviceMetric0.getUnit();
        assertNull(codeableConcept0);
    }

    @Test
    public void test09() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        DeviceMetricColor deviceMetricColor0 = deviceMetric0.getColor();
        assertNull(deviceMetricColor0);
    }

    @Test
    public void test10() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setIdentifier((Identifier) null);
    }

    @Test
    public void test11() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setMeasurementPeriod((Timing) null);
    }

    @Test
    public void test12() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        DeviceMetricOperationalStatus deviceMetricOperationalStatus0 = deviceMetric0.getOperationalStatus();
        assertNull(deviceMetricOperationalStatus0);
    }

    @Test
    public void test13() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        Identifier identifier0 = deviceMetric0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test14() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setCategory((DeviceMetricCategory) null);
    }

    @Test
    public void test15() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setUnit((CodeableConcept) null);
    }

    @Test
    public void test16() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        CodeableConcept codeableConcept0 = deviceMetric0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test17() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        deviceMetric0.setParent((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        DeviceMetric deviceMetric0 = new DeviceMetric();
        Timing timing0 = deviceMetric0.getMeasurementPeriod();
        assertNull(timing0);
    }
}
