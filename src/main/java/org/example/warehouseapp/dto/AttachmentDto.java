package org.example.warehouseapp.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AttachmentDto {
    private String name;
    private String size;
    private String contentType;

}