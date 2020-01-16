package com.example.Pigeons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PigeonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PigeonsApplication.class, args);
    }

}
