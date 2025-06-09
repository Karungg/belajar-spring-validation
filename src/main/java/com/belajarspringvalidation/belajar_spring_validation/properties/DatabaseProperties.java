package com.belajarspringvalidation.belajar_spring_validation.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ConfigurationProperties("database")
@Validated
public class DatabaseProperties {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
