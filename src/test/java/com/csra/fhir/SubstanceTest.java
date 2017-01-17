/*
 * This file was created by Steffen Kory
 * Mon Jan 16 18:02:29 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class SubstanceTest {

    @Test
    public void test0() throws Throwable {
        Substance substance0 = new Substance();
        java.util.List<SubstanceIngredient> list0 = substance0.getIngredient();
        java.util.List<SubstanceIngredient> list1 = substance0.getIngredient();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        Substance substance0 = new Substance();
        java.util.List<SubstanceInstance> list0 = substance0.getInstance();
        java.util.List<SubstanceInstance> list1 = substance0.getInstance();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test2() throws Throwable {
        Substance substance0 = new Substance();
        java.util.List<CodeableConcept> list0 = substance0.getCategory();
        java.util.List<CodeableConcept> list1 = substance0.getCategory();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test3() throws Throwable {
        Substance substance0 = new Substance();
        java.util.List<Identifier> list0 = substance0.getIdentifier();
        java.util.List<Identifier> list1 = substance0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test4() throws Throwable {
        Substance substance0 = new Substance();
        CodeableConcept codeableConcept0 = substance0.getCode();
        assertNull(codeableConcept0);
    }

    @Test
    public void test5() throws Throwable {
        Substance substance0 = new Substance();
        substance0.setDescription((String) null);
    }

    @Test
    public void test6() throws Throwable {
        Substance substance0 = new Substance();
        String string0 = substance0.getDescription();
        assertNull(string0);
    }

    @Test
    public void test7() throws Throwable {
        Substance substance0 = new Substance();
        substance0.setCode((CodeableConcept) null);
    }
}
