package com.ishtiak.original_student.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ishtiak.original_student.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{
	@Query
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}
