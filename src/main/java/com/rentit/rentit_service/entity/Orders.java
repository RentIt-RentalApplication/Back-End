package com.rentit.rentit_service.entity;

import com.rentit.rentit_service.constant.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name="oder_tracking_number")
    private int orderTrackingNumber;

    @Column(name="total_quantity")
    private int totalQuantity;

    @Column(name="total_price")
    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private Status orderStatus;


    @Column(name = "user_id")
    private Long userId;

    @Column(name = "transaction_id")
    private Long transactionId;


}
