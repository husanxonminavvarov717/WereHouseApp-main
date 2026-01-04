package org.example.warehouseapp.repository;

import org.example.warehouseapp.model.InPutProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InPutRepository extends JpaRepository<InPutProduct,Integer> {
}
