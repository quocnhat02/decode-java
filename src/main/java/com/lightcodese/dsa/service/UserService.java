package com.lightcodese.dsa.service;

import com.lightcodese.dsa.entity.user.UserEntity;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity findByUserNameAndUserEmail(String userName, String email);
}
