package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
