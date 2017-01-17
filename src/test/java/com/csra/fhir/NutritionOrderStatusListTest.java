/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:23:37 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class NutritionOrderStatusListTest {

    @Test
    public void test0() throws Throwable {
        NutritionOrderStatusList[] nutritionOrderStatusListArray0 = NutritionOrderStatusList.values();
        assertNotNull(nutritionOrderStatusListArray0);
    }

    @Test
    public void test1() throws Throwable {
        NutritionOrderStatusList nutritionOrderStatusList0 = NutritionOrderStatusList.valueOf("PROPOSED");
        assertEquals("PROPOSED", nutritionOrderStatusList0.name());
    }

    @Test
    public void test2() throws Throwable {
        NutritionOrderStatusList nutritionOrderStatusList0 = NutritionOrderStatusList.valueOf("CANCELLED");
        assertEquals(NutritionOrderStatusList.CANCELLED, nutritionOrderStatusList0);
    }

    @Test
    public void test3() throws Throwable {
        NutritionOrderStatusList nutritionOrderStatusList0 = NutritionOrderStatusList.fromValue("completed");
        assertEquals("COMPLETED", nutritionOrderStatusList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            NutritionOrderStatusList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        NutritionOrderStatusList nutritionOrderStatusList0 = NutritionOrderStatusList.fromValue("proposed");
        assertEquals("proposed", nutritionOrderStatusList0.value());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            NutritionOrderStatusList.fromValue("4_=k=XphrAI'ySc");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // 4_=k=XphrAI'ySc
            //
            assertThrownBy("com.csra.fhir.NutritionOrderStatusList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        NutritionOrderStatusList nutritionOrderStatusList0 = NutritionOrderStatusList.PROPOSED;
        java.lang.String string0 = nutritionOrderStatusList0.value();
        assertEquals("proposed", string0);
    }
}
