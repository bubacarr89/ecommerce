package com.marjlow.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.marjlow.ecommerce.*"})
//@EnableJpaRepositories(basePackages = {"com.marjlow.ecommerce.dto"})
//@EntityScan(basePackages = {"com.marjlow.ecommerce.models"})
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

}
