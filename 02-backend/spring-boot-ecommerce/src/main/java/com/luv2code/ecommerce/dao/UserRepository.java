package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.ecommerce.entity.User;
@RepositoryRestResource(collectionResourceRel = "user", path = "user-info")
public interface UserRepository extends JpaRepository<User, Integer>{
	

}
