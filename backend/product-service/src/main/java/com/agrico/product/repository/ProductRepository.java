package com.agrico.product.repository;

import com.agrico.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByActiveTrue(Pageable pageable);

    Page<Product> findByCategoryIgnoreCaseAndActiveTrue(
            String category,
            Pageable pageable
    );

    Page<Product> findByNameContainingIgnoreCaseAndActiveTrue(
            String name,
            Pageable pageable
    );
}
