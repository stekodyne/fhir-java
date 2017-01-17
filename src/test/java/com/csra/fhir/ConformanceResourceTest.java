/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:13:33 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ConformanceResourceTest {

    @Test
    public void test00() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        ResourceVersionPolicy resourceVersionPolicy0 = new ResourceVersionPolicy();
        conformanceResource0.setVersioning(resourceVersionPolicy0);
        assertNull(resourceVersionPolicy0.getValue());
    }

    @Test
    public void test01() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Reference reference0 = new Reference();
        conformanceResource0.setProfile(reference0);
        assertNull(conformanceResource0.getId());
    }

    @Test
    public void test02() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        ResourceVersionPolicy resourceVersionPolicy0 = new ResourceVersionPolicy();
        conformanceResource0.versioning = resourceVersionPolicy0;
        ResourceVersionPolicy resourceVersionPolicy1 = conformanceResource0.getVersioning();
        assertNull(resourceVersionPolicy1.getValue());
    }

    @Test
    public void test03() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.updateCreate = boolean0;
        Boolean boolean1 = conformanceResource0.getUpdateCreate();
        assertNull(boolean1.getId());
    }

    @Test
    public void test04() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Reference reference0 = new Reference();
        conformanceResource0.profile = reference0;
        Reference reference1 = conformanceResource0.getProfile();
        assertNull(reference1.getId());
    }

    @Test
    public void test05() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.conditionalUpdate = boolean0;
        Boolean boolean1 = conformanceResource0.getConditionalUpdate();
        assertNull(boolean1.getId());
    }

    @Test
    public void test06() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        java.util.List<ConformanceSearchParam> list0 = conformanceResource0.getSearchParam();
        java.util.List<ConformanceSearchParam> list1 = conformanceResource0.getSearchParam();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        java.util.List<String> list0 = conformanceResource0.getSearchRevInclude();
        java.util.List<String> list1 = conformanceResource0.getSearchRevInclude();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test08() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        java.util.List<String> list0 = conformanceResource0.getSearchInclude();
        java.util.List<String> list1 = conformanceResource0.getSearchInclude();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        java.util.List<ConformanceInteraction> list0 = conformanceResource0.getInteraction();
        java.util.List<ConformanceInteraction> list1 = conformanceResource0.getInteraction();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test10() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Code code0 = conformanceResource0.getType();
        assertNull(code0);
    }

    @Test
    public void test11() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = conformanceResource0.getUpdateCreate();
        assertNull(boolean0);
    }

    @Test
    public void test12() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        ResourceVersionPolicy resourceVersionPolicy0 = conformanceResource0.getVersioning();
        assertNull(resourceVersionPolicy0);
    }

    @Test
    public void test13() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.setConditionalCreate(boolean0);
        Boolean boolean1 = conformanceResource0.getConditionalCreate();
        assertNull(boolean1.getId());
    }

    @Test
    public void test14() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.setConditionalUpdate(boolean0);
        assertNull(conformanceResource0.getId());
    }

    @Test
    public void test15() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.setUpdateCreate(boolean0);
        assertNull(conformanceResource0.getId());
    }

    @Test
    public void test16() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = new Boolean();
        conformanceResource0.setReadHistory(boolean0);
        Boolean boolean1 = conformanceResource0.getReadHistory();
        assertNull(boolean1.getId());
    }

    @Test
    public void test17() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        ConditionalDeleteStatus conditionalDeleteStatus0 = new ConditionalDeleteStatus();
        conformanceResource0.setConditionalDelete(conditionalDeleteStatus0);
        ConditionalDeleteStatus conditionalDeleteStatus1 = conformanceResource0.getConditionalDelete();
        assertSame(conditionalDeleteStatus1, conditionalDeleteStatus0);
    }

    @Test
    public void test18() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Reference reference0 = conformanceResource0.getProfile();
        assertNull(reference0);
    }

    @Test
    public void test19() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = conformanceResource0.getConditionalUpdate();
        assertNull(boolean0);
    }

    @Test
    public void test20() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = conformanceResource0.getConditionalCreate();
        assertNull(boolean0);
    }

    @Test
    public void test21() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Code code0 = new Code();
        conformanceResource0.setType(code0);
        Code code1 = conformanceResource0.getType();
        assertNull(code1.getValue());
    }

    @Test
    public void test22() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        ConditionalDeleteStatus conditionalDeleteStatus0 = conformanceResource0.getConditionalDelete();
        assertNull(conditionalDeleteStatus0);
    }

    @Test
    public void test23() throws Throwable {
        ConformanceResource conformanceResource0 = new ConformanceResource();
        Boolean boolean0 = conformanceResource0.getReadHistory();
        assertNull(boolean0);
    }
}
