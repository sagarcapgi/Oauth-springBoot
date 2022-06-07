package com.example.springOauth3.service;


import com.example.springOauth3.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    void delete(long id);
}
