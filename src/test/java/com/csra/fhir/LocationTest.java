/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:39:43 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class LocationTest {

    @Test
    public void test00() throws Throwable {
        Location location0 = new Location();
        java.util.List<ContactPoint> list0 = location0.getTelecom();
        java.util.List<ContactPoint> list1 = location0.getTelecom();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        Location location0 = new Location();
        java.util.List<Identifier> list0 = location0.getIdentifier();
        java.util.List<Identifier> list1 = location0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        Location location0 = new Location();
        location0.setPartOf((Reference) null);
    }

    @Test
    public void test03() throws Throwable {
        Location location0 = new Location();
        CodeableConcept codeableConcept0 = location0.getPhysicalType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test04() throws Throwable {
        Location location0 = new Location();
        location0.setAddress((Address) null);
    }

    @Test
    public void test05() throws Throwable {
        Location location0 = new Location();
        String string0 = location0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test06() throws Throwable {
        Location location0 = new Location();
        location0.setManagingOrganization((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        Location location0 = new Location();
        location0.setName((String) null);
    }

    @Test
    public void test08() throws Throwable {
        Location location0 = new Location();
        Reference reference0 = location0.getPartOf();
        assertNull(reference0);
    }

    @Test
    public void test09() throws Throwable {
        Location location0 = new Location();
        location0.setPhysicalType((CodeableConcept) null);
    }

    @Test
    public void test10() throws Throwable {
        Location location0 = new Location();
        LocationStatus locationStatus0 = location0.getStatus();
        assertNull(locationStatus0);
    }

    @Test
    public void test11() throws Throwable {
        Location location0 = new Location();
        location0.setMode((LocationMode) null);
    }

    @Test
    public void test12() throws Throwable {
        Location location0 = new Location();
        location0.setType((CodeableConcept) null);
    }

    @Test
    public void test13() throws Throwable {
        Location location0 = new Location();
        LocationMode locationMode0 = location0.getMode();
        assertNull(locationMode0);
    }

    @Test
    public void test14() throws Throwable {
        Location location0 = new Location();
        Address address0 = location0.getAddress();
        assertNull(address0);
    }

    @Test
    public void test15() throws Throwable {
        Location location0 = new Location();
        location0.setStatus((LocationStatus) null);
    }

    @Test
    public void test16() throws Throwable {
        Location location0 = new Location();
        String string0 = location0.getName();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        Location location0 = new Location();
        Reference reference0 = location0.getManagingOrganization();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        Location location0 = new Location();
        location0.setDescription((String) null);
    }

    @Test
    public void test19() throws Throwable {
        Location location0 = new Location();
        CodeableConcept codeableConcept0 = location0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test20() throws Throwable {
        Location location0 = new Location();
        location0.setPosition((LocationPosition) null);
    }

    @Test
    public void test21() throws Throwable {
        Location location0 = new Location();
        location0.getPosition();
    }
}
