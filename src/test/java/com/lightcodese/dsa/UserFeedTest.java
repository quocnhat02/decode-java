package com.lightcodese.dsa;

import com.lightcodese.dsa.entity.feed.FeedEntity;
import com.lightcodese.dsa.entity.user.UserEntity;
import com.lightcodese.dsa.repository.FeedRepository;
import com.lightcodese.dsa.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
public class UserFeedTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedRepository feedRepository;

    @Test
    @Transactional
    @Rollback(false)
    void oneToManyTest() {
        // 1. New User
        UserEntity user = new UserEntity();
        FeedEntity feed = new FeedEntity();

        user.setUserName("user3");
        user.setUserEmail("user3@test.com");

        feed.setTitle("title1");
        feed.setDescription("description1");

        user.setFeeds(List.of(feed));
        feed.setUser(user);

        userRepository.save(user);

    }


    @Test
    @Transactional
    void selectedOneToManyTest() {
        UserEntity user = userRepository.findById(2L).orElseThrow();
        System.out.println(user);
        System.out.println(user.getFeeds());
    }

}
