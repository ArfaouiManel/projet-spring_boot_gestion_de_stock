package org.example.gestion_de_stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.gestion_de_stock.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
