package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.entity.Registration;
import com.sample.repository.RegistrationRepository;

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
			rr.save(new Registration("RajaRam", "SundarRaj"));

			rr.findAll().forEach(r -> {
				logger.info("data saved to memory " + r.getFirstname().toLowerCase());
			});

		};
	}

}
