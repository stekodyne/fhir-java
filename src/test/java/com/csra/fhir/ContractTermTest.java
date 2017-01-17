/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:54:16 GMT 2017
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

public class ContractTermTest {

    @Test
    public void test00() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        LinkedList<ContractValuedItem1> linkedList0 = new LinkedList<ContractValuedItem1>();
        contractTerm0.valuedItem = (java.util.List<ContractValuedItem1>) linkedList0;
        ContractValuedItem1 contractValuedItem1_0 = new ContractValuedItem1();
        linkedList0.add(contractValuedItem1_0);
        java.util.List<ContractValuedItem1> list0 = contractTerm0.getValuedItem();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test01() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        contractTerm0.subType = codeableConcept0;
        CodeableConcept codeableConcept1 = contractTerm0.getSubType();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test02() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        LinkedList<ContractTerm> linkedList0 = new LinkedList<ContractTerm>();
        contractTerm0.group = (java.util.List<ContractTerm>) linkedList0;
        linkedList0.add(contractTerm0);
        java.util.List<ContractTerm> list0 = contractTerm0.getGroup();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test03() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Period period0 = new Period();
        contractTerm0.setApplies(period0);
        Period period1 = contractTerm0.getApplies();
        assertSame(period1, period0);
    }

    @Test
    public void test04() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        LinkedList<ContractActor1> linkedList0 = new LinkedList<ContractActor1>();
        contractTerm0.actor = (java.util.List<ContractActor1>) linkedList0;
        ContractActor1 contractActor1_0 = new ContractActor1();
        linkedList0.add(contractActor1_0);
        java.util.List<ContractActor1> list0 = contractTerm0.getActor();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test05() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        java.util.List<ContractTerm> list0 = contractTerm0.getGroup();
        assertEquals(0, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        java.util.List<ContractValuedItem1> list0 = contractTerm0.getValuedItem();
        java.util.List<ContractValuedItem1> list1 = contractTerm0.getValuedItem();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        java.util.List<ContractActor1> list0 = contractTerm0.getActor();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test08() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        java.util.List<CodeableConcept> list0 = contractTerm0.getActionReason();
        java.util.List<CodeableConcept> list1 = contractTerm0.getActionReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test09() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        java.util.List<CodeableConcept> list0 = contractTerm0.getAction();
        java.util.List<CodeableConcept> list1 = contractTerm0.getAction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        contractTerm0.setSubType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test11() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        String string0 = contractTerm0.getText();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        DateTime dateTime0 = new DateTime();
        contractTerm0.setIssued(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test13() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        String string0 = new String();
        contractTerm0.setText(string0);
        String string1 = contractTerm0.getText();
        assertSame(string1, string0);
    }

    @Test
    public void test14() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        DateTime dateTime0 = contractTerm0.getIssued();
        assertNull(dateTime0);
    }

    @Test
    public void test15() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        CodeableConcept codeableConcept0 = contractTerm0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test16() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Identifier identifier0 = new Identifier();
        contractTerm0.setIdentifier(identifier0);
        Identifier identifier1 = contractTerm0.getIdentifier();
        assertNull(identifier1.getId());
    }

    @Test
    public void test17() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        CodeableConcept codeableConcept0 = contractTerm0.getSubType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test18() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Identifier identifier0 = contractTerm0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test19() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Period period0 = contractTerm0.getApplies();
        assertNull(period0);
    }

    @Test
    public void test20() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        contractTerm0.setType(codeableConcept0);
        CodeableConcept codeableConcept1 = contractTerm0.getType();
        assertNull(codeableConcept1.getId());
    }

    @Test
    public void test21() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Reference reference0 = contractTerm0.getSubject();
        assertNull(reference0);
    }

    @Test
    public void test22() throws Throwable {
        ContractTerm contractTerm0 = new ContractTerm();
        Reference reference0 = new Reference();
        contractTerm0.setSubject(reference0);
        contractTerm0.getSubject();
    }
}
