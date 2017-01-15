package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirCodingSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirCodingModule extends SimpleModule {
    private static final String NAME = "FhirCodingModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirCodingModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.Coding.class, new FhirCodingSerializer());
    }
}
