package com.github.hotire.spring.spock

import spock.lang.Specification

class RoleTest extends Specification {

    def "get type"() {
        expect:
        role.getType() == result

        where:
        role         | result
        Role.USER    | 1
        Role.ADMIN   | 2
        Role.ANY     | 0
        Role.NONE    | -1
    }
}
