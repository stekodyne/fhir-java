/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:36:13 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class CommunicationRequestTest {

    @Test
    public void test00() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CommunicationRequestStatus communicationRequestStatus0 = new CommunicationRequestStatus();
        communicationRequest0.setStatus(communicationRequestStatus0);
        assertNull(communicationRequestStatus0.getId());
    }

    @Test
    public void test01() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.setSubject(reference0);
        Reference reference1 = communicationRequest0.getRequester();
        assertNull(reference1);
    }

    @Test
    public void test02() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.sender = reference0;
        Reference reference1 = communicationRequest0.getRequester();
        assertNull(reference1);
    }

    @Test
    public void test03() throws Throwable {
        CodeableConcept codeableConcept0 = new CodeableConcept();
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        communicationRequest0.setCategory(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test04() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CommunicationRequestStatus communicationRequestStatus0 = new CommunicationRequestStatus();
        communicationRequest0.status = communicationRequestStatus0;
        CommunicationRequestStatus communicationRequestStatus1 = communicationRequest0.getStatus();
        assertSame(communicationRequestStatus1, communicationRequestStatus0);
    }

    @Test
    public void test05() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.sender = reference0;
        Reference reference1 = communicationRequest0.getSender();
        assertSame(reference1, reference0);
    }

    @Test
    public void test06() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        NarrativeStatus narrativeStatus0 = new NarrativeStatus();
        communicationRequest0.setScheduledDateTimeOrScheduledPeriod(narrativeStatus0);
        NarrativeStatus narrativeStatus1 = (NarrativeStatus) communicationRequest0.getScheduledDateTimeOrScheduledPeriod();
        assertNull(narrativeStatus1.getValue());
    }

    @Test
    public void test07() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        DateTime dateTime0 = new DateTime();
        communicationRequest0.requestedOn = dateTime0;
        DateTime dateTime1 = communicationRequest0.getRequestedOn();
        assertNull(dateTime1.getId());
    }

    @Test
    public void test08() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        communicationRequest0.recipient = (java.util.List<Reference>) linkedList0;
        linkedList0.add((Reference) null);
        java.util.List<Reference> list0 = communicationRequest0.getRecipient();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test09() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        LinkedList<Identifier> linkedList0 = new LinkedList<Identifier>();
        communicationRequest0.identifier = (java.util.List<Identifier>) linkedList0;
        Identifier identifier0 = new Identifier();
        linkedList0.add(identifier0);
        java.util.List<Identifier> list0 = communicationRequest0.getIdentifier();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.encounter = reference0;
        Reference reference1 = communicationRequest0.getEncounter();
        assertSame(reference1, reference0);
    }

    @Test
    public void test11() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        communicationRequest0.category = codeableConcept0;
        CodeableConcept codeableConcept1 = communicationRequest0.getCategory();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test12() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        java.util.List<CodeableConcept> list0 = communicationRequest0.getReason();
        java.util.List<CodeableConcept> list1 = communicationRequest0.getReason();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        java.util.List<CodeableConcept> list0 = communicationRequest0.getMedium();
        java.util.List<CodeableConcept> list1 = communicationRequest0.getMedium();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test14() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        java.util.List<CommunicationRequestPayload> list0 = communicationRequest0.getPayload();
        java.util.List<CommunicationRequestPayload> list1 = communicationRequest0.getPayload();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test15() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        java.util.List<Reference> list0 = communicationRequest0.getRecipient();
        java.util.List<Reference> list1 = communicationRequest0.getRecipient();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        java.util.List<Identifier> list0 = communicationRequest0.getIdentifier();
        assertEquals(0, list0.size());
    }

    @Test
    public void test17() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CodeableConcept codeableConcept0 = communicationRequest0.getCategory();
        assertNull(codeableConcept0);
    }

    @Test
    public void test18() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.setSender(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test19() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CodeableConcept codeableConcept0 = communicationRequest0.getPriority();
        assertNull(codeableConcept0);
    }

    @Test
    public void test20() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.setSubject(reference0);
        Reference reference1 = communicationRequest0.getSubject();
        assertSame(reference1, reference0);
    }

    @Test
    public void test21() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = communicationRequest0.getSender();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.setRequester(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test23() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        DateTime dateTime0 = new DateTime();
        communicationRequest0.setRequestedOn(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test24() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = new Reference();
        communicationRequest0.setEncounter(reference0);
        assertNull(reference0.getId());
    }

    @Test
    public void test25() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        communicationRequest0.setPriority(codeableConcept0);
        CodeableConcept codeableConcept1 = communicationRequest0.getPriority();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test26() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = communicationRequest0.getEncounter();
        assertNull(reference0);
    }

    @Test
    public void test27() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        DateTime dateTime0 = communicationRequest0.getRequestedOn();
        assertNull(dateTime0);
    }

    @Test
    public void test28() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Reference reference0 = communicationRequest0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test29() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        Element element0 = communicationRequest0.getScheduledDateTimeOrScheduledPeriod();
        assertNull(element0);
    }

    @Test
    public void test30() throws Throwable {
        CommunicationRequest communicationRequest0 = new CommunicationRequest();
        CommunicationRequestStatus communicationRequestStatus0 = communicationRequest0.getStatus();
        assertNull(communicationRequestStatus0);
    }
}
