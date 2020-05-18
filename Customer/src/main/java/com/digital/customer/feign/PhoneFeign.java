package com.digital.customer.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.digital.customer.model.Phone;


@FeignClient(value = "Phone", url ="localhost:8083/phone")
public interface PhoneFeign {

	@GetMapping(value = "/get-phone/{customerId}")
    List<Phone> getPhoneByCustomerId(@PathVariable(value="customerId") Long customerId);
}
