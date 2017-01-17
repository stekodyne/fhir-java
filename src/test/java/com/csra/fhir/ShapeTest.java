/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:49:31 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ShapeTest {

    @Test
    public void test0() throws Throwable {
        Shape[] shapeArray0 = Shape.values();
        assertNotNull(shapeArray0);
    }

    @Test
    public void test1() throws Throwable {
        Shape shape0 = Shape.valueOf("RECT");
        assertEquals("RECT", shape0.name());
    }

    @Test
    public void test2() throws Throwable {
        Shape shape0 = Shape.valueOf("POLY");
        assertEquals("POLY", shape0.toString());
    }

    @Test
    public void test3() throws Throwable {
        Shape shape0 = Shape.fromValue("default");
        assertEquals(3, shape0.ordinal());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            Shape.valueOf((java.lang.String) null);
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
            Shape.valueOf("fm]uXa#.dAI35=");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.Shape.fm]uXa#.dAI35=
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        Shape shape0 = Shape.fromValue("rect");
        assertEquals("RECT", shape0.toString());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            Shape.fromValue("Q&BJ[W,");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Q&BJ[W,
            //
            assertThrownBy("com.csra.fhir.Shape", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        Shape shape0 = Shape.DEFAULT;
        java.lang.String string0 = shape0.value();
        assertEquals("default", string0);
    }
}
