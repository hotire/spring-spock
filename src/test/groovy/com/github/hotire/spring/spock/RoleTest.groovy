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

    def "lookup"() {
        expect:
        Role.lookup(type) == result

        where:
        type | result
        1    | Role.USER
        2    | Role.ADMIN
        0    | Role.ANY
        -1   | Role.NONE
        3    | Role.NONE
        null | Role.NONE
    }

}
