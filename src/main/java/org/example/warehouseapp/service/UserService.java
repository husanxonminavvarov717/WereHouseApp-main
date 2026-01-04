package org.example.warehouseapp.service;

import org.example.warehouseapp.model.Result;
import org.example.warehouseapp.model.User;
import org.example.warehouseapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
    public User getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }
    public Result createUser(User user) {
        User user1 = new User();
        user1.setFirstname(user.getFirstname());
        user1.setLastname(user.getLastname());
        user1.setPassword(user.getPassword());

        userRepository.save(user1);
        return new Result(true,"succes");
    }
    public Result updateUser(User user, Integer id) {
        Optional<User> userOptional = userRepository.findById(user.getId());
        if (userOptional.isPresent()) {

            return new Result(true,"molodes");
        }
        return new Result(false,"user not found Mazgi");
    }
    public Result deleteUser(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            return new Result(true,"user deleted");
        }
        return new Result(false,"user not found Mazgi");
    }

}

