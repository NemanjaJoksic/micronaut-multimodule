package org.joksin.commons;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Serdeable
@Getter
@AllArgsConstructor
public class ApiResponse<T> {

    private final T data;
}
