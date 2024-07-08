package org.real.project.example.repositories;

import org.real.project.example.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
     ProductEntity findByTitle(String title);
     ProductEntity findByDescription(String description);
}
