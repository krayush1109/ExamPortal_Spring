package com.exam.examserver.service;

import java.util.Set;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

public interface UserService {

    // creating user roles
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
