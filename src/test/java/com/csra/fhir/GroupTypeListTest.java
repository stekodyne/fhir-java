/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:46:00 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GroupTypeListTest {

    @Test
    public void test0() throws Throwable {
        GroupTypeList[] groupTypeListArray0 = GroupTypeList.values();
        assertNotNull(groupTypeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        GroupTypeList groupTypeList0 = GroupTypeList.valueOf("PERSON");
        assertEquals(0, groupTypeList0.ordinal());
    }

    @Test
    public void test2() throws Throwable {
        GroupTypeList groupTypeList0 = GroupTypeList.valueOf("MEDICATION");
        assertEquals(GroupTypeList.MEDICATION, groupTypeList0);
    }

    @Test
    public void test3() throws Throwable {
        GroupTypeList groupTypeList0 = GroupTypeList.fromValue("device");
        assertEquals("device", groupTypeList0.value());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            GroupTypeList.valueOf((java.lang.String) null);
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
            GroupTypeList.valueOf("person");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.GroupTypeList.person
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        GroupTypeList groupTypeList0 = GroupTypeList.fromValue("person");
        assertEquals("person", groupTypeList0.value());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            GroupTypeList.fromValue("Hd;qSCIs8*Z9.s");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Hd;qSCIs8*Z9.s
            //
            assertThrownBy("com.csra.fhir.GroupTypeList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        GroupTypeList groupTypeList0 = GroupTypeList.PRACTITIONER;
        java.lang.String string0 = groupTypeList0.value();
        assertEquals("practitioner", string0);
    }
}
