package com.senpiper.liv2train.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestControllerAdvice
@EnableWebMvc
public class EmailAlreadyRegisteredExceptionHandler {
	@ExceptionHandler(value = { EmailAlreadyRegisterException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public InvalidExceptionResponse exceptionHandler(Exception ex) {
    	return new InvalidExceptionResponse(400,"Email Already Registered");
    }
}
