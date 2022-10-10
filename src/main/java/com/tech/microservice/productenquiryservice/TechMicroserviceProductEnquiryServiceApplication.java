package com.tech.microservice.productenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.tech.microservice.productenquiryservice")
public class TechMicroserviceProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechMicroserviceProductEnquiryServiceApplication.class, args);
	}

}
