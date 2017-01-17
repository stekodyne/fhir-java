/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:15:47 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AggregationModeListTest {

    @Test
    public void test0() throws Throwable {
        AggregationModeList[] aggregationModeListArray0 = AggregationModeList.values();
        assertNotNull(aggregationModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        AggregationModeList aggregationModeList0 = AggregationModeList.valueOf("CONTAINED");
        assertEquals("CONTAINED", aggregationModeList0.toString());
    }

    @Test
    public void test2() throws Throwable {
        AggregationModeList aggregationModeList0 = AggregationModeList.valueOf("REFERENCED");
        assertEquals("REFERENCED", aggregationModeList0.name());
    }

    @Test
    public void test3() throws Throwable {
        AggregationModeList aggregationModeList0 = AggregationModeList.fromValue("bundled");
        assertEquals("BUNDLED", aggregationModeList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            AggregationModeList.valueOf((java.lang.String) null);
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
        // Undeclared exception!
        try {
            AggregationModeList.valueOf(":cd3j");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.AggregationModeList.:cd3j
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            AggregationModeList.fromValue((java.lang.String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("com.csra.fhir.AggregationModeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        AggregationModeList aggregationModeList0 = AggregationModeList.fromValue("contained");
        java.lang.String string0 = aggregationModeList0.value();
        assertEquals("contained", string0);
    }
}
