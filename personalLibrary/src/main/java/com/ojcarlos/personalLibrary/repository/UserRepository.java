package com.ojcarlos.personalLibrary.repository;

import com.ojcarlos.personalLibrary.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
