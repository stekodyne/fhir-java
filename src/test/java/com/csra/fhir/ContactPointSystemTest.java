/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:55:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class ContactPointSystemTest {

    @Test
    public void test0() throws Throwable {
        ContactPointSystem contactPointSystem0 = new ContactPointSystem();
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.PHONE;
        contactPointSystem0.setValue(contactPointSystemList0);
        contactPointSystem0.getValue();
        ContactPointSystemList contactPointSystemList1 = ContactPointSystemList.PAGER;
        contactPointSystem0.value = contactPointSystemList1;
    }

    @Test
    public void test1() throws Throwable {
        ContactPointSystem contactPointSystem0 = new ContactPointSystem();
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.EMAIL;
        contactPointSystem0.value = contactPointSystemList0;
        contactPointSystem0.getValue();
    }

    @Test
    public void test2() throws Throwable {
        ContactPointSystem contactPointSystem0 = new ContactPointSystem();
        ContactPointSystemList contactPointSystemList0 = ContactPointSystemList.PAGER;
        contactPointSystem0.setValue(contactPointSystemList0);
    }

    @Test
    public void test3() throws Throwable {
        ContactPointSystem contactPointSystem0 = new ContactPointSystem();
        contactPointSystem0.getValue();
        contactPointSystem0.setValue((ContactPointSystemList) null);
    }
}
