package org.example.warehouseapp.repository;

import org.example.warehouseapp.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppplierRepository extends JpaRepository<Supplier,Integer> {
}
