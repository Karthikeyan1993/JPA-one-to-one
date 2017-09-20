package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.entity.Registration;
import com.sample.repository.RegistrationRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class OtmApplication {

	public static final Logger logger = LoggerFactory.getLogger(OtmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OtmApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RegistrationRepository rr) {
		return (args) -> {
			rr.save(new Registration("Karthikeyan", "Karuppusamy"));
			rr.findAll().forEach(r -> {
				logger.info("data saved to memory " + r.getFirstname().toLowerCase());
			});

		};
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/api.*")).build();
	}

}
