package com.digital.Address.Persistance;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {
@Id
private String addressLine;
private String city;
private String state;
private String country;
private int pinCode;

private Long customerId;
}
