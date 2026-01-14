package org.example.backendproject.controller;

import org.example.backendproject.entity.Product;
import org.example.backendproject.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//
//@RestController
//@RequestMapping
//public class ProductControllerCopy {
//    private final ProductService productService;
//    public ProductControllerCopy(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public List<Product> getAll(){
//        return productService.getAll();
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getById(@PathVariable Long id){
//        return productService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//    @PostMapping("/create/item")
//    public Product create(@RequestBody Product product){
//        return productService.save(product);
//    }
//    @PutMapping("/{id}")
//    public Product update(@PathVariable Long id, @RequestBody Product product){
//        return productService.update(id, product);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id){
//        productService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//}
