/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:46:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DeviceTest {

    @Test
    public void test00() throws Throwable {
        Device device0 = new Device();
        java.util.List<ContactPoint> list0 = device0.getContact();
        java.util.List<ContactPoint> list1 = device0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Device device0 = new Device();
        java.util.List<Annotation> list0 = device0.getNote();
        java.util.List<Annotation> list1 = device0.getNote();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Device device0 = new Device();
        java.util.List<Identifier> list0 = device0.getIdentifier();
        java.util.List<Identifier> list1 = device0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        Device device0 = new Device();
        Reference reference0 = device0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        Device device0 = new Device();
        device0.setUdi((String) null);
    }

    @Test
    public void test05() throws Throwable {
        Device device0 = new Device();
        CodeableConcept codeableConcept0 = device0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        Device device0 = new Device();
        device0.setManufacturer((String) null);
    }

    @Test
    public void test07() throws Throwable {
        Device device0 = new Device();
        DateTime dateTime0 = device0.getManufactureDate();
        assertNull(dateTime0);
    }

    @Test
    public void test08() throws Throwable {
        Device device0 = new Device();
        Uri uri0 = device0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test09() throws Throwable {
        Device device0 = new Device();
        DateTime dateTime0 = device0.getExpiry();
        assertNull(dateTime0);
    }

    @Test
    public void test10() throws Throwable {
        Device device0 = new Device();
        device0.setVersion((String) null);
    }

    @Test
    public void test11() throws Throwable {
        Device device0 = new Device();
        device0.setModel((String) null);
    }

    @Test
    public void test12() throws Throwable {
        Device device0 = new Device();
        String string0 = device0.getUdi();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Device device0 = new Device();
        Reference reference0 = device0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test14() throws Throwable {
        Device device0 = new Device();
        device0.setStatus((DeviceStatus) null);
    }

    @Test
    public void test15() throws Throwable {
        Device device0 = new Device();
        device0.setManufactureDate((DateTime) null);
    }

    @Test
    public void test16() throws Throwable {
        Device device0 = new Device();
        device0.setLocation((Reference) null);
    }

    @Test
    public void test17() throws Throwable {
        Device device0 = new Device();
        String string0 = device0.getLotNumber();
        assertNull(string0);
    }

    @Test
    public void test18() throws Throwable {
        Device device0 = new Device();
        device0.setPatient((Reference) null);
    }

    @Test
    public void test19() throws Throwable {
        Device device0 = new Device();
        String string0 = device0.getModel();
        assertNull(string0);
    }

    @Test
    public void test20() throws Throwable {
        Device device0 = new Device();
        Reference reference0 = device0.getOwner();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        Device device0 = new Device();
        String string0 = device0.getManufacturer();
        assertNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        Device device0 = new Device();
        device0.setLotNumber((String) null);
    }

    @Test
    public void test23() throws Throwable {
        Device device0 = new Device();
        device0.setExpiry((DateTime) null);
    }

    @Test
    public void test24() throws Throwable {
        Device device0 = new Device();
        device0.setUrl((Uri) null);
    }

    @Test
    public void test25() throws Throwable {
        Device device0 = new Device();
        device0.setOwner((Reference) null);
    }

    @Test
    public void test26() throws Throwable {
        Device device0 = new Device();
        String string0 = device0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test27() throws Throwable {
        Device device0 = new Device();
        DeviceStatus deviceStatus0 = device0.getStatus();
        assertNull(deviceStatus0);
    }

    @Test
    public void test28() throws Throwable {
        Device device0 = new Device();
        device0.setType((CodeableConcept) null);
    }
}
