package com.mycompany.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerDto {

    private Long id;
    private String customerName;
    private List<OrderItemDto> orders;
}
