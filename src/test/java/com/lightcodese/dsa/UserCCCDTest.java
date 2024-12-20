package com.lightcodese.dsa;

import com.lightcodese.dsa.entity.user.CCCDEntity;
import com.lightcodese.dsa.entity.user.UserEntity;
import com.lightcodese.dsa.repository.CCCDRepository;
import com.lightcodese.dsa.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class UserCCCDTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CCCDRepository cccdRepository;

    @Test
    @Transactional
    @Rollback(false)
    void oneToOneTest() {
        UserEntity user = new UserEntity();
        CCCDEntity cccd = new CCCDEntity();

        user.setUserName("user cccd");
        user.setUserEmail("cccd@gmail.com");

        cccd.setNumberCCCD("111222333");
        user.setCccd(cccd);

        userRepository.save(user);
    }
}
