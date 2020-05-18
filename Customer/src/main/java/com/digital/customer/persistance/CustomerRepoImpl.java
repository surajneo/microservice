package com.digital.customer.persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepoImpl {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).get();
		}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerByName(String firstName) {
		return customerRepository.findByFirstName(firstName);
		}
}

