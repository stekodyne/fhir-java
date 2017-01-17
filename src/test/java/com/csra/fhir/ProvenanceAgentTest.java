/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:15:40 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ProvenanceAgentTest {

    @Test
    public void test0() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        java.util.List<ProvenanceRelatedAgent> list0 = provenanceAgent0.getRelatedAgent();
        java.util.List<ProvenanceRelatedAgent> list1 = provenanceAgent0.getRelatedAgent();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test1() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        provenanceAgent0.setUserId((Identifier) null);
        assertNull(provenanceAgent0.getId());
    }

    @Test
    public void test2() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        provenanceAgent0.setActor((Reference) null);
        assertNull(provenanceAgent0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        Identifier identifier0 = provenanceAgent0.getUserId();
        assertNull(identifier0);
    }

    @Test
    public void test4() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        Reference reference0 = provenanceAgent0.getActor();
        assertNull(reference0);
    }

    @Test
    public void test5() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        Coding coding0 = provenanceAgent0.getRole();
        assertNull(coding0);
    }

    @Test
    public void test6() throws Throwable {
        ProvenanceAgent provenanceAgent0 = new ProvenanceAgent();
        provenanceAgent0.setRole((Coding) null);
        assertNull(provenanceAgent0.getId());
    }
}
