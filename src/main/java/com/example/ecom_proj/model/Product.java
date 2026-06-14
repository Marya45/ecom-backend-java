package com.example.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private Boolean available;
    private Integer stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;

}
