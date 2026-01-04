package org.example.warehouseapp.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDto {
    private String name;
    private boolean active;
    private String phoneNumber;
}
