package com.murilo.commerce.dtos;

import jakarta.validation.constraints.NotBlank;

public record CartDto(
    @NotBlank String productName,
    @NotBlank int qty
)
{ }
