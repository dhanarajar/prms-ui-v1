package com.ford.purchase.prms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages="com.ford.purchase.prms.*")
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories(basePackages="com.ford.purchase.prms.repository")
@EntityScan(basePackages="com.ford.purchase.prms.entity")
public class PrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrmsApplication.class, args);
		//TEST --V2
	}
}
