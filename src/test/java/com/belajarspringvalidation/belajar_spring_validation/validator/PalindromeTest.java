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
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("miftah"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }

    @Test
    void testIsPalindrome() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("kodok"));
        Assertions.assertTrue(constraintViolations.isEmpty());
        Assertions.assertEquals(0, constraintViolations.size());
    }

    @Test
    void testPalindromeMessage() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("miftah"));

        String message = constraintViolations.stream().findFirst().get().getMessage();

        Assertions.assertEquals("Data bukan palindrome", message);
    }

}
