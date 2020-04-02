package com.github.hotire.spring.spock;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public enum Role {
    USER(1),
    ADMIN(2),
    ANY(0),
    NONE(-1)
    ;

    @Getter
    private final Integer type;

    public static final Map<Integer, Role> TYPE_MAP = Arrays.stream(Role.values()).collect(Collectors.toMap(Role::getType, Function.identity()));

    public static Role lookup(final Integer type) {
        return Optional.ofNullable(TYPE_MAP.get(type)).orElse(NONE);
    }
}
