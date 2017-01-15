package com.csra.jackson.module;

import com.csra.jackson.serializer.FhirResourceContainerSerializer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Created by steffen on 1/12/17.
 */
public class FhirResourceContainerModule extends SimpleModule {
    private static final String NAME = "FhirResourceContainerModule";
    private static final VersionUtil VERSION_UTIL = new VersionUtil() {};

    public FhirResourceContainerModule() {
        super(NAME, VERSION_UTIL.version());
        addSerializer(com.csra.fhir.ResourceContainer.class, new FhirResourceContainerSerializer());
    }
}
