package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.util.IdGenerator;
import org.springframework.stereotype.Repository;


@Repository
public class ProductRepository extends AbstractInMemoryRepository<Product>{

    @Override
    protected String getId(Product product) {
        return product.getProductId();
    }

    @Override
    protected void setId(Product product, String id) {
        product.setProductId(id);
    }

    @Override
    protected void copyField(Product existingProduct, Product updatedProduct) {
        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setProductQuantity(updatedProduct.getProductQuantity());
    }
}
