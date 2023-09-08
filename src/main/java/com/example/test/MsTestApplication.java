package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@RequiredArgsConstructor
public class MsTestApplication {

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.poolSize}")
    private Integer poolSize;

    public static void main(String[] args) {
        SpringApplication.run(MsTestApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println(username);
            System.out.println(password);
            System.out.println(poolSize);
        };
    }

}
