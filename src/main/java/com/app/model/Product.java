package com.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Basic
    String name;
    String companyBrand;
    int amount;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name +
                ", companyBrand=" + companyBrand + ", amount=" + amount + '}';
    }

    //Se utiliza para poder mapear la lista deproductosy asi mostrarlos en la tabla
  public Object[] toArray(){
      
      Object[] obj = new Object[4];
      
      obj[0]= this.id;
      obj[1]=this.name;
       obj[2]=this.amount;
       obj[3]=this.companyBrand;
       return obj;
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
