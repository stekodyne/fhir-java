/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:28:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParametersTest {

    @Test
    public void test0() throws Throwable {
        Parameters parameters0 = new Parameters();
        parameters0.getParameter();
        java.util.List<ParametersParameter> list0 = parameters0.getParameter();
        assertTrue(list0.isEmpty());
    }
}
