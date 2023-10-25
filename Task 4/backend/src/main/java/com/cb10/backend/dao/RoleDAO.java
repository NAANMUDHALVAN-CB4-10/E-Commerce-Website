package com.cb10.backend.dao;

import com.cb10.backend.entity.Role;

public interface RoleDAO {
    public Role findByName(String name);
}
