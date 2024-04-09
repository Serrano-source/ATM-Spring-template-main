package com.daw.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.atm.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom queries here if needed
}
