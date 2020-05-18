package com.digital.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.customer.feign.AddressFeign;
import com.digital.customer.feign.PhoneFeign;
import com.digital.customer.model.Address;
import com.digital.customer.model.CustomerDetails;
import com.digital.customer.model.Phone;
import com.digital.customer.persistance.Customer;
import com.digital.customer.persistance.CustomerRepoImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepoImpl customerRepoImpl;
	
	
	@Autowired
	private AddressFeign addressFeign;
	
	@Autowired
	private PhoneFeign phoneFeign;
	
    @GetMapping(value = "/get-customer/{id}")
	public Customer getCustomerById(@PathVariable("id") Long id ) {
		System.out.println("The customer id is "+ id);
		return customerRepoImpl.getCustomerById(id);
	}
    
    @GetMapping(value = "/get-customer-by-name/{firstName}")
   	public Customer getCustomerByName(@PathVariable("firstName") String firstName ) {
   		
    	System.out.println("The customer First Name is "+ firstName);
   		return customerRepoImpl.getCustomerByName(firstName);
   	}
	
	@GetMapping(value = "/get-all-customers")
	public List<Customer> getAllCustomers() {
		return customerRepoImpl.getAllCustomers();
	}
	
	@GetMapping(value="/get-all-details/{id}")
	public CustomerDetails getAllDetailsById(@PathVariable("id") Long id) {
		
		System.out.println("The customer id is "+ id);
		
		Customer customer =  customerRepoImpl.getCustomerById(id);
		
		List<Address> addresses = addressFeign.getAddressByCustomerId(id);
		List<Phone> phones = phoneFeign.getPhoneByCustomerId(id);
		
		CustomerDetails details = new CustomerDetails();
		
		details.setAddresses(addresses);
		details.setPhones(phones);
		details.setCustomer(customer);
		
		System.out.println("The customer details are "+ details);
		return details;
	}
	
	@GetMapping(value="/get-customer-address/{id}")
	public List<Address> getCustomerAddressById(@PathVariable("id") Long id) {
		System.out.println("The customer id is "+ id);
		
		return addressFeign.getAddressByCustomerId(id);
	}
	
	@GetMapping(value="/get-customer-phone/{id}")
	public List<Phone> getCustomerPhoneById(@PathVariable("id") Long id) {
		System.out.println("The customer id is "+ id);
		return phoneFeign.getPhoneByCustomerId(id);
	}
}
