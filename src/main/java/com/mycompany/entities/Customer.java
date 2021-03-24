package com.mycompany.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Collection;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {

    private Long id;
    private String name;
    private Collection<OrderItem> orderItems;
}
