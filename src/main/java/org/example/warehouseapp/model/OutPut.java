package org.example.warehouseapp.model;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OutPut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Timestamp date;
    @ManyToOne
    private WareHouse warehouse;
    @OneToMany
    private List <Currency> curency;
    @Column(nullable = false)
    private String factureNumber;
    @Column(nullable = false)
    private Integer code;
    @ManyToMany
    private List<Client> client;
}
