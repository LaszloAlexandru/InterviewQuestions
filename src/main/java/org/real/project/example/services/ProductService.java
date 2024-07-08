package org.real.project.example.services;

import org.real.project.example.entities.ProductEntity;
import org.real.project.example.models.Product;

import java.util.List;

public interface ProductService {
    //Create
//    Product createClassicsProduct(Product product);
//    Product createHistoryProduct(Product product);

    Product createProduct(Product product);

    //READ
    Product getProductByTitle(String title);

    List<ProductEntity> getAllProducts();

    Product getProductById(Integer id);

    Product getProductByDescription(String description);

    //UPDATE
    Product updateProduct(Integer id, Product product);

    //DELETE
    void deleteProductById(Integer id);

    void deleteAllProducts();
}

