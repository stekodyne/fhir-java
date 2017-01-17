/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:40:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class MessageHeaderTest {

    @Test
    public void test00() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        java.util.List<Reference> list0 = messageHeader0.getData();
        java.util.List<Reference> list1 = messageHeader0.getData();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        java.util.List<MessageHeaderDestination> list0 = messageHeader0.getDestination();
        java.util.List<MessageHeaderDestination> list1 = messageHeader0.getDestination();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Instant instant0 = messageHeader0.getTimestamp();
        assertNull(instant0);
    }

    @Test
    public void test03() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Reference reference0 = messageHeader0.getEnterer();
        assertNull(reference0);
    }

    @Test
    public void test04() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setEnterer((Reference) null);
    }

    @Test
    public void test05() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        MessageHeaderSource messageHeaderSource0 = messageHeader0.getSource();
        assertNull(messageHeaderSource0);
    }

    @Test
    public void test06() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setResponse((MessageHeaderResponse) null);
    }

    @Test
    public void test07() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Reference reference0 = messageHeader0.getAuthor();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setSource((MessageHeaderSource) null);
    }

    @Test
    public void test09() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Coding coding0 = messageHeader0.getEvent();
        assertNull(coding0);
    }

    @Test
    public void test10() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Reference reference0 = messageHeader0.getResponsible();
        assertNull(reference0);
    }

    @Test
    public void test11() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setTimestamp((Instant) null);
    }

    @Test
    public void test12() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setResponsible((Reference) null);
    }

    @Test
    public void test13() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setAuthor((Reference) null);
    }

    @Test
    public void test14() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        Reference reference0 = messageHeader0.getReceiver();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        MessageHeaderResponse messageHeaderResponse0 = messageHeader0.getResponse();
        assertNull(messageHeaderResponse0);
    }

    @Test
    public void test16() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setReason((CodeableConcept) null);
    }

    @Test
    public void test17() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setReceiver((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        CodeableConcept codeableConcept0 = messageHeader0.getReason();
        assertNull(codeableConcept0);
    }

    @Test
    public void test19() throws Throwable {
        MessageHeader messageHeader0 = new MessageHeader();
        messageHeader0.setEvent((Coding) null);
    }
}
