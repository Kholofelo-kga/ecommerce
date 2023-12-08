
package com.sportyshoes.ecommerce.Controller;

import ch.qos.logback.core.model.Model;
import com.sportyshoes.ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public String getUserByUsername(@PathVariable String username, Model model) {
        model.addAttribute("user", userService.getUserByUsername(username));
        return "user";
    }
}