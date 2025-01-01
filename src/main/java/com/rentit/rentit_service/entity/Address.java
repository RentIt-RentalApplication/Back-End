package com.rentit.rentit_service.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Address extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "address_id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "is_primary")
    private boolean isPrimary;
}
