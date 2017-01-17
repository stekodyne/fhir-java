/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:42:21 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class DiagnosticOrderStatusTest {

    @Test
    public void test0() throws Throwable {
        DiagnosticOrderStatus diagnosticOrderStatus0 = new DiagnosticOrderStatus();
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.PROPOSED;
        diagnosticOrderStatus0.setValue(diagnosticOrderStatusList0);
        diagnosticOrderStatus0.setId("");
        diagnosticOrderStatus0.getValue();
    }

    @Test
    public void test1() throws Throwable {
        DiagnosticOrderStatus diagnosticOrderStatus0 = new DiagnosticOrderStatus();
        diagnosticOrderStatus0.getValue();
    }

    @Test
    public void test2() throws Throwable {
        DiagnosticOrderStatus diagnosticOrderStatus0 = new DiagnosticOrderStatus();
        DiagnosticOrderStatusList diagnosticOrderStatusList0 = DiagnosticOrderStatusList.REQUESTED;
        diagnosticOrderStatus0.setValue(diagnosticOrderStatusList0);
        diagnosticOrderStatus0.getValue();
    }
}
