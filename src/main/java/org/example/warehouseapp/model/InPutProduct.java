package org.example.warehouseapp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InPutProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    private List<Product> product;
    @Column(nullable = false)
    private Integer amount;
    @Column(nullable = false)
    private Double price;
    private Timestamp expireDate;
    @OneToOne
    private Input input;
}
