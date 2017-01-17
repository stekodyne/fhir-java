/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:14:14 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OrganizationContactTest {

    @Test
    public void test0() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        java.util.List<ContactPoint> list0 = organizationContact0.getTelecom();
        java.util.List<ContactPoint> list1 = organizationContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        organizationContact0.setPurpose((CodeableConcept) null);
        assertNull(organizationContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        Address address0 = organizationContact0.getAddress();
        assertNull(address0);
    }

    @Test
    public void test3() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        HumanName humanName0 = organizationContact0.getName();
        assertNull(humanName0);
    }

    @Test
    public void test4() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        organizationContact0.setName((HumanName) null);
        assertNull(organizationContact0.getId());
    }

    @Test
    public void test5() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        CodeableConcept codeableConcept0 = organizationContact0.getPurpose();
        assertNull(codeableConcept0);
    }

    @Test
    public void test6() throws Throwable {
        OrganizationContact organizationContact0 = new OrganizationContact();
        organizationContact0.setAddress((Address) null);
        assertNull(organizationContact0.getId());
    }
}
