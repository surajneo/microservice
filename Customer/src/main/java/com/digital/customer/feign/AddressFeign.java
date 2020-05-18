package com.digital.customer.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.digital.customer.model.Address;

@FeignClient(value = "Address", url ="localhost:8082/address")
public interface AddressFeign {
	
	@GetMapping(value = "/get-address/{customerId}")
    List<Address> getAddressByCustomerId(@PathVariable(value="customerId") Long customerId);

}
