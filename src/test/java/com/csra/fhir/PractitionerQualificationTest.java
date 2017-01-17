/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:09:46 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class PractitionerQualificationTest {

    @Test
    public void test0() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        java.util.List<Identifier> list0 = practitionerQualification0.getIdentifier();
        java.util.List<Identifier> list1 = practitionerQualification0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        practitionerQualification0.setCode((CodeableConcept) null);
        assertNull(practitionerQualification0.getId());
    }

    @Test
    public void test2() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        CodeableConcept codeableConcept0 = practitionerQualification0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test3() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        Reference reference0 = practitionerQualification0.getIssuer();
        assertNull(reference0);
    }

    @Test
    public void test4() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        practitionerQualification0.setIssuer((Reference) null);
        assertNull(practitionerQualification0.getId());
    }

    @Test
    public void test5() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        practitionerQualification0.setPeriod((Period) null);
        assertNull(practitionerQualification0.getId());
    }

    @Test
    public void test6() throws Throwable {
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        practitionerQualification0.getPeriod();
    }
}
