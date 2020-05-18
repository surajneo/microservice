package com.digital.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
private String addressLine;
private String city;
private String state;
private String country;
private int pinCode;

private Long customerId;
}
