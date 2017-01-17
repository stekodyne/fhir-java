/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:36:03 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ValueSetTest {

    @Test
    public void test00() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        java.util.List<CodeableConcept> list0 = valueSet0.getUseContext();
        java.util.List<CodeableConcept> list1 = valueSet0.getUseContext();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        java.util.List<ValueSetContact> list0 = valueSet0.getContact();
        java.util.List<ValueSetContact> list1 = valueSet0.getContact();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test02() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        ValueSetExpansion valueSetExpansion0 = valueSet0.getExpansion();
        assertNull(valueSetExpansion0);
    }

    @Test
    public void test03() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Uri uri0 = valueSet0.getUrl();
        assertNull(uri0);
    }

    @Test
    public void test04() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        ValueSetCompose valueSetCompose0 = valueSet0.getCompose();
        assertNull(valueSetCompose0);
    }

    @Test
    public void test05() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Boolean boolean0 = valueSet0.getImmutable();
        assertNull(boolean0);
    }

    @Test
    public void test06() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setDescription((String) null);
    }

    @Test
    public void test07() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Identifier identifier0 = valueSet0.getIdentifier();
        assertNull(identifier0);
    }

    @Test
    public void test08() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setCompose((ValueSetCompose) null);
    }

    @Test
    public void test09() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setImmutable((Boolean) null);
    }

    @Test
    public void test10() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setStatus((Code) null);
    }

    @Test
    public void test11() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setDate((DateTime) null);
    }

    @Test
    public void test12() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setName((String) null);
    }

    @Test
    public void test13() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getPublisher();
        assertNull(string0);
    }

    @Test
    public void test14() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setPublisher((String) null);
    }

    @Test
    public void test15() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setRequirements((String) null);
    }

    @Test
    public void test16() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getRequirements();
        assertNull(string0);
    }

    @Test
    public void test17() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setCopyright((String) null);
    }

    @Test
    public void test18() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Boolean boolean0 = valueSet0.getExperimental();
        assertNull(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        ValueSetCodeSystem valueSetCodeSystem0 = valueSet0.getCodeSystem();
        assertNull(valueSetCodeSystem0);
    }

    @Test
    public void test20() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setExpansion((ValueSetExpansion) null);
    }

    @Test
    public void test21() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Boolean boolean0 = valueSet0.getExtensible();
        assertNull(boolean0);
    }

    @Test
    public void test22() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Date date0 = valueSet0.getLockedDate();
        assertNull(date0);
    }

    @Test
    public void test23() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setUrl((Uri) null);
    }

    @Test
    public void test24() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setLockedDate((Date) null);
    }

    @Test
    public void test25() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        Code code0 = valueSet0.getStatus();
        assertNull(code0);
    }

    @Test
    public void test26() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setIdentifier((Identifier) null);
    }

    @Test
    public void test27() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getVersion();
        assertNull(string0);
    }

    @Test
    public void test28() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setCodeSystem((ValueSetCodeSystem) null);
    }

    @Test
    public void test29() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getCopyright();
        assertNull(string0);
    }

    @Test
    public void test30() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test31() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setExtensible((Boolean) null);
    }

    @Test
    public void test32() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setExperimental((Boolean) null);
    }

    @Test
    public void test33() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        String string0 = valueSet0.getName();
        assertNull(string0);
    }

    @Test
    public void test34() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        DateTime dateTime0 = valueSet0.getDate();
        assertNull(dateTime0);
    }

    @Test
    public void test35() throws Throwable {
        ValueSet valueSet0 = new ValueSet();
        valueSet0.setVersion((String) null);
    }
}
