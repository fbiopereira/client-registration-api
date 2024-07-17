package com.fbiopereira.customer_registration_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ClientRegistrationApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
