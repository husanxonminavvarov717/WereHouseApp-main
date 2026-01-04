package org.example.warehouseapp.dto;

import lombok.*;
import org.example.warehouseapp.model.Client;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutPutDto {
    private Integer wareHouseId;
    private Integer currencyId;
    private String factureNumber;
    private Integer code;
    private List<Client> clientId;
}
