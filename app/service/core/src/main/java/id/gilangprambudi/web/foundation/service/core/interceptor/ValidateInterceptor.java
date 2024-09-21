/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.interceptor;

import id.gilangprambudi.web.foundation.service.core.interceptor.annotations.Validate;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: ValidateInterceptor.java, v 0.1 2024‐09‐19 00.31 gilang.prambudi Exp $$
 */

@Interceptor
@Validate
@Priority(10)
public class ValidateInterceptor {

   Logger logger = LoggerFactory.getLogger(ValidateInterceptor.class);

   @AroundInvoke
   public Object validateInvocation(InvocationContext ctx) throws Exception {
      // Get method name and class
      String methodName = ctx.getMethod().getName();
      String className = ctx.getTarget().getClass().getName();

      // Log before the method execution
      logger.info("Entering method: " + className + "." + methodName);
      try {
         // Proceed with the original method call
         return ctx.proceed();
      } finally {
         // Log after the method execution
         logger.info("Exiting method: " + className + "." + methodName);
      }
   }


}