package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

  private Logger logger = LoggerFactory.getLogger(getClass());

//   @Pointcut
  @Before(
    "execution(* com.in28minutes.learnspringaop.aopexample.data.*.*(..))"
  )
  public void logMethodCall(JoinPoint joinPoint) {
    logger.info("Method is called -{}", joinPoint);
  }
}
