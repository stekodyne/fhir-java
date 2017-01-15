package com.csra.jackson.serializer;

import com.csra.fhir.Coding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirCodingSerializer extends StdSerializer<Coding> {

    public FhirCodingSerializer() {
        this(null);
    }

    public FhirCodingSerializer(Class<Coding> input) {
        super(input);
    }

    @Override
    public void serialize(Coding input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("display", input.getDisplay());
        jsonGenerator.writeObjectField("code", input.getCode());
        jsonGenerator.writeObjectField("system", input.getSystem());
        jsonGenerator.writeEndObject();
    }
}
