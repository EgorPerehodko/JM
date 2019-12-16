package com.simpleapp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Employee Not Found")
public class NoSuchIdException extends Exception {

    public NoSuchIdException(Long employeeId, String operation) {
        super(String.format("Can`t %s that employee. We have no employee with id - %s", operation, employeeId));
    }
}
