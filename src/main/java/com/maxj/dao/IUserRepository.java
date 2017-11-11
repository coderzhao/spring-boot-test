package com.maxj.dao;

import com.maxj.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {

    public User findUserByName(String name);
}
