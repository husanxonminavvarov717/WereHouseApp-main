package org.example.warehouseapp.service;

import org.example.warehouseapp.repository.SuppplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    SuppplierRepository suppplierRepository;

}
