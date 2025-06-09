package com.belajarspringvalidation.belajar_spring_validation.validator;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.belajarspringvalidation.belajar_spring_validation.data.Foo;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;

    @Test
    void testPalindromeFail() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("Kodok"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }

}
