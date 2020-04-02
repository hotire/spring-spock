package com.github.hotire.spring.spock

import spock.lang.Specification

class UserServiceTest extends Specification {

    def "find user by id"() {
        given:
        final User user = User.builder().id(1L).role(Role.USER).build()
        final UserRepository repository = Mock(UserRepository.class)
        final UserService userService = new UserService(repository)

        when:
        repository.findById(user.getId()) >> Optional.of(user)
        final User result = userService.findById(user.getId())

        then:
        result == user
    }
}
