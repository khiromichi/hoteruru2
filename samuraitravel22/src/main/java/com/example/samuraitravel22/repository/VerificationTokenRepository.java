package com.example.samuraitravel22.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel22.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository< VerificationToken, Integer> {
    public VerificationToken findByToken(String token);
}

