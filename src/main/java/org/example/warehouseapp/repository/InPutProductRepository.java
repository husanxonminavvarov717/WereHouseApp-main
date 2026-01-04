package org.example.warehouseapp.repository;

import org.example.warehouseapp.model.InPutProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InPutProductRepository extends JpaRepository<InPutProduct, Integer> {
}
