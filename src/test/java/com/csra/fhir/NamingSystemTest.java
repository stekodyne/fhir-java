/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:23:59 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NamingSystemTest {

    @Test
    public void test00() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        java.util.List<NamingSystemUniqueId> list0 = namingSystem0.getUniqueId();
        java.util.List<NamingSystemUniqueId> list1 = namingSystem0.getUniqueId();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        java.util.List<CodeableConcept> list0 = namingSystem0.getUseContext();
        java.util.List<CodeableConcept> list1 = namingSystem0.getUseContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        java.util.List<NamingSystemContact> list0 = namingSystem0.getContact();
        java.util.List<NamingSystemContact> list1 = namingSystem0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setType((CodeableConcept) null);
    }

    @Test
    public void test04() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setResponsible((String) null);
    }

    @Test
    public void test05() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setKind((NamingSystemType) null);
    }

    @Test
    public void test06() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setPublisher((String) null);
    }

    @Test
    public void test07() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        String string0 = namingSystem0.getResponsible();
        assertNull(string0);
    }

    @Test
    public void test08() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        Code code0 = namingSystem0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test09() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        DateTime dateTime0 = namingSystem0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test10() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        CodeableConcept codeableConcept0 = namingSystem0.getType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test11() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        Reference reference0 = namingSystem0.getReplacedBy();
        assertNull(reference0);
    }

    @Test
    public void test12() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        String string0 = namingSystem0.getUsage();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setUsage((String) null);
    }

    @Test
    public void test14() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setName((String) null);
    }

    @Test
    public void test15() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setReplacedBy((Reference) null);
    }

    @Test
    public void test16() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setDescription((String) null);
    }

    @Test
    public void test17() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setDate((DateTime) null);
    }

    @Test
    public void test18() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        namingSystem0.setStatus((Code) null);
    }

    @Test
    public void test19() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        NamingSystemType namingSystemType0 = namingSystem0.getKind();
        assertNull(namingSystemType0);
    }

    @Test
    public void test20() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        String string0 = namingSystem0.getName();
        assertNull(string0);
    }

    @Test
    public void test21() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        String string0 = namingSystem0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test22() throws Throwable {
        NamingSystem namingSystem0 = new NamingSystem();
        String string0 = namingSystem0.getDescription();
        assertNull(string0);
    }
}
