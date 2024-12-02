package com.example.schemaEx.controller.advice;

import com.example.schemaEx.service.task.TaskEntityNotFoundException;
import com.example.todoapi.model.ResourceNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(TaskEntityNotFoundException.class)
    public ResponseEntity<ResourceNotFoundError> handleTaskNotFoundException(TaskEntityNotFoundException ex) {
        var error = new ResourceNotFoundError();
        error.setDetail(ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}
