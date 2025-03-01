package com.example.samuraitravel22.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel22.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
     public Role findByName(String name);    
}

