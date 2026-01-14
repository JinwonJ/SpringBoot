package org.example.backendproject.dto.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {

    @NotNull
    private String name;

    @NotNull
    @Positive
    private Double price;
}
