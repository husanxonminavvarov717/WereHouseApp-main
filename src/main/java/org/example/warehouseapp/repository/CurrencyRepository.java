package org.example.warehouseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
