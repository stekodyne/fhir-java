package com.csra.jackson.serializer;

import com.csra.fhir.Code;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirCodeSerializer extends StdSerializer<Code> {

    public FhirCodeSerializer() {
        this(null);
    }

    public FhirCodeSerializer(Class<Code> code) {
        super(code);
    }

    @Override
    public void serialize(Code code, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(code.getValue());
    }
}
