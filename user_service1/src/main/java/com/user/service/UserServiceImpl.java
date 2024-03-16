package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    //Fake user List

    List<User> list = List.of(
            new User(1311L, "Rahim R Valasang", "9511722764"),
            new User(1312L, "Ayyaz R Valasang", "8970116253"),
            new User(1313L, "Ankit Tiwari", "89701162534")
    );


    @Override
    public User getUser(Long id) {
        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
