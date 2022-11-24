package com.mohamed.users.service;

import com.mohamed.users.entities.Role;
import com.mohamed.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
}
