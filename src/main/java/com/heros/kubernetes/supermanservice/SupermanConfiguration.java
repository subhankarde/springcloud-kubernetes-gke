package com.heros.kubernetes.supermanservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "supermanservice")
@Configuration
public class SupermanConfiguration {

    private String message = "I am the saviour of the Earth";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}