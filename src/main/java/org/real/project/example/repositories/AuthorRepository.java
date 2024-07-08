package org.real.project.example.repositories;

import org.real.project.example.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
    AuthorEntity findByLastName(String lastName);
}
