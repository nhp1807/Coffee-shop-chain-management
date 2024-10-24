package com.example.coffee_shop_chain_management.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long materialID;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "description", nullable = false)
    String description;

    @OneToMany(mappedBy = "material")
    List<DetailImportOrder> detailImportOrders;

    @OneToMany(mappedBy = "material")
    List<ProductMaterial> productMaterials;

    @OneToMany(mappedBy = "material")
    List<Storage> storages;

    // Getters and setters
}

