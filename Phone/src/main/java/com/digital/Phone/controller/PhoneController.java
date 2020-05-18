package com.digital.Phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.Phone.Persistance.Phone;
import com.digital.Phone.Persistance.PhoneRepositoryImpl;

@RestController
@RequestMapping("/phone")
public class PhoneController {

	@Autowired
	private PhoneRepositoryImpl  phoneRepositoryImpl;
	
	@GetMapping(value = "/get-phone/{customerId}")
	public List<Phone> getPhoneByCustomerId(@PathVariable("customerId") Long customerId ) {
		System.out.println("The customer id is "+ customerId);
		return phoneRepositoryImpl.getPhoneByCustomerId(customerId);
	}
}
