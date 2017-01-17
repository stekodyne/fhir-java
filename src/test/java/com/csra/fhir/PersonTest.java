/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:41:21 GMT 2017
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

public class PersonTest {

    @Test
    public void test00() throws Throwable {
        Person person0 = new Person();
        Date date0 = new Date();
        person0.setBirthDate(date0);
        assertNull(date0.getValue());
    }

    @Test
    public void test01() throws Throwable {
        Person person0 = new Person();
        LinkedList<ContactPoint> linkedList0 = new LinkedList<ContactPoint>();
        ContactPoint contactPoint0 = new ContactPoint();
        linkedList0.add(contactPoint0);
        person0.telecom = (java.util.List<ContactPoint>) linkedList0;
        java.util.List<ContactPoint> list0 = person0.getTelecom();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test02() throws Throwable {
        Person person0 = new Person();
        Attachment attachment0 = new Attachment();
        person0.photo = attachment0;
        Attachment attachment1 = person0.getPhoto();
        assertSame(attachment1, attachment0);
    }

    @Test
    public void test03() throws Throwable {
        Person person0 = new Person();
        LinkedList<HumanName> linkedList0 = new LinkedList<HumanName>();
        HumanName humanName0 = new HumanName();
        linkedList0.add(humanName0);
        person0.name = (java.util.List<HumanName>) linkedList0;
        java.util.List<HumanName> list0 = person0.getName();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        Person person0 = new Person();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        person0.identifier = (java.util.List<Identifier>) linkedList0;
        java.util.List<Identifier> list0 = person0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        Person person0 = new Person();
        Code code0 = new Code();
        person0.gender = code0;
        Code code1 = person0.getGender();
        assertNull(code1.getValue());
    }

    @Test
    public void test06() throws Throwable {
        Person person0 = new Person();
        Date date0 = new Date();
        person0.birthDate = date0;
        Date date1 = person0.getBirthDate();
        assertNull(date1.getId());
    }

    @Test
    public void test07() throws Throwable {
        Person person0 = new Person();
        Boolean boolean0 = new Boolean();
        person0.active = boolean0;
        Boolean boolean1 = person0.getActive();
        assertNull(boolean1.getId());
    }

    @Test
    public void test08() throws Throwable {
        Person person0 = new Person();
        java.util.List<PersonLink> list0 = person0.getLink();
        java.util.List<PersonLink> list1 = person0.getLink();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        Person person0 = new Person();
        java.util.List<Address> list0 = person0.getAddress();
        java.util.List<Address> list1 = person0.getAddress();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        Person person0 = new Person();
        java.util.List<ContactPoint> list0 = person0.getTelecom();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        Person person0 = new Person();
        java.util.List<HumanName> list0 = person0.getName();
        java.util.List<HumanName> list1 = person0.getName();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        Person person0 = new Person();
        java.util.List<Identifier> list0 = person0.getIdentifier();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test13() throws Throwable {
        Person person0 = new Person();
        Code code0 = person0.getGender();
        assertNull(code0);
    }

    @Test
    public void test14() throws Throwable {
        Person person0 = new Person();
        Attachment attachment0 = person0.getPhoto();
        assertNull(attachment0);
    }

    @Test
    public void test15() throws Throwable {
        Person person0 = new Person();
        Reference reference0 = new Reference();
        person0.setManagingOrganization(reference0);
        Reference reference1 = person0.getManagingOrganization();
        assertSame(reference1, reference0);
    }

    @Test
    public void test16() throws Throwable {
        Person person0 = new Person();
        Boolean boolean0 = new Boolean();
        person0.setActive(boolean0);
        assertNull(boolean0.getId());
    }

    @Test
    public void test17() throws Throwable {
        Person person0 = new Person();
        Reference reference0 = person0.getManagingOrganization();
        assertNull(reference0);
    }

    @Test
    public void test18() throws Throwable {
        Person person0 = new Person();
        Boolean boolean0 = person0.getActive();
        assertNull(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        Person person0 = new Person();
        Date date0 = person0.getBirthDate();
        assertNull(date0);
    }

    @Test
    public void test20() throws Throwable {
        Person person0 = new Person();
        Code code0 = new Code();
        person0.setGender(code0);
        assertNull(code0.getValue());
    }

    @Test
    public void test21() throws Throwable {
        Person person0 = new Person();
        Attachment attachment0 = new Attachment();
        person0.setPhoto(attachment0);
        assertNull(attachment0.getId());
    }
}
