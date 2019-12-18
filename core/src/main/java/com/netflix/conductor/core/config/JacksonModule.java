package com.netflix.conductor.core.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.AbstractModule;
import com.netflix.conductor.common.utils.JsonMapperProvider;

public class JacksonModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ObjectMapper.class).toProvider(JsonMapperProvider.class);
    }
}
