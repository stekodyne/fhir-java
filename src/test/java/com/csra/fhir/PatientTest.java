/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:09:08 GMT 2017
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

public class PatientTest {

    @Test
    public void test00() throws Throwable {
        Patient patient0 = new Patient();
        Date date0 = new Date();
        patient0.setBirthDate(date0);
        assertNull(date0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<HumanName> linkedList0 = new LinkedList<HumanName>();
        linkedList0.add((HumanName) null);
        patient0.name = (java.util.List<HumanName>) linkedList0;
        java.util.List<HumanName> list0 = patient0.getName();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        Patient patient0 = new Patient();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        patient0.maritalStatus = codeableConcept0;
        CodeableConcept codeableConcept1 = patient0.getMaritalStatus();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test03() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<PatientLink> linkedList0 = new LinkedList<PatientLink>();
        patient0.link = (java.util.List<PatientLink>) linkedList0;
        PatientLink patientLink0 = new PatientLink();
        linkedList0.add(0, patientLink0);
        java.util.List<PatientLink> list0 = patient0.getLink();
        assertFalse(list0.isEmpty());
        assertNotNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        patient0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        java.util.List<Identifier> list0 = patient0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        Patient patient0 = new Patient();
        Code code0 = new Code();
        patient0.setGender(code0);
        Code code1 = patient0.getGender();
        assertNull(code1.getValue());
    }

    @Test
    public void test06() throws Throwable {
        Patient patient0 = new Patient();
        PatientContact patientContact0 = new PatientContact();
        patient0.deceasedBooleanOrDeceasedDateTime = (Element) patientContact0;
        PatientContact patientContact1 = (PatientContact) patient0.getDeceasedBooleanOrDeceasedDateTime();
        assertSame(patientContact1, patientContact0);
    }

    @Test
    public void test07() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<PatientContact> linkedList0 = new LinkedList<PatientContact>();
        patient0.contact = (java.util.List<PatientContact>) linkedList0;
        PatientContact patientContact0 = new PatientContact();
        linkedList0.add(patientContact0);
        java.util.List<PatientContact> list0 = patient0.getContact();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<PatientCommunication> linkedList0 = new LinkedList<PatientCommunication>();
        PatientCommunication patientCommunication0 = new PatientCommunication();
        linkedList0.add(patientCommunication0);
        patient0.communication = (java.util.List<PatientCommunication>) linkedList0;
        java.util.List<PatientCommunication> list0 = patient0.getCommunication();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test09() throws Throwable {
        Patient patient0 = new Patient();
        Date date0 = new Date();
        patient0.birthDate = date0;
        Date date1 = patient0.getBirthDate();
        assertSame(date1, date0);
    }

    @Test
    public void test10() throws Throwable {
        Patient patient0 = new Patient();
        LinkedList<Address> linkedList0 = new LinkedList<Address>();
        linkedList0.add((Address) null);
        patient0.address = (java.util.List<Address>) linkedList0;
        java.util.List<Address> list0 = patient0.getAddress();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<PatientLink> list0 = patient0.getLink();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test12() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<Reference> list0 = patient0.getCareProvider();
        java.util.List<Reference> list1 = patient0.getCareProvider();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test13() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<PatientCommunication> list0 = patient0.getCommunication();
        java.util.List<PatientCommunication> list1 = patient0.getCommunication();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test14() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<PatientContact> list0 = patient0.getContact();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test15() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<Attachment> list0 = patient0.getPhoto();
        java.util.List<Attachment> list1 = patient0.getPhoto();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<Address> list0 = patient0.getAddress();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test17() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<ContactPoint> list0 = patient0.getTelecom();
        java.util.List<ContactPoint> list1 = patient0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test18() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<HumanName> list0 = patient0.getName();
        assertEquals(0, list0.size());
    }

    @Test
    public void test19() throws Throwable {
        Patient patient0 = new Patient();
        java.util.List<Identifier> list0 = patient0.getIdentifier();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test20() throws Throwable {
        Patient patient0 = new Patient();
        PositiveInt positiveInt0 = (PositiveInt) patient0.getMultipleBirthBooleanOrMultipleBirthInteger();
        assertNull(positiveInt0);
    }

    @Test
    public void test21() throws Throwable {
        Patient patient0 = new Patient();
        Date date0 = patient0.getBirthDate();
        assertNull(date0);
    }

    @Test
    public void test22() throws Throwable {
        Patient patient0 = new Patient();
        IdentifierUse identifierUse0 = new IdentifierUse();
        patient0.setDeceasedBooleanOrDeceasedDateTime(identifierUse0);
        assertNull(identifierUse0.getValue());
    }

    @Test
    public void test23() throws Throwable {
        Patient patient0 = new Patient();
        PatientAnimal patientAnimal0 = new PatientAnimal();
        patient0.setAnimal(patientAnimal0);
        PatientAnimal patientAnimal1 = patient0.getAnimal();
        assertNull(patientAnimal1.getId());
    }

    @Test
    public void test24() throws Throwable {
        Patient patient0 = new Patient();
        CodeableConcept codeableConcept0 = patient0.getMaritalStatus();
        assertNull(codeableConcept0);
    }

    @Test
    public void test25() throws Throwable {
        Patient patient0 = new Patient();
        PatientAnimal patientAnimal0 = patient0.getAnimal();
        assertNull(patientAnimal0);
    }

    @Test
    public void test26() throws Throwable {
        Patient patient0 = new Patient();
        Reference reference0 = new Reference();
        patient0.setManagingOrganization(reference0);
        Reference reference1 = patient0.getManagingOrganization();
        assertSame(reference1, reference0);
    }

    @Test
    public void test27() throws Throwable {
        Patient patient0 = new Patient();
        PositiveInt positiveInt0 = new PositiveInt();
        patient0.setMultipleBirthBooleanOrMultipleBirthInteger(positiveInt0);
        PositiveInt positiveInt1 = (PositiveInt) patient0.getMultipleBirthBooleanOrMultipleBirthInteger();
        assertSame(positiveInt1, positiveInt0);
    }

    @Test
    public void test28() throws Throwable {
        Patient patient0 = new Patient();
        PatientContact patientContact0 = (PatientContact) patient0.getDeceasedBooleanOrDeceasedDateTime();
        assertNull(patientContact0);
    }

    @Test
    public void test29() throws Throwable {
        Patient patient0 = new Patient();
        Boolean boolean0 = new Boolean();
        patient0.setActive(boolean0);
        Boolean boolean1 = patient0.getActive();
        assertSame(boolean1, boolean0);
    }

    @Test
    public void test30() throws Throwable {
        Patient patient0 = new Patient();
        Reference reference0 = patient0.getManagingOrganization();
        assertNull(reference0);
    }

    @Test
    public void test31() throws Throwable {
        Patient patient0 = new Patient();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        patient0.setMaritalStatus(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test32() throws Throwable {
        Patient patient0 = new Patient();
        Boolean boolean0 = patient0.getActive();
        assertNull(boolean0);
    }

    @Test
    public void test33() throws Throwable {
        Patient patient0 = new Patient();
        Code code0 = patient0.getGender();
        assertNull(code0);
    }
}
