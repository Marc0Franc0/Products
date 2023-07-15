package com.app.persitence;

import com.app.model.Product;
import com.app.persitence.ProductJpaController;
import java.util.List;

//Esta clase se usa a la hora de utilizar los controladores Jpa de acuerdo a las 
// diferentes entidades
public class PersistenceController {

    ProductJpaController productJpaController = new ProductJpaController();

    public Product addProduct(Product product) {
        productJpaController.create(product);
        return product;
    }

    public List<Product> getProducts() {
        return productJpaController.findProductEntities();
  
    }

    public Product getProduct(int id) {
        return productJpaController.findProduct(id);
    }

    public Product modifyProduct(Product product) {
        try{
            productJpaController.edit(product);
        }catch(Exception e){
            e.printStackTrace();
        }
         
         return product;
    }

    public String removeProduct(int id) {
          try{
           productJpaController.destroy(id);
        }catch(Exception e){
            e.printStackTrace();
        }
       return "Producto con id '"+id+"' eliminado.";
    }
}
