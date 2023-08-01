package dev.scjoao.usercontrolapi.controllers;

import dev.scjoao.usercontrolapi.entities.User;
import dev.scjoao.usercontrolapi.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    @Transactional
    public User saveUser(@RequestBody User user){
        return repository.save(user);
    }
}
