package com.marina.marina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"controller", "service"})
public class MarinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarinaApplication.class, args);
    }

}
