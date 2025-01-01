package com.rentit.rentit_service.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Review extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "review_id")
    private Long id;

    @Column(name = "review_title")
    private String title;

    @Column(name = "review_description")
    private String description;

    @Column(name = "rating")
    private int rating;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "user_id")
    private long userId;


}
