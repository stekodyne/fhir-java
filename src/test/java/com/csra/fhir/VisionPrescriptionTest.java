/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:13:00 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class VisionPrescriptionTest {

    @Test
    public void test00() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        java.util.List<VisionPrescriptionDispense> list0 = visionPrescription0.getDispense();
        java.util.List<VisionPrescriptionDispense> list1 = visionPrescription0.getDispense();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        java.util.List<Identifier> list0 = visionPrescription0.getIdentifier();
        java.util.List<Identifier> list1 = visionPrescription0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        Reference reference0 = visionPrescription0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test03() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        visionPrescription0.setPrescriber((Reference) null);
    }

    @Test
    public void test04() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        visionPrescription0.setDateWritten((DateTime) null);
    }

    @Test
    public void test05() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        visionPrescription0.setReasonCodeableConceptOrReasonReference((Element) null);
    }

    @Test
    public void test06() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        Reference reference0 = visionPrescription0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test07() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        DateTime dateTime0 = visionPrescription0.getDateWritten();
        assertNull(dateTime0);
    }

    @Test
    public void test08() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        Element element0 = visionPrescription0.getReasonCodeableConceptOrReasonReference();
        assertNull(element0);
    }

    @Test
    public void test09() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        visionPrescription0.setPatient((Reference) null);
    }

    @Test
    public void test10() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        visionPrescription0.setEncounter((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        VisionPrescription visionPrescription0 = new VisionPrescription();
        Reference reference0 = visionPrescription0.getPrescriber();
        assertNull(reference0);
    }
}
