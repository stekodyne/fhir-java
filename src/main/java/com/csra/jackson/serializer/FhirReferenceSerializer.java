package com.csra.jackson.serializer;

import com.csra.fhir.Reference;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirReferenceSerializer extends StdSerializer<Reference> {

    public FhirReferenceSerializer() {
        this(null);
    }

    public FhirReferenceSerializer(Class<Reference> input) {
        super(input);
    }

    @Override
    public void serialize(Reference input, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("reference", input.getReference());
        jsonGenerator.writeObjectField("display", input.getDisplay());
        jsonGenerator.writeEndObject();
    }
}
