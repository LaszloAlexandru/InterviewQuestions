package org.real.project.example.repositories;
import org.real.project.example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> { // <UserEntity> Type <Integer> ID
    UserEntity findByLastName(String lastName);
    UserEntity findByEmail(String email);

}
