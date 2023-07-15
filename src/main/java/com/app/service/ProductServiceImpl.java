package com.app.service;

import com.app.dto.ProductDTO;
import com.app.model.Product;
import com.app.persitence.PersistenceController;
import java.util.List;

//Clase que contiene los metodos que envian datos a los metodos 
//de la clase PersistenceController
public class ProductServiceImpl implements ProductService{
    PersistenceController persistenceController = new PersistenceController();
   @Override
  public Product addProduct(ProductDTO productDTO)  {
      return persistenceController.addProduct(
              Product.builder()
              .id(0)
              .name(productDTO.getName())
              .amount(productDTO.getAmount())
              .companyBrand(productDTO.getCompanyBrand())
              .build()
      );
  }

    @Override
    public String removeProduct(int id) {
    return persistenceController.removeProduct(id);
    }

    @Override
    public Product modifyProduct(int id,ProductDTO productDTO) {
        return persistenceController.modifyProduct(Product.builder()
              .id(id)
              .name(productDTO.getName())
              .amount(productDTO.getAmount())
              .companyBrand(productDTO.getCompanyBrand())
              .build());
    }

    @Override
    public Product getProduct(int id) {
       return persistenceController.getProduct(id);
    }

    @Override
    public List<Product> getProducts( ) {
        
        return persistenceController.getProducts();
    }
}
