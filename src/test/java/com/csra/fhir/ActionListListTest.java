/*
 * This file was created by Steffen Kory
 * Mon Jan 16 19:20:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ActionListListTest {

    @Test
    public void test0() throws Throwable {
        ActionListList[] actionListListArray0 = ActionListList.values();
        assertNotNull(actionListListArray0);
    }

    @Test
    public void test1() throws Throwable {
        ActionListList actionListList0 = ActionListList.valueOf("CANCEL");
        assertEquals(ActionListList.CANCEL, actionListList0);
    }

    @Test
    public void test2() throws Throwable {
        ActionListList actionListList0 = ActionListList.valueOf("STATUS");
        assertEquals(ActionListList.STATUS, actionListList0);
    }

    @Test
    public void test3() throws Throwable {
        ActionListList actionListList0 = ActionListList.fromValue("status");
        assertEquals("STATUS", actionListList0.toString());
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            ActionListList.valueOf((java.lang.String) null);
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
            ActionListList.valueOf(",60[~P=m*.&*D,+");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.ActionListList.,60[~P=m*.&*D,+
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        ActionListList actionListList0 = ActionListList.fromValue("cancel");
        assertEquals(0, actionListList0.ordinal());
    }

    @Test
    public void test7() throws Throwable {
        // Undeclared exception!
        try {
            ActionListList.fromValue("uh`l");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // uh`l
            //
            assertThrownBy("com.csra.fhir.ActionListList", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        ActionListList actionListList0 = ActionListList.CANCEL;
        java.lang.String string0 = actionListList0.value();
        assertEquals("cancel", string0);
    }
}
