package com.example.employee.controller.external;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

@Component
public class UserAPICall {

    @Retry(name = "restTemplateRetry", fallbackMethod = "getUserApiFallBack")
    public String getUserApicall() {
        System.out.println("inside getUserApicall");
        throw new HttpServerErrorException(HttpStatusCode.valueOf(502));
    }

    // rules:
    // The fallback method must return the same type as the original method (or a compatible type).
    //The fallback method must match all parameters of the original method, in order.
    //You can optionally add a Throwable as the last parameter to get the exception that caused the failure.
    //
    //Usually in the same class as the method being retried.
    //Can also be in a different bean, if accessible via Spring (advanced).


    public String getUserApiFallBack(HttpServerErrorException ex){
        System.out.println(ex.getMessage()+ " HttpServerError");
        throw ex;
    }

    public String getUserApiFallBack(ResourceAccessException ex){
        System.out.println(ex.getMessage());
        throw ex;
    }
}
