package com.example.Ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JoinColumn(name = "category_id", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL) // TODO: take a look
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "imageURL")
    private String imageURL;

    @Column(name = "date_created")
    @CreationTimestamp // TODO: Take a look
    private LocalDate dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp // TODO: Take a look
    private LocalDate lastUpdated;
}
