package com.springproject.crudsimple.repository;

import com.springproject.crudsimple.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
