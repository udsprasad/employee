package com.example.employee.controller.external;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

@Component
@Profile("!dev")
public class FirstRetryAndCircuitBreakerAnnotation implements ExternalService {

    // by default retry(circuitBreaker(method))
    // fallback method should belongs to outerAspect like shown below
    // it should have below fallback method for retry and circuit breaker
    @Retry(name = "restTemplateRetry", fallbackMethod = "fallBackMethod")
    @CircuitBreaker(name = "userApiCircuitBreaker")
    public String getUserApicall(int i) {
        System.out.println("inside FirstRetryAndCircuitBreakerAnnotation getUserApicall: " + i);
        throw new HttpServerErrorException(HttpStatusCode.valueOf(502));
    }

    public String fallBackMethod(int i, CallNotPermittedException ex){
        System.out.println(ex.getMessage()+ " HttpServerError inside circuit breaker of FirstRetryAndCircuitBreakerAnnotation");
        return "Currently user server is down";
    }


    public String fallBackMethod(int i,Exception ex){
        System.out.println(ex.getMessage()+ " HttpServerError inside retry");
        return "fallback method for another exceptions";
    }

}
