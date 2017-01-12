package com.csra.jackson.serializer;

import com.csra.fhir.String;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirStringSerializer  extends StdSerializer<String> {

    public FhirStringSerializer() {
        this(null);
    }

    public FhirStringSerializer(Class<String> string) {
        super(string);
    }

    @Override
    public void serialize(String string, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(string.getValue());
    }
}
