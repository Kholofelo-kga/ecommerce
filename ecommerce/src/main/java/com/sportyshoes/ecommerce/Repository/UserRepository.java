
package com.sportyshoes.ecommerce.Repository;

import com.sportyshoes.ecommerce.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}