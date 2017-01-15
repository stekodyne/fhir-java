package com.csra.jackson.serializer;

import com.csra.fhir.Code;
import com.csra.jackson.module.FhirCodeModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirCodeSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirCodeModule());
    }

    @Test
    public void serialize() throws Exception {
        Code input = new Code();
        input.setValue("true");

        assertEquals("\"true\"", objectMapper.writeValueAsString(input));
    }

}