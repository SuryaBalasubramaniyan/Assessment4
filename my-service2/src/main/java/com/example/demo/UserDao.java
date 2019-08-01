package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer>{
	@Query("Select u from User u where u.name=?1 and u.password=?2")
	 User findUser(String name,String pwd);
}
