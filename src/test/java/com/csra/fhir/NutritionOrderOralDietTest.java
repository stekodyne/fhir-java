/*
 * This file was created by Steffen Kory
 * Mon Jan 16 17:52:51 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class NutritionOrderOralDietTest {

    @Test
    public void test00() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        nutritionOrderOralDiet0.type = (java.util.List<CodeableConcept>) linkedList0;
        CodeableConcept codeableConcept0 = new CodeableConcept();
        linkedList0.add(codeableConcept0);
        java.util.List<CodeableConcept> list0 = nutritionOrderOralDiet0.getType();
        assertEquals(1, list0.size());
        assertNotNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        LinkedList<NutritionOrderTexture> linkedList0 = new LinkedList<NutritionOrderTexture>();
        nutritionOrderOralDiet0.texture = (java.util.List<NutritionOrderTexture>) linkedList0;
        NutritionOrderTexture nutritionOrderTexture0 = linkedList0.pollLast();
        linkedList0.add(nutritionOrderTexture0);
        java.util.List<NutritionOrderTexture> list0 = nutritionOrderOralDiet0.getTexture();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test02() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        LinkedList<Timing> linkedList0 = new LinkedList<Timing>();
        nutritionOrderOralDiet0.schedule = (java.util.List<Timing>) linkedList0;
        Timing timing0 = new Timing();
        linkedList0.add(timing0);
        java.util.List<Timing> list0 = nutritionOrderOralDiet0.getSchedule();
        assertFalse(list0.isEmpty());
        assertNotNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        LinkedList<NutritionOrderNutrient> linkedList0 = new LinkedList<NutritionOrderNutrient>();
        nutritionOrderOralDiet0.nutrient = (java.util.List<NutritionOrderNutrient>) linkedList0;
        NutritionOrderNutrient nutritionOrderNutrient0 = new NutritionOrderNutrient();
        linkedList0.add(nutritionOrderNutrient0);
        java.util.List<NutritionOrderNutrient> list0 = nutritionOrderOralDiet0.getNutrient();
        assertNotNull(list0);
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        String string0 = new String();
        nutritionOrderOralDiet0.instruction = string0;
        String string1 = nutritionOrderOralDiet0.getInstruction();
        assertNull(string1.getId());
    }

    @Test
    public void test05() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        LinkedList<CodeableConcept> linkedList0 = new LinkedList<CodeableConcept>();
        CodeableConcept codeableConcept0 = new CodeableConcept();
        linkedList0.add(codeableConcept0);
        nutritionOrderOralDiet0.fluidConsistencyType = (java.util.List<CodeableConcept>) linkedList0;
        java.util.List<CodeableConcept> list0 = nutritionOrderOralDiet0.getFluidConsistencyType();
        assertNotNull(list0);
        assertEquals(1, list0.size());
    }

    @Test
    public void test06() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        java.util.List<CodeableConcept> list0 = nutritionOrderOralDiet0.getFluidConsistencyType();
        java.util.List<CodeableConcept> list1 = nutritionOrderOralDiet0.getFluidConsistencyType();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test07() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        java.util.List<NutritionOrderTexture> list0 = nutritionOrderOralDiet0.getTexture();
        java.util.List<NutritionOrderTexture> list1 = nutritionOrderOralDiet0.getTexture();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test08() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        java.util.List<NutritionOrderNutrient> list0 = nutritionOrderOralDiet0.getNutrient();
        java.util.List<NutritionOrderNutrient> list1 = nutritionOrderOralDiet0.getNutrient();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test09() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        java.util.List<Timing> list0 = nutritionOrderOralDiet0.getSchedule();
        java.util.List<Timing> list1 = nutritionOrderOralDiet0.getSchedule();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test10() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        java.util.List<CodeableConcept> list0 = nutritionOrderOralDiet0.getType();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test11() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        String string0 = nutritionOrderOralDiet0.getInstruction();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        NutritionOrderOralDiet nutritionOrderOralDiet0 = new NutritionOrderOralDiet();
        String string0 = new String();
        nutritionOrderOralDiet0.setInstruction(string0);
    }
}
