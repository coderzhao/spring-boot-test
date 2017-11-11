package com.maxj.service.impl;

import com.maxj.dao.IUserRepository;
import com.maxj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public User findUser(String name) {
        return userRepository.findUserByName(name);
    }

}
