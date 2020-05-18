package com.digital.Phone.Persistance;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Phone {
@Id
private Long number;
@Enumerated(EnumType.STRING)
private NoType noType;

private Long customerId;
}
