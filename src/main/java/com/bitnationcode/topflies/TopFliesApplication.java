package com.bitnationcode.topflies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TopFliesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopFliesApplication.class, args);
    }
}