/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:08:53 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ContractActorTest {

    @Test
    public void test0() throws Throwable {
        ContractActor contractActor0 = new ContractActor();
        java.util.List<CodeableConcept> list0 = contractActor0.getRole();
        java.util.List<CodeableConcept> list1 = contractActor0.getRole();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ContractActor contractActor0 = new ContractActor();
        Reference reference0 = contractActor0.getEntity();
        assertNull(reference0);
    }

    @Test
    public void test2() throws Throwable {
        ContractActor contractActor0 = new ContractActor();
        contractActor0.setEntity((Reference) null);
        assertNull(contractActor0.getId());
    }
}
