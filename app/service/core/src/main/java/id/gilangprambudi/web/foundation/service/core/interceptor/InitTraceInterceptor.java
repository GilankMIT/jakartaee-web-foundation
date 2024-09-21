/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.interceptor;

import id.gilangprambudi.web.foundation.service.core.interceptor.annotations.InitTrace;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: InitTraceInterceptor.java, v 0.1 2024‐09‐19 01.01 gilang.prambudi Exp $$
 */

@Interceptor @InitTrace @Priority(5)
public class InitTraceInterceptor {

   private final Tracer tracer = GlobalOpenTelemetry.getTracer("my-service-tracer");

   @AroundInvoke
   public Object invokeInitTrace(InvocationContext ctx) throws Exception {

      String methodName = ctx.getMethod().getName();
      String className = ctx.getTarget().getClass().getName();

      Span span = tracer.spanBuilder(String.format("%s%s", className,  methodName)).startSpan();

      try {
         span.makeCurrent();
         return ctx.proceed();
      } catch (Exception e) {
         span.recordException(e);
         span.setStatus(io.opentelemetry.api.trace.StatusCode.ERROR);
         return ctx.proceed();
      } finally {
         span.end();
      }
   }


}