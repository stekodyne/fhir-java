/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:41:57 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class CountTest {

    @Test
    public void test0() throws Throwable {
        Count count0 = new Count();
        assertNull(count0.getId());
    }
}
