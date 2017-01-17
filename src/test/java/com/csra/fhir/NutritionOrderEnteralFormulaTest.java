/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:41:19 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class NutritionOrderEnteralFormulaTest {

    @Test
    public void test00() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        java.util.List<NutritionOrderAdministration> list0 = nutritionOrderEnteralFormula0.getAdministration();
        java.util.List<NutritionOrderAdministration> list1 = nutritionOrderEnteralFormula0.getAdministration();
        assertNotNull(list1);
        assertSame(list1, list0);
    }

    @Test
    public void test01() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setBaseFormulaType((CodeableConcept) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test02() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        String string0 = nutritionOrderEnteralFormula0.getAdditiveProductName();
        assertNull(string0);
    }

    @Test
    public void test03() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        SimpleQuantity simpleQuantity0 = nutritionOrderEnteralFormula0.getMaxVolumeToDeliver();
        assertNull(simpleQuantity0);
    }

    @Test
    public void test04() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setCaloricDensity((SimpleQuantity) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test05() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        CodeableConcept codeableConcept0 = nutritionOrderEnteralFormula0.getBaseFormulaType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test06() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        CodeableConcept codeableConcept0 = nutritionOrderEnteralFormula0.getRouteofAdministration();
        assertNull(codeableConcept0);
    }

    @Test
    public void test07() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setAdditiveProductName((String) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test08() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setMaxVolumeToDeliver((SimpleQuantity) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test09() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setAdministrationInstruction((String) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test10() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setAdditiveType((CodeableConcept) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test11() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        String string0 = nutritionOrderEnteralFormula0.getBaseFormulaProductName();
        assertNull(string0);
    }

    @Test
    public void test12() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setRouteofAdministration((CodeableConcept) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test13() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        CodeableConcept codeableConcept0 = nutritionOrderEnteralFormula0.getAdditiveType();
        assertNull(codeableConcept0);
    }

    @Test
    public void test14() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.setBaseFormulaProductName((String) null);
        assertNull(nutritionOrderEnteralFormula0.getId());
    }

    @Test
    public void test15() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        String string0 = nutritionOrderEnteralFormula0.getAdministrationInstruction();
        assertNull(string0);
    }

    @Test
    public void test16() throws Throwable {
        NutritionOrderEnteralFormula nutritionOrderEnteralFormula0 = new NutritionOrderEnteralFormula();
        nutritionOrderEnteralFormula0.getCaloricDensity();
    }
}
