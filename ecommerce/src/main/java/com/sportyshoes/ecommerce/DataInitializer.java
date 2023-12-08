package com.sportyshoes.ecommerce;

import com.sportyshoes.ecommerce.Entities.Product;
import com.sportyshoes.ecommerce.Entities.User;
import com.sportyshoes.ecommerce.Repository.ProductRepository;
import com.sportyshoes.ecommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(ProductRepository productRepository, UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Add products
        productRepository.save(new Product("Running Shoes", "Sports"));
        productRepository.save(new Product("Basketball Shoes", "Sports"));
        productRepository.save(new Product("Tennis Shoes", "Sports"));

        // Add users
        userRepository.save(new User("john_doe", passwordEncoder.encode("password"), "john.doe@example.com"));
        userRepository.save(new User("jane_smith", passwordEncoder.encode("password"), "jane.smith@example.com"));
    }
}
