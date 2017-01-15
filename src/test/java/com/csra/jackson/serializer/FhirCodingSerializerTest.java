package com.csra.jackson.serializer;

import com.csra.fhir.Code;
import com.csra.fhir.Coding;
import com.csra.fhir.String;
import com.csra.jackson.module.FhirCodeModule;
import com.csra.jackson.module.FhirCodingModule;
import com.csra.jackson.module.FhirStringModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by steffen on 1/15/17.
 */
public class FhirCodingSerializerTest {

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new FhirCodeModule());
        this.objectMapper.registerModule(new FhirStringModule());
        this.objectMapper.registerModule(new FhirCodingModule());
    }

    @Test
    public void serialize() throws Exception {
        Coding input = new Coding();
        Code code = new Code();
        String display = new String();

        code.setValue("true");
        display.setValue("display");
        input.setDisplay(display);
        input.setCode(code);

        assertEquals("{\"display\":\"display\",\"code\":\"true\",\"system\":null}", objectMapper.writeValueAsString(input));
    }

}