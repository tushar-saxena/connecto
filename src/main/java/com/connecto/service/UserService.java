package com.connecto.service;


import com.connecto.domain.User;

public interface UserService {
    void save(User user);

    User findByEmailId(String emailId);
}
