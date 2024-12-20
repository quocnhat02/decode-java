package com.lightcodese.dsa.service;

import com.lightcodese.dsa.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public interface UserService {

    UserEntity createUser(UserEntity user);
    UserEntity findByUserNameAndUserEmail(String userName, String email);

    // get all by limit offset
    Page<UserEntity> findAllUsers(Pageable pageable);
    // get search by limit offset
    Page<UserEntity> findByUserNameContaining(String userName, Pageable pageable);
}
