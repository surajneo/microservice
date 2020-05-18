package com.digital.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Phone {
private Long number;
private NoType noType;

private Long customerId;
}
