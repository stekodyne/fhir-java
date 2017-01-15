package com.csra.jackson.module;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirMedicationOrderStatusModuleTest {

    private ObjectMapper objectMapper;

    @Test
    public void registeringModule() {
        this.objectMapper = new ObjectMapper();
        FhirMedicationOrderStatusModule module = new FhirMedicationOrderStatusModule();
        assertNotNull(module);
        objectMapper.registerModule(module);
    }

}