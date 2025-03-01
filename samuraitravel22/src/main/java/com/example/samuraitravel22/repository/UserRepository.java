package com.example.samuraitravel22.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel22.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
}
