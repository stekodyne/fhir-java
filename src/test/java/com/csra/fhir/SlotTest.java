/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:17:50 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SlotTest {

    @Test
    public void test00() throws Throwable {
        Slot slot0 = new Slot();
        java.util.List<Identifier> list0 = slot0.getIdentifier();
        java.util.List<Identifier> list1 = slot0.getIdentifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setSchedule((Reference) null);
    }

    @Test
    public void test02() throws Throwable {
        Slot slot0 = new Slot();
        SlotStatus slotStatus0 = slot0.getFreeBusyType();
        assertNull(slotStatus0);
    }

    @Test
    public void test03() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setEnd((Instant) null);
    }

    @Test
    public void test04() throws Throwable {
        Slot slot0 = new Slot();
        Boolean boolean0 = slot0.getOverbooked();
        assertNull(boolean0);
    }

    @Test
    public void test05() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setFreeBusyType((SlotStatus) null);
    }

    @Test
    public void test06() throws Throwable {
        Slot slot0 = new Slot();
        Instant instant0 = slot0.getEnd();
        assertNull(instant0);
    }

    @Test
    public void test07() throws Throwable {
        Slot slot0 = new Slot();
        Reference reference0 = slot0.getSchedule();
        assertNull(reference0);
    }

    @Test
    public void test08() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setComment((String) null);
    }

    @Test
    public void test09() throws Throwable {
        Slot slot0 = new Slot();
        String string0 = slot0.getComment();
        assertNull(string0);
    }

    @Test
    public void test10() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setType((CodeableConcept) null);
    }

    @Test
    public void test11() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setStart((Instant) null);
    }

    @Test
    public void test12() throws Throwable {
        Slot slot0 = new Slot();
        slot0.setOverbooked((Boolean) null);
    }

    @Test
    public void test13() throws Throwable {
        Slot slot0 = new Slot();
        Instant instant0 = slot0.getStart();
        assertNull(instant0);
    }

    @Test
    public void test14() throws Throwable {
        Slot slot0 = new Slot();
        CodeableConcept codeableConcept0 = slot0.getType();
        assertNull(codeableConcept0);
    }
}
