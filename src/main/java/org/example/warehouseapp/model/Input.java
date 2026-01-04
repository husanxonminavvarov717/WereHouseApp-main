package org.example.warehouseapp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Timestamp date;
    @ManyToMany
    private List<WareHouse> warehouse;
    @OneToOne
    private Supplier supplier;
    @OneToMany
    private List<Currency> currency;
    @Column(nullable = false)
    private String factureNumber;
    @Column(nullable = false)
    private String code;


}
