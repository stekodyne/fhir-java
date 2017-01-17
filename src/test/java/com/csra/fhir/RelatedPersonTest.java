/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:19:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class RelatedPersonTest {

    @Test
    public void test00() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Period period0 = new Period();
        relatedPerson0.period = period0;
        Period period1 = relatedPerson0.getPeriod();
        assertSame(period1, period0);
    }

    @Test
    public void test01() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        relatedPerson0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(0, identifier0);
        java.util.List<Identifier> list0 = relatedPerson0.getIdentifier();
        assertFalse(list0.isEmpty());
        assertNotNull(list0);
    }

    @Test
    public void test02() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        java.util.List<Attachment> list0 = relatedPerson0.getPhoto();
        java.util.List<Attachment> list1 = relatedPerson0.getPhoto();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        java.util.List<Address> list0 = relatedPerson0.getAddress();
        java.util.List<Address> list1 = relatedPerson0.getAddress();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test04() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        java.util.List<ContactPoint> list0 = relatedPerson0.getTelecom();
        java.util.List<ContactPoint> list1 = relatedPerson0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test05() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        java.util.List<Identifier> list0 = relatedPerson0.getIdentifier();
        java.util.List<Identifier> list1 = relatedPerson0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test06() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Code code0 = new Code();
        relatedPerson0.setGender(code0);
        Code code1 = relatedPerson0.getGender();
        assertNull(code1.getValue());
    }

    @Test
    public void test07() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Reference reference0 = new Reference();
        relatedPerson0.setPatient(reference0);
        Reference reference1 = relatedPerson0.getPatient();
        assertNull(reference1.getId());
    }

    @Test
    public void test08() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        relatedPerson0.setRelationship(codeableConcept0);
        CodeableConcept codeableConcept1 = relatedPerson0.getRelationship();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test09() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        HumanName humanName0 = new HumanName();
        relatedPerson0.setName(humanName0);
        HumanName humanName1 = relatedPerson0.getName();
        assertSame(humanName1, humanName0);
    }

    @Test
    public void test10() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Period period0 = new Period();
        relatedPerson0.setPeriod(period0);
        assertNull(period0.getId());
    }

    @Test
    public void test11() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Code code0 = relatedPerson0.getGender();
        assertNull(code0);
    }

    @Test
    public void test12() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        CodeableConcept codeableConcept0 = relatedPerson0.getRelationship();
        assertNull(codeableConcept0);
    }

    @Test
    public void test13() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Date date0 = relatedPerson0.getBirthDate();
        assertNull(date0);
    }

    @Test
    public void test14() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        HumanName humanName0 = relatedPerson0.getName();
        assertNull(humanName0);
    }

    @Test
    public void test15() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Date date0 = new Date();
        relatedPerson0.setBirthDate(date0);
        Date date1 = relatedPerson0.getBirthDate();
        assertNull(date1.getId());
    }

    @Test
    public void test16() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Reference reference0 = relatedPerson0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test17() throws Throwable {
        RelatedPerson relatedPerson0 = new RelatedPerson();
        Period period0 = relatedPerson0.getPeriod();
        assertNull(period0);
    }
}
