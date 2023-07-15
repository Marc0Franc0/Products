package com.app.service;

import com.app.dto.ProductDTO;
import com.app.model.Product;
import java.util.List;

public interface ProductService {

    public Product addProduct(ProductDTO productDTO);

    public String removeProduct(int id);

    public Product modifyProduct(int id,ProductDTO productDTO);

    public Product getProduct(int id);
       
    public List<Product> getProducts();

}
