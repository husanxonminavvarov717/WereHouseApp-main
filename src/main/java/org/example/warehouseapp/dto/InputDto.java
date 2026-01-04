package org.example.warehouseapp.dto;

import lombok.*;
import org.example.warehouseapp.model.Currency;
import org.example.warehouseapp.model.Supplier;
import org.example.warehouseapp.model.WareHouse;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputDto {
    private WareHouse warehouse;
    private Supplier supplier;
    private Currency currency;
    private String factureNumber;
    private String code;
}
