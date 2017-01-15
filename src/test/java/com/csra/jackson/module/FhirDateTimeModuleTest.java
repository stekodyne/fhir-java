package com.csra.jackson.module;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirDateTimeModuleTest {

    private ObjectMapper objectMapper;

    @Test
    public void registeringModule() {
        this.objectMapper = new ObjectMapper();
        FhirDateTimeModule module = new FhirDateTimeModule();
        assertNotNull(module);
        objectMapper.registerModule(module);
    }

}