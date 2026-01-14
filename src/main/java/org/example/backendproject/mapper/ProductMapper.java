package org.example.backendproject.mapper;

import org.example.backendproject.dto.product.ProductRequestDto;
import org.example.backendproject.dto.product.ProductResponseDto;
import org.example.backendproject.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductResponseDto toResponse(Product product) {
        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getPrice()
        );
    }

    public Product toEntity(ProductRequestDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }

    /** update 시에 기존 엔티티에 값만 덮어쓰기 */
    public void updateEntity(Product product, ProductRequestDto dto) {
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
    }
}
