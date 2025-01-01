package com.rentit.rentit_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;

    @Column(name = "rental_price_per_day")
    private BigDecimal rentalPricePerDay;

    @Column(name = "rental_price_per_week")
    private BigDecimal rentalPricePerWeek;

    @Column(name = "availability_status")
    private String availabilityStatus;

    @Column(name = "max_rental_period")
    private Integer maxRentalPeriod;

    @Column(name = "deposit_amount")
    private BigDecimal depositAmount;

    @Column(name = "quantity_available")
    private Integer quantityAvailable;

    @Column(name = "total_quantity")
    private Integer totalQuantity;

    @Column(name = "product_conditions")
    private String conditions;

    @Column(name = "last_maintenance_date")
    private LocalDate lastMaintenanceDate;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "tags")
    private String tags;


    @Column(name = "user_id")
    private long userId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Review> reviews;

    @Column(name = "category_id")
    private long categoryId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rental_detail_id")
    private List<RentalDetail> rentalDetail;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Wishlist> WishList;

}
