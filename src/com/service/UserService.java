package com.service;

import com.entity.User;

import java.util.List;

/**
 * @author : Iman
 * date : 2019/4/22
 */
public interface UserService {

    public List<User> findAll();

    public void add(User user);

    public User findById(Integer id);

    public void update(User user);

    public void delete(User user);
}
