package com.murilo.commerce.dtos;

import jakarta.validation.constraints.NotBlank;

public record ProductDto(
    @NotBlank String name,
    @NotBlank String description,
    @NotBlank double price
) {}