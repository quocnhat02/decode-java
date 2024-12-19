package com.lightcodese.dsa.controller.user;

import com.lightcodese.dsa.dto.request.user.UserCreateRequest;
import com.lightcodese.dsa.entity.user.UserEntity;
import com.lightcodese.dsa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserCRUDController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/search")
    public  UserEntity searchUser(@RequestParam String userName, @RequestParam String userEmail) {
        return userService.findByUserNameAndUserEmail(userName, userEmail);
    }
}
