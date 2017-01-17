/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:29:41 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class MoneyTest {

    @Test
    public void test0() throws Throwable {
        Money money0 = new Money();
        assertNull(money0.getId());
    }
}
