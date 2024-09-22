package web.foundation.application.config; /**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: config.WebFoundationConfig.java, v 0.1 2024‐09‐18 23.18 gilang.prambudi Exp $$
 */

@Startup
@Singleton
public class WebFoundationConfig {

    private OpenTelemetry openTelemetry;

    @PostConstruct
    public void initOtlp(){
        OtlpGrpcSpanExporter spanExporter = OtlpGrpcSpanExporter.builder()
                .setEndpoint("http://localhost:4317") // Set your OTLP endpoint
                .build();

        SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder()
                .addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
                .build();

        openTelemetry = OpenTelemetrySdk.builder()
                .setTracerProvider(sdkTracerProvider)
                .buildAndRegisterGlobal();
    }

    public OpenTelemetry getOpenTelemetry() {
        return openTelemetry;
    }

}