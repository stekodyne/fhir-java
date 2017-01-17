/*
 * This file was created by Steffen Kory
 * Mon Jan 16 21:56:36 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BlockTest {

    @Test
    public void test0() throws Throwable {
        Block block0 = new Block();
        block0.getPOrH1OrH2();
        java.util.List<java.lang.Object> list0 = block0.getPOrH1OrH2();
        assertTrue(list0.isEmpty());
    }
}
