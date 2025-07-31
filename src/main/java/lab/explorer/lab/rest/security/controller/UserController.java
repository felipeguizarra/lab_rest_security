package lab.explorer.lab.rest.security.controller;

import lab.explorer.lab.rest.security.Service.UserService;
import lab.explorer.lab.rest.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void postUser(@RequestBody User user){
        service.createUser(user);
    }
}
