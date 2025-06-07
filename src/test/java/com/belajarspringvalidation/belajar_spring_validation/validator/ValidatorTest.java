package com.belajarspringvalidation.belajar_spring_validation.validator;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.belajarspringvalidation.belajar_spring_validation.data.Person;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@SpringBootTest
public class ValidatorTest {

  @Autowired
  private Validator validator;

  @Test
  void personNotValid() {
    var person = new Person("", "");

    Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
    
    Assertions.assertFalse(constraintViolations.isEmpty());
    Assertions.assertEquals(2, constraintViolations.size());
  }
}