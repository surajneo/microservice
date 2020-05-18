package com.digital.Phone.Persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneRepositoryImpl {

	@Autowired
	private PhoneRepository  phoneRepository;
	
	public List<Phone> getPhoneByCustomerId(Long customerId) {
		return phoneRepository.findByCustomerId(customerId);
	}
}
