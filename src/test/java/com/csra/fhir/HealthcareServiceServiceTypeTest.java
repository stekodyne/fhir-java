/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:08:18 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class HealthcareServiceServiceTypeTest {

    @Test
    public void test0() throws Throwable {
        HealthcareServiceServiceType healthcareServiceServiceType0 = new HealthcareServiceServiceType();
        java.util.List<CodeableConcept> list0 = healthcareServiceServiceType0.getSpecialty();
        java.util.List<CodeableConcept> list1 = healthcareServiceServiceType0.getSpecialty();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        HealthcareServiceServiceType healthcareServiceServiceType0 = new HealthcareServiceServiceType();
        healthcareServiceServiceType0.setType((CodeableConcept) null);
        assertNull(healthcareServiceServiceType0.getId());
    }

    @Test
    public void test2() throws Throwable {
        HealthcareServiceServiceType healthcareServiceServiceType0 = new HealthcareServiceServiceType();
        healthcareServiceServiceType0.getType();
    }
}
