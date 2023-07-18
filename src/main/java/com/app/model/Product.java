package com.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Basic
    @Column(unique = true,nullable = false)
    private String name;

    @Basic
    @Column(nullable = false)
    private String companyBrand;

    @Basic
    @Column(nullable = false)
    private int amount;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name
                + ", companyBrand=" + companyBrand + ", amount=" + amount + '}';
    }

    //Se utiliza para poder mapear la lista deproductosy asi mostrarlos en la tabla
    public Object[] toArray() {

        Object[] obj = new Object[4];

        obj[0] = this.id;
        obj[1] = this.name;
        obj[2] = this.amount;
        obj[3] = this.companyBrand;
        return obj;
    }

    public Product() {
    }

    public Product(int id, String name, String companyBrand, int amount) {
        this.id = id;
        this.name = name;
        this.companyBrand = companyBrand;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getCompanyBrand() {
        return companyBrand;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyBrand(String companyBrand) {
        this.companyBrand = companyBrand;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
