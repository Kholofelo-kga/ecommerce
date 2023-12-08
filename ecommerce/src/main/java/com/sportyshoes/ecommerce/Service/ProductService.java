
package com.sportyshoes.ecommerce.Service;

import com.sportyshoes.ecommerce.Entities.Product;
import java.util.List;

public interface ProductService {
     List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
}
