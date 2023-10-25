package com.cb10.backend.security;

import com.cb10.backend.dao.UserDAO;
import com.cb10.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { // (1)
        User user = userDAO.findByName(username);
        if (user == null) throw new UsernameNotFoundException("User not found");

        return new MyUserDetails(user);
    }
}
