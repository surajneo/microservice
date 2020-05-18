package com.digital.customer.model;

import java.util.List;

import com.digital.customer.persistance.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDetails {

	private Customer customer;
	private List<Address> addresses;
	private List<Phone> phones;
	
}
