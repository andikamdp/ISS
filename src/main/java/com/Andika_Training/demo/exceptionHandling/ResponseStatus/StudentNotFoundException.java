package com.Andika_Training.demo.exceptionHandling.ResponseStatus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.NOT_FOUND,
        reason = "Requested student does not exist"
)
public class StudentNotFoundException
        extends RuntimeException {

    public StudentNotFoundException(Throwable t) {
        super(t);
    }
}