/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:16:56 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OrganizationTest {

    @Test
    public void test00() throws Throwable {
        Organization organization0 = new Organization();
        java.util.List<OrganizationContact> list0 = organization0.getContact();
        java.util.List<OrganizationContact> list1 = organization0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Organization organization0 = new Organization();
        java.util.List<Address> list0 = organization0.getAddress();
        java.util.List<Address> list1 = organization0.getAddress();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        Organization organization0 = new Organization();
        java.util.List<ContactPoint> list0 = organization0.getTelecom();
        java.util.List<ContactPoint> list1 = organization0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        Organization organization0 = new Organization();
        java.util.List<Identifier> list0 = organization0.getIdentifier();
        java.util.List<Identifier> list1 = organization0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        Organization organization0 = new Organization();
        organization0.setPartOf((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        Organization organization0 = new Organization();
        CodeableConcept codeableConcept0 = organization0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        Organization organization0 = new Organization();
        organization0.setActive((Boolean) null);
    }

    @Test
    public void test07() throws Throwable {
        Organization organization0 = new Organization();
        Reference reference0 = organization0.getPartOf();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        Organization organization0 = new Organization();
        String string0 = organization0.getName();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Organization organization0 = new Organization();
        organization0.setName((String) null);
    }

    @Test
    public void test10() throws Throwable {
        Organization organization0 = new Organization();
        Boolean boolean0 = organization0.getActive();
        assertNull(boolean0);
    }

    @Test
    public void test11() throws Throwable {
        Organization organization0 = new Organization();
        organization0.setType((CodeableConcept) null);
    }
}
