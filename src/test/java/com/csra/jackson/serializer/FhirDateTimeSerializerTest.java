package com.csra.jackson.serializer;

import com.csra.fhir.DateTime;
import com.csra.jackson.module.FhirDateTimeModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirDateTimeSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirDateTimeModule());
    }

    @Test
    public void serialize() throws Exception {
        DateTime input = new DateTime();
        input.setValue("1900-01-01");

        assertEquals("\"1900-01-01\"", objectMapper.writeValueAsString(input));
    }

}