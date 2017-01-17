/*
 * This file was created by Steffen Kory
 * Mon Jan 16 22:42:44 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class ImplementationGuideContactTest {

    @Test
    public void test0() throws Throwable {
        ImplementationGuideContact implementationGuideContact0 = new ImplementationGuideContact();
        java.util.List<ContactPoint> list0 = implementationGuideContact0.getTelecom();
        java.util.List<ContactPoint> list1 = implementationGuideContact0.getTelecom();
        assertSame(list1, list0);
        assertNotNull(list1);
    }

    @Test
    public void test1() throws Throwable {
        ImplementationGuideContact implementationGuideContact0 = new ImplementationGuideContact();
        String string0 = implementationGuideContact0.getName();
        assertNull(string0);
    }

    @Test
    public void test2() throws Throwable {
        ImplementationGuideContact implementationGuideContact0 = new ImplementationGuideContact();
        implementationGuideContact0.setName((String) null);
    }
}
