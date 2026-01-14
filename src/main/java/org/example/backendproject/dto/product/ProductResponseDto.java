package org.example.backendproject.dto.product;

import lombok.Getter;

@Getter
public class ProductResponseDto {

    // getter
    private Long id;
    private String name;
    private Double price;

    public ProductResponseDto(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
