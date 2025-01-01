package com.rentit.rentit_service.entity;

import com.rentit.rentit_service.constant.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "last_login_at")
    private LocalDateTime lastLoginAt;

    @Column(name = "profile_url")
    private String profileUrl;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "status")
    private String status;

    @Column(name = "phone_no")
    private String phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;



    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<CartItem> cartItems;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Product> products;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "whishlist_id")
    private Wishlist wishlist;

    @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "user_id")
    List<RentalDetail> rentalDetails;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
     List<Orders> orders;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    List<Review> reviews;


    @Column(name = "transaction_id")
    private Long transactionId;









}
