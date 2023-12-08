
package com.sportyshoes.ecommerce.Service.Implementations;
import com.sportyshoes.ecommerce.Entities.Product;
import com.sportyshoes.ecommerce.Repository.ProductRepository;
import com.sportyshoes.ecommerce.Service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }  
}
