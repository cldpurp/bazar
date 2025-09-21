package com.example.pro2_kovalov_bazar.repositories;

import com.example.pro2_kovalov_bazar.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
