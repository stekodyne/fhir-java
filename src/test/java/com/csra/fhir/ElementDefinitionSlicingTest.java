/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:22:16 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ElementDefinitionSlicingTest {

    @Test
    public void test0() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        java.util.List<String> list0 = elementDefinitionSlicing0.getDiscriminator();
        java.util.List<String> list1 = elementDefinitionSlicing0.getDiscriminator();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        SlicingRules slicingRules0 = elementDefinitionSlicing0.getRules();
        assertNull(slicingRules0);
    }

    @Test
    public void test2() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinitionSlicing0.setRules((SlicingRules) null);
        assertNull(elementDefinitionSlicing0.getId());
    }

    @Test
    public void test3() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        Boolean boolean0 = elementDefinitionSlicing0.getOrdered();
        assertNull(boolean0);
    }

    @Test
    public void test4() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinitionSlicing0.setDescription((String) null);
        assertNull(elementDefinitionSlicing0.getId());
    }

    @Test
    public void test5() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        String string0 = elementDefinitionSlicing0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test6() throws Throwable {
        ElementDefinitionSlicing elementDefinitionSlicing0 = new ElementDefinitionSlicing();
        elementDefinitionSlicing0.setOrdered((Boolean) null);
        assertNull(elementDefinitionSlicing0.getId());
    }
}
