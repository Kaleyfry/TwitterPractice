package com.tts.TechTalentTwitter2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.TechTalentTwitter2.model.Role;

@Repository

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);
}
