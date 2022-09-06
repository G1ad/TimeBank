package it.develhope.TimeBank.controllers;

import it.develhope.TimeBank.entities.User;
import it.develhope.TimeBank.repository.UserRepository;
import it.develhope.TimeBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller has to provide all the main operations we need on the User class.
 * The main operations we need are the CRUD (Create, Read, Update, Delete) operations.
 */


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity insertNewUser(@RequestBody User user){
        return userService.insertNewUser(user);
    }

    @GetMapping("/fetchAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long Id) {return userService.getUserById(Id);}

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updateUser){ userService.updateUser(id, updateUser); }

    @DeleteMapping("/{username}")
    public void deleteUserByUsername(@PathVariable String username) {
        userService.deleteUserByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}
