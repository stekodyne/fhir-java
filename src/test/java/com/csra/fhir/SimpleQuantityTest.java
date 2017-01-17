/*
 * This file was created by Steffen Kory
 * Mon Jan 16 23:51:49 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class SimpleQuantityTest {

    @Test
    public void test0() throws Throwable {
        SimpleQuantity simpleQuantity0 = new SimpleQuantity();
        assertNull(simpleQuantity0.getId());
    }
}
