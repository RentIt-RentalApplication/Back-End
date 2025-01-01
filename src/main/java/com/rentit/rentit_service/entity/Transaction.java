package com.rentit.rentit_service.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "transaction_id")
    private Long id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "transaction_date")
    private String date;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_status")
    private String transactioStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;


}
