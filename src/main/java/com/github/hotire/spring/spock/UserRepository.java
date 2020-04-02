package com.github.hotire.spring.spock;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}
