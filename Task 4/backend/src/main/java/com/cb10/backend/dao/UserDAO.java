package com.cb10.backend.dao;

import com.cb10.backend.entity.User;

public interface UserDAO {
    public User findByName(String name);
    public void add(User user);
}
