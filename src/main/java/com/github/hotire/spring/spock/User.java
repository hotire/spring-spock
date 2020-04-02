package com.github.hotire.spring.spock;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Getter
public class User {
    @EqualsAndHashCode.Include
    private Long id;
    private Role role;
}
