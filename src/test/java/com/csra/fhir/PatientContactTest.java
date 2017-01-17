/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:12:07 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PatientContactTest {

    @Test
    public void test00() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        java.util.List<ContactPoint> list0 = patientContact0.getTelecom();
        java.util.List<ContactPoint> list1 = patientContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        java.util.List<CodeableConcept> list0 = patientContact0.getRelationship();
        java.util.List<CodeableConcept> list1 = patientContact0.getRelationship();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        Address address0 = patientContact0.getAddress();
        assertNull(address0);
    }

    @Test
    public void test03() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        patientContact0.setOrganization((Reference) null);
        assertNull(patientContact0.getId());
    }

    @Test
    public void test04() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        patientContact0.setName((HumanName) null);
        assertNull(patientContact0.getId());
    }

    @Test
    public void test05() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        patientContact0.setPeriod((Period) null);
        assertNull(patientContact0.getId());
    }

    @Test
    public void test06() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        HumanName humanName0 = patientContact0.getName();
        assertNull(humanName0);
    }

    @Test
    public void test07() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        patientContact0.setGender((Code) null);
        assertNull(patientContact0.getId());
    }

    @Test
    public void test08() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        Code code0 = patientContact0.getGender();
        assertNull(code0);
    }

    @Test
    public void test09() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        patientContact0.setAddress((Address) null);
        assertNull(patientContact0.getId());
    }

    @Test
    public void test10() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        Period period0 = patientContact0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test11() throws Throwable {
        PatientContact patientContact0 = new PatientContact();
        Reference reference0 = patientContact0.getOrganization();
        assertNull(reference0);
    }
}
