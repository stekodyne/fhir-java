/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:33:17 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OperationDefinitionContactTest {

    @Test
    public void test0() throws Throwable {
        OperationDefinitionContact operationDefinitionContact0 = new OperationDefinitionContact();
        java.util.List<ContactPoint> list0 = operationDefinitionContact0.getTelecom();
        java.util.List<ContactPoint> list1 = operationDefinitionContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        OperationDefinitionContact operationDefinitionContact0 = new OperationDefinitionContact();
        operationDefinitionContact0.setName((String) null);
        assertNull(operationDefinitionContact0.getId());
    }

    @Test
    public void test2() throws Throwable {
        OperationDefinitionContact operationDefinitionContact0 = new OperationDefinitionContact();
        operationDefinitionContact0.getName();
    }
}
