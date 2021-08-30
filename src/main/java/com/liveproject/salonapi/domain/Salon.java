package com.liveproject.salonapi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
@Entity
public class Salon {
    private final String name;
    private final String address;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String phone;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
