package com.example.pro2_kovalov_bazar.repositories;

import com.example.pro2_kovalov_bazar.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
