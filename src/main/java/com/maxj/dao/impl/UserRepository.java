package com.maxj.dao.impl;

import com.maxj.dao.IUserRepository;
import com.maxj.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class UserRepository implements IUserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public User findUserByName(String name) {
        List<User> list = (List<User>) hibernateTemplate.find("from com.maxj.entity.User where name = ?", new Object[]{name});
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public <S extends User> S save(S s) {
        return null;
    }

    public <S extends User> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    public User findOne(Long aLong) {
        return null;
    }

    public boolean exists(Long aLong) {
        return false;
    }

    public Iterable<User> findAll() {
        return null;
    }

    public Iterable<User> findAll(Iterable<Long> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(Long aLong) {

    }

    public void delete(User user) {

    }

    public void delete(Iterable<? extends User> iterable) {

    }

    public void deleteAll() {

    }
}
