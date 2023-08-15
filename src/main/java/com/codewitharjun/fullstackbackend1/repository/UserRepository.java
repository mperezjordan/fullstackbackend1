package com.codewitharjun.fullstackbackend1.repository;

import com.codewitharjun.fullstackbackend1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
