package com.app.service;

import com.app.dto.ProductDTO;
import com.app.model.Product;
import java.util.List;

public interface ProductService {

    public void addProduct(ProductDTO productDTO);

    public void removeProduct(int id);

    public void modifyProduct(int id,ProductDTO productDTO);

    public Product getProduct(int id);
       
    public List<Product> getProducts();

}
