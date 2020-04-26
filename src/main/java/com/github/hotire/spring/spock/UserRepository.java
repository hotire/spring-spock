package com.github.hotire.spring.spock;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<User> findById(Long id);
}
