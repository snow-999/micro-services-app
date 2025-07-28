package com.khaledmicroservices.product_service.productDTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private long id;
    private String productName;
    private String productDisc;
    private int productAmount;
}
