package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirReferenceSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirReferenceModule extends SimpleModule {
    private static final String NAME = "FhirReferenceModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirReferenceModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.Reference.class, new FhirReferenceSerializer());
    }
}
