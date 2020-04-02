package com.github.hotire.spring.spock

import spock.lang.Specification

class RoleTest extends Specification {

    def "get type"() {
        given:
        final Integer expected = 1
        final Role role = Role.USER

        when:
        final Integer result = role.getType()

        then:
        result == expected
    }
}
