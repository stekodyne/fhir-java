package com.csra.jackson.serializer;

import com.csra.fhir.Boolean;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirBooleanSerializer extends StdSerializer<Boolean> {

    public FhirBooleanSerializer() {
        this(null);
    }

    public FhirBooleanSerializer(Class<Boolean> input) {
        super(input);
    }

    @Override
    public void serialize(Boolean input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(input.isValue());
    }
}
