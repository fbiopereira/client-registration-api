package com.fbiopereira.customer_registration_api;

import org.springframework.boot.SpringApplication;

public class TestClientRegistrationApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClientRegistrationApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
