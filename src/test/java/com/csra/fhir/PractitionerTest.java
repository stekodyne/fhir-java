/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:16:52 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class PractitionerTest {

    @Test
    public void test00() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        LinkedList<ContactPoint> linkedList0 = new LinkedList<ContactPoint>();
        ContactPoint contactPoint0 = new ContactPoint();
        linkedList0.push(contactPoint0);
        practitioner0.telecom = (java.util.List<ContactPoint>) linkedList0;
        java.util.List<ContactPoint> list0 = practitioner0.getTelecom();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        LinkedList<PractitionerQualification> linkedList0 = new LinkedList<PractitionerQualification>();
        practitioner0.qualification = (java.util.List<PractitionerQualification>) linkedList0;
        PractitionerQualification practitionerQualification0 = new PractitionerQualification();
        linkedList0.add(practitionerQualification0);
        java.util.List<PractitionerQualification> list0 = practitioner0.getQualification();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        LinkedList<PractitionerPractitionerRole> linkedList0 = new LinkedList<PractitionerPractitionerRole>();
        PractitionerPractitionerRole practitionerPractitionerRole0 = new PractitionerPractitionerRole();
        linkedList0.add(practitionerPractitionerRole0);
        practitioner0.practitionerRole = (java.util.List<PractitionerPractitionerRole>) linkedList0;
        java.util.List<PractitionerPractitionerRole> list0 = practitioner0.getPractitionerRole();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test03() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        LinkedList<Attachment> linkedList0 = new LinkedList<Attachment>();
        practitioner0.photo = (java.util.List<Attachment>) linkedList0;
        Attachment attachment0 = new Attachment();
        linkedList0.add(attachment0);
        java.util.List<Attachment> list0 = practitioner0.getPhoto();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test04() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Code code0 = new Code();
        practitioner0.gender = code0;
        Code code1 = practitioner0.getGender();
        assertNull(code1.getValue());
    }

    @Test
    public void test05() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Date date0 = new Date();
        practitioner0.birthDate = date0;
        Date date1 = practitioner0.getBirthDate();
        assertNull(date1.getId());
    }

    @Test
    public void test06() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        LinkedList<Address> linkedList0 = new LinkedList<Address>();
        Address address0 = new Address();
        linkedList0.addFirst(address0);
        practitioner0.address = (java.util.List<Address>) linkedList0;
        java.util.List<Address> list0 = practitioner0.getAddress();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test07() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Boolean boolean0 = new Boolean();
        practitioner0.active = boolean0;
        Boolean boolean1 = practitioner0.getActive();
        assertNull(boolean1.getId());
    }

    @Test
    public void test08() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<CodeableConcept> list0 = practitioner0.getCommunication();
        java.util.List<CodeableConcept> list1 = practitioner0.getCommunication();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test09() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<PractitionerQualification> list0 = practitioner0.getQualification();
        java.util.List<PractitionerQualification> list1 = practitioner0.getQualification();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<PractitionerPractitionerRole> list0 = practitioner0.getPractitionerRole();
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<Attachment> list0 = practitioner0.getPhoto();
        java.util.List<Attachment> list1 = practitioner0.getPhoto();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test12() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<Address> list0 = practitioner0.getAddress();
        java.util.List<Address> list1 = practitioner0.getAddress();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<ContactPoint> list0 = practitioner0.getTelecom();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test14() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        java.util.List<Identifier> list0 = practitioner0.getIdentifier();
        java.util.List<Identifier> list1 = practitioner0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test15() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Date date0 = new Date();
        practitioner0.setBirthDate(date0);
        assertNull(date0.getValue());
    }

    @Test
    public void test16() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Boolean boolean0 = practitioner0.getActive();
        assertNull(boolean0);
    }

    @Test
    public void test17() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Date date0 = practitioner0.getBirthDate();
        assertNull(date0);
    }

    @Test
    public void test18() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        HumanName humanName0 = practitioner0.getName();
        assertNull(humanName0);
    }

    @Test
    public void test19() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Code code0 = new Code();
        practitioner0.setGender(code0);
        assertNull(code0.getId());
    }

    @Test
    public void test20() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        HumanName humanName0 = new HumanName();
        practitioner0.setName(humanName0);
        HumanName humanName1 = practitioner0.getName();
        assertSame(humanName1, humanName0);
    }

    @Test
    public void test21() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Boolean boolean0 = new Boolean();
        practitioner0.setActive(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test22() throws Throwable {
        Practitioner practitioner0 = new Practitioner();
        Code code0 = practitioner0.getGender();
        assertNull(code0);
    }
}
