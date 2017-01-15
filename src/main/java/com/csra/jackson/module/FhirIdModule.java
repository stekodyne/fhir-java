package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirIdSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirIdModule extends SimpleModule {
    private static final String NAME = "FhirIdModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirIdModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.Id.class, new FhirIdSerializer());
    }
}
