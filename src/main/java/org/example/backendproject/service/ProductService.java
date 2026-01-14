package org.example.backendproject.service;

import org.example.backendproject.dto.product.ProductRequestDto;
import org.example.backendproject.dto.product.ProductResponseDto;
import org.example.backendproject.entity.Product;
import org.example.backendproject.mapper.ProductMapper;
import org.example.backendproject.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Transactional(readOnly = true)
    public List<ProductResponseDto> getAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toResponse)
                .toList();
    }

    @Transactional(readOnly = true)
    public Optional<ProductResponseDto> getById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toResponse);
    }

    public ProductResponseDto create(ProductRequestDto dto) {
        Product saved = productRepository.save(productMapper.toEntity(dto));
        return productMapper.toResponse(saved);
    }

    public ProductResponseDto update(Long id, ProductRequestDto dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));

        productMapper.updateEntity(product, dto); // 엔티티 값 변경
        // @Transactional이라 save 없이도 flush 시점에 반영되지만,
        // 명시적으로 save 해도 OK
        Product saved = productRepository.save(product);

        return productMapper.toResponse(saved);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
