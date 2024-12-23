package com.izmo.spring_cloud.currecy_exchange_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrecyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrecyExchangeServiceApplication.class, args);
	}
}

