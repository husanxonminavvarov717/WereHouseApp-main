package org.example.warehouseapp.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private Integer categoryId;
    private Integer attachment;
    private String code;
    private Integer measurement;
}
