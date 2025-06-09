package com.belajarspringvalidation.belajar_spring_validation.data;

import com.belajarspringvalidation.belajar_spring_validation.validator.Palindrome;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Foo {

    @Palindrome
    private String bar;

}
