package com.example.employee.controller.external;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

@Component
@Profile("dev")
public class FirstCircuitBreakAndRetryAnnotation implements ExternalService {

    // check how the order of circuit breaker and retry has been change by
    // following config
    //- resilience4j.retry.retryAspectOrder
    //- resilience4j.circuitbreaker.circuitBreakerAspectOrder
    //- resilience4j.ratelimiter.rateLimiterAspectOrder
    //- resilience4j.timelimiter.timeLimiterAspectOrder
    //- resilience4j.bulkhead.bulkheadAspectOrder


    // important thing here out layer is CD and inner is retry
    // retry should throw error then only CB will count it
    // that why fallback method belong to Outer layer
    // but created fallbackMethods for different exceptions
    // I want to handle
    //
    // CallnotPermitted is used in opening state to reject

    @Retry(name = "restTemplateRetry")
    @CircuitBreaker(name = "userApiCircuitBreaker", fallbackMethod = "getUserApiCircuitBreakerFallBack")
    public String getUserApicall(int i) {
        System.out.println("inside FirstRetryAndCircuitBreakerAnnotation getUserApicall: " + i);
        throw new HttpServerErrorException(HttpStatusCode.valueOf(502));
    }


    public String getUserApiCircuitBreakerFallBack(int i, CallNotPermittedException ex){
        System.out.println(ex.getMessage()+ " HttpServerError inside circuit breaker of FirstRetryAndCircuitBreakerAnnotation");
        return "Currently user server is down";
    }

    public String getUserApiCircuitBreakerFallBack(int i, Exception ex){
        System.out.println(ex.getMessage());
        return "Handling other exceptions";
    }

}
