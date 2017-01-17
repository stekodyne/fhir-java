/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:01:28 GMT 2017
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

public class HumanNameTest {

    @Test
    public void test00() throws Throwable {
        HumanName humanName0 = new HumanName();
        NameUse nameUse0 = new NameUse();
        humanName0.setUse(nameUse0);
        NameUse nameUse1 = humanName0.getUse();
        assertSame(nameUse1, nameUse0);
    }

    @Test
    public void test01() throws Throwable {
        HumanName humanName0 = new HumanName();
        String string0 = new String();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add(string0);
        humanName0.suffix = (java.util.List<String>) linkedList0;
        java.util.List<String> list0 = humanName0.getSuffix();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test02() throws Throwable {
        HumanName humanName0 = new HumanName();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add((String) null);
        humanName0.prefix = (java.util.List<String>) linkedList0;
        java.util.List<String> list0 = humanName0.getPrefix();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        HumanName humanName0 = new HumanName();
        String string0 = new String();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add(string0);
        humanName0.family = (java.util.List<String>) linkedList0;
        java.util.List<String> list0 = humanName0.getFamily();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test04() throws Throwable {
        HumanName humanName0 = new HumanName();
        java.util.List<String> list0 = humanName0.getSuffix();
        java.util.List<String> list1 = humanName0.getSuffix();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test05() throws Throwable {
        HumanName humanName0 = new HumanName();
        java.util.List<String> list0 = humanName0.getPrefix();
        assertEquals(0, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        HumanName humanName0 = new HumanName();
        java.util.List<String> list0 = humanName0.getGiven();
        java.util.List<String> list1 = humanName0.getGiven();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        HumanName humanName0 = new HumanName();
        java.util.List<String> list0 = humanName0.getFamily();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        HumanName humanName0 = new HumanName();
        Period period0 = humanName0.getPeriod();
        assertNull(period0);
    }

    @Test
    public void test09() throws Throwable {
        HumanName humanName0 = new HumanName();
        String string0 = new String();
        humanName0.setText(string0);
        String string1 = humanName0.getText();
        assertNull(string1.getId());
    }

    @Test
    public void test10() throws Throwable {
        HumanName humanName0 = new HumanName();
        String string0 = humanName0.getText();
        assertNull(string0);
    }

    @Test
    public void test11() throws Throwable {
        HumanName humanName0 = new HumanName();
        NameUse nameUse0 = humanName0.getUse();
        humanName0.setUse(nameUse0);
        assertNull(humanName0.getId());
    }

    @Test
    public void test12() throws Throwable {
        HumanName humanName0 = new HumanName();
        Period period0 = new Period();
        humanName0.setPeriod(period0);
        Period period1 = humanName0.getPeriod();
        assertNull(period1.getId());
    }
}
