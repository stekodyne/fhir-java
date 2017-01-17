/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:56:04 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NutritionOrderTest {

    @Test
    public void test00() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        java.util.List<NutritionOrderSupplement> list0 = nutritionOrder0.getSupplement();
        java.util.List<NutritionOrderSupplement> list1 = nutritionOrder0.getSupplement();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test01() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        java.util.List<CodeableConcept> list0 = nutritionOrder0.getExcludeFoodModifier();
        java.util.List<CodeableConcept> list1 = nutritionOrder0.getExcludeFoodModifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test02() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        java.util.List<CodeableConcept> list0 = nutritionOrder0.getFoodPreferenceModifier();
        java.util.List<CodeableConcept> list1 = nutritionOrder0.getFoodPreferenceModifier();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test03() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        java.util.List<Reference> list0 = nutritionOrder0.getAllergyIntolerance();
        java.util.List<Reference> list1 = nutritionOrder0.getAllergyIntolerance();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test04() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        java.util.List<Identifier> list0 = nutritionOrder0.getIdentifier();
        java.util.List<Identifier> list1 = nutritionOrder0.getIdentifier();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test05() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        NutritionOrderStatus nutritionOrderStatus0 = nutritionOrder0.getStatus();
        assertNull(nutritionOrderStatus0);
    }

    @Test
    public void test06() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setPatient((Reference) null);
    }

    @Test
    public void test07() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setDateTime((DateTime) null);
    }

    @Test
    public void test08() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setEnteralFormula((NutritionOrderEnteralFormula) null);
    }

    @Test
    public void test09() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        Reference reference0 = nutritionOrder0.getPatient();
        assertNull(reference0);
    }

    @Test
    public void test10() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setEncounter((Reference) null);
    }

    @Test
    public void test11() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setOralDiet((NutritionOrderOralDiet) null);
    }

    @Test
    public void test12() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        NutritionOrderOralDiet nutritionOrderOralDiet0 = nutritionOrder0.getOralDiet();
        assertNull(nutritionOrderOralDiet0);
    }

    @Test
    public void test13() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setStatus((NutritionOrderStatus) null);
    }

    @Test
    public void test14() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        Reference reference0 = nutritionOrder0.getOrderer();
        assertNull(reference0);
    }

    @Test
    public void test15() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = nutritionOrder0.getEnteralFormula();
        assertNull(nutritionOrderEnteralFormula0);
    }

    @Test
    public void test16() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        DateTime dateTime0 = nutritionOrder0.getDateTime();
        assertNull(dateTime0);
    }

    @Test
    public void test17() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        nutritionOrder0.setOrderer((Reference) null);
    }

    @Test
    public void test18() throws Throwable {
        NutritionOrder nutritionOrder0 = new NutritionOrder();
        Reference reference0 = nutritionOrder0.getEncounter();
        assertNull(reference0);
    }
}
