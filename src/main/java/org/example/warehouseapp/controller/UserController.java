package org.example.warehouseapp.controller;

import org.example.warehouseapp.model.Result;
import org.example.warehouseapp.model.User;
import org.example.warehouseapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("{/user}")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public Result createUser(@RequestBody User user) {
        Result user1 = userService.createUser(user);
        return user1;


    }

    @PutMapping
    public Result updateUser(@RequestBody User user, @PathVariable Integer id) {
        Result result = userService.updateUser(user, id);
        return result;

    }

    @DeleteMapping
    public Result deleteUser(@PathVariable Integer id) {
        Result result = userService.deleteUser(id);
        return result;


    }
}