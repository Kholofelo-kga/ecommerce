
package com.sportyshoes.ecommerce.Repository;

import com.sportyshoes.ecommerce.Entities.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}