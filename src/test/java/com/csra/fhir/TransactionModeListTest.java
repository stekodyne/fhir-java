/*
 * This file was created by Steffen Kory
 * Mon Jan 16 20:51:06 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TransactionModeListTest {

    @Test
    public void test0() throws Throwable {
        TransactionModeList[] transactionModeListArray0 = TransactionModeList.values();
        assertNotNull(transactionModeListArray0);
    }

    @Test
    public void test1() throws Throwable {
        TransactionModeList transactionModeList0 = TransactionModeList.valueOf("TRANSACTION");
        assertEquals("transaction", transactionModeList0.value());
    }

    @Test
    public void test2() throws Throwable {
        TransactionModeList transactionModeList0 = TransactionModeList.fromValue("transaction");
        assertEquals(2, transactionModeList0.ordinal());
    }

    @Test
    public void test3() throws Throwable {
        // Undeclared exception!
        try {
            TransactionModeList.valueOf((java.lang.String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Name is null
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        // Undeclared exception!
        try {
            TransactionModeList.valueOf("not-supported");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No enum constant com.csra.fhir.TransactionModeList.not-supported
            //
            assertThrownBy("java.lang.Enum", e);
        }
    }

    @Test
    public void test5() throws Throwable {
        TransactionModeList transactionModeList0 = TransactionModeList.fromValue("not-supported");
        assertEquals("NOT_SUPPORTED", transactionModeList0.name());
    }

    @Test
    public void test6() throws Throwable {
        // Undeclared exception!
        try {
            TransactionModeList.fromValue("kGc");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // kGc
            //
            assertThrownBy("com.csra.fhir.TransactionModeList", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        TransactionModeList transactionModeList0 = TransactionModeList.valueOf("NOT_SUPPORTED");
        java.lang.String string0 = transactionModeList0.value();
        assertEquals("not-supported", string0);
    }
}
