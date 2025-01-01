package com.rentit.rentit_service.entity;

import java.util.Date;

import com.rentit.rentit_service.constant.Status;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RentalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_detail_id")
    private Long id;

    @Column(name = "rental_date")
    private Date rentalDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "rental_type")
    private String rentalType;

    @Column(name = "total_cost")
    private int totalCost;


    @Enumerated(EnumType.STRING)
    private Status orderStatus;




    @Column(name = "user_id")
    private long userId;

    @Column(name = "order_id")
    private long orderId;

}
