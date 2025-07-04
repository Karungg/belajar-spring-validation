package com.belajarspringvalidation.belajar_spring_validation.validator;

import org.springframework.beans.factory.annotation.Autowired;

import com.belajarspringvalidation.belajar_spring_validation.helper.StringHelper;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return stringHelper.isPalindrome(value);
    }

}