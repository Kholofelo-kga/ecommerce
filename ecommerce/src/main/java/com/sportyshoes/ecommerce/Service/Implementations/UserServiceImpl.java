
package com.sportyshoes.ecommerce.Service.Implementations;

import com.sportyshoes.ecommerce.Entities.User;
import com.sportyshoes.ecommerce.Repository.UserRepository;
import com.sportyshoes.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}