package com.school.jwt_authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo  extends JpaRepository<Users, Integer>{

	@Query("SELECT u FROM Users u WHERE u.name = :username")
	public Users findByUserName(String username);


}
