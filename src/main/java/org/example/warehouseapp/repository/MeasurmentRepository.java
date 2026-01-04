package org.example.warehouseapp.repository;

import org.example.warehouseapp.model.Measurment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurmentRepository extends JpaRepository<Measurment, Long> {
}
