package com.qa.AccountDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AccountDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDiscoveryServerApplication.class, args);
	}

}
