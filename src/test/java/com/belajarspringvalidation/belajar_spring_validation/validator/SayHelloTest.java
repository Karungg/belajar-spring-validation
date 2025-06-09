package com.belajarspringvalidation.belajar_spring_validation.validator;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.belajarspringvalidation.belajar_spring_validation.helper.SayHello;

import jakarta.validation.ConstraintViolationException;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSayHello() {
        String message = sayHello.sayHello("Miftah");
        Assertions.assertEquals("Hello Miftah", message);
    }

    @Test
    void testError() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            sayHello.sayHello("");
        });
    }

}
