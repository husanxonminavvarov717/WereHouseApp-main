package org.example.warehouseapp.dto;

import lombok.*;
import org.example.warehouseapp.model.Input;
import org.example.warehouseapp.model.Product;

import java.security.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InPutProductDto {
    private List<Product> product;
    private Integer amount;
    private Double price;
    private Timestamp expireDate;
    private Input input;
}
