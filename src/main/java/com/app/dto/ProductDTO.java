package com.app.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductDTO {
    String name;
    String companyBrand;

    public ProductDTO(String name, String companyBrand, int amount) {
        this.name = name;
        this.companyBrand = companyBrand;
        this.amount = amount;
    }
    int amount;
}
