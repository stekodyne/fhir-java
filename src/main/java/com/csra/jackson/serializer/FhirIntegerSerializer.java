package com.csra.jackson.serializer;

import com.csra.fhir.Integer;
import com.csra.fhir.String;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirIntegerSerializer extends StdSerializer<Integer> {

    public FhirIntegerSerializer() {
        this(null);
    }

    public FhirIntegerSerializer(Class<Integer> input) {
        super(input);
    }

    @Override
    public void serialize(Integer input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(input.getValue());
    }
}
