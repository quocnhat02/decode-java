package com.lightcodese.dsa.service.impl;

import com.lightcodese.dsa.entity.user.UserEntity;
import com.lightcodese.dsa.repository.UserRepository;
import com.lightcodese.dsa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
