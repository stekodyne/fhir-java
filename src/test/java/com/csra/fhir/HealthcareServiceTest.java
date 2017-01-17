/*
 * This file was created by Steffen Kory
 * Mon Jan 16 16:59:40 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HealthcareServiceTest {

    @Test
    public void test00() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        healthcareService0.setServiceCategory(codeableConcept0);
        CodeableConcept codeableConcept1 = healthcareService0.getServiceCategory();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test01() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        healthcareService0.referralMethod = (java.util.List<CodeableConcept>) linkedList0;
        linkedList0.add((CodeableConcept) null);
        java.util.List<CodeableConcept> list0 = healthcareService0.getReferralMethod();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = new Reference();
        healthcareService0.providedBy = reference0;
        Reference reference1 = healthcareService0.getProvidedBy();
        assertSame(reference1, reference0);
    }

    @Test
    public void test03() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Attachment attachment0 = new Attachment();
        healthcareService0.setPhoto(attachment0);
        Attachment attachment1 = healthcareService0.getPhoto();
        assertNull(attachment1.getId());
    }

    @Test
    public void test04() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = new Reference();
        healthcareService0.location = reference0;
        Reference reference1 = healthcareService0.getLocation();
        assertSame(reference1, reference0);
    }

    @Test
    public void test05() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        healthcareService0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        java.util.List<Identifier> list0 = healthcareService0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        healthcareService0.characteristic = (java.util.List<CodeableConcept>) linkedList0;
        CodeableConcept codeableConcept0 = new CodeableConcept();
        linkedList0.add(codeableConcept0);
        java.util.List<CodeableConcept> list0 = healthcareService0.getCharacteristic();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test07() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<HealthcareServiceNotAvailable> list0 = healthcareService0.getNotAvailable();
        java.util.List<HealthcareServiceNotAvailable> list1 = healthcareService0.getNotAvailable();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<HealthcareServiceAvailableTime> list0 = healthcareService0.getAvailableTime();
        java.util.List<HealthcareServiceAvailableTime> list1 = healthcareService0.getAvailableTime();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<CodeableConcept> list0 = healthcareService0.getReferralMethod();
        java.util.List<CodeableConcept> list1 = healthcareService0.getReferralMethod();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<CodeableConcept> list0 = healthcareService0.getCharacteristic();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<String> list0 = healthcareService0.getProgramName();
        java.util.List<String> list1 = healthcareService0.getProgramName();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<CodeableConcept> list0 = healthcareService0.getServiceProvisionCode();
        java.util.List<CodeableConcept> list1 = healthcareService0.getServiceProvisionCode();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<Reference> list0 = healthcareService0.getCoverageArea();
        java.util.List<Reference> list1 = healthcareService0.getCoverageArea();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<ContactPoint> list0 = healthcareService0.getTelecom();
        java.util.List<ContactPoint> list1 = healthcareService0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test15() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<HealthcareServiceServiceType> list0 = healthcareService0.getServiceType();
        java.util.List<HealthcareServiceServiceType> list1 = healthcareService0.getServiceType();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        java.util.List<Identifier> list0 = healthcareService0.getIdentifier();
        java.util.List<Identifier> list1 = healthcareService0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test17() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setServiceName(string0);
        String string1 = healthcareService0.getServiceName();
        assertSame(string1, string0);
    }

    @Test
    public void test18() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        CodeableConcept codeableConcept0 = healthcareService0.getEligibility();
        assertNull(codeableConcept0);
    }

    @Test
    public void test19() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setPublicKey(string0);
        String string1 = healthcareService0.getPublicKey();
        assertSame(string1, string0);
    }

    @Test
    public void test20() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getEligibilityNote();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = healthcareService0.getLocation();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = new Reference();
        healthcareService0.setLocation(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test23() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        CodeableConcept codeableConcept0 = healthcareService0.getServiceCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test24() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Boolean boolean0 = healthcareService0.getAppointmentRequired();
        assertNull(boolean0);
    }

    @Test
    public void test25() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Boolean boolean0 = new Boolean();
        healthcareService0.setAppointmentRequired(boolean0);
        Boolean boolean1 = healthcareService0.getAppointmentRequired();
        assertNull(boolean1.getId());
    }

    @Test
    public void test26() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = healthcareService0.getProvidedBy();
        assertNull(reference0);
    }

    @Test
    public void test27() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Attachment attachment0 = healthcareService0.getPhoto();
        assertNull(attachment0);
    }

    @Test
    public void test28() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setComment(string0);
        String string1 = healthcareService0.getComment();
        assertNull(string1.getValue());
    }

    @Test
    public void test29() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getExtraDetails();
        assertNull(string0);
    }

    @Test
    public void test30() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getPublicKey();
        assertNull(string0);
    }

    @Test
    public void test31() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        healthcareService0.setEligibility(codeableConcept0);
        CodeableConcept codeableConcept1 = healthcareService0.getEligibility();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test32() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setAvailabilityExceptions(string0);
        String string1 = healthcareService0.getAvailabilityExceptions();
        assertSame(string1, string0);
    }

    @Test
    public void test33() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getAvailabilityExceptions();
        assertNull(string0);
    }

    @Test
    public void test34() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setEligibilityNote(string0);
        String string1 = healthcareService0.getEligibilityNote();
        assertSame(string1, string0);
    }

    @Test
    public void test35() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        Reference reference0 = new Reference();
        healthcareService0.setProvidedBy(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test36() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getServiceName();
        assertNull(string0);
    }

    @Test
    public void test37() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = new String();
        healthcareService0.setExtraDetails(string0);
        String string1 = healthcareService0.getExtraDetails();
        assertNull(string1.getValue());
    }

    @Test
    public void test38() throws Throwable {
        HealthcareService healthcareService0 = new HealthcareService();
        String string0 = healthcareService0.getComment();
        assertNull(string0);
    }
}
