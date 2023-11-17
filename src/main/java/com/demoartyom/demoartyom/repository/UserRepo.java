package com.demoartyom.demoartyom.repository;

import com.demoartyom.demoartyom.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users, Long> {
    Optional<Users> findById(Long id);

}
