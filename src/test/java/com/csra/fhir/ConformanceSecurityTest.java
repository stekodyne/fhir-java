/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:23:40 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConformanceSecurityTest {

    @Test
    public void test0() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        java.util.List<ConformanceCertificate> list0 = conformanceSecurity0.getCertificate();
        java.util.List<ConformanceCertificate> list1 = conformanceSecurity0.getCertificate();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        java.util.List<CodeableConcept> list0 = conformanceSecurity0.getService();
        java.util.List<CodeableConcept> list1 = conformanceSecurity0.getService();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        String string0 = conformanceSecurity0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        conformanceSecurity0.setCors((Boolean) null);
        assertNull(conformanceSecurity0.getId());
    }

    @Test
    public void test4() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        conformanceSecurity0.setDescription((String) null);
        assertNull(conformanceSecurity0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ConformanceSecurity conformanceSecurity0 = new ConformanceSecurity();
        Boolean boolean0 = conformanceSecurity0.getCors();
        assertNull(boolean0);
    }
}
