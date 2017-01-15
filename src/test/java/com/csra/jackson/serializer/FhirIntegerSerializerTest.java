package com.csra.jackson.serializer;

import com.csra.fhir.Integer;
import com.csra.jackson.module.FhirIntegerModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirIntegerSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirIntegerModule());
    }

    @Test
    public void serialize() throws Exception {
        Integer input = new Integer();
        input.setValue(1);

        assertEquals("1", objectMapper.writeValueAsString(input));
    }

}