package com.livemilton.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.livemilton.loans.dto.LoansContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
/*
 * @ComponentScans({ @ComponentScan("com.livemilton.loans.controller") })
 * 
 * @EnableJpaRepositories("com.livemilton.loans.repository")
 * 
 * @EntityScan("com.livemilton.loans.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = { LoansContactInfoDto.class })
@OpenAPIDefinition(info = @Info(title = "Loans microservice REST API Documentation", description = "Livemilton Loans microservice REST API Documentation", version = "v1", contact = @Contact(name = "Milton Munoz", email = "livemilton@hotmail.com", url = "https://www.livemilton.com"), license = @License(name = "Apache 2.0", url = "https://www.livemilton.com")), externalDocs = @ExternalDocumentation(description = "Livemilton Loans microservice REST API Documentation", url = "https://www.livemilton.com/swagger-ui.html"))
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}