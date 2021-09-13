package com.webdesignerportalimigrante.ongs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OngsNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(OngsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ongsNotFoundHandler(OngsNotFoundException ex) {
        return ex.getMessage();
    }
}
