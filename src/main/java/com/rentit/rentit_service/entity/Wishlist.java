package com.rentit.rentit_service.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "wishlist_id")
    private Long id;

    @Column(name = "added_at")
    private Date addedAt;


}
