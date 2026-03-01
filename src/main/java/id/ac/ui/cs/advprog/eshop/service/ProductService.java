package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;

public interface ProductService extends BaseService<Product>{
    Product create(Product product);
    List<Product> findAll();
    Product findById(String productId);
    Product update(String id, Product product);
    void deleteById(String productId);
}
