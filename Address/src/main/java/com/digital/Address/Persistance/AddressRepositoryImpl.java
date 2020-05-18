package com.digital.Address.Persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressRepositoryImpl {

	@Autowired
	private AddressRepository  addressRepository;

	public List<Address> getAddressByCustomerId(Long customerId) {
		return addressRepository.findByCustomerId(customerId);
	}
}
