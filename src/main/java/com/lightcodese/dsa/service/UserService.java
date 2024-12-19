package com.lightcodese.dsa.service;

import com.lightcodese.dsa.entity.user.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUsers();
}
