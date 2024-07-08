package org.real.project.example.repositories;

import org.real.project.example.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
    OrderEntity findByDateOfSubmission(String dateOfSubmission);
}
