package com.example.springOauth3.repository;

import com.example.springOauth3.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
