/*
 * This file was created by Steffen Kory
 * Tue Jan 17 00:17:05 GMT 2017
 */

package com.csra.fhir;

import org.junit.Test;

public class ContractRuleTest {

    @Test
    public void test0() throws Throwable {
        ContractRule contractRule0 = new ContractRule();
        contractRule0.getContentAttachmentOrContentReference();
        contractRule0.contentAttachmentOrContentReference = null;
        ContractRule contractRule1 = new ContractRule();
        java.util.List<Extension> list0 = contractRule1.getExtension();
        ContractRule contractRule2 = new ContractRule();
        contractRule2.modifierExtension = list0;
        contractRule0.setContentAttachmentOrContentReference(contractRule1);
        contractRule2.getContentAttachmentOrContentReference();
        contractRule0.getExtension();
        contractRule2.setContentAttachmentOrContentReference(contractRule0.contentAttachmentOrContentReference);
        contractRule1.setId("");
        contractRule0.contentAttachmentOrContentReference = (Element) contractRule1;
        ContractRule contractRule3 = new ContractRule();
        contractRule3.getExtension();
        contractRule3.getModifierExtension();
        contractRule3.contentAttachmentOrContentReference = null;
        contractRule1.id = "";
        contractRule0.getContentAttachmentOrContentReference();
        ContractRule contractRule4 = new ContractRule();
        contractRule3.setContentAttachmentOrContentReference((Element) null);
        contractRule1.contentAttachmentOrContentReference = null;
    }

    @Test
    public void test1() throws Throwable {
        ContractRule contractRule0 = new ContractRule();
        java.util.List<Extension> list0 = contractRule0.getModifierExtension();
        ContractRule contractRule1 = new ContractRule();
        contractRule0.setContentAttachmentOrContentReference(contractRule1);
        ContractRule contractRule2 = new ContractRule();
        contractRule0.modifierExtension = list0;
        contractRule0.setContentAttachmentOrContentReference(contractRule1);
        contractRule1.getContentAttachmentOrContentReference();
    }
}
