package org.example.warehouseapp.repository;

import org.example.warehouseapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
