/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:28:24 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PractitionerPractitionerRoleTest {

    @Test
    public void test0() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        java.util.List<Reference> list0 = practitionerPractitionerRole0.getHealthcareService();
        java.util.List<Reference> list1 = practitionerPractitionerRole0.getHealthcareService();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        java.util.List<Reference> list0 = practitionerPractitionerRole0.getLocation();
        java.util.List<Reference> list1 = practitionerPractitionerRole0.getLocation();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        java.util.List<CodeableConcept> list0 = practitionerPractitionerRole0.getSpecialty();
        java.util.List<CodeableConcept> list1 = practitionerPractitionerRole0.getSpecialty();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test3() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        practitionerPractitionerRole0.setRole((CodeableConcept) null);
        assertNull(practitionerPractitionerRole0.getId());
    }

    @Test
    public void test4() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        CodeableConcept codeableConcept0 = practitionerPractitionerRole0.getRole();
        assertNull(codeableConcept0);
    }

    @Test
    public void test5() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        Period period0 = practitionerPractitionerRole0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test6() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        practitionerPractitionerRole0.setManagingOrganization((Reference) null);
        assertNull(practitionerPractitionerRole0.getId());
    }

    @Test
    public void test7() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        practitionerPractitionerRole0.setPeriod((Period) null);
        assertNull(practitionerPractitionerRole0.getId());
    }

    @Test
    public void test8() throws Throwable {
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        Reference reference0 = practitionerPractitionerRole0.getManagingOrganization();
        assertNull(reference0);
    }
}
