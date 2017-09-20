package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.Registration;
import com.sample.repository.RegistrationRepository;

@RestController
@RequestMapping("api/v1/")
public class RegistrationController {

	@Autowired
	private RegistrationRepository registrationRepository;

	@RequestMapping(value = "master", method = RequestMethod.GET)
	public Registration registration() {
		System.out.println(registrationRepository.findOne(1L));
		return registrationRepository.findOne(Long.valueOf("1"));
	}

	@RequestMapping("test")
	public String test() {
		return "Hello World";
	}
}
