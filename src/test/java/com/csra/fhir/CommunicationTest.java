/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:46:39 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class CommunicationTest {

    @Test
    public void test00() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.setSubject(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test01() throws Throwable {
        Communication communication0 = new Communication();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        communication0.setCategory(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test02() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.subject = reference0;
        Reference reference1 = communication0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test03() throws Throwable {
        Communication communication0 = new Communication();
        DateTime dateTime0 = new DateTime();
        communication0.sent = dateTime0;
        DateTime dateTime1 = communication0.getSent();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test04() throws Throwable {
        Communication communication0 = new Communication();
        LinkedList<CommunicationPayload> linkedList0 = new LinkedList<CommunicationPayload>();
        communication0.payload = (java.util.List<CommunicationPayload>) linkedList0;
        CommunicationPayload communicationPayload0 = new CommunicationPayload();
        linkedList0.add(communicationPayload0);
        java.util.List<CommunicationPayload> list0 = communication0.getPayload();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.encounter = reference0;
        Reference reference1 = communication0.getEncounter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test06() throws Throwable {
        Communication communication0 = new Communication();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        communication0.category = codeableConcept0;
        CodeableConcept codeableConcept1 = communication0.getCategory();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test07() throws Throwable {
        Communication communication0 = new Communication();
        java.util.List<CodeableConcept> list0 = communication0.getReason();
        java.util.List<CodeableConcept> list1 = communication0.getReason();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        Communication communication0 = new Communication();
        java.util.List<CodeableConcept> list0 = communication0.getMedium();
        java.util.List<CodeableConcept> list1 = communication0.getMedium();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        Communication communication0 = new Communication();
        java.util.List<CommunicationPayload> list0 = communication0.getPayload();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test10() throws Throwable {
        Communication communication0 = new Communication();
        java.util.List<Reference> list0 = communication0.getRecipient();
        java.util.List<Reference> list1 = communication0.getRecipient();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test11() throws Throwable {
        Communication communication0 = new Communication();
        java.util.List<Identifier> list0 = communication0.getIdentifier();
        java.util.List<Identifier> list1 = communication0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = communication0.getRequestDetail();
        assertNull(reference0);
    }

    @Test
    public void test13() throws Throwable {
        Communication communication0 = new Communication();
        CommunicationStatus communicationStatus0 = new CommunicationStatus();
        communication0.setStatus(communicationStatus0);
        CommunicationStatus communicationStatus1 = communication0.getStatus();
        assertSame(communicationStatus1, communicationStatus0);
    }

    @Test
    public void test14() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = communication0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        Communication communication0 = new Communication();
        DateTime dateTime0 = new DateTime();
        communication0.setSent(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test16() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.setSender(reference0);
        Reference reference1 = communication0.getSender();
        assertNull(reference1.getId());
    }

    @Test
    public void test17() throws Throwable {
        Communication communication0 = new Communication();
        DateTime dateTime0 = communication0.getReceived();
        assertNull(dateTime0);
    }

    @Test
    public void test18() throws Throwable {
        Communication communication0 = new Communication();
        CommunicationStatus communicationStatus0 = communication0.getStatus();
        assertNull(communicationStatus0);
    }

    @Test
    public void test19() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test20() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = communication0.getSender();
        assertNull(reference0);
    }

    @Test
    public void test21() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = new Reference();
        communication0.setRequestDetail(reference0);
        Reference reference1 = communication0.getRequestDetail();
        assertNull(reference1.getId());
    }

    @Test
    public void test22() throws Throwable {
        Communication communication0 = new Communication();
        CodeableConcept codeableConcept0 = communication0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test23() throws Throwable {
        Communication communication0 = new Communication();
        DateTime dateTime0 = communication0.getSent();
        assertNull(dateTime0);
    }

    @Test
    public void test24() throws Throwable {
        Communication communication0 = new Communication();
        DateTime dateTime0 = new DateTime();
        communication0.setReceived(dateTime0);
        DateTime dateTime1 = communication0.getReceived();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test25() throws Throwable {
        Communication communication0 = new Communication();
        Reference reference0 = communication0.getEncounter();
        assertNull(reference0);
    }
}
