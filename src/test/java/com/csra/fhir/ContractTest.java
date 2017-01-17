/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:04:15 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ContractTest {

    @Test
    public void test00() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<ContractValuedItem> linkedList0 = new LinkedList<ContractValuedItem>();
        ContractValuedItem contractValuedItem0 = new ContractValuedItem();
        linkedList0.addFirst(contractValuedItem0);
        contract0.valuedItem = (java.util.List<ContractValuedItem>) linkedList0;
        java.util.List<ContractValuedItem> list0 = contract0.getValuedItem();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test01() throws Throwable {
        Contract contract0 = new Contract();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        contract0.type = codeableConcept0;
        CodeableConcept codeableConcept1 = contract0.getType();
        assertSame(codeableConcept1, codeableConcept0);
    }

    @Test
    public void test02() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        contract0.subType = (java.util.List<CodeableConcept>) linkedList0;
        linkedList0.add((CodeableConcept) null);
        java.util.List<CodeableConcept> list0 = contract0.getSubType();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test03() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<ContractRule> linkedList0 = new LinkedList<ContractRule>();
        linkedList0.add((ContractRule) null);
        contract0.rule = (java.util.List<ContractRule>) linkedList0;
        java.util.List<ContractRule> list0 = contract0.getRule();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        Contract contract0 = new Contract();
        DateTime dateTime0 = new DateTime();
        contract0.issued = dateTime0;
        DateTime dateTime1 = contract0.getIssued();
        assertSame(dateTime1, dateTime0);
    }

    @Test
    public void test05() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<ContractFriendly> linkedList0 = new LinkedList<ContractFriendly>();
        ContractFriendly contractFriendly0 = new ContractFriendly();
        linkedList0.add(contractFriendly0);
        contract0.friendly = (java.util.List<ContractFriendly>) linkedList0;
        java.util.List<ContractFriendly> list0 = contract0.getFriendly();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test06() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<Reference> linkedList0 = new LinkedList<Reference>();
        contract0.authority = (java.util.List<Reference>) linkedList0;
        linkedList0.add((Reference) null);
        java.util.List<Reference> list0 = contract0.getAuthority();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test07() throws Throwable {
        Contract contract0 = new Contract();
        LinkedList<ContractActor> linkedList0 = new LinkedList<ContractActor>();
        contract0.actor = (java.util.List<ContractActor>) linkedList0;
        ContractActor contractActor0 = new ContractActor();
        linkedList0.add(contractActor0);
        java.util.List<ContractActor> list0 = contract0.getActor();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractRule> list0 = contract0.getRule();
        assertEquals(0, list0.size());
    }

    @Test
    public void test09() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractLegal> list0 = contract0.getLegal();
        java.util.List<ContractLegal> list1 = contract0.getLegal();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractFriendly> list0 = contract0.getFriendly();
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractTerm> list0 = contract0.getTerm();
        java.util.List<ContractTerm> list1 = contract0.getTerm();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test12() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractSigner> list0 = contract0.getSigner();
        java.util.List<ContractSigner> list1 = contract0.getSigner();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractValuedItem> list0 = contract0.getValuedItem();
        assertEquals(0, list0.size());
    }

    @Test
    public void test14() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<ContractActor> list0 = contract0.getActor();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test15() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<CodeableConcept> list0 = contract0.getActionReason();
        java.util.List<CodeableConcept> list1 = contract0.getActionReason();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test16() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<CodeableConcept> list0 = contract0.getAction();
        java.util.List<CodeableConcept> list1 = contract0.getAction();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test17() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<CodeableConcept> list0 = contract0.getSubType();
        assertEquals(0, list0.size());
    }

    @Test
    public void test18() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<Reference> list0 = contract0.getDomain();
        java.util.List<Reference> list1 = contract0.getDomain();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test19() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<Reference> list0 = contract0.getAuthority();
        java.util.List<Reference> list1 = contract0.getAuthority();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test20() throws Throwable {
        Contract contract0 = new Contract();
        java.util.List<Reference> list0 = contract0.getSubject();
        java.util.List<Reference> list1 = contract0.getSubject();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test21() throws Throwable {
        Contract contract0 = new Contract();
        Period period0 = new Period();
        contract0.setApplies(period0);
        Period period1 = contract0.getApplies();
        assertSame(period1, period0);
    }

    @Test
    public void test22() throws Throwable {
        Contract contract0 = new Contract();
        Period period0 = contract0.getApplies();
        assertNull(period0);
    }

    @Test
    public void test23() throws Throwable {
        Contract contract0 = new Contract();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        contract0.setType(codeableConcept0);
        assertNull(codeableConcept0.getId());
    }

    @Test
    public void test24() throws Throwable {
        Contract contract0 = new Contract();
        Identifier identifier0 = (Identifier) contract0.getBindingAttachmentOrBindingReference();
        assertNull(identifier0);
    }

    @Test
    public void test25() throws Throwable {
        Contract contract0 = new Contract();
        DateTime dateTime0 = new DateTime();
        contract0.setIssued(dateTime0);
        assertNull(dateTime0.getValue());
    }

    @Test
    public void test26() throws Throwable {
        Contract contract0 = new Contract();
        Identifier identifier0 = new Identifier();
        contract0.setIdentifier(identifier0);
        Identifier identifier1 = contract0.getIdentifier();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test27() throws Throwable {
        Contract contract0 = new Contract();
        DateTime dateTime0 = contract0.getIssued();
        assertNull(dateTime0);
    }

    @Test
    public void test28() throws Throwable {
        Contract contract0 = new Contract();
        Identifier identifier0 = new Identifier();
        contract0.setBindingAttachmentOrBindingReference(identifier0);
        Identifier identifier1 = (Identifier) contract0.getBindingAttachmentOrBindingReference();
        assertSame(identifier1, identifier0);
    }

    @Test
    public void test29() throws Throwable {
        Contract contract0 = new Contract();
        CodeableConcept codeableConcept0 = contract0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test30() throws Throwable {
        Contract contract0 = new Contract();
        Identifier identifier0 = contract0.getIdentifier();
        assertNull(identifier0);
    }
}
