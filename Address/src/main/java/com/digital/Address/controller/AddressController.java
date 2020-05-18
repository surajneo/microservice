package com.digital.Address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.Address.Persistance.Address;
import com.digital.Address.Persistance.AddressRepositoryImpl;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressRepositoryImpl  addressRepositoryImpl;
	
	@GetMapping(value = "/get-address/{customerId}")
	public List<Address> getAddressByCustomerId(@PathVariable("customerId") Long customerId ) {
		System.out.println("The customer id is "+ customerId);
		return addressRepositoryImpl.getAddressByCustomerId(customerId);
	}
}
