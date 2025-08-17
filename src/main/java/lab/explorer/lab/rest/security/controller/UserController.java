package lab.explorer.lab.rest.security.controller;

import lab.explorer.lab.rest.security.Service.UserService;
import lab.explorer.lab.rest.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void postUser(@RequestBody User user){
        service.createUser(user);
    }
    @GetMapping
    public ResponseEntity<List<User>> listaUsuarios() {
        return ResponseEntity.ok(service.listarUsuarios());
    }
}
