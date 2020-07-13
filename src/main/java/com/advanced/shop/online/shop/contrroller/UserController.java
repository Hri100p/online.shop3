package com.advanced.shop.online.shop.contrroller;


import com.advanced.shop.online.shop.modell.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @PostMapping
    public void  createUser(@RequestBody User user) {

    }

    @GetMapping("/{userID}")
    public List<User> getUser(@PathVariable("userID") Long userID) {
        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userID") Long userID) {

    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        
    }
}

