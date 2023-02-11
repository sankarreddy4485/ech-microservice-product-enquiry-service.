package com.tech.microservice.productenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableFeignClients("com.tech.microservice.productenquiryservice")
public class TechMicroserviceProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechMicroserviceProductEnquiryServiceApplication.class, args);
	}

}
