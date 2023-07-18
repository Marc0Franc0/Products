package com.app.service;

import com.app.dto.ProductDTO;
import com.app.model.Product;
import com.app.persitence.ProductJpaController;
import com.app.persitence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Clase que contiene los metodos que envian datos a los metodos 
//de la clase PersistenceController
public class ProductServiceImpl implements ProductService{
    ProductJpaController productJpaController = new ProductJpaController();
   @Override
  public void addProduct(ProductDTO productDTO)  {
       productJpaController.create(
              new Product(
              0,
              productDTO.getName(),
              productDTO.getCompanyBrand(),
              productDTO.getAmount())
      );
    
  }

    @Override
    public void removeProduct(int id) {
        try {
            productJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifyProduct(int id,ProductDTO productDTO) {
        try {
            productJpaController.edit(new Product(
                    id,
                    productDTO.getName(),
                    productDTO.getCompanyBrand(),
                    productDTO.getAmount()));
        } catch (Exception ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProduct(int id) {
       return productJpaController.findProduct(id);
    }

    @Override
    public List<Product> getProducts( ) {
        
        return productJpaController.findProductEntities();
    }
}
