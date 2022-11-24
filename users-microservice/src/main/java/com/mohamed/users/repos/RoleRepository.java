package com.mohamed.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mohamed.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}