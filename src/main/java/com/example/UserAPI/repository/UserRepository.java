package com.example.UserAPI.repository;
import com.example.UserAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}