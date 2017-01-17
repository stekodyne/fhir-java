/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:41:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class GroupTest {

    @Test
    public void test00() throws Throwable {
        Group group0 = new Group();
        java.util.List<GroupMember> list0 = group0.getMember();
        java.util.List<GroupMember> list1 = group0.getMember();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        Group group0 = new Group();
        java.util.List<GroupCharacteristic> list0 = group0.getCharacteristic();
        java.util.List<GroupCharacteristic> list1 = group0.getCharacteristic();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        Group group0 = new Group();
        java.util.List<Identifier> list0 = group0.getIdentifier();
        java.util.List<Identifier> list1 = group0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test03() throws Throwable {
        Group group0 = new Group();
        String string0 = group0.getName();
        assertNull(string0);
    }

    @Test
    public void test04() throws Throwable {
        Group group0 = new Group();
        group0.setType((GroupType) null);
    }

    @Test
    public void test05() throws Throwable {
        Group group0 = new Group();
        Boolean boolean0 = group0.getActual();
        assertNull(boolean0);
    }

    @Test
    public void test06() throws Throwable {
        Group group0 = new Group();
        group0.setActual((Boolean) null);
    }

    @Test
    public void test07() throws Throwable {
        Group group0 = new Group();
        group0.setQuantity((UnsignedInt) null);
    }

    @Test
    public void test08() throws Throwable {
        Group group0 = new Group();
        group0.setName((String) null);
    }

    @Test
    public void test09() throws Throwable {
        Group group0 = new Group();
        CodeableConcept codeableConcept0 = group0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test10() throws Throwable {
        Group group0 = new Group();
        UnsignedInt unsignedInt0 = group0.getQuantity();
        assertNull(unsignedInt0);
    }

    @Test
    public void test11() throws Throwable {
        Group group0 = new Group();
        group0.setCode((CodeableConcept) null);
    }

    @Test
    public void test12() throws Throwable {
        Group group0 = new Group();
        GroupType groupType0 = group0.getType();
        assertNull(groupType0);
    }
}
