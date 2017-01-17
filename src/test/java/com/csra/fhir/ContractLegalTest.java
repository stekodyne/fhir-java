/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:11:48 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class ContractLegalTest {

    @Test
    public void test0() throws Throwable {
        ContractLegal contractLegal0 = new ContractLegal();
        contractLegal0.contentAttachmentOrContentReference = (Element) contractLegal0;
        contractLegal0.getContentAttachmentOrContentReference();
    }

    @Test
    public void test1() throws Throwable {
        ContractLegal contractLegal0 = new ContractLegal();
        contractLegal0.setContentAttachmentOrContentReference(contractLegal0);
    }

    @Test
    public void test2() throws Throwable {
        ContractLegal contractLegal0 = new ContractLegal();
        contractLegal0.getContentAttachmentOrContentReference();
    }
}
