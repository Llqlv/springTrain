package com.example.spirng_ioc.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Crime and punishment")
    private String name;

    public String getName() {
        return name;
    }
}