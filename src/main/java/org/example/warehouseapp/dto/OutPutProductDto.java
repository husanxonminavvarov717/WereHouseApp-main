package org.example.warehouseapp.dto;

import lombok.*;
import org.example.warehouseapp.model.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutPutProductDto {
    private Product product;
    private Integer amount;
    private Double price;
    private Integer outPutId;
}
