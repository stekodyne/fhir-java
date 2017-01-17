/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:58:58 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ContractActor1Test {

    @Test
    public void test0() throws Throwable {
        ContractActor1 contractActor1_0 = new ContractActor1();
        java.util.List<CodeableConcept> list0 = contractActor1_0.getRole();
        java.util.List<CodeableConcept> list1 = contractActor1_0.getRole();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ContractActor1 contractActor1_0 = new ContractActor1();
        Reference reference0 = contractActor1_0.getEntity();
        assertNull(reference0);
    }

    @Test
    public void test2() throws Throwable {
        ContractActor1 contractActor1_0 = new ContractActor1();
        contractActor1_0.setEntity((Reference) null);
    }
}
