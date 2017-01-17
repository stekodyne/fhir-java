/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:50:02 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class AllergyIntoleranceStatusTest {

    @Test
    public void test0() throws Throwable {
        AllergyIntoleranceStatus allergyIntoleranceStatus0 = new AllergyIntoleranceStatus();
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.UNCONFIRMED;
        allergyIntoleranceStatus0.setValue(allergyIntoleranceStatusList0);
        AllergyIntoleranceStatusList allergyIntoleranceStatusList1 = allergyIntoleranceStatus0.value;
        allergyIntoleranceStatus0.setValue(allergyIntoleranceStatusList1);
        allergyIntoleranceStatus0.setValue(allergyIntoleranceStatusList0);
        AllergyIntoleranceStatusList allergyIntoleranceStatusList2 = AllergyIntoleranceStatusList.ACTIVE;
        allergyIntoleranceStatus0.setValue(allergyIntoleranceStatusList2);
        allergyIntoleranceStatus0.getValue();
    }

    @Test
    public void test1() throws Throwable {
        AllergyIntoleranceStatus allergyIntoleranceStatus0 = new AllergyIntoleranceStatus();
        allergyIntoleranceStatus0.getValue();
    }

    @Test
    public void test2() throws Throwable {
        AllergyIntoleranceStatus allergyIntoleranceStatus0 = new AllergyIntoleranceStatus();
        AllergyIntoleranceStatusList allergyIntoleranceStatusList0 = AllergyIntoleranceStatusList.INACTIVE;
        allergyIntoleranceStatus0.setValue(allergyIntoleranceStatusList0);
        allergyIntoleranceStatus0.getValue();
    }
}
