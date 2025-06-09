package com.belajarspringvalidation.belajar_spring_validation.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Validated
@Component
public class SayHello {

    public String sayHello(@NotBlank String name) {
        return "Hello " + name;
    }

}
