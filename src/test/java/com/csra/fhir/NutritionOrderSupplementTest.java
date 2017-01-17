/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:53:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NutritionOrderSupplementTest {

    @Test
    public void test0() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        java.util.List<Timing> list0 = nutritionOrderSupplement0.getSchedule();
        java.util.List<Timing> list1 = nutritionOrderSupplement0.getSchedule();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        nutritionOrderSupplement0.setInstruction((String) null);
        assertNull(nutritionOrderSupplement0.getId());
    }

    @Test
    public void test2() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        String string0 = nutritionOrderSupplement0.getProductName();
        assertNull(string0);
    }

    @Test
    public void test3() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        String string0 = nutritionOrderSupplement0.getInstruction();
        assertNull(string0);
    }

    @Test
    public void test4() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        nutritionOrderSupplement0.setQuantity((SimpleQuantity) null);
        assertNull(nutritionOrderSupplement0.getId());
    }

    @Test
    public void test5() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        SimpleQuantity simpleQuantity0 = nutritionOrderSupplement0.getQuantity();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test6() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        nutritionOrderSupplement0.setProductName((String) null);
        assertNull(nutritionOrderSupplement0.getId());
    }

    @Test
    public void test7() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        nutritionOrderSupplement0.setType((CodeableConcept) null);
        assertNull(nutritionOrderSupplement0.getId());
    }

    @Test
    public void test8() throws Throwable {
        NutritionOrderSupplement nutritionOrderSupplement0 = new NutritionOrderSupplement();
        nutritionOrderSupplement0.getType();
    }
}
