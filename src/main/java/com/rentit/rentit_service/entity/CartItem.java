package com.rentit.rentit_service.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int quantity;

    @Column(name = "user_id")
    private long userId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

}
