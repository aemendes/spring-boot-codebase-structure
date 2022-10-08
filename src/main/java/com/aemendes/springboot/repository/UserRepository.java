package com.aemendes.springboot.repository;

import com.aemendes.springboot.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
